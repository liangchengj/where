package com.meyou;

import java.io.File;

public interface DownloadListener {
    void noNetWork();

    void onDownloading(String fileName, byte[] bytes, String percentage);

    void onPause(String fileName, String percentage);

    void onError(String fileName, String percentage);

    void onFinish(File file, String fileName);
}