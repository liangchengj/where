package com.meyou.where;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterViewFlipper;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextClock;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.VideoView;
import android.widget.ViewSwitcher;

import com.meyou.where.Example.ActivityTransitionExample2;
import com.meyou.where.Example.ForResultExample2;
import com.meyou.where.Example.FragmentB;
import com.meyou.where.Example.MyExpandableListViewAdapter;
import com.meyou.where.Example.MyInterface;
import com.meyou.where.Example.PassingValueExample2;
import com.meyou.where.Example.ServiceExample;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Calendar;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import static android.graphics.Color.parseColor;
import static com.meyou.Me.getWhite;
import static com.meyou.Me.startThread;

public class Show extends Common implements MyInterface {

    private static final int REQUEST_OR_RESULT_CODE_CAMERA_EXAMPLE = 1023;

    private static final int REQUEST_PERMISSION_CODE_GET_PHONE_DETAILS = 9934;

    private static final String KEY_DATA_SHARED_PREFERENCE_EXAMPLE = "SHARED_PREFERENCE_DATA";

    private boolean onBinding = false;

    private String[] cities = {"衡阳", "长沙", "湘潭", "武汉", "北京", "重庆", "四川", "防城港", "上海", "大连", "株洲", "广州", "南宁", "乌鲁木齐"};

    private String[] textSwitcherExampleTexts = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    private static String[] listViewExampleTexts = new String[8];

    private static String[] gridViewExampleTexts = listViewExampleTexts;


    static {
        for (int i = 0; i < listViewExampleTexts.length; i++) {
            String common = "View Item     " + (i + 1);

            listViewExampleTexts[i] = "List " + common;
            gridViewExampleTexts[i] = "Grid " + common;
        }
    }


    private int[] imageSwitcherImages = {R.drawable.xxx_1, R.drawable.xxx_2, R.drawable.xxx_3, R.drawable.xxx_4, R.drawable.xxx_5};

    private int[] adapterViewFlipperImages = {R.drawable.fff_1, R.drawable.fff_2, R.drawable.fff_3, R.drawable.fff_4, R.drawable.fff_5};

    private String[] adapterViewFlipperTexts = {"One", "Two", "Three", "Four", "Five"};

    private String[] emailExampleTexts = {"dengjie9934@qq.com", "express9934@gmail.com"};

    private String[] bottomNavigationViewExampleTexts = {"One", "Two", "Three"};


    private String activityLifecycleExampleText = "";

    private int switcherExamplePosition = -1;

    private String phoneDetailsExampleText;

