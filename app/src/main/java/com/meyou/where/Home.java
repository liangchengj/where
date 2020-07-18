package com.meyou.where;

import android.app.PendingIntent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationManagerCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.meyou.CallBackListener;
import com.meyou.Dialog;
import com.meyou.DownloadListener;
import com.meyou.Focus;
import com.meyou.FunTouchListener;
import com.meyou.Me;
import com.meyou.UIState;
import com.meyou.where.Next.Five;
import com.meyou.where.Next.Four;
import com.meyou.where.Next.One;
import com.meyou.where.Next.Seven;
import com.meyou.where.Next.Six;
import com.meyou.where.Next.Three;
import com.meyou.where.Next.Two;

import java.io.File;
import java.net.HttpURLConnection;

import static android.Manifest.permission.CHANGE_WIFI_STATE;
import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.READ_PHONE_STATE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;
import static android.os.Build.VERSION_CODES.N;
import static com.meyou.UIState.HIDE_SYSTEM_BARS;
import static com.meyou.UIState.LAYOUT_IN_SYSTEM_BARS;
import static com.meyou.where.What.HOME_TO_NEXT_TITLE;
import static com.meyou.where.What.NEXT_TO_HOME;


@UIState({HIDE_SYSTEM_BARS, LAYOUT_IN_SYSTEM_BARS})
public class Home extends Focus implements FunTouchListener {

    static {
        loadNative("where");
    }

    private static native String httpUrl();

    private static native String downloadUrl();

    private static native String proName();


    private boolean onWindowFocusChanged = false;

    private static final String HOME_CHECK_LOAD = "HOME_CHECK_LOAD";
    private static final String UPDATE = "UPDATE";

    private final static int REQUEST_PERMISSIONS = 111;

