package com.meyou.where.Example;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Button;

import static com.meyou.Me.toast;

public class ServiceExample extends Service {

    public class MyBinder extends Binder {
        public void show(Button button) {
            button.setText("onBinding...");
        }
    }

    private void show() {
        toast(ServiceExample.this,
                Thread.currentThread().getStackTrace()[3].getMethodName() + " was Called");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    @Override
    public void onCreate() {
        show();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        show();
        super.onDestroy();
    }
}
