package com.meyou;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Outline;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Keep;
import android.support.annotation.RequiresPermission;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.RemoteViews;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

import static android.Manifest.permission.ACCESS_NETWORK_STATE;
import static android.Manifest.permission.INTERNET;
import static android.Manifest.permission.REQUEST_INSTALL_PACKAGES;
import static android.content.Context.CONNECTIVITY_SERVICE;
import static android.content.Context.MODE_PRIVATE;
import static android.content.Context.NOTIFICATION_SERVICE;
import static android.content.Intent.ACTION_VIEW;
import static android.content.Intent.CATEGORY_BROWSABLE;
import static android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION;
import static android.content.pm.PackageManager.PERMISSION_GRANTED;
import static android.graphics.BitmapFactory.decodeResource;
import static android.graphics.Color.BLACK;
import static android.graphics.Color.argb;
import static android.graphics.Color.rgb;
import static android.net.Uri.fromParts;
import static android.net.Uri.parse;
import static android.os.Build.VERSION.SDK_INT;
import static android.os.Build.VERSION_CODES.LOLLIPOP;
import static android.os.Build.VERSION_CODES.O;
import static android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS;
import static android.provider.Settings.ACTION_APP_NOTIFICATION_SETTINGS;
import static android.provider.Settings.EXTRA_APP_PACKAGE;
import static android.view.View.TEXT_ALIGNMENT_CENTER;
import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;
import static com.meyou.BuildConfig.DEBUG;
import static java.lang.Boolean.parseBoolean;
import static java.lang.Class.forName;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Runtime.getRuntime;
import static java.lang.System.currentTimeMillis;
import static java.net.HttpURLConnection.HTTP_OK;
import static java.net.URLDecoder.decode;
import static java.net.URLEncoder.encode;
import static java.util.Map.Entry;
import static java.util.concurrent.TimeUnit.SECONDS;


public abstract class Me {

    static {
        loadNative("meyou");
    }

    @Keep
    public static final String ME = Me.class.getSimpleName().toUpperCase();


    private static final native String GET();

    private static final native String POST();

    private static final native String HEAD();

    private static final native String PUT();

    private static final native String DELETE();

    private static final native String OPTIONS();

    private static final native String TRACE();

    private static final native String FORM();

    private static final native String MULTIPART();

    private static final native String ISO88591();

    private static final native String GBK();

    private static final native String GB2312();

    private static final native String UTF16();

    private static final native String UTF8();

    private static final native String UNICODE();

    private static final native String ASCII();

    private static final native String USASCII();

    private static final native String URL9934();

    private static final native String URL();

    public static final String CHARSET_ISO_8859_1 = ISO88591();
    public static final String CHARSET_GBK = GBK();
    public static final String CHARSET_GB2312 = GB2312();
    public static final String CHARSET_UTF16 = UTF16();
    public static final String CHARSET_UTF8 = UTF8();
    public static final String CHARSET_UNICODE = UNICODE();
    public static final String CHARSET_ASCII = ASCII();
    public static final String CHARSET_US_ASCII = USASCII();


    public static final String METHOD_GET = GET();
    public static final String METHOD_POST = POST();
    public static final String METHOD_HEAD = HEAD();
    public static final String METHOD_OPTIONS = OPTIONS();
    public static final String METHOD_PUT = PUT();
    public static final String METHOD_DELETE = DELETE();
    public static final String METHOD_TRACE = TRACE();


    public static final String MIME_MULTIPART = MULTIPART();
    public static final String MIME_FORM = FORM();

    public static final String MIME_BINARY = getMimeByName(".*");
    public static final String MIME_APK = getMimeByName(".apk");
    public static final String MIME_JSON = getMimeByName(".json");
    public static final String MIME_JS = getMimeByName(".js");
    public static final String MIME_HTML = getMimeByName(".html");
    public static final String MIME_CSS = getMimeByName(".css");
    public static final String MIME_XML = getMimeByName(".xml");
    public static final String MIME_GIF = getMimeByName(".gif");
    public static final String MIME_PNG = getMimeByName(".png");
    public static final String MIME_JPEG = getMimeByName(".jpeg");
    public static final String MIME_JPG = getMimeByName(".jpg");

    public static final String HTTP_URL_9934 = URL9934();


    public static final void loadNative(String libName) {
        System.loadLibrary(libName);
    }


    private static ThreadPoolExecutor threadPoolExecutor = null;

    private static boolean sendNotificationCheckOnce = false;

