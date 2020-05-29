package com.meyou;

import java.net.HttpURLConnection;

public interface CallBackListener {
    void onCallBacking(HttpURLConnection httpURLConnection, byte[] bytes, boolean responseOver);

    void onError();

    void noNetWork();
}