    private void animation(boolean isStart) {
        findViewById(R.id.homeTopToolBarRight).setVisibility(View.VISIBLE);
        findViewById(R.id.imageButton).setVisibility(View.VISIBLE);

        if (isStart) {
            findViewById(R.id.homeTopToolBarRight).startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.home_top_toolbar_right_move_left));
            findViewById(R.id.imageButton).startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.home_imagebutton_move_bottom));
        }

    }

    private void clickHide() {
        findViewById(R.id.homeTopRightScrollShow).startAnimation(loadAnimation(R.anim.button_click_scrollview_hide));
        findViewById(R.id.homeTopRightScrollShow).setVisibility(View.GONE);
        findViewById(R.id.homeSeeRe).startAnimation(loadAnimation(R.anim.button_click_scrollview_hide));

        findViewById(R.id.homeSeeRe).setVisibility(View.GONE);

        findViewById(R.id.homeTopToolBarRight).startAnimation(loadAnimation(R.anim.home_top_toolbar_right_move_left));
        findViewById(R.id.homeTopToolBarRight).setVisibility(View.VISIBLE);
    }

    private void topRightLoad() {
        for (int i = 1; i <= 7; i++) {
            final int z = i;
            findViewById(getResources().getIdentifier("tool_" + i, "id", getPackageName())).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    homeLoad(z, true);
                    clickHide();
                }
            });

            ((TextView) findViewById(getId("t" + i))).setText(getStringArray(R.array.homeScrollViewTopRightLoad)[i - 1]);
            ((ImageView) findViewById(getId("i" + i))).setImageResource(0);
            if (i == getIntShare("HOME_CHECK_LOAD", 1)) {
                ((ImageView) findViewById(getId("i" + i))).setImageResource(R.drawable.home_check_load_icon);
                continue;
            }
        }
    }

    private void homeLoad(final int checkLoad, final boolean checkAnimation) {
        putShare("HOME_CHECK_LOAD", checkLoad);


        funTouch(R.id.homeTopToolBarRight, this);

        findViewById(R.id.homeTopRightToolBarTextView).setVisibility(View.VISIBLE);
        findViewById(R.id.homeTopRightToolBarTextView).startAnimation(loadAnimation(R.anim.home_top_toolbar_right_text_fade_in));
        ((TextView) findViewById(R.id.homeTopRightToolBarTextView)).setText(getStringArray(R.array.homeScrollViewTopRightLoad)[checkLoad - 1]);


        for (int i = 1; i <= 7; i++)
            findViewById(getId("scrollView_" + i)).setVisibility(View.GONE);


        if (checkAnimation) {
            findViewById(getId("scrollView_" + checkLoad)).
                    startAnimation(loadAnimation(R.anim.home_scrollview_show));
        }

        if (!getBooleanShare(NEXT_TO_HOME, true))
            ((ScrollView) findViewById(getId("scrollView_" + checkLoad))).smoothScrollTo(0, 0);

        findViewById(getId("scrollView_" + checkLoad)).setVisibility(View.VISIBLE);
    }


    private void runIn() {
        if (onWindowFocusChanged && !getBooleanShare(NEXT_TO_HOME, false)) {
            homeLoad(getIntShare("HOME_CHECK_LOAD", 1), true);
            animation(true);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String TAG = getClass().getSimpleName();

        Me.le(TAG, Me.MIME_HTML);

        overridePendingTransition(R.anim.home_scale_in, R.anim.splash_out);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        runIn();

        if (!hasPermission(READ_EXTERNAL_STORAGE)
                || !hasPermission(WRITE_EXTERNAL_STORAGE)
                || !hasPermission(READ_PHONE_STATE)
                || !hasPermission(CHANGE_WIFI_STATE))
            requestPermissions(new String[]{READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE, READ_PHONE_STATE, CHANGE_WIFI_STATE}, REQUEST_PERMISSIONS);

    }

    @Override
    protected void onUIState() {
        super.onUIState();

        if (isPortrait())
            findViewById(R.id.homeBottom).setVisibility(View.VISIBLE);
        else if (isLandScape())
            findViewById(R.id.homeBottom).setVisibility(View.GONE);

        Toast.makeText(this, System.getProperty("os.name") + " " + System.getProperty("os.arch"), Toast.LENGTH_SHORT).show();

    }


    @Override
    public void onWindowFocusChanged(final boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {

            if (getBooleanShare(NEXT_TO_HOME, true) && onWindowFocusChanged) {
                homeLoad(getIntShare(HOME_CHECK_LOAD, 1), false);
                animation(false);

                delay(800, new Runnable() {
                    @Override
                    public void run() {
                        putShare(NEXT_TO_HOME, false);
                    }
                });
            } else if (onWindowFocusChanged) {
                homeLoad(getIntShare(HOME_CHECK_LOAD, 1), true);
                animation(true);

            } else {
                homeLoad(getIntShare(HOME_CHECK_LOAD, 1), false);
                animation(true);
                onWindowFocusChanged = true;
            }

            if (getBooleanShare(UPDATE, false))
                delay(1000, new Runnable() {
                    @Override
                    public void run() {
                        get(httpUrl(), Me.hash("Get", "Version"), new CallBackListener() {

                            private String response = "";

                            @Override
                            public void onCallBacking(HttpURLConnection httpURLConnection, byte[] bytes, boolean responseOver) {
                                if (!responseOver)
                                    response += new String(bytes);
                                else {
                                    if (!getVersionName().equals(response)) {
                                        new Dialog(getContext())
                                                .setHighLightColor(getColor(R.color.colorAccent))
                                                .setMessage("检查到新版本，是否立即更新？")
                                                .setLeftButton("是", new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        putShare(UPDATE, false);
                                                        startDownload(downloadUrl(), new DownloadListener() {
                                                            @Override
                                                            public void onDownloading(String fileName, byte[] bytes, String percentage) {
                                                                sendNotification(133,
                                                                        NotificationManagerCompat.IMPORTANCE_LOW,
                                                                        null,
                                                                        false,
                                                                        "正在下载安装包",
                                                                        "已下载" + percentage,
                                                                        R.drawable.ic_explore, 0, null, null);
                                                            }

                                                            @Override
                                                            public void onPause(String fileName, String percentage) {
                                                                getNotificationManager().cancel(133);
                                                                sendNotification(134,
                                                                        NotificationManagerCompat.IMPORTANCE_LOW,
                                                                        null,
                                                                        false,
                                                                        "下载中断",
                                                                        "已下载" + percentage,
                                                                        R.drawable.ic_explore, 0, null, null);
                                                            }

                                                            @Override
                                                            public void onError(String fileName, String percentage) {
                                                                getNotificationManager().cancel(133);
                                                                sendNotification(134,
                                                                        NotificationManagerCompat.IMPORTANCE_LOW,
                                                                        null,
                                                                        false,
                                                                        "下载出错",
                                                                        "可能服务器上不存在该文件",
                                                                        R.drawable.ic_explore, 0, null, null);
                                                            }

                                                            @Override
                                                            public void onFinish(File file, String fileName) {

                                                                getNotificationManager().cancel(133);

                                                                Uri uri;

                                                                if (SDK_INT >= N)
                                                                    uri = getUriForFile(getPackageName() + "." + proName(), file);
                                                                else
                                                                    uri = Uri.fromFile(file);


                                                                sendNotification(134,
                                                                        NotificationManagerCompat.IMPORTANCE_HIGH,
                                                                        null,
                                                                        true,
                                                                        "下载" + fileName + "完成",
                                                                        "点我安装",
                                                                        R.drawable.ic_explore, 0, null,
                                                                        PendingIntent.getActivity(getContext(), 0, Me.getInstall(uri), 0));
                                                            }

                                                            @Override
                                                            public void noNetWork() {
                                                                getNotificationManager().cancel(133);
                                                                sendNotification(134,
                                                                        NotificationManagerCompat.IMPORTANCE_LOW,
                                                                        null,
                                                                        false,
                                                                        "...",
                                                                        "没有网络无法下载",
                                                                        R.drawable.ic_explore, 0, null, null);
                                                            }
                                                        });
                                                    }
                                                })
                                                .setRightButton("否", new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        putShare(UPDATE, false);
                                                    }
                                                })
                                                .show();
                                    }
                                }
                            }

                            @Override
                            public void onError() {
                                toast("联网检查更新出错");
                            }

                            @Override
                            public void noNetWork() {
                                toast("没有网络，无法检查更新");
                            }
                        });
                    }
                });

        }

    }


    @Override
    protected void onDestroy() {
        putShare(NEXT_TO_HOME, false);
        putShare(UPDATE, true);
        super.onDestroy();
    }


    @Override
    public void onBackPressed() {
        finish(R.anim.desktop_show, R.anim.home_to_desktop);
    }


    public void homeListToolBarClick(final View v) {


        //      a
        for (int i = 0; i < 20; i++) {
            if (v.getId() == getId("tool_a" + (i + 1))) {

                startActivity(getIntent(One.class)
                        .putExtra(One.class.getSimpleName(), (i + 1))
                        .putExtra(HOME_TO_NEXT_TITLE, ((TextView) findViewById(getId("homeToNextTitle_A" + (i + 1)))).getText()));
                overridePendingTransition(R.anim.next_activity_in, R.anim.home_to_next_hide);
                continue;
            }

        }


        //      b
        for (int i = 0; i < 11; i++) {
            if (v.getId() == getId("tool_b" + (i + 1))) {
                startActivity(getIntent(Two.class)
                        .putExtra(Two.class.getSimpleName(), (i + 1))
                        .putExtra(HOME_TO_NEXT_TITLE, ((TextView) findViewById(getId("homeToNextTitle_B" + (i + 1)))).getText()));
                overridePendingTransition(R.anim.next_activity_in, R.anim.home_to_next_hide);
                continue;
            }

        }


        //     c
        for (int i = 0; i < 14; i++) {
            if (v.getId() == getId("tool_c" + (i + 1))) {
                startActivity(getIntent(Three.class)
                        .putExtra(Three.class.getSimpleName(), (i + 1))
                        .putExtra(HOME_TO_NEXT_TITLE, ((TextView) findViewById(getId("homeToNextTitle_C" + (i + 1)))).getText()));
                overridePendingTransition(R.anim.next_activity_in, R.anim.home_to_next_hide);
                continue;
            }

        }


        //     d
        for (int i = 0; i < 8; i++) {
            if (v.getId() == getId("tool_d" + (i + 1))) {
                startActivity(getIntent(Four.class)
                        .putExtra(Four.class.getSimpleName(), (i + 1))
                        .putExtra(HOME_TO_NEXT_TITLE, ((TextView) findViewById(getId("homeToNextTitle_D" + (i + 1)))).getText()));
                overridePendingTransition(R.anim.next_activity_in, R.anim.home_to_next_hide);
                continue;
            }

        }


        //     e
        for (int i = 0; i < 10; i++) {
            if (v.getId() == getId("tool_e" + (i + 1))) {
                startActivity(getIntent(Five.class)
                        .putExtra(Five.class.getSimpleName(), (i + 1))
                        .putExtra(HOME_TO_NEXT_TITLE, ((TextView) findViewById(getId("homeToNextTitle_E" + (i + 1)))).getText()));
                overridePendingTransition(R.anim.next_activity_in, R.anim.home_to_next_hide);
                continue;
            }


        }


        //     f
        for (int i = 0; i < 11; i++) {
            if (v.getId() == getId("tool_f" + (i + 1))) {
                startActivity(getIntent(Six.class)
                        .putExtra(Six.class.getSimpleName(), (i + 1))
                        .putExtra(HOME_TO_NEXT_TITLE, ((TextView) findViewById(getId("homeToNextTitle_F" + (i + 1)))).getText()));
                overridePendingTransition(R.anim.next_activity_in, R.anim.home_to_next_hide);
                continue;
            }


        }


        //      g
        for (int i = 0; i < 6; i++) {
            if (v.getId() == getId("tool_g" + (i + 1))) {
                startActivity(getIntent(Seven.class)
                        .putExtra(Seven.class.getSimpleName(), (i + 1))
                        .putExtra(HOME_TO_NEXT_TITLE, ((TextView) findViewById(getId("homeToNextTitle_G" + (i + 1)))).getText()));
                overridePendingTransition(R.anim.next_activity_in, R.anim.home_to_next_hide);
                continue;
            }
        }


    }

    @Override
    public void onActionDown(View v, MotionEvent event) {
        findViewById(R.id.homeTopToolBarRight).setBackgroundResource(R.drawable.home_top_toolbar_right_drawable_pressed);
        ((TextView) findViewById(R.id.homeTopRightToolBarTextView)).setTextColor(Color.BLACK);
    }

    @Override
    public void onActionUp(View v, MotionEvent event) {
        findViewById(R.id.homeTopToolBarRight).setBackgroundResource(R.drawable.home_top_toolbar_right_drawable);
        ((TextView) findViewById(R.id.homeTopRightToolBarTextView)).setTextColor(Color.WHITE);
    }

    @Override
    public void onClick(View v) {
        findViewById(R.id.homeTopToolBarRight).startAnimation(loadAnimation(R.anim.home_top_toolbar_right_move_right));
        findViewById(R.id.homeTopToolBarRight).setVisibility(View.GONE);

        ((RelativeLayout) findViewById(R.id.home_main_layout)).
                addView(inflate(R.layout.home_top_right_scrollview_show_layout, null));

        findViewById(R.id.homeSeeRe).setVisibility(View.VISIBLE);
        findViewById(R.id.homeSeeRe).startAnimation(loadAnimation(R.anim.home_top_toolbar_right_text_fade_in));

        setViewRadius(15, R.id.homeTopRightScrollShow);
        findViewById(R.id.homeTopRightScrollShow).setVisibility(View.VISIBLE);
        findViewById(R.id.homeTopRightScrollShow).startAnimation(loadAnimation(R.anim.button_click_scrollview_show));


        findViewById(R.id.homeSeeRe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHide();
            }
        });


        topRightLoad();
    }
}