    public static final ThreadPoolExecutor getThreadPool() {
        if (threadPoolExecutor == null) {
            synchronized (ThreadPoolExecutor.class) {
                if (threadPoolExecutor == null)
                    threadPoolExecutor = new ThreadPoolExecutor(getRuntime().availableProcessors() + 1, getRuntime().availableProcessors() * 2 + 1, 0, SECONDS, new LinkedBlockingQueue<Runnable>(), new ThreadFactory() {

                        private AtomicInteger atomicInteger = new AtomicInteger(1);

                        @Override
                        public Thread newThread(Runnable r) {
                            return new Thread(r, ME + "_THREAD_" + atomicInteger.getAndIncrement() + "_" + getDate("yyyy/M/d") + "_" + getTime("H:m:s"));
                        }
                    });
            }
        }
        return threadPoolExecutor;
    }


    public static final native String getTypeByName(String name);

    public static final native String getMimeByName(String name);

    public static final native String subWithLastIndex(String string, String ch, int moveRight);

    public static final String subWithLastIndex(String string, String ch) {
        return subWithLastIndex(string, ch, 1);
    }


    public static final String getDate(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }


    public static final String getTime(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }

    public static final boolean isNight() {
        return (!pastSixAM() || pastNinePM());
    }

    public static final boolean pastSixAM() {
        return timeOver(6);
    }

    public static final boolean pastNinePM() {
        return timeOver(21);
    }

    public static final boolean timeOver(int hour) {
        return timeOver(hour, 0);
    }

    public static final boolean timeOver(int hour, int minute) {
        return parseInt(getTime("H")) > hour
                || parseInt(getTime("H")) == hour
                && parseInt(getTime("m")) > minute;
    }

    public static final void startThread(Thread thread) {
        thread.start();
    }


    public static final int getGray(int value) {
        return rgb(value, value, value);
    }

    public static final int getWhite(int alpha) {
        return argb(alpha, 255, 255, 255);
    }


    public static final void readBytes(InputStream inputStream, ReadBytesListener readBytesListener) throws IOException {
        if (inputStream != null && readBytesListener != null) {

            byte[] bytes = new byte[1024];

            byte[] onceRead = null;

            for (int length; (length = inputStream.read(bytes)) != -1; ) {
                onceRead = new byte[length];
                for (int i = 0; i < length; i++)
                    onceRead[i] = bytes[i];
                readBytesListener.onReading(onceRead, false);
            }

            readBytesListener.onReading(onceRead, true);

            if (inputStream != null)
                inputStream.close();

        } else
            lt(ME, "readBytes", new NullPointerException());
    }


    public static final void writeBytes(OutputStream outputStream, byte[] bytes, boolean writeOnce) {
        if (outputStream != null && bytes != null) {
            try {
                outputStream.write(bytes);
            } catch (IOException e) {
                lt(ME, "writeBytes", e);
            } finally {
                try {
                    outputStream.flush();
                } catch (IOException e) {
                    lt(ME, "writeBytes", e);
                } finally {
                    try {
                        if (writeOnce)
                            outputStream.close();
                    } catch (IOException e) {
                        lt(ME, "writeBytes", e);
                    }
                }
            }
        } else
            lt(ME, "writeBytes", new NullPointerException());
    }


    public static final void writeBytes(OutputStream outputStream, byte[] bytes) {
        writeBytes(outputStream, bytes, true);
    }

    public static final void writeBytes(OutputStream outputStream, Object object) throws UnsupportedEncodingException {
        writeBytes(outputStream, object.toString().getBytes(CHARSET_UTF8));
    }


    public static final void copy(InputStream inputStream, final OutputStream outputStream) throws IOException {
        readBytes(inputStream, new ReadBytesListener() {
            @Override
            public void onReading(byte[] bytes, boolean readOver) {
                writeBytes(outputStream, bytes, false);
            }
        });

        if (outputStream != null)
            outputStream.close();

    }

