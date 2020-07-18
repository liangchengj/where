package com.meyou;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresPermission;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.RemoteViews;

import org.xmlpull.v1.XmlPullParser;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static android.Manifest.permission.ACCESS_NETWORK_STATE;
import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.REQUEST_INSTALL_PACKAGES;
import static android.content.Context.CONNECTIVITY_SERVICE;
import static android.content.Context.INPUT_METHOD_SERVICE;
import static android.content.Context.NOTIFICATION_SERVICE;
import static android.content.Context.TELEPHONY_SERVICE;
import static android.content.Context.WIFI_SERVICE;
import static android.content.pm.PackageManager.PERMISSION_GRANTED;
import static android.content.res.Configuration.ORIENTATION_LANDSCAPE;
import static android.content.res.Configuration.ORIENTATION_PORTRAIT;
import static android.graphics.Bitmap.createBitmap;
import static android.graphics.Color.TRANSPARENT;
import static android.os.Build.VERSION_CODES.LOLLIPOP;
import static android.os.Build.VERSION_CODES.M;
import static android.os.Build.VERSION_CODES.N_MR1;
import static android.os.Build.VERSION_CODES.O;
import static android.provider.MediaStore.MediaColumns.DATA;
import static android.view.MotionEvent.ACTION_DOWN;
import static android.view.MotionEvent.ACTION_UP;
import static android.view.View.SYSTEM_UI_FLAG_FULLSCREEN;
import static android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
import static android.view.View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
import static android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
import static android.view.View.SYSTEM_UI_FLAG_VISIBLE;
import static com.meyou.Me.ME;
import static com.meyou.Me.getGray;
import static com.meyou.Me.getThreadPool;
import static com.meyou.Me.installApk;
import static com.meyou.Me.subWithLastIndex;
import static com.meyou.UIState.HIDE_SYSTEM_BARS;
import static com.meyou.UIState.LAYOUT_IN_SYSTEM_BARS;
import static java.io.File.separator;
import static java.lang.System.currentTimeMillis;
import static java.util.Arrays.asList;


public abstract class Fragment extends android.support.v4.app.Fragment {

    protected final String IDENTIFIER_DRAWABLE = Focus.IDENTIFIER_DRAWABLE;
    protected final String IDENTIFIER_ID = Focus.IDENTIFIER_ID;
    protected final String IDENTIFIER_STRING = Focus.IDENTIFIER_STRING;
    protected final String IDENTIFIER_ARRAY = Focus.IDENTIFIER_ARRAY;
    protected final String IDENTIFIER_DIMEN = Focus.IDENTIFIER_DIMEN;
    protected final String IDENTIFIER_COLOR = Focus.IDENTIFIER_COLOR;
    protected final String IDENTIFIER_LAYOUT = Focus.IDENTIFIER_LAYOUT;


    protected final String PACKAGE_ANDROID = Focus.PACKAGE_ANDROID;

    private final int SYSTEM_UI_LIGHT_SYSTEM_BARS = SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            | SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
            | SYSTEM_UI_FLAG_LAYOUT_STABLE;

    protected final int SDK_INT = Focus.SDK_INT;

    protected final int COLOR_NIGHT = Focus.COLOR_NIGHT;


    private boolean onDestroyView = false;
    private boolean layoutInSystemBars = false;


    protected static final void loadNative(String libName) {
        Me.loadNative(libName);
    }


    protected final Context getApplicationContext() {
        return ((AppCompatActivity) getContext()).getApplicationContext();
    }

    @Override
    public void onDestroyView() {
        onDestroyView = true;
        super.onDestroyView();
    }

