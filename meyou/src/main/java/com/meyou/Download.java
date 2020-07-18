package com.meyou;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.RequiresPermission;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

import static android.Manifest.permission.ACCESS_NETWORK_STATE;
import static com.meyou.Me.METHOD_GET;
import static com.meyou.Me.getThreadPool;
import static com.meyou.Me.hasNetWork;
import static com.meyou.Me.readBytes;
import static java.net.HttpURLConnection.HTTP_OK;
import static java.net.HttpURLConnection.HTTP_PARTIAL;

final class Download {

    private String url;
    private Context context;
    private DownloadListener downloadListener;
    private String fileName;
    private long current = 0;
    private String percentage;
    private long contentLength = 0;
    private File file;

    Download(Context context, String url, String savePath, String fileName, DownloadListener downloadListener) {
        this.context = context;
        this.url = url;
        this.downloadListener = downloadListener;
        this.fileName = fileName;
        this.file = new File(savePath, fileName);


        File file = new File(savePath);

        if (!file.exists())
            file.mkdirs();

    }


    Download start() {
        getThreadPool().execute(new Runnable() {
            @SuppressLint("MissingPermission")
            @Override
            public void run() {
                if (hasNetWork(context)) {
                    HttpURLConnection httpURLConnection = null;
                    try {
                        httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
                        httpURLConnection.setConnectTimeout(5000);
                        httpURLConnection.setRequestMethod(METHOD_GET);

                        if (httpURLConnection.getResponseCode() == HTTP_OK) {
                            contentLength = httpURLConnection.getContentLength();

                            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                            randomAccessFile.setLength(contentLength);
                            randomAccessFile.close();

                            long threadCount = contentLength / (1024 * 64);

                            threadCount = (threadCount == 0) ? 1 : threadCount;

                            threadCount = (threadCount > 128) ? 128 : threadCount;

                            long blockSize = contentLength / threadCount;

                            for (int threadId = 0; threadId < threadCount; threadId++) {
                                long startIndex = blockSize * threadId;


                                long endIndex = blockSize * (threadId + 1) - 1;

                                if (threadId == (threadCount - 1))
                                    endIndex = ((int) contentLength) - 1;

                                new Thread(startIndex, endIndex).start();

                            }
                        } else
                            onError();

                    } catch (IOException e) {
                        onError();
                    } finally {
                        httpURLConnection.disconnect();
                    }
                } else {
                    ((Activity) context).runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            downloadListener.noNetWork();
                        }
                    });
                }
            }
        });

        return this;
    }


    void onPause() {
        ((Activity) context).runOnUiThread(new Runnable() {
            @Override
            public void run() {
                downloadListener.onPause(fileName, percentage);
            }
        });
    }

    void onError() {
        ((Activity) context).runOnUiThread(new Runnable() {
            @Override
            public void run() {
                downloadListener.onError(fileName, percentage);
            }
        });
    }


    private class Thread extends java.lang.Thread {

        private long startIndex;
        private long endIndex;

        Thread(long startIndex, long endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        @RequiresPermission(ACCESS_NETWORK_STATE)
        public void run() {
            try {
                if (hasNetWork(context)) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
                    httpURLConnection.setRequestMethod(METHOD_GET);
                    httpURLConnection.setRequestProperty("Range", "bytes=" + startIndex + "-" + endIndex);

                    if (httpURLConnection.getResponseCode() == HTTP_PARTIAL) {
                        readBytes(httpURLConnection.getInputStream(), new ReadBytesListener() {

                            private RandomAccessFile randomAccessFile;

                            {
                                randomAccessFile = new RandomAccessFile(file, "rw");
                                randomAccessFile.seek(startIndex);
                            }

                            @Override
                            public void onReading(final byte[] bytes, boolean readOver) {
                                try {
                                    synchronized (Thread.class) {
                                        if (!readOver) {
                                            current += bytes.length;
                                            randomAccessFile.write(bytes);
                                            ((Activity) context).runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    percentage = ((int) ((float) current / (float) contentLength * 100)) + "%";
                                                    downloadListener.onDownloading(fileName, bytes, percentage);
                                                }
                                            });
                                        } else {
                                            randomAccessFile.close();
                                            interrupt();
                                            if (current / contentLength == 1) {
                                                getThreadPool().execute(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        ((Activity) context).runOnUiThread(new Runnable() {
                                                            @Override
                                                            public void run() {
                                                                downloadListener.onFinish(file, fileName);
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        }
                                    }
                                } catch (IOException e) {
                                    onError();
                                    interrupt();
                                }
                            }
                        });
                    }
                } else
                    onPause();
            } catch (IOException e) {
                onError();
                interrupt();
            }
        }

    }
}