    public static final void copy(String oldPath, String newPath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(oldPath));
        FileOutputStream fileOutputStream = new FileOutputStream(new File(newPath));
        copy(fileInputStream, fileOutputStream);
    }


    public static final Class<?> findClassByName(String name) throws ClassNotFoundException {
        return forName(name);
    }


    @RequiresPermission(REQUEST_INSTALL_PACKAGES)
    public static final void installApk(Context context, Uri uri) {
        context.startActivity(getInstall(uri));
    }


    @RequiresPermission(REQUEST_INSTALL_PACKAGES)
    public static final Intent getInstall(Uri uri) {
        return getOpenFileIntent(uri, MIME_APK);
    }


    public static final Intent getOpenFileIntent(Uri uri, String type) {
        return new Intent(ACTION_VIEW)
                .addFlags(FLAG_GRANT_READ_URI_PERMISSION)
                .setDataAndType(uri, type);
    }

    public static final int getRandom(int range) {
        return (int) (Math.random() * range);
    }

    public static final void openFileByIntent(Context context, Uri uri, String type) {
        context.startActivity(getOpenFileIntent(uri, type));
    }


    public static final void browse(Context context, String url) {
        context.startActivity(new Intent(ACTION_VIEW)
                .addCategory(CATEGORY_BROWSABLE)
                .setData(parse(url)));
    }


    public static final String e(String string) {
        try {
            return encode(string, CHARSET_UTF16);
        } catch (UnsupportedEncodingException e) {
            lt(ME, "e", e);
        }
        return null;
    }


    public static final String d(String string) {
        try {
            return decode(string, CHARSET_UTF16);
        } catch (UnsupportedEncodingException e) {
            lt(ME, "d", e);
        }
        return null;
    }


    public static final int dpToPixels(Context context, float dp) {
        return (int) (dp * (context.getResources().getDisplayMetrics().density) + 0.5f);
    }


    public static final HashMap<String, String> hash(String key, String value) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(key, value);
        return hashMap;
    }


    public static final void setViewRadius(final int radius, View... views) {
        if (SDK_INT >= LOLLIPOP) {
            for (View view : views)
                view.setOutlineProvider(new ViewOutlineProvider() {
                    @Override
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), radius);
                        view.setClipToOutline(true);
                    }
                });
        }
    }

    private static final void toast(Context context, View view, int duration) {
        Toast toast = new Toast(context);
        toast.setView(view);
        toast.setDuration(duration);
        toast.show();
    }

    private static final void toast(Context context, String text, int duration) {
        TextView textView = new TextView(context);

        setViewRadius(dpToPixels(context, 16.2f), textView);

        textView.setText(text);
        textView.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        textView.setTextSize(dpToPixels(context, 6.4f));

        if (isNight())
            textView.setBackgroundColor(getGray(60));
        else
            textView.setBackgroundColor(argb(240, 251, 251, 251));

        if (isNight())
            textView.setTextColor(getWhite(220));
        else
            textView.setTextColor(BLACK);

        textView.setPadding(52, 25, 52, 25);

        toast(context, textView, duration);
    }

    public static final void toast(Context context, String text) {
        toast(context, text, LENGTH_SHORT);
    }

    public static final void toast(Context context, View view) {
        toast(context, view, LENGTH_SHORT);
    }

    public static final void longer(Context context, String text) {
        toast(context, text, LENGTH_LONG);
    }

    public static final void longer(Context context, View view) {
        toast(context, view, LENGTH_LONG);
    }


    public static final String subWithIndex(String string, String ch) {
        return subWithIndex(string, ch, 1);
    }

    public static final String subWithIndex(String string, String ch, int move) {
        return string.substring(string.indexOf(ch) + move);
    }


    private static final native void le(String tag, String message, boolean debug);

    private static final native void ld(String tag, String message, boolean debug);

    private static final native void li(String tag, String message, boolean debug);

    private static final native void lt(String tag, String methodName, String exceptionName, boolean debug);


    public static final void le(String tag, String message) {
        le(tag, message, DEBUG);
    }

    public static final void ld(String tag, String message) {
        ld(tag, message, DEBUG);
    }

    public static final void li(String tag, String message) {
        li(tag, message, DEBUG);
    }


    public static final void lt(String tag, String methodName, Throwable e) {
        lt(tag, methodName, e.getClass().getSimpleName(), DEBUG);
    }


    private static final native String notifyTip();

    public synchronized static final void sendNotification(Context context, int id, int importance, NotificationCompat.Style style, boolean autoCancel, String title, String message, int smallIcon, int largeIcon, RemoteViews remoteViews, PendingIntent pendingIntent) {
        if (NotificationManagerCompat.from(context).areNotificationsEnabled()) {

            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);

            if (SDK_INT >= O)
                notificationManager.createNotificationChannel(new NotificationChannel(id + "", ME, importance));

            notificationManager.notify(id, new NotificationCompat.Builder(context, id + "")
                    .setAutoCancel(autoCancel)
                    .setContentTitle(title)
                    .setContentText(message)
                    .setWhen(currentTimeMillis())
                    .setSmallIcon(smallIcon)
                    .setLargeIcon(decodeResource(context.getResources(), largeIcon))
                    .setCustomContentView(remoteViews)
                    .setContentIntent(pendingIntent)
                    .setStyle(style)
                    .build());

        } else if (!sendNotificationCheckOnce) {

            toast(context, notifyTip());

            Intent intent = new Intent();

            String packageName = context.getPackageName();

            try {
                if (SDK_INT >= O)
                    intent.setAction(ACTION_APP_NOTIFICATION_SETTINGS)
                            .putExtra(EXTRA_APP_PACKAGE, packageName);
                else if (SDK_INT > LOLLIPOP)
                    intent.setAction(ACTION_APP_NOTIFICATION_SETTINGS)
                            .putExtra("app_package", packageName)
                            .putExtra("app_uid", context.getApplicationInfo().uid);
                else
                    intent.setAction(ACTION_APPLICATION_DETAILS_SETTINGS)
                            .setData(fromParts("package", packageName, null));

            } catch (Exception e) {
                intent.setAction(ACTION_APPLICATION_DETAILS_SETTINGS)
                        .setData(fromParts("package", packageName, null));
            }

            sendNotificationCheckOnce = true;
            context.startActivity(intent);
        }
    }


    private static final native String shareName(String sign);


    public static final void putShare(Context context, String key, Object value) {
        context.getSharedPreferences(shareName(ME), MODE_PRIVATE).edit().putString(key, value + "").apply();
    }

    public static final String getStringShare(Context context, String key, Object defaultValue) {
        return context.getSharedPreferences(shareName(ME), MODE_PRIVATE).getString(key, defaultValue + "");
    }

    public static final int getIntShare(Context context, String key, int defaultValue) {
        return parseInt(getStringShare(context, key, defaultValue));
    }

    public static final boolean getBooleanShare(Context context, String key, boolean defaultValue) {
        return parseBoolean(getStringShare(context, key, defaultValue));
    }

    public static final long getLongShare(Context context, String key, long defaultValue) {
        return parseLong(getStringShare(context, key, defaultValue));
    }

    public static final float getFloatShare(Context context, String key, float defaultValue) {
        return parseFloat(getStringShare(context, key, defaultValue));
    }

    @RequiresPermission(ACCESS_NETWORK_STATE)
    public static final boolean hasNetWork(Context context) {
        if (ActivityCompat.checkSelfPermission(context, ACCESS_NETWORK_STATE) != PERMISSION_GRANTED)
            longer(context, "Not Found Permission ACCESS_NETWORK_STATE");
        else if (((ConnectivityManager) context.getSystemService(CONNECTIVITY_SERVICE)).getActiveNetworkInfo() != null)
            return true;
        return false;
    }


    public static final void openApp(Context context, String packageName) {
        context.startActivity(context.getPackageManager().getLaunchIntentForPackage(packageName));
    }


    public static final void get(Context context, String url, HashMap<String, String> params, boolean onUIThread, CallBackListener callBackListener) {
        get(context, url, null, params, onUIThread, callBackListener);
    }


    public static final void get(Context context, String url, HashMap<String, String> properties, HashMap<String, String> params, boolean onUIThread, CallBackListener callBackListener) {
        String parameter = "";

        if (params != null) {
            for (Entry<String, String> entry : params.entrySet())
                parameter += entry.getKey() + "=" + entry.getValue() + "&";
        } else
            parameter = null;

        if (parameter != null)
            parameter = parameter.substring(0, parameter.length() - 1);

        request(context, url, METHOD_GET, properties, parameter, onUIThread, callBackListener);

    }


    public static final void post(Context context, String url, String param, boolean onUIThread, CallBackListener callBackListener) {
        post(context, url, null, param, onUIThread, callBackListener);
    }


    public static final void post(Context context, String url, HashMap<String, String> properties, String param, boolean onUIThread, CallBackListener callBackListener) {
        request(context, url, METHOD_POST, properties, param, onUIThread, callBackListener);
    }


    private synchronized static final void request(final Context context, final String url, final String method, final HashMap<String, String> properties, final String param, final boolean onUIThread, final CallBackListener callBackListener) {
        getThreadPool().execute(new Runnable() {

            private HttpURLConnection httpURLConnection;

            private Handler handler = new Handler() {
                @Override
                public void handleMessage(Message message) {
                    if (message.what == 0055) {
                        callBackListener.noNetWork();
                        return;
                    }

                    if (message.what == 0066) {
                        if (httpURLConnection != null)
                            httpURLConnection.disconnect();
                        callBackListener.onError();
                    }
                }
            };

            @SuppressLint("MissingPermission")
            @RequiresPermission(ACCESS_NETWORK_STATE)
            @Override
            public void run() {
                if (ActivityCompat.checkSelfPermission(context, INTERNET) != PERMISSION_GRANTED)
                    longer(context, "Not Found Permission INTERNET");
                else {
                    if (hasNetWork(context)) {
                        try {
                            if (!method.equals(METHOD_GET) && param == null)
                                httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
                            else
                                httpURLConnection = (HttpURLConnection) new URL(url + "?" + param).openConnection();

                            httpURLConnection.setConnectTimeout(5000);
                            httpURLConnection.setRequestMethod(method);
                            httpURLConnection.setRequestProperty("Referer", URL() + "/" + ME);

                            if (properties != null) {
                                for (Entry<String, String> entry : properties.entrySet())
                                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());

                            }

                            if (method.equals(METHOD_POST) && param != null) {

                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setUseCaches(false);
                                httpURLConnection.setRequestProperty("Content-Type", MIME_FORM);
                                httpURLConnection.setRequestProperty("Content-Length", "" + param.length());

                                writeBytes(httpURLConnection.getOutputStream(), param);
                            }

                            if (httpURLConnection.getResponseCode() == HTTP_OK) {
                                getThreadPool().execute(new Runnable() {
                                    @Override
                                    public void run() {
                                        try {
                                            readBytes(httpURLConnection.getInputStream(), new ReadBytesListener() {
                                                @Override
                                                public void onReading(final byte[] bytes, final boolean readOver) {
                                                    synchronized (this) {
                                                        if (onUIThread) {

                                                            ((Activity) context).runOnUiThread(new Runnable() {
                                                                @Override
                                                                public void run() {
                                                                    callBackListener.onCallBacking(httpURLConnection, bytes, readOver);
                                                                }
                                                            });

                                                        } else {
                                                            callBackListener.onCallBacking(httpURLConnection, bytes, readOver);
                                                        }

                                                        if (readOver && httpURLConnection != null)
                                                            httpURLConnection.disconnect();
                                                    }
                                                }
                                            });
                                        } catch (IOException e) {
                                            Message message = new Message();
                                            message.what = 0066;
                                            handler.sendMessage(message);
                                        }
                                    }
                                });
                            } else {
                                Message message = new Message();
                                message.what = 0066;
                                handler.sendMessage(message);
                            }
                        } catch (IOException e) {
                            Message message = new Message();
                            message.what = 0066;
                            handler.sendMessage(message);
                        }

                    } else {
                        Message message = new Message();
                        message.what = 0055;
                        handler.sendMessage(message);
                    }
                }
            }
        });
    }


    public static final void startDownload(final Context context, String url, final String savePath, final String fileName, final DownloadListener downloadListener) {
        if (getMimeByName(url) != null) {
            new Download(context, url, savePath, fileName, downloadListener).start();
        } else {

            File file = new File(savePath);

            if (!file.exists())
                file.mkdirs();

            final String[] percentage = {null};

            try {

                get(context, url, null, false, new CallBackListener() {

                    private File file = new File(savePath, fileName);

                    private FileOutputStream fileOutputStream = new FileOutputStream(file);

                    private long current = 0;

                    @Override
                    public void onCallBacking(final HttpURLConnection httpURLConnection, final byte[] bytes, boolean responseOver) {
                        if (!responseOver) {
                            current += bytes.length;
                            writeBytes(fileOutputStream, bytes, false);
                            ((Activity) context).runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    percentage[0] = ((int) (((float) current / (float) httpURLConnection.getContentLength()) * 100)) + "%";
                                    downloadListener.onDownloading(fileName, bytes, percentage[0]);
                                }
                            });
                        } else {
                            ((Activity) context).runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    downloadListener.onFinish(file, fileName);
                                }
                            });
                        }

                    }

                    @Override
                    public void onError() {
                        ((Activity) context).runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                downloadListener.onError(fileName, percentage[0]);
                            }
                        });
                    }

                    @Override
                    public void noNetWork() {
                        downloadListener.noNetWork();
                    }
                });
            } catch (IOException e) {
                ((Activity) context).runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        downloadListener.onError(fileName, percentage[0]);
                    }
                });
            }
        }
    }

}