    protected final void funTouch(View view, final FunTouchListener funTouchListener) {
        view.setOnTouchListener(new View.OnTouchListener() {

            long touchDown;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == ACTION_DOWN) {
                    funTouchListener.onActionDown(v, event);
                    touchDown = currentTimeMillis();
                } else if (event.getAction() == ACTION_UP) {
                    funTouchListener.onActionUp(v, event);
                    if (currentTimeMillis() - touchDown <= 500)
                        funTouchListener.onClick(v);
                }
                return false;
            }
        });
    }


    protected final void funTouch(int id, FunTouchListener funTouchListener) {
        funTouch(getView().findViewById(id), funTouchListener);
    }


    protected final void putShare(String key, Object value) {
        Me.putShare(getContext(), key, value);
    }

    protected final String getStringShare(String key, Object defaultValue) {
        return Me.getStringShare(getContext(), key, defaultValue);
    }

    protected final int getIntShare(String key, int defaultValue) {
        return Me.getIntShare(getContext(), key, defaultValue);
    }

    protected final boolean getBooleanShare(String key, boolean defaultValue) {
        return Me.getBooleanShare(getContext(), key, defaultValue);
    }

    protected final long getLongShare(String key, long defaultValue) {
        return Me.getLongShare(getContext(), key, defaultValue);
    }

    protected final float getFloatShare(String key, float defaultValue) {
        return Me.getFloatShare(getContext(), key, defaultValue);
    }

    protected final void setShortCuts(ShortcutInfo... shortcutInfo) {
        if (SDK_INT > O && shortcutInfo != null)
            for (ShortcutInfo s : shortcutInfo)
                getShortCutManager().addDynamicShortcuts(asList(s));
    }

    protected final void setDecorViewRadius(int dp) {
        setViewRadius(dp, getDecorView());
    }

    protected final void setSystemUiVisibility(int visibility) {
        getDecorView().setSystemUiVisibility(visibility);
    }

    protected final void setNavigationBarColor(int color) {
        if (getNavigationBarHeight() != 0 && SDK_INT > LOLLIPOP)
            ((AppCompatActivity) getContext()).getWindow().setNavigationBarColor(color);
    }

    protected final void setStatusBarColor(int color) {
        ((AppCompatActivity) getContext()).getWindow().setStatusBarColor(color);
    }


    protected final void hideSystemBars() {
        setSystemUiVisibility(HIDE_SYSTEM_BARS);
    }

    protected final void layoutInSystemBars() {
        setSystemUiVisibility(getDecorView().getSystemUiVisibility() | LAYOUT_IN_SYSTEM_BARS);
        layoutInSystemBars = true;
    }


    protected synchronized final void lightSystemBars() {
        if (SDK_INT < M && SDK_INT >= LOLLIPOP)
            setStatusBarColor(getGray(230));
        else
            setStatusBarColor(TRANSPARENT);

        if (SDK_INT < O && SDK_INT >= LOLLIPOP)
            setNavigationBarColor(getGray(230));
        else
            setNavigationBarColor(TRANSPARENT);

        if ((getDecorView().getSystemUiVisibility() & SYSTEM_UI_FLAG_FULLSCREEN) == SYSTEM_UI_FLAG_FULLSCREEN)
            setSystemUiVisibility(SYSTEM_UI_FLAG_VISIBLE);


        if (layoutInSystemBars)
            setSystemUiVisibility(LAYOUT_IN_SYSTEM_BARS | SYSTEM_UI_LIGHT_SYSTEM_BARS);
        else
            setSystemUiVisibility(SYSTEM_UI_LIGHT_SYSTEM_BARS);

    }

    protected final void setWindowDrawable(int resource) {
        ((AppCompatActivity) getContext()).getWindow().setBackgroundDrawableResource(resource);
    }


    protected final void setBackgroundColor(int color) {
        getDecorView().setBackgroundColor(color);
    }


    protected final View getDecorView() {
        return ((AppCompatActivity) getContext()).getWindow().getDecorView();
    }

    protected final int getIdentifier(String name, String defType, String defPackage) {
        return getResources().getIdentifier(name, defType, defPackage);
    }

    protected final int getId(String name, String defPackage) {
        return getIdentifier(name, IDENTIFIER_ID, defPackage);
    }

    protected final int getId(String name) {
        return getId(name, getContext().getPackageName());
    }

    protected final int getLayoutId(String name, String defPackage) {
        return getIdentifier(name, IDENTIFIER_LAYOUT, defPackage);
    }

    protected final int getLayoutId(String name) {
        return getLayoutId(name, getContext().getPackageName());
    }

    protected final int getArrayId(String name, String defPackage) {
        return getIdentifier(name, IDENTIFIER_ARRAY, defPackage);
    }

    protected final int getArrayId(String name) {
        return getArrayId(name, getContext().getPackageName());
    }

    protected final int getStringId(String name, String defPackage) {
        return getIdentifier(name, IDENTIFIER_STRING, defPackage);
    }

    protected final int getStringId(String name) {
        return getStringId(name, getContext().getPackageName());
    }

    protected final int getDimenId(String name, String defPackage) {
        return getIdentifier(name, IDENTIFIER_DIMEN, defPackage);
    }

    protected final int getDimenId(String name) {
        return getDimenId(name, getContext().getPackageName());
    }


    protected final int getColorId(String name, String defPackage) {
        return getIdentifier(name, IDENTIFIER_COLOR, defPackage);
    }

    protected final int getColorId(String name) {
        return getColorId(name, getContext().getPackageName());
    }


    protected final int getDrawableId(String name, String defPackage) {
        return getIdentifier(name, IDENTIFIER_DRAWABLE, defPackage);
    }

    protected final int getDrawableId(String name) {
        return getDrawableId(name, getContext().getPackageName());
    }


    protected final XmlResourceParser getLayout(int id) {
        return getResources().getLayout(id);
    }

    protected final XmlResourceParser getLayout(String name) {
        return getLayout(getLayoutId(name));
    }

    protected final String[] getStringArray(int id) {
        return getResources().getStringArray(id);
    }

    protected final String[] getStringArray(String name) {
        return getStringArray(getArrayId(name));
    }

    protected final String getString(String name) {
        return getString(getStringId(name));
    }

    protected final int getColor(String name) {
        return getResources().getColor(getColorId(name));
    }


    protected Drawable getDrawable(String name) {
        return getContext().getDrawable(getDrawableId(name));
    }

    protected final int getDimenToPixels(int id) {
        return getResources().getDimensionPixelSize(id);
    }

    protected final int getDimenToPixels(String name) {
        return getDimenToPixels(getDimenId(name));
    }


    protected final int getOrientation() {
        return getResources().getConfiguration().orientation;
    }

    protected final boolean isPortrait() {
        return getOrientation() == ORIENTATION_PORTRAIT;
    }

    protected final boolean isLandScape() {
        return getOrientation() == ORIENTATION_LANDSCAPE;
    }

    protected final PackageInfo getPackageInfo() throws PackageManager.NameNotFoundException {
        return getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0);
    }

    protected final String getVersionName() {
        try {
            return getPackageInfo().versionName;
        } catch (PackageManager.NameNotFoundException e) {
            lt("getVersionName", e);
        }
        return null;
    }


    protected final boolean hasPermission(String permission) {
        return ActivityCompat.checkSelfPermission(getContext(), permission) == PERMISSION_GRANTED;
    }

    protected final AnimationSet getAnimationSet(boolean shareInterpolator, Animation... animations) {
        AnimationSet animationSet = new AnimationSet(shareInterpolator);
        if (animations != null) {
            for (Animation animation : animations)
                animationSet.addAnimation(animation);
        }

        return animationSet;
    }


    protected final void setViewRadius(float dp, View... views) {
        Me.setViewRadius(dpToPixels(dp), views);
    }

    protected final void setViewRadius(float dp, int... ids) {
        for (int id : ids)
            setViewRadius(dp, getView().findViewById(id));
    }

    protected final void setViewOval(View... views) {
        if (SDK_INT > LOLLIPOP) {
            for (View view : views)
                view.setOutlineProvider(new ViewOutlineProvider() {
                    @Override
                    public void getOutline(View view, Outline outline) {
                        outline.setOval(0, 0, view.getWidth(), view.getHeight());
                        view.setClipToOutline(true);
                    }
                });
        }
    }

    protected final void setViewOval(int... ids) {
        for (int id : ids)
            setViewOval(getView().findViewById(id));
    }

    protected final int getStatusBarHeight() {
        return isPortrait()
                ? getDimenToPixels(getDimenId("status_bar_height", PACKAGE_ANDROID))
                : getDimenToPixels(getDimenId("status_bar_height_landscape", PACKAGE_ANDROID));
    }

    protected final int getNavigationBarHeight() {
        return isPortrait()
                ? getDimenToPixels(getDimenId("navigation_bar_height", PACKAGE_ANDROID))
                : getDimenToPixels(getDimenId("navigation_bar_height_landscape", PACKAGE_ANDROID));
    }

    protected final ConnectivityManager getConnectivityManager() {
        return ((ConnectivityManager) getContext().getSystemService(CONNECTIVITY_SERVICE));
    }

    protected final NotificationManager getNotificationManager() {
        return ((NotificationManager) getContext().getSystemService(NOTIFICATION_SERVICE));
    }

    protected final InputMethodManager getInputMethodManager() {
        return ((InputMethodManager) getContext().getSystemService(INPUT_METHOD_SERVICE));
    }

    protected final TelephonyManager getTelephonyManager() {
        return ((TelephonyManager) getContext().getSystemService(TELEPHONY_SERVICE));
    }

    protected final WifiManager getWifiManager() {
        return ((WifiManager) getContext().getApplicationContext().getSystemService(WIFI_SERVICE));
    }

    protected final ShortcutManager getShortCutManager() {
        if (SDK_INT >= N_MR1)
            return getContext().getSystemService(ShortcutManager.class);
        return null;
    }

    @RequiresPermission(ACCESS_NETWORK_STATE)
    protected final boolean hasNetWork() {
        return Me.hasNetWork(getContext());
    }

    protected final Animation loadAnimation(int id) {
        return AnimationUtils.loadAnimation(getContext(), id);
    }

    protected final Intent getIntent(Class<? extends AppCompatActivity> clazz) {
        return new Intent(getContext(), clazz);
    }

    protected final void startActivity(Class<? extends AppCompatActivity> clazz) {
        startActivity(getIntent(clazz));
    }

    protected final void startActivity(Class<? extends AppCompatActivity> clazz, HashMap<String, String> stringExtras) {
        Intent intent = getIntent(clazz);

        if (stringExtras != null) {
            for (Map.Entry<String, String> entry : stringExtras.entrySet())
                intent.putExtra(entry.getKey(), entry.getValue());
        }

        startActivity(intent);

    }


    protected final void startActivity(Class<? extends AppCompatActivity> clazz, HashMap<String, String> stringExtras, int enterAnimation, int exitAnimation) {
        startActivity(clazz, stringExtras);
        ((AppCompatActivity) getContext()).overridePendingTransition(enterAnimation, exitAnimation);
    }


    protected final void startActivity(Class<? extends AppCompatActivity> clazz, int enterAnimation, int exitAnimation) {
        startActivity(clazz);
        ((AppCompatActivity) getContext()).overridePendingTransition(enterAnimation, exitAnimation);
    }


    protected final void finish(int enterAnimation, int exitAnimation) {
        ((AppCompatActivity) getContext()).finish();
        ((AppCompatActivity) getContext()).overridePendingTransition(enterAnimation, exitAnimation);
    }


    protected final Uri getUriForFile(String authority, File file) {
        return FileProvider.getUriForFile(getContext(), authority, file);
    }


    @RequiresPermission(REQUEST_INSTALL_PACKAGES)
    protected final void install(Uri uri) {
        installApk(getContext(), uri);
    }


    protected final void delay(final long timeMillis, final Runnable runnable) {

        final Handler handler = new Handler() {
            @Override
            public void handleMessage(Message message) {
                if (message.what == 0033)
                    runnable.run();
            }
        };

        getThreadPool().execute(new Runnable() {
            @Override
            public void run() {
                synchronized (runnable) {
                    long first = currentTimeMillis();
                    while (true) {
                        if (onDestroyView)
                            break;
                        else if (currentTimeMillis() - first == timeMillis) {
                            Message message = new Message();
                            message.what = 0033;
                            handler.sendMessage(message);
                            break;
                        }
                    }
                }
            }
        });
    }


    protected final void toast(View view) {
        Me.toast(getContext(), view);
    }

    protected final void toast(String text) {
        Me.toast(getContext(), text);
    }


    protected final void longer(String text) {
        Me.longer(getContext(), text);
    }

    protected final void longer(View view) {
        Me.longer(getContext(), view);
    }


    protected final void sendNotification(int id, int importance, NotificationCompat.Style style, boolean autoCancel, String title, String message, int smallIcon, int largeIcon, RemoteViews remoteViews, PendingIntent pendingIntent) {
        Me.sendNotification(getContext(), id, importance, style, autoCancel, title, message, smallIcon, largeIcon, remoteViews, pendingIntent);
    }


    protected final View inflate(int resource, ViewGroup root, boolean attachToRoot) {
        return inflate(getResources().getLayout(resource), root, attachToRoot);
    }

    protected final View inflate(int resource, ViewGroup root) {
        return inflate(getResources().getLayout(resource), root);
    }

    protected final View inflate(XmlPullParser parser, ViewGroup root, boolean attachToRoot) {
        return getLayoutInflater().inflate(parser, root, attachToRoot);
    }

    protected final View inflate(XmlPullParser parser, ViewGroup root) {
        return inflate(parser, root, root != null);
    }

    protected final boolean isInputMethodShowing() {

        Rect rect = new Rect();

        getDecorView().getWindowVisibleDisplayFrame(rect);

        return getDecorView().getHeight() - rect.bottom > getNavigationBarHeight();
    }


    protected final Bitmap rotateBitmap(Bitmap bitmap, int degrees) {
        Matrix matrix = new Matrix();
        matrix.postRotate(degrees);


        Bitmap flag = createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);

        if (!flag.isRecycled() && degrees != 0)
            flag.recycle();

        return flag;

    }


    protected final void get(String url, CallBackListener callBackListener) {
        get(url, null, callBackListener);
    }


    protected final void get(String url, HashMap<String, String> param, CallBackListener callBackListener) {
        Me.get(getContext(), url, param, true, callBackListener);
    }


    protected final void post(String url, String param, CallBackListener callBackListener) {
        Me.post(getContext(), url, param, true, callBackListener);
    }

    protected final void post(String url, CallBackListener callBackListener) {
        post(url, null, callBackListener);
    }

    protected final void startDownload(String url, String savePath, String fileName, DownloadListener downloadListener) {
        Me.startDownload(getContext(), url, savePath, fileName, downloadListener);
    }

    protected final void startDownload(String url, String fileName, DownloadListener downloadListener) {
        startDownload(url, getMeDirPath(), fileName, downloadListener);
    }


    protected final void startDownload(String url, DownloadListener downloadListener, String savePath) {
        startDownload(url, savePath, subWithLastIndex(url, "/"), downloadListener);
    }


    protected final void startDownload(String url, DownloadListener downloadListener) {
        startDownload(url, subWithLastIndex(url, "/"), downloadListener);
    }

    protected final String getMeDirPath() {
        return getContext().getExternalFilesDir(ME).getPath();
    }

    protected final String getMeDirPath(String type) {
        return getMeDirPath() + separator + type;
    }

    protected final void le(String message) {
        Me.le(getClass().getName(), message);
    }

    protected final void ld(String message) {
        Me.ld(getClass().getSimpleName(), message);
    }

    protected final void li(String message) {
        Me.li(getClass().getSimpleName(), message);
    }

    protected final void lt(String methodName, Throwable e) {
        Me.lt(getClass().getName(), methodName, e);
    }

    protected final void openApp(String packageName) {
        Me.openApp(getContext(), packageName);
    }


    protected final int dpToPixels(float dp) {
        return Me.dpToPixels(getContext(), dp);
    }


    @RequiresPermission(READ_EXTERNAL_STORAGE)
    protected final String getImagePathFromURI(Uri uri) {
        String result;
        Cursor cursor = null;

        try {
            cursor = getContext().getContentResolver().query(uri, null, null, null, null);
        } catch (Throwable e) {
            lt("getImagePathFromURI", e);
        }

        if (cursor == null)
            result = uri.getPath();
        else {
            cursor.moveToFirst();
            result = cursor.getString(cursor.getColumnIndex(DATA));
            cursor.close();
        }

        return result;
    }
}