    private ServiceExample.MyBinder myBinder;

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            myBinder = (ServiceExample.MyBinder) service;
            myBinder.show(((Button) findViewById(R.id.Button_Bind_On_Service_Lifecycle_Example)));
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
        }
    };


    private float fromX = 0.0f,
            toX = 0.0f,
            fromY = 0.0f,
            toY = 0.0f;

    private String jsonString = "{\"example\":[A,B,C,D,E,F,G]}";

    private String xmlString = "<example>\n" +
            "    <student>\n" +
            "        <name>Marry</name>\n" +
            "        <class>1</class>\n" +
            "        <age>13</age>\n" +
            "    </student>\n" +
            "\n" +
            "    <student>\n" +
            "        <name>Jon</name>\n" +
            "        <class>2</class>\n" +
            "        <age>22</age>\n" +
            "    </student>\n" +
            "\n" +
            "    <student>\n" +
            "        <name>Tom</name>\n" +
            "        <class>3</class>\n" +
            "        <age>18</age>\n" +
            "    </student>\n" +
            "</example>";


    @SuppressLint("MissingPermission")
    private void phoneDetailsExample() {
        String phoneType = null;
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        switch (telephonyManager.getPhoneType()) {
            case (TelephonyManager.PHONE_TYPE_CDMA):
                phoneType = "CDMA";
                break;
            case (TelephonyManager.PHONE_TYPE_GSM):
                phoneType = "GSM";
                break;
            case (TelephonyManager.PHONE_TYPE_SIP):
                phoneType = "SIP";
                break;
            case (TelephonyManager.PHONE_TYPE_NONE):
                phoneType = "NONE";
            default:
                break;
        }


        phoneDetailsExampleText = "PhoneDetails:\n";
        phoneDetailsExampleText += "Phone NetWork Type:" + phoneType;
        phoneDetailsExampleText += "\nIMEI Number:" + telephonyManager.getDeviceId();
        phoneDetailsExampleText += "\nSubscriber ID:" + telephonyManager.getDeviceId();
        phoneDetailsExampleText += "\nSIM Serial Number:" + telephonyManager.getSimSerialNumber();
        phoneDetailsExampleText += "\nNetWork Country ISO:" + telephonyManager.getNetworkCountryIso();
        phoneDetailsExampleText += "\nSIM Country ISO:" + telephonyManager.getSimCountryIso();
        phoneDetailsExampleText += "\nSoftWare Version:" + telephonyManager.getDeviceSoftwareVersion();
        phoneDetailsExampleText += "\nVoice Mail Number:" + telephonyManager.getVoiceMailNumber();
        phoneDetailsExampleText += "\nIn Roaming:" + telephonyManager.isNetworkRoaming();

        ((TextView) findViewById(R.id.TextView_On_GetPhoneDetailsExample)).setText(phoneDetailsExampleText);


    }


    private void activityLifecycleExample() {
        if (getLoadValue() == 46) {
            String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();

            ;
            activityLifecycleExampleText += methodName + " was Called\n";
            ((TextView) findViewById(R.id.TextView_B_On_ActivityLifecycleExample)).setText(activityLifecycleExampleText);
            toast(methodName + " was Called");
        }
    }


    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutId("showing_" + getLoadValue()));
        activityLifecycleExample();

        switch (getLoadValue()) {
            case 1:
                ((TextView) findViewById(R.id.TextView_On_TextViewExample)).setTextColor(getLoadColor());
                break;
            case 2:
                ((EditText) findViewById(R.id.EditText_On_EditTextExample)).setTextColor(getLoadColor());
                findViewById(R.id.EditText_On_EditTextExample).setBackgroundColor(BAC_GRAY_COLOR);
                setViewRadius(getRadius(), R.id.EditText_On_EditTextExample);
                break;
            case 3:
                oneTouch(R.id.Button_Example);
                setViewRadius(getRadius(), R.id.Button_Example);
                findViewById(R.id.Button_Example).setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        ((Button) findViewById(R.id.Button_Example)).setText("你长按了我");
                        return false;
                    }
                });
                break;
            case 4:
                ((RadioGroup) findViewById(R.id.radioGroup)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.r1:
                                findViewById(R.id.showing_4_re).setBackgroundColor(Color.RED);
                                break;
                            case R.id.r2:
                                findViewById(R.id.showing_4_re).setBackgroundColor(Color.GREEN);
                                break;
                            case R.id.r3:
                                findViewById(R.id.showing_4_re).setBackgroundColor(Color.BLUE);
                            default:
                                break;
                        }
                    }
                });
                break;
            case 5:
                oneTouch(R.id.Button_On_CheckBoxExample);
                setViewRadius(0, R.id.Button_On_CheckBoxExample);
                break;
            case 6:
                oneTouch(R.id.Button_On_RatingBarExample);
                break;
            case 8:
                oneTouch(R.id.Button_On_ProgressBarExample);
                break;
            case 9:
                oneTouch(R.id.ToggleButton_On_ToggleButtonExample);
                final TextView tV9 = findViewById(R.id.TextView_On_Toggle_Switch_Example);
                final Switch sw9 = findViewById(R.id.Switch_On_Switch_Example);
                sw9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (sw9.isChecked())
                            tV9.setText("Switch处于开启状态");
                        else
                            tV9.setText("Switch处于关闭状态");
                    }
                });
                break;
            case 10:
                ((Spinner) findViewById(R.id.Spinner_Example)).setAdapter(new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, cities));
                ((Spinner) findViewById(R.id.Spinner_Example)).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        ((TextView) findViewById(R.id.text_on_spinner)).setText("你最喜欢的城市是：" + cities[position]);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
                break;
            case 11:
                AutoCompleteTextView autoCompleteTextView = findViewById(R.id.AutoCompleteTextView_Example);
                autoCompleteTextView.setBackgroundColor(BAC_GRAY_COLOR);
                autoCompleteTextView.setTextColor(getLoadColor());
                autoCompleteTextView.setAdapter(new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, cities));

                setViewRadius(getRadius(), autoCompleteTextView);

                ((TextView) findViewById(R.id.TextView_On_AutoCompleteTextViewExample)).setTextColor(getLoadColor());

                break;
            case 12:

                CheckedTextView checkedTextView = findViewById(R.id.CheckedTextView_On_CheckedTextViewExample);
                checkedTextView.setTextColor(getLoadColor());
                checkedTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Show.this.onClick(v);
                    }
                });
                break;
            case 13:
                ((TextView) findViewById(R.id.TextView_On_TextSwitcherExample)).setTextColor(getLoadColor());
                ((TextSwitcher) findViewById(R.id.TextSwitcher_On_TextSwitcherExample)).setFactory(new ViewSwitcher.ViewFactory() {
                    @Override
                    public View makeView() {
                        TextView textView = new TextView(getApplicationContext());
                        textView.setTextColor(getLoadColor());
                        textView.setTextSize(34);
                        textView.setGravity(Gravity.CENTER);
                        return textView;
                    }
                });

                moreTouch(R.id.Button_Right_On_TextSwitcherExample,
                        R.id.Button_Left_On_TextSwitcherExample);

                break;
            case 14:
                ((TextView) findViewById(R.id.TextView_On_ImageSwitcherExample)).setTextColor(getLoadColor());
                ((ImageSwitcher) findViewById(R.id.ImageSwitcher_On_ImageSwitcherExample)).setFactory(new ViewSwitcher.ViewFactory() {
                    @Override
                    public View makeView() {
                        ImageView imageView = new ImageView(getApplicationContext());
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
                        return imageView;
                    }
                });

                moreTouch(R.id.Button_Right_On_ImageSwitcherExample,
                        R.id.Button_Left_On_ImageSwitcherExample);

                break;
            case 15:

                ((TextView) findViewById(R.id.TextView_On_AdapterViewFlipperExample)).setTextColor(getLoadColor());

                ((AdapterViewFlipper) findViewById(R.id.AdapterViewFlipper_On_AdapterViewFilterExample)).
                        setAdapter(new AdapterViewFlipperAdapter(adapterViewFlipperImages, adapterViewFlipperTexts));
                ((AdapterViewFlipper) findViewById(R.id.AdapterViewFlipper_On_AdapterViewFilterExample)).setAutoStart(true);

                break;
            case 16:
                findViewById(R.id.ImageButton_On_ImageButtonExample).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ((TextView) findViewById(R.id.TextView_On_ImageButtonExample)).setText("你点击了ImageButton");
                    }
                });
                break;
            case 18:

                findViewById(R.id.codeTopLine).setPadding(dpToPixels(5), dpToPixels(5), dpToPixels(5), dpToPixels(5));
                findViewById(R.id.codeTopLine).setBackgroundColor(getColor(R.color.homeTopToolBarBac));
                setViewRadius(17, R.id.codeTopLine);

                VideoView videoView = findViewById(R.id.VideoView_On_VideoViewExample);
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.example);
                videoView.requestFocus();
                videoView.start();
                break;
            case 19:
                ((TextClock) findViewById(R.id.TextClock_On_TextClockExample)).setTextColor(getLoadColor());
                break;
            case 20:
                Chronometer chronometer = findViewById(R.id.Chronometer_On_ChronometerExample);
                chronometer.setTextColor(getLoadColor());
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
                break;
            case 21:
                ((TextView) findViewById(R.id.TextView_On_EmailExample)).setTextColor(getLoadColor());
                oneTouch(R.id.Button_On_EmailExample);
                break;
            case 22:
                ((TextView) findViewById(R.id.TextView_On_MapsExample)).setTextColor(getLoadColor());
                oneTouch(R.id.Button_On_MapsExample);
                break;
            case 23:
                ((EditText) findViewById(R.id.EditText_On_PhoneCallExample)).setTextColor(getLoadColor());
                findViewById(R.id.EditText_On_PhoneCallExample).setBackgroundColor(BAC_GRAY_COLOR);
                setViewRadius(getRadius(), R.id.EditText_On_PhoneCallExample);
                oneTouch(R.id.Button_On_PhoneCallExample);
                break;
            case 24:
                oneTouch(R.id.Button_On_CameraExample);
                break;
            case 25:
                ((TextView) findViewById(R.id.TextView_On_GetPhoneDetailsExample)).setTextColor(getLoadColor());
                oneTouch(R.id.Button_On_GetPhoneDetailsExample);
                break;
            case 26:
                ((TextView) findViewById(R.id.TextView_On_ChangeWIFIStateExample)).setTextColor(getLoadColor());
                moreTouch(R.id.Button_A_On_ChangeWIFIStateExample,
                        R.id.Button_B_On_ChangeWIFIStateExample);
                break;
            case 29:
                ((TextView) findViewById(R.id.TextView_On_ActivityTransitionExample)).setTextColor(getLoadColor());
                moreTouch(R.id.Button_A_On_ActivityTransition,
                        R.id.Button_B_On_ActivityTransition);
                break;
            case 30:
                ((EditText) findViewById(R.id.EditText_On_PassingValueExample)).setTextColor(getLoadColor());
                findViewById(R.id.EditText_On_PassingValueExample).setBackgroundColor(BAC_GRAY_COLOR);
                setViewRadius(getRadius(), R.id.EditText_On_PassingValueExample);
                oneTouch(R.id.Button_On_PassingValueExample);
                break;
            case 31:
                ((TextView) findViewById(R.id.TextView_On_ForResultExample)).setTextColor(getLoadColor());
                oneTouch(R.id.Button_On_ForResultExample);
                break;
            case 32:
                ((ListView) findViewById(R.id.ListView_On_ListViewExample)).setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, listViewExampleTexts));
                break;
            case 33:
                ((ExpandableListView) findViewById(R.id.ExpandableListView_On_ExpandableListViewExample)).setAdapter(new MyExpandableListViewAdapter(getApplicationContext(),
                        MyExpandableListViewAdapter.ChildProvider.getInfo(),
                        new ArrayList<>(MyExpandableListViewAdapter.ChildProvider.getInfo().keySet())));
                break;
            case 34:
                ((GridView) findViewById(R.id.GridView_On_GridViewExample)).setAdapter(new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, gridViewExampleTexts));
                break;
            case 35:
                WebView webView = findViewById(R.id.WebView_On_WebViewExample);
                webView.setWebViewClient(new WebViewClient());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.loadUrl("http://www.dgtle.com");
                break;
            case 36:
                final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, cities);
                ((ListView) findViewById(R.id.ListView_On_SearchViewExample)).setAdapter(arrayAdapter);
                ((SearchView) findViewById(R.id.SearchView_On_SearchViewExample)).setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                    @Override
                    public boolean onQueryTextSubmit(String query) {
                        return false;
                    }

                    @Override
                    public boolean onQueryTextChange(String newText) {
                        arrayAdapter.getFilter().filter(newText);
                        return false;
                    }
                });

                ((ListView) findViewById(R.id.ListView_On_SearchViewExample)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        ((SearchView) findViewById(R.id.SearchView_On_SearchViewExample)).setQuery(arrayAdapter.getItem(position), false);
                    }
                });

                break;
            case 37:
                oneTouch(R.id.Button_On_PopUpMenuExample);
                setViewRadius(getRadius(), R.id.Button_On_PopUpMenuExample);
                break;
            case 38:
                ((DatePicker) findViewById(R.id.DatePicker_On_DatePickerExample)).init(Calendar.getInstance().get(Calendar.YEAR),
                        Calendar.getInstance().get(Calendar.MONTH),
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH),
                        new DatePicker.OnDateChangedListener() {
                            @Override
                            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                toast(year + "年" + (monthOfYear + 1) + "月" + dayOfMonth + "日");
                            }
                        });
                break;
            case 39:
                ((TimePicker) findViewById(R.id.TimePicker_On_TimePickerExample)).setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
                    @Override
                    public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                        toast(hourOfDay + ":" + minute);
                    }
                });
                break;
            case 40:
                ((TextView) findViewById(R.id.TextView_On_TextInputEditTextExample)).setTextColor(getLoadColor());
                oneTouch(R.id.Button_On_TextInputEditTextExample);
                break;
            case 41:
                findViewById(R.id.FloatingActionButton_FloatingActionButtonExample).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Show.this.onClick(v);
                    }
                });
                ((TextView) findViewById(R.id.TextView_On_FloatingActionButtonExample)).setTextColor(getLoadColor());
                break;
            case 42:
                final TextView tV42 = findViewById(R.id.TextView_On_BottomNavigationViewExample);
                BottomNavigationView bottomNavigationView = findViewById(R.id.BottomNavigationView_On_BottomNavigationViewExample);
                bottomNavigationView.setBackgroundColor(getLoadColor());
                bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        for (int i = 0; i < 3; i++) {
                            if (menuItem.getItemId() == getId("action_" + (i + 1)))
                                tV42.setText("你点击了" + bottomNavigationViewExampleTexts[i]);

                        }
                        return false;

                    }
                });

                tV42.setTextColor(getLoadColor());

                break;
            case 43:
                ((TextView) findViewById(R.id.TextView_On_NavigationViewExample)).setTextColor(getLoadColor());
                break;
            case 44:
                setViewRadius(20,
                        R.id.ImageView_A_On_ScrollViewExample,
                        R.id.ImageView_B_On_ScrollViewExample,
                        R.id.ImageView_C_On_ScrollViewExample,
                        R.id.ImageView_D_On_ScrollViewExample,
                        R.id.ImageView_E_On_ScrollViewExample,
                        R.id.ImageView_F_On_ScrollViewExample,
                        R.id.ImageView_G_On_ScrollViewExample);
                break;
            case 45:
                oneTouch(R.id.Button_On_NestedScrollViewExample);
                setViewRadius(getRadius(), R.id.Button_On_NestedScrollViewExample);
                BottomSheetBehavior.from(findViewById(R.id.RelativeLayout_On_NestedScrollViewExample)).setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {

                    @Override
                    public void onStateChanged(@NonNull View view, int i) {
                        if (i == BottomSheetBehavior.STATE_COLLAPSED)
                            ((TextView) findViewById(R.id.TextView_On_NestedScrollViewExample)).setText("上滑以打开NestedScrollView");
                        else if (i == BottomSheetBehavior.STATE_EXPANDED)
                            ((TextView) findViewById(R.id.TextView_On_NestedScrollViewExample)).setText("下滑以关闭NestedScrollView");
                    }

                    @Override
                    public void onSlide(@NonNull View view, float v) {
                    }
                });
                break;
            case 46:
                ((TextView) findViewById(R.id.TextView_A_On_ActivityLifecycleExample)).setTextColor(getLoadColor());
                ((TextView) findViewById(R.id.TextView_B_On_ActivityLifecycleExample)).setTextColor(getLoadColor());
                break;
            case 49:
                findViewById(R.id.codeTopLine).setPadding(dpToPixels(10), dpToPixels(5), dpToPixels(10), dpToPixels(5));
                findViewById(R.id.codeTopLine).setBackgroundColor(Color.argb(200, 255, 255, 255));
                setViewRadius(12, R.id.codeTopLine);
                findViewById(R.id.RelativeLayout_On_InterFragmentCommunicationExample).setBackgroundColor(Color.RED);
                break;
            case 52:
                for (int id : new int[]{
                        R.id.Button_Start_On_Service_Lifecycle_Example,
                        R.id.Button_Stop_On_Service_Lifecycle_Example,
                        R.id.Button_Bind_On_Service_Lifecycle_Example,
                        R.id.Button_Unbind_On_Service_Lifecycle_Example
                })
                    oneTouch(id);
                break;
            case 54:
                moreTouch(R.id.Button_Left_On_FadeAnimationExample,
                        R.id.Button_Right_On_FadeAnimationExample);
                break;
            case 55:
                moreTouch(R.id.Button_Left_On_ZoomAnimationExample,
                        R.id.Button_Right_On_ZoomAnimationExample);
                break;
            case 56:
                moreTouch(R.id.Button_Left_On_RotateAnimationExample,
                        R.id.Button_Right_On_RotateAnimationExample);
                break;
            case 57:
                moreTouch(R.id.Button_Left_On_TranslateAnimationExample,
                        R.id.Button_Up_On_TranslateAnimationExample);

                moreTouch(R.id.Button_Right_On_TranslateAnimationExample,
                        R.id.Button_Down_On_TranslateAnimationExample);
                break;
            case 58:
                moreTouch(R.id.Button_Left_On_SlideAnimationExample,
                        R.id.Button_Up_On_SlideAnimationExample);

                moreTouch(R.id.Button_Right_On_SlideAnimationExample,
                        R.id.Button_Down_On_SlideAnimationExample);
                break;
            case 59:
                oneTouch(R.id.Button_On_BounceAnimationExample);
                break;
            case 60:
                oneTouch(R.id.Button_On_BlinkAnimationExample);
                break;
            case 61:
                moreTouch(R.id.Button_Left_On_ScaleAnimationExample,
                        R.id.Button_Right_On_ScaleAnimationExample);
                break;
            case 62:
                oneTouch(R.id.Button_On_SequentialAnimationExample);
                break;
            case 63:
                oneTouch(R.id.Button_On_TogetherAnimationExample);
                break;
            case 64:
                moreTouch(R.id.Button_Left_On_SharedPreferenceExample,
                        R.id.Button_Right_On_SharedPreferenceExample);
                EditText editText = findViewById(R.id.EditText_On_SharedPreferenceExample);
                editText.setBackgroundColor(getLoadColor());
                editText.setTextColor(Color.WHITE);
                editText.setHintTextColor(getWhite(220));
                setViewRadius(15, editText);
                break;
            case 69:
                TextView textView = findViewById(R.id.TextView_On_JSONParsingExample);
                textView.setTextColor(getLoadColor());
                textView.setText("JSON:            " + jsonString);
                oneTouch(R.id.Button_On_JSPNParsingExample);
                break;
            case 70:
                TextView xmlLeft = findViewById(R.id.TextView_Left_On_XMLParsingExample);
                xmlLeft.setTextColor(getLoadColor());
                xmlLeft.setText(xmlString);

                ((TextView) findViewById(R.id.TextView_Right_On_XMLParsingExample)).setTextColor(getLoadColor());

                oneTouch(R.id.Button_On_XMLParsingExample);
                break;
            case 71:
                oneTouch(R.id.Button_On_SQLiteInsertExample);
                ((EditText) findViewById(R.id.EditText_Name_On_SQLiteInsertExample)).setTextColor(getLoadColor());
                ((EditText) findViewById(R.id.EditText_Sex_On_SQLiteInsertExample)).setTextColor(getLoadColor());
                ((EditText) findViewById(R.id.EditText_Hobbies_On_SQLiteInsertExample)).setTextColor(getLoadColor());
                break;
            case 72:
                oneTouch(R.id.Button_On_SQLiteDeleteExample);
                ((EditText) findViewById(R.id.EditText_Id_On_SQLiteDeleteExample)).setTextColor(getLoadColor());
                break;
            case 73:
                oneTouch(R.id.Button_On_SQLiteUpdateExample);
                ((EditText) findViewById(R.id.EditText_Id_On_SQLiteUpdateExample)).setTextColor(getLoadColor());
                ((EditText) findViewById(R.id.EditText_Name_On_SQLiteUpdateExample)).setTextColor(getLoadColor());
                ((EditText) findViewById(R.id.EditText_Sex_On_SQLiteUpdateExample)).setTextColor(getLoadColor());
                ((EditText) findViewById(R.id.EditText_Hobbies_On_SQLiteUpdateExample)).setTextColor(getLoadColor());
                break;
            case 74:
                oneTouch(R.id.Button_On_SQLiteReadExample);
                ((TextView) findViewById(R.id.TextView_On_SQLiteReadExample)).setTextColor(getLoadColor());
                break;
            case 75:
                oneTouch(R.id.Button_On_SimpleNotificationExample);
                break;
            case 76:
                oneTouch(R.id.Button_On_InboxStyleNotificationExample);
                break;
            case 77:
                oneTouch(R.id.Button_On_BigTextStyleNotificationExample);
                break;
            case 78:
                oneTouch(R.id.Button_On_BigPictureStyleNotificationExample);
                break;
            case 79:
                oneTouch(R.id.Button_On_SnackBarExample);
                break;
            case 80:
                oneTouch(R.id.Button_On_ToastExample);
                setViewRadius(24, R.id.Button_On_ToastExample);
            default:
                break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Button_Example:
                ((Button) findViewById(R.id.Button_Example)).setText("你点击了我");
                break;
            case R.id.Button_On_CheckBoxExample:
                CheckBox checkBox1 = findViewById(R.id.c1);
                CheckBox checkBox2 = findViewById(R.id.c2);
                CheckBox checkBox3 = findViewById(R.id.c3);

                if (checkBox1.isChecked() == true
                        && checkBox2.isChecked() == true
                        && checkBox3.isChecked() == true) {

                    findViewById(R.id.showing_5_re).setBackgroundColor(parseColor("#FFFFFF"));

                } else if (checkBox1.isChecked() == true && checkBox2.isChecked() == true) {

                    findViewById(R.id.showing_5_re).setBackgroundColor(parseColor("#FFFF00"));

                } else if (checkBox1.isChecked() == true && checkBox3.isChecked() == true) {

                    findViewById(R.id.showing_5_re).setBackgroundColor(parseColor("#FF00FF"));

                } else if (checkBox2.isChecked() == true && checkBox3.isChecked() == true) {

                    findViewById(R.id.showing_5_re).setBackgroundColor(parseColor("#00FFFF"));

                } else if (checkBox1.isChecked() == true) {

                    findViewById(R.id.showing_5_re).setBackgroundColor(Color.RED);

                } else if (checkBox2.isChecked() == true) {

                    findViewById(R.id.showing_5_re).setBackgroundColor(Color.GREEN);

                } else if (checkBox3.isChecked() == true) {

                    findViewById(R.id.showing_5_re).setBackgroundColor(Color.BLUE);

                }
                break;
            case R.id.Button_On_RatingBarExample:
                ((Button) findViewById(R.id.Button_On_RatingBarExample)).setText(String.valueOf(((RatingBar) findViewById(R.id.RatingBar_Example)).getRating()));
                break;
            case R.id.Button_On_ProgressBarExample:
                startThread(new Thread() {
                    @Override
                    public void run() {
                        int i = 0;
                        while (i <= 100) {
                            try {
                                ((ProgressBar) findViewById(R.id.ProgressBar_On_ProgressBarExample)).setProgress(i);
                                i += 10;
                                sleep(1000);
                            } catch (InterruptedException e) {
                                lt("startThread", e);
                            }
                        }
                    }
                });
                break;
            case R.id.CheckedTextView_On_CheckedTextViewExample:
                ((CheckedTextView) findViewById(R.id.CheckedTextView_On_CheckedTextViewExample)).toggle();
                break;
            case R.id.Button_Right_On_TextSwitcherExample:
                if (switcherExamplePosition < textSwitcherExampleTexts.length - 1) {
                    switcherExamplePosition += 1;
                    ((TextSwitcher) findViewById(R.id.TextSwitcher_On_TextSwitcherExample)).setText(textSwitcherExampleTexts[switcherExamplePosition]);
                }
                break;
            case R.id.Button_Left_On_TextSwitcherExample:
                if (switcherExamplePosition > 0) {
                    switcherExamplePosition -= 1;
                    ((TextSwitcher) findViewById(R.id.TextSwitcher_On_TextSwitcherExample)).setText(textSwitcherExampleTexts[switcherExamplePosition]);
                }
                break;
            case R.id.Button_Right_On_ImageSwitcherExample:
                if (switcherExamplePosition < imageSwitcherImages.length - 1) {
                    switcherExamplePosition += 1;
                    findViewById(R.id.ImageSwitcher_On_ImageSwitcherExample).setBackgroundResource(imageSwitcherImages[switcherExamplePosition]);
                }
                break;
            case R.id.Button_Left_On_ImageSwitcherExample:
                if (switcherExamplePosition > 0) {
                    switcherExamplePosition -= 1;
                    findViewById(R.id.ImageSwitcher_On_ImageSwitcherExample).setBackgroundResource(imageSwitcherImages[switcherExamplePosition]);
                }
                break;
            case R.id.Button_On_EmailExample:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("email"));
                intent.putExtra(Intent.EXTRA_EMAIL, emailExampleTexts);
                intent.putExtra(Intent.EXTRA_SUBJECT, "This is a Subject.");
                intent.putExtra(Intent.EXTRA_TEXT, "Hi,This is the Email body.");
                intent.setType("message/rfc822");

                startActivity(Intent.createChooser(intent, "Launch Email"));
                break;
            case R.id.Button_On_MapsExample:
                try {
                    startActivity(Intent.createChooser(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("geo:112.5545,27.5429")), "Launch Maps"));
                } catch (ActivityNotFoundException e) {
                    ((TextView) findViewById(R.id.TextView_On_MapsExample)).setText("手机上没有地图APP");
                }

                break;
            case R.id.Button_On_PhoneCallExample:
                if (((EditText) findViewById(R.id.EditText_On_PhoneCallExample)).getText().toString().trim().isEmpty()) {
                    startActivity(new Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:110")));
                } else {
                    startActivity(new Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:" + ((EditText) findViewById(R.id.EditText_On_PhoneCallExample)).getText().toString())));
                }
                break;
            case R.id.Button_On_CameraExample:
                startActivityForResult(new Intent(MediaStore.ACTION_IMAGE_CAPTURE), REQUEST_OR_RESULT_CODE_CAMERA_EXAMPLE);
                break;
            case R.id.Button_On_GetPhoneDetailsExample:
                if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED)
                    phoneDetailsExample();
                else
                    ActivityCompat.requestPermissions(Show.this, new String[]{Manifest.permission.READ_PHONE_STATE}, REQUEST_PERMISSION_CODE_GET_PHONE_DETAILS);
                break;
            case R.id.Button_A_On_ChangeWIFIStateExample:
                ((WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE)).setWifiEnabled(true);
                ((TextView) findViewById(R.id.TextView_On_ChangeWIFIStateExample)).setText("WIFI OPENED");
                break;
            case R.id.Button_B_On_ChangeWIFIStateExample:
                ((WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE)).setWifiEnabled(false);
                ((TextView) findViewById(R.id.TextView_On_ChangeWIFIStateExample)).setText("WIFI CLOSED");
                break;
            case R.id.Button_A_On_ActivityTransition:
            case R.id.Button_B_On_ActivityTransition:
                startActivity(getIntent(ActivityTransitionExample2.class)
                        .putExtra(PROPERTY, getLoadValue())
                        .putExtra(PROPERTY_TITLE, getPropertyTitle())
                        .putExtra(SHOW_CODE_PASSING, getLoadValue()));
                overridePendingTransition(R.anim.next_yan, R.anim.next_to_code);
                break;
            case R.id.Button_On_PassingValueExample:
                startActivity(getIntent(PassingValueExample2.class)
                        .putExtra(PROPERTY, getLoadValue())
                        .putExtra(PROPERTY_TITLE, getPropertyTitle())
                        .putExtra(PassingValueExample2.EXTRA_PASSING_VALUE_EXAMPLE, ((EditText) findViewById(R.id.EditText_On_PassingValueExample)).getText().toString())
                        .putExtra(SHOW_CODE_PASSING, getLoadValue()));
                overridePendingTransition(R.anim.next_yan, R.anim.next_to_code);

                break;
            case R.id.Button_On_ForResultExample:
                startActivityForResult(getIntent(ForResultExample2.class)
                        .putExtra(PROPERTY, getLoadValue())
                        .putExtra(PROPERTY_TITLE, getPropertyTitle())
                        .putExtra(SHOW_CODE_PASSING, getLoadValue()), ForResultExample2.REQUEST_OR_RESULT_CODE_FOR_RESULT_EXAMPLE);
                overridePendingTransition(R.anim.next_yan, R.anim.next_to_code);
                break;
            case R.id.Button_On_PopUpMenuExample:
                final PopupMenu popupMenu = new PopupMenu(getApplicationContext(), findViewById(R.id.Button_On_PopUpMenuExample));
                popupMenu.getMenuInflater().inflate(R.menu.menu_popup, popupMenu.getMenu());
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        ((Button) findViewById(R.id.Button_On_PopUpMenuExample)).setText(item.getTitle());
                        popupMenu.dismiss();
                        return false;
                    }
                });
                break;
            case R.id.Button_On_TextInputEditTextExample:
                TextInputEditText userNameInput = findViewById(R.id.TextInputEditText_A_OnExample);
                TextInputEditText passwordInput = findViewById(R.id.TextInputEditText_B_OnExample);

                if (TextUtils.isEmpty(userNameInput.getText().toString().trim())
                        || TextUtils.isEmpty(passwordInput.getText().toString().trim())) {
                    if (TextUtils.isEmpty(userNameInput.getText().toString().trim()))
                        userNameInput.setError("UserName can't be Empty");
                    else if (TextUtils.isEmpty(passwordInput.getText().toString().trim()))
                        passwordInput.setError("Password can't be Empty");
                } else {
                    ((TextView) findViewById(R.id.TextView_On_TextInputEditTextExample)).setText("Login Success");
                    userNameInput.setText("");
                    passwordInput.setText("");
                }
                break;
            case R.id.FloatingActionButton_FloatingActionButtonExample:
                ((TextView) findViewById(R.id.TextView_On_FloatingActionButtonExample)).setText("你点击了\nFloatingActionButton");
                break;
            case R.id.Button_On_NestedScrollViewExample:
                if (BottomSheetBehavior.from(findViewById(R.id.RelativeLayout_On_NestedScrollViewExample)).getState() == BottomSheetBehavior.STATE_COLLAPSED) {
                    BottomSheetBehavior.from(findViewById(R.id.RelativeLayout_On_NestedScrollViewExample)).setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    BottomSheetBehavior.from(findViewById(R.id.RelativeLayout_On_NestedScrollViewExample)).setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
                break;
            case R.id.Button_Start_On_Service_Lifecycle_Example:
                startService(new Intent(getContext(), Service.class));
                break;
            case R.id.Button_Stop_On_Service_Lifecycle_Example:
                stopService(new Intent(getContext(), Service.class));
                break;
            case R.id.Button_Bind_On_Service_Lifecycle_Example:
                bindService(new Intent(getContext(), ServiceExample.class), serviceConnection, BIND_AUTO_CREATE);
                onBinding = true;
                break;
            case R.id.Button_Unbind_On_Service_Lifecycle_Example:
                if (onBinding) {
                    unbindService(serviceConnection);
                    ((Button) findViewById(R.id.Button_Bind_On_Service_Lifecycle_Example)).setText("绑定服务");
                    onBinding = false;
                }
                break;
            case R.id.Button_Left_On_FadeAnimationExample:
                findViewById(R.id.ImageView_On_FadeAnimationExample).startAnimation(loadAnimation(android.R.anim.fade_in));
                findViewById(R.id.ImageView_On_FadeAnimationExample).setVisibility(View.VISIBLE);
                break;
            case R.id.Button_Right_On_FadeAnimationExample:
                findViewById(R.id.ImageView_On_FadeAnimationExample).startAnimation(loadAnimation(android.R.anim.fade_out));
                findViewById(R.id.ImageView_On_FadeAnimationExample).setVisibility(View.GONE);
                break;
            case R.id.Button_Left_On_RotateAnimationExample:
                RotateAnimation rotateAnimation = new RotateAnimation(0, -90,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                rotateAnimation.setDuration(300);
                rotateAnimation.setFillAfter(true);
                findViewById(R.id.ImageView_On_RotateAnimationExample).startAnimation(rotateAnimation);
                break;
            case R.id.Button_Right_On_RotateAnimationExample:
                RotateAnimation rotate = new RotateAnimation(0, 90,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                rotate.setDuration(300);
                rotate.setFillAfter(true);
                findViewById(R.id.ImageView_On_RotateAnimationExample).startAnimation(rotate);
                break;
            case R.id.Button_Left_On_TranslateAnimationExample:
                fromX = toX;
                toX -= 0.2f;
                fromY = toY;
                TranslateAnimation moveLeft = new TranslateAnimation(Animation.RELATIVE_TO_SELF, fromX,
                        Animation.RELATIVE_TO_SELF, toX,
                        Animation.RELATIVE_TO_SELF, fromY,
                        Animation.RELATIVE_TO_SELF, toY);
                moveLeft.setInterpolator(new LinearInterpolator());
                moveLeft.setDuration(300);
                moveLeft.setFillAfter(true);
                findViewById(R.id.ImageView_On_TranslateAnimationExample).startAnimation(moveLeft);
                break;
            case R.id.Button_Up_On_TranslateAnimationExample:
                fromY = toY;
                toY -= 0.2f;
                fromX = toX;
                TranslateAnimation moveUp = new TranslateAnimation(Animation.RELATIVE_TO_SELF, fromX,
                        Animation.RELATIVE_TO_SELF, toX,
                        Animation.RELATIVE_TO_SELF, fromY,
                        Animation.RELATIVE_TO_SELF, toY);
                moveUp.setInterpolator(new LinearInterpolator());
                moveUp.setDuration(300);
                moveUp.setFillAfter(true);
                findViewById(R.id.ImageView_On_TranslateAnimationExample).startAnimation(moveUp);
                break;
            case R.id.Button_Right_On_TranslateAnimationExample:
                fromX = toX;
                toX += 0.2f;
                fromY = toY;
                TranslateAnimation moveRight = new TranslateAnimation(Animation.RELATIVE_TO_SELF, fromX,
                        Animation.RELATIVE_TO_SELF, toX,
                        Animation.RELATIVE_TO_SELF, fromY,
                        Animation.RELATIVE_TO_SELF, toY);
                moveRight.setInterpolator(new LinearInterpolator());
                moveRight.setDuration(300);
                moveRight.setFillAfter(true);
                findViewById(R.id.ImageView_On_TranslateAnimationExample).startAnimation(moveRight);
                break;
            case R.id.Button_Down_On_TranslateAnimationExample:
                fromY = toY;
                toY += 0.2f;
                fromX = toX;
                TranslateAnimation moveBottom = new TranslateAnimation(Animation.RELATIVE_TO_SELF, fromX,
                        Animation.RELATIVE_TO_SELF, toX,
                        Animation.RELATIVE_TO_SELF, fromY,
                        Animation.RELATIVE_TO_SELF, toY);
                moveBottom.setInterpolator(new LinearInterpolator());
                moveBottom.setDuration(300);
                moveBottom.setFillAfter(true);
                findViewById(R.id.ImageView_On_TranslateAnimationExample).startAnimation(moveBottom);
                break;
            case R.id.Button_Left_On_ScaleAnimationExample:
                ScaleAnimation scaleUp = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                scaleUp.setDuration(300);
                scaleUp.setInterpolator(new AccelerateDecelerateInterpolator());
                scaleUp.setFillAfter(true);


                findViewById(R.id.ImageView_On_ScaleAnimationExample).startAnimation(scaleUp);
                findViewById(R.id.ImageView_On_ScaleAnimationExample).setVisibility(View.VISIBLE);
                break;
            case R.id.Button_Right_On_ScaleAnimationExample:
                ScaleAnimation scaleDown = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                scaleDown.setDuration(300);
                scaleDown.setInterpolator(new AccelerateDecelerateInterpolator());
                scaleDown.setFillAfter(true);

                findViewById(R.id.ImageView_On_ScaleAnimationExample).startAnimation(scaleDown);
                findViewById(R.id.ImageView_On_ScaleAnimationExample).setVisibility(View.GONE);
                break;
            case R.id.Button_Left_On_ZoomAnimationExample:
                ScaleAnimation zoomIn = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                zoomIn.setDuration(300);
                zoomIn.setInterpolator(new AccelerateDecelerateInterpolator());
                zoomIn.setFillAfter(true);


                findViewById(R.id.ImageView_On_ZoomAnimationExample).startAnimation(zoomIn);
                break;
            case R.id.Button_Right_On_ZoomAnimationExample:
                ScaleAnimation zoomOut = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                zoomOut.setDuration(300);
                zoomOut.setInterpolator(new AccelerateDecelerateInterpolator());
                zoomOut.setFillAfter(true);

                findViewById(R.id.ImageView_On_ZoomAnimationExample).startAnimation(zoomOut);
                break;
            case R.id.Button_Left_On_SlideAnimationExample:
                ScaleAnimation slideLeft = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                slideLeft.setInterpolator(new LinearInterpolator());
                slideLeft.setDuration(300);
                slideLeft.setFillAfter(true);
                findViewById(R.id.ImageView_On_SlideAnimationExample).startAnimation(slideLeft);
                break;
            case R.id.Button_Up_On_SlideAnimationExample:
                ScaleAnimation slideUp = new ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.0f);
                slideUp.setInterpolator(new LinearInterpolator());
                slideUp.setDuration(300);
                slideUp.setFillAfter(true);
                findViewById(R.id.ImageView_On_SlideAnimationExample).startAnimation(slideUp);
                break;
            case R.id.Button_Right_On_SlideAnimationExample:
                ScaleAnimation slideRight = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f,
                        Animation.RELATIVE_TO_SELF, 1.0f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                slideRight.setInterpolator(new LinearInterpolator());
                slideRight.setDuration(300);
                slideRight.setFillAfter(true);
                findViewById(R.id.ImageView_On_SlideAnimationExample).startAnimation(slideRight);
                break;
            case R.id.Button_Down_On_SlideAnimationExample:
                ScaleAnimation slideDown = new ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 1.0f);
                slideDown.setInterpolator(new LinearInterpolator());
                slideDown.setDuration(300);
                slideDown.setFillAfter(true);
                findViewById(R.id.ImageView_On_SlideAnimationExample).startAnimation(slideDown);
                break;
            case R.id.Button_On_BounceAnimationExample:
                TranslateAnimation bounce = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, -2.2f,
                        Animation.RELATIVE_TO_SELF, 0.0f);
                bounce.setDuration(1000);
                bounce.setFillAfter(true);
                bounce.setInterpolator(new BounceInterpolator());

                findViewById(R.id.ImageView_On_BounceAnimationExample).startAnimation(bounce);
                break;
            case R.id.Button_On_BlinkAnimationExample:
                AlphaAnimation blink = new AlphaAnimation(0.0f, 1.0f);
                blink.setDuration(500);
                blink.setFillAfter(true);
                blink.setInterpolator(new AccelerateDecelerateInterpolator());
                blink.setRepeatCount(Animation.INFINITE);
                blink.setRepeatMode(Animation.REVERSE);

                findViewById(R.id.ImageView_On_BlinkAnimationExample).startAnimation(blink);
                break;
            case R.id.Button_On_SequentialAnimationExample:

                TranslateAnimation t1 = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, -0.5f,
                        Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f);
                t1.setDuration(1000);
                t1.setInterpolator(new LinearInterpolator());
                t1.setFillAfter(true);


                TranslateAnimation t2 = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, -0.5f);
                t2.setDuration(1000);
                t2.setInterpolator(new LinearInterpolator());
                t2.setFillAfter(true);
                t2.setStartOffset(2000);


                TranslateAnimation t3 = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f);
                t3.setDuration(1000);
                t3.setInterpolator(new LinearInterpolator());
                t3.setFillAfter(true);
                t3.setStartOffset(3000);

                TranslateAnimation t4 = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.0f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                t4.setDuration(1000);
                t4.setInterpolator(new LinearInterpolator());
                t4.setFillAfter(true);
                t4.setStartOffset(4000);

                findViewById(R.id.ImageView_On_SequentialAnimationExample).startAnimation(getAnimationSet(false, t1, t2, t3, t4));
                break;
            case R.id.Button_On_TogetherAnimationExample:
                ScaleAnimation a1 = new ScaleAnimation(1.0f, 1.6f, 1.0f, 1.6f,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                a1.setDuration(4000);
                a1.setInterpolator(new LinearInterpolator());
                a1.setFillAfter(true);


                RotateAnimation a2 = new RotateAnimation(0, 360,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                a2.setDuration(600);
                a2.setInterpolator(new LinearInterpolator());
                a2.setFillAfter(true);
                a2.setRepeatCount(Animation.INFINITE);
                a2.setRepeatMode(Animation.RESTART);


                ScaleAnimation a3 = new ScaleAnimation(1.6f, 1.0f, 1.6f, 1.0f,
                        Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                a3.setDuration(4000);
                a3.setInterpolator(new LinearInterpolator());
                a3.setFillAfter(true);
                a3.setStartOffset(4000);

                findViewById(R.id.ImageView_On_TogetherAnimationExample).startAnimation(getAnimationSet(false, a1, a2, a3));
                break;
            case R.id.Button_Left_On_SharedPreferenceExample:
                putShare(KEY_DATA_SHARED_PREFERENCE_EXAMPLE, ((EditText) findViewById(R.id.EditText_On_SharedPreferenceExample)).getText().toString());
                toast("Data Saved Successfully");
                break;
            case R.id.Button_Right_On_SharedPreferenceExample:
                toast("DATA:" + getStringShare(KEY_DATA_SHARED_PREFERENCE_EXAMPLE, ""));
                break;
            case R.id.Button_On_JSPNParsingExample:
                try {
                    TextView textView = findViewById(R.id.TextView_On_JSONParsingExample);

                    JSONObject jsonObject = new JSONObject(jsonString);
                    JSONArray jsonArray = jsonObject.getJSONArray("example");
                    String result = "";

                    for (int i = 0; i < jsonArray.length(); i++)
                        result += jsonArray.getString(i);

                    textView.setText(textView.getText() + "\n\n\n\n" + "Result:" + "\n\n" + result);
                } catch (JSONException e) {
                    le("JSON parsing with Error!");
                }
                break;
            case R.id.Button_On_XMLParsingExample:
                try {
                    Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xmlString)));
                    document.getDocumentElement().normalize();

                    NodeList nodeList = document.getElementsByTagName("student");

                    String result = "Result:\n\n\n";

                    for (int i = 0; i < nodeList.getLength(); i++) {
                        Node node = nodeList.item(i);
                        if (node.getNodeType() == Node.ELEMENT_NODE) {
                            Element element = (Element) node;
                            String name = element.getElementsByTagName("name").item(0).getTextContent();
                            String cl = element.getElementsByTagName("class").item(0).getTextContent();
                            String age = element.getElementsByTagName("age").item(0).getTextContent();

                            result += "     Name:" + name + "\n" +
                                    "     Class:" + cl + "\n" +
                                    "     Age:" + age + "\n\n";
                        }
                    }

                    ((TextView) findViewById(R.id.TextView_Right_On_XMLParsingExample)).setText(result);

                } catch (IOException e) {
                    e.printStackTrace();
                } catch (SAXException e) {
                    e.printStackTrace();
                } catch (ParserConfigurationException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.Button_On_SQLiteInsertExample:
                String name = ((EditText) findViewById(R.id.EditText_Name_On_SQLiteInsertExample)).getText().toString();
                String sex = ((EditText) findViewById(R.id.EditText_Sex_On_SQLiteInsertExample)).getText().toString();
                String hobbies = ((EditText) findViewById(R.id.EditText_Hobbies_On_SQLiteInsertExample)).getText().toString();

                boolean insertOK = new SQLiteOpenHelper().insertData(name, sex, hobbies);

                if (insertOK)
                    toast("Data Inserted Successfully");

                else
                    toast("Data Insertion Failed");

                break;
            case R.id.Button_On_SQLiteDeleteExample:
                String idDelete = ((EditText) findViewById(R.id.EditText_Id_On_SQLiteDeleteExample)).getText().toString();
                toast("Rows:  " + new SQLiteOpenHelper().deleteData(idDelete) + " Affected");
                break;
            case R.id.Button_On_SQLiteUpdateExample:
                String idUpdate = ((EditText) findViewById(R.id.EditText_Id_On_SQLiteUpdateExample)).getText().toString();
                String nameUpdate = ((EditText) findViewById(R.id.EditText_Name_On_SQLiteUpdateExample)).getText().toString();
                String sexUpdate = ((EditText) findViewById(R.id.EditText_Sex_On_SQLiteUpdateExample)).getText().toString();
                String hobbiesUpdate = ((EditText) findViewById(R.id.EditText_Hobbies_On_SQLiteUpdateExample)).getText().toString();

                boolean updateOK = new SQLiteOpenHelper().updateData(idUpdate, nameUpdate, sexUpdate, hobbiesUpdate);

                if (updateOK)
                    toast("Data Updated Successfully");
                else
                    toast("No Rows Affected");

                break;
            case R.id.Button_On_SQLiteReadExample:
                ((TextView) findViewById(R.id.TextView_On_SQLiteReadExample)).setText(new SQLiteOpenHelper().readData());
                break;
            case R.id.Button_On_SimpleNotificationExample:
                sendNotification(777,
                        NotificationManager.IMPORTANCE_HIGH,
                        null,
                        true,
                        "Simple Notification",
                        "Example",
                        R.drawable.ic_explore, 0,
                        null, null);
                break;
            case R.id.Button_On_InboxStyleNotificationExample:
                NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                inboxStyle.setBigContentTitle("Inbox");
                for (int i = 0; i < 7; i++)
                    inboxStyle.addLine(textSwitcherExampleTexts[i]);

                sendNotification(888,
                        NotificationManager.IMPORTANCE_HIGH,
                        inboxStyle,
                        true,
                        "Inbox Style Notification",
                        "Example",
                        R.drawable.ic_explore, 0,
                        null, null);
                break;
            case R.id.Button_On_BigTextStyleNotificationExample:

                NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();

                bigTextStyle.bigText("My family\n" +
                        "　　I love my family, because I have a happy family. My father is an English teacher." +
                        " His name is Jacky. He is thirty-eight. " +
                        "He likes playing basketball. What’s my mother job? " +
                        "Is she a teacher? Yes, you’re right! " +
                        "My mother is very kind and nice, she is thirty-seven." +
                        " My mother is always laborious work. I love my parents!" +
                        " On Saturday and Sunday, I often go to the library and play the piano, My father go to play basketball. " +
                        "Sometimes, we watch TV and listen to music at home. I love my family." +
                        " Because I’m very happy to live with my parents together!");
                bigTextStyle.setBigContentTitle("Big Text Style");
                bigTextStyle.setSummaryText("else");

                sendNotification(999,
                        NotificationManager.IMPORTANCE_HIGH,
                        bigTextStyle,
                        true,
                        "Big Text Style Notification",
                        "Example",
                        R.drawable.ic_explore, 0,
                        null, null);
                break;
            case R.id.Button_On_BigPictureStyleNotificationExample:

                NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                bigPictureStyle.bigPicture(BitmapFactory.decodeResource(getResources(), R.drawable.zzz_78));

                sendNotification(1111,
                        NotificationManager.IMPORTANCE_HIGH,
                        bigPictureStyle,
                        true,
                        "Big Picture Style Notification",
                        "Example",
                        R.drawable.ic_explore, 0,
                        null, null);
                break;
            case R.id.Button_On_SnackBarExample:
                Snackbar.make(view, "Welcome", Snackbar.LENGTH_SHORT)
                        .setAction("OK", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                toast("Clicked OK");
                            }
                        }).show();
                break;
            case R.id.Button_On_ToastExample:
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setImageResource(R.drawable.zzz_80);

                int dimen = dpToPixels(150);

                FrameLayout frameLayout = new FrameLayout(getApplicationContext());
                frameLayout.addView(imageView);
                frameLayout.setPadding(dimen, dimen, dimen, dimen);

                longer(frameLayout.getRootView());
            default:
                break;
        }
    }


    @Override
    protected void onStart() {
        activityLifecycleExample();
        super.onStart();
    }

    @Override
    protected void onUIState() {
        hideSystemBars();
        layoutInSystemBars();
        if (getLoadValue() == 18)
            setWindowDrawable(R.drawable.next_window_drawable_white);
        else
            setWindowDrawable(R.drawable.next_window_drawable);
    }

    @Override
    protected void onResume() {
        activityLifecycleExample();
        super.onResume();
    }

    @Override
    protected void onPause() {
        activityLifecycleExample();
        super.onPause();
    }

    @Override
    protected void onStop() {
        activityLifecycleExample();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        activityLifecycleExample();
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        activityLifecycleExample();
        super.onRestart();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_OR_RESULT_CODE_CAMERA_EXAMPLE && resultCode == RESULT_OK)
            ((ImageView) findViewById(R.id.ImageView_On_CameraExample)).setImageBitmap((Bitmap) data.getExtras().get("data"));


        if (resultCode == ForResultExample2.REQUEST_OR_RESULT_CODE_FOR_RESULT_EXAMPLE) {
            if (data.getStringExtra(ForResultExample2.EXTRA_FOR_RESULT_EXAMPLE).isEmpty())
                ((TextView) findViewById(R.id.TextView_On_ForResultExample)).setText("你没有输入返回参数哦");
            else
                ((TextView) findViewById(R.id.TextView_On_ForResultExample)).setText(data.getStringExtra(ForResultExample2.EXTRA_FOR_RESULT_EXAMPLE));

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_PERMISSION_CODE_GET_PHONE_DETAILS && grantResults[0] == PackageManager.PERMISSION_GRANTED)
            phoneDetailsExample();
        else
            ((TextView) findViewById(R.id.TextView_On_GetPhoneDetailsExample)).setText("You don't have required permission \nto make the Action");


    }

    @Override
    public void set(String data) {
        ((FragmentB) getSupportFragmentManager().findFragmentById(R.id.Fragment_B_On_InterFragmentCommunicationExample)).setShow(data);
    }


    class AdapterViewFlipperAdapter extends BaseAdapter {
        private int[] images;
        private String[] texts;

        public AdapterViewFlipperAdapter(int[] images, String[] texts) {
            this.images = images;
            this.texts = texts;
        }

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = inflate(R.layout.flipper_items, null);
            ((ImageView) convertView.findViewById(R.id.AdapterViewFlipper_Example_ImageView)).setImageResource(images[position]);
            ((TextView) convertView.findViewById(R.id.AdapterViewFlipper_Example_TextView)).setText(texts[position]);
            return convertView;
        }
    }


    class SQLiteOpenHelper extends android.database.sqlite.SQLiteOpenHelper {

        private final static String TABLE_NAME = "Tell";

        private final static String COLUMN_ID = "ID";
        private final static String COLUMN_NAME = "NAME";
        private final static String COLUMN_SEX = "SEX";
        private final static String COLUMN_HOBBIES = "HOBBIES";

        public SQLiteOpenHelper() {
            super(Show.this, "FirstSQLite.db", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE " + TABLE_NAME + "(" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    COLUMN_NAME + " TEXT," +
                    COLUMN_SEX + " TEXT," +
                    COLUMN_HOBBIES + " TEXT)");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }

        public synchronized boolean insertData(String name, String sex, String hobbies) {
            SQLiteDatabase sqLiteDatabase = getWritableDatabase();

            ContentValues contentValues = new ContentValues();
            contentValues.put(COLUMN_NAME, name);
            contentValues.put(COLUMN_SEX, sex);
            contentValues.put(COLUMN_HOBBIES, hobbies);

            long result = sqLiteDatabase.insert(TABLE_NAME, null, contentValues);

            sqLiteDatabase.close();

            return result != -1;
        }

        public synchronized int deleteData(String id) {
            SQLiteDatabase sqLiteDatabase = getWritableDatabase();
            int rows = sqLiteDatabase.delete(TABLE_NAME, COLUMN_ID + "=?", new String[]{id});
            sqLiteDatabase.close();
            return rows;
        }


        public synchronized boolean updateData(String id, String name, String sex, String hobbies) {
            SQLiteDatabase sqLiteDatabase = getWritableDatabase();

            ContentValues contentValues = new ContentValues();
            contentValues.put(COLUMN_NAME, name);
            contentValues.put(COLUMN_SEX, sex);
            contentValues.put(COLUMN_HOBBIES, hobbies);

            int result = sqLiteDatabase.update(TABLE_NAME, contentValues, COLUMN_ID + "=?", new String[]{id});

            sqLiteDatabase.close();

            return result > 0;
        }


        public synchronized String readData() {
            SQLiteDatabase sqLiteDatabase = getWritableDatabase();
            Cursor cursor = sqLiteDatabase.query(TABLE_NAME, null, null, null, null, null, null);

            String query;

            if (cursor != null && cursor.getCount() > 0) {
                query = "";
                while (cursor.moveToNext()) {
                    query += "Id:  " + cursor.getInt(cursor.getColumnIndex(COLUMN_ID)) + "\n";
                    query += "Name:  " + cursor.getString(cursor.getColumnIndex(COLUMN_NAME)) + "\n";
                    query += "Sex:  " + cursor.getString(cursor.getColumnIndex(COLUMN_SEX)) + "\n";
                    query += "Hobbies:  " + cursor.getString(cursor.getColumnIndex(COLUMN_HOBBIES)) + "\n\n\n";
                }

            } else
                query = "No Data to Retrieve";

            cursor.close();
            sqLiteDatabase.close();

            return query;
        }

    }


}
