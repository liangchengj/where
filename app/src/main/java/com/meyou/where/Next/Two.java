package com.meyou.where.Next;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.meyou.where.R;
import com.meyou.where.What;

public class Two extends What {

    private void mainActivityJava(int i) {
        switch (i) {
            case 1:
                codeLoad("import android.content.Intent;\n" +
                        "import android.net.Uri;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity  {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "    private String[] EmailExampleTexts={\"dengjie9934@qq.com\",\"express9934@gmail.com\"};\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        button=(Button) findViewById(R.id.Button_On_EmailExample);\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent=new Intent(Intent.ACTION_SEND);\n" +
                        "                intent.setData(Uri.parse(\"email\"));\n" +
                        "                intent.putExtra(Intent.EXTRA_EMAIL,EmailExampleTexts);\n" +
                        "                intent.putExtra(Intent.EXTRA_SUBJECT,\"This is a Subject.\");\n" +
                        "                intent.putExtra(Intent.EXTRA_TEXT,\"Hi,This is the Email Body.\");\n" +
                        "                intent.setType(\"message/rfc822\");\n" +
                        "\n" +
                        "                Intent chooser=Intent.createChooser(intent,\"Launch Email\");\n" +
                        "                startActivity(chooser);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "\n");
                break;
            case 2:
                codeLoad("import android.content.Intent;\n" +
                        "import android.net.Uri;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity  {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        button=(Button) findViewById(R.id.Button_On_MapsExample);\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "\n" +
                        "                Intent intent=new Intent(Intent.ACTION_VIEW);\n" +
                        "                intent.setData(Uri.parse(\"geo:112.5545,27.5429\"));\n" +
                        "\n" +
                        "                Intent chooser=Intent.createChooser(intent,\"Launch Maps\");\n" +
                        "                startActivity(chooser);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "\n" +
                        "}");
                break;
            case 3:
                codeLoad("import android.content.Intent;\n" +
                        "import android.net.Uri;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.EditText;\n" +
                        "\n" +
                        "/**\n" +
                        " * 注意在AndroidManifest.xml配置文件中添加以下权限：\n" +
                        " * <uses-permission android:name=\"android.permission.CALL_PHONE\"/>\n" +
                        " */\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "    private EditText editText;\n" +
                        "    private String Number;\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        editText=(EditText) findViewById(R.id.EditText_On_PhoneCallExample);\n" +
                        "        button=(Button) findViewById(R.id.Button_On_PhoneCallExample);\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Number=editText.getText().toString();\n" +
                        "\n" +
                        "                Intent intent=new Intent(Intent.ACTION_DIAL);\n" +
                        "                if (Number.trim().isEmpty()){\n" +
                        "                    intent.setData(Uri.parse(\"tel:110\"));\n" +
                        "                }else {\n" +
                        "                    intent.setData(Uri.parse(\"tel:\"+Number));\n" +
                        "                }\n" +
                        "                startActivity(intent);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 4:
                codeLoad("import android.app.Activity;\n" +
                        "import android.content.Intent;\n" +
                        "import android.graphics.Bitmap;\n" +
                        "import android.provider.MediaStore;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageView;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "    private ImageView imageView;\n" +
                        "    private static final int CAMERA_EXAMPLE_REQUEST=110;\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        imageView=(ImageView) findViewById(R.id.ImageView_On_CameraExample);\n" +
                        "        button=(Button) findViewById(R.id.Button_On_CameraExample);\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "\n" +
                        "                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);\n" +
                        "                startActivityForResult(intent,CAMERA_EXAMPLE_REQUEST);\n" +
                        "\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    public void onActivityResult(int requestCode,int resultCode,Intent data){\n" +
                        "        if(requestCode==CAMERA_EXAMPLE_REQUEST&&resultCode== Activity.RESULT_OK){\n" +
                        "            Bitmap photo=(Bitmap) data.getExtras().get(\"data\");\n" +
                        "            imageView.setImageBitmap(photo);\n" +
                        "        }\n" +
                        "    }\n" +
                        "\n" +
                        "}");
                break;
            case 5:
                codeLoad("import android.Manifest;\n" +
                        "import android.annotation.SuppressLint;\n" +
                        "import android.content.Context;\n" +
                        "import android.content.pm.PackageManager;\n" +
                        "import android.support.v4.app.ActivityCompat;\n" +
                        "import android.support.v4.content.ContextCompat;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.telephony.TelephonyManager;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "/**\n" +
                        " * 注意在AndroidManifest.xml配置文件中添加以下权限：\n" +
                        " * <uses-permission android:name=\"android.permission.INTERNET\"/>\n" +
                        " * <uses-permission android:name=\"android.permission.READ_PHONE_STATE\"/>\n" +
                        " */\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "    private TextView textView;\n" +
                        "    private String sPhoneType,info;\n" +
                        "    private static final int PERMISSION_READ_STATE = 123;\n" +
                        "    private boolean isRoaming;\n" +
                        "    private TelephonyManager telephonyManager;\n" +
                        "\n" +
                        "\n" +
                        "    private void MyTelephoneManager() {\n" +
                        "\n" +
                        "        telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);\n" +
                        "        int phoneType = telephonyManager.getPhoneType();\n" +
                        "        switch (phoneType) {\n" +
                        "            case (TelephonyManager.PHONE_TYPE_CDMA):\n" +
                        "                sPhoneType = \"CDMA\";\n" +
                        "                break;\n" +
                        "            case (TelephonyManager.PHONE_TYPE_GSM):\n" +
                        "                sPhoneType = \"GSM\";\n" +
                        "                break;\n" +
                        "            case (TelephonyManager.PHONE_TYPE_SIP):\n" +
                        "                sPhoneType = \"SIP\";\n" +
                        "                break;\n" +
                        "            case (TelephonyManager.PHONE_TYPE_NONE):\n" +
                        "                sPhoneType = \"NONE\";\n" +
                        "            default:\n" +
                        "                break;\n" +
                        "        }\n" +
                        "\n" +
                        "        isRoaming = telephonyManager.isNetworkRoaming();\n" +
                        "\n" +
                        "\n" +
                        "        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {\n" +
                        "            // TODO: Consider calling\n" +
                        "            //    ActivityCompat#requestPermissions\n" +
                        "            // here to request the missing permissions, and then overriding\n" +
                        "            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,\n" +
                        "            //                                          int[] grantResults)\n" +
                        "            // to handle the case where the user grants the permission. See the documentation\n" +
                        "            // for ActivityCompat#requestPermissions for more details.\n" +
                        "            return;\n" +
                        "        }\n" +
                        "\n" +
                        "        @SuppressLint(\"MissingPermission\")\n" +
                        "        String iMEINumber = telephonyManager.getDeviceId();\n" +
                        "\n" +
                        "        @SuppressLint(\"MissingPermission\")\n" +
                        "        String subscriberID = telephonyManager.getDeviceId();\n" +
                        "\n" +
                        "        @SuppressLint(\"MissingPermission\")\n" +
                        "        String simSerialNumber=telephonyManager.getSimSerialNumber();\n" +
                        "\n" +
                        "        @SuppressLint(\"MissingPermission\")\n" +
                        "        String netWorkCountryISO=telephonyManager.getNetworkCountryIso();\n" +
                        "\n" +
                        "        @SuppressLint(\"MissingPermission\")\n" +
                        "        String simCountryISO=telephonyManager.getSimCountryIso();\n" +
                        "\n" +
                        "        @SuppressLint(\"MissingPermission\")\n" +
                        "        String softwareVersion=telephonyManager.getDeviceSoftwareVersion();\n" +
                        "\n" +
                        "        @SuppressLint(\"MissingPermission\")\n" +
                        "        String voiceMailNumber=telephonyManager.getVoiceMailNumber();\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "        info=\"PhoneDetails:\\n\";\n" +
                        "        info+=\"Phone NetWork Type:\"+sPhoneType;\n" +
                        "        info+=\"\\nIMEI Number:\"+iMEINumber;\n" +
                        "        info+=\"\\nSubscriber ID:\"+subscriberID;\n" +
                        "        info+=\"\\nSIM Serial Number:\"+simSerialNumber;\n" +
                        "        info+=\"\\nNetWork Country ISO:\"+netWorkCountryISO;\n" +
                        "        info+=\"\\nSIM Country ISO:\"+simCountryISO;\n" +
                        "        info+=\"\\nSoftWare Version:\"+softwareVersion;\n" +
                        "        info+=\"\\nVoice Mail Number:\"+voiceMailNumber;\n" +
                        "        info+=\"\\nIn Roaming:\"+isRoaming;\n" +
                        "\n" +
                        "        textView.setText(info);\n" +
                        "    }\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        textView=(TextView) findViewById(R.id.TextView_On_GetPhoneDetailsExample);\n" +
                        "        button=(Button) findViewById(R.id.Button_On_GetPhoneDetailsExample);\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "\n" +
                        "                int permission= ContextCompat.checkSelfPermission(getApplicationContext(),Manifest.permission.READ_PHONE_STATE);\n" +
                        "\n" +
                        "                if (permission==PackageManager.PERMISSION_GRANTED){\n" +
                        "                    MyTelephoneManager();\n" +
                        "                }else {\n" +
                        "                    ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.READ_PHONE_STATE},PERMISSION_READ_STATE);\n" +
                        "                }\n" +
                        "\n" +
                        "\n" +
                        "            }});\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onRequestPermissionsResult(int requestCode,String[] permissions,int[] grantResults){\n" +
                        "        super.onRequestPermissionsResult(requestCode,permissions,grantResults);\n" +
                        "\n" +
                        "        if (requestCode==PERMISSION_READ_STATE){\n" +
                        "\n" +
                        "            if(grantResults.length>=0&&grantResults[0]== PackageManager.PERMISSION_GRANTED){\n" +
                        "                MyTelephoneManager();\n" +
                        "            }else {\n" +
                        "                textView.setText(\"You don't have required permission \\nto make the Action\");\n" +
                        "            }\n" +
                        "        }\n" +
                        "\n" +
                        "    }\n" +
                        "}");
                break;
            case 6:
                codeLoad("import android.content.Context;\n" +
                        "import android.net.wifi.WifiManager;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "/**\n" +
                        " * 注意在AndroidManifest.xml配置文件中添加以下权限：\n" +
                        " * <uses-permission android:name=\"android.permission.CHANGE_WIFI_STATE\"/>\n" +
                        " */\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button_1,button_2;\n" +
                        "    private TextView textView;\n" +
                        "    private WifiManager wifiManager;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        button_1=(Button) findViewById(R.id.Button_A_On_ChangeWIFIStateExample);\n" +
                        "        button_2=(Button) findViewById(R.id.Button_B_On_ChangeWIFIStateExample);\n" +
                        "        textView=(TextView) findViewById(R.id.TextView_On_ChangeWIFIStateExample);\n" +
                        "\n" +
                        "        wifiManager=(WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);\n" +
                        "\n" +
                        "        button_1.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                wifiManager.setWifiEnabled(true);\n" +
                        "                textView.setText(\"WIFI已打开\");\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        button_2.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                wifiManager.setWifiEnabled(false);\n" +
                        "                textView.setText(\"WIFI已关闭\");\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 9:
                codeLoad("import android.content.Intent;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "/**\n" +
                        " * Main2Activity在AndroidManifest.xml配置文件中的配置信息如下：\n" +
                        " * \n" +
                        " *    <activity android:name=\".Main2Activity\" >\n" +
                        " *\n" +
                        " *             <intent-filter>\n" +
                        " *                 <action android:name=\"com.Main2Activity\" />\n" +
                        " *\n" +
                        " *                 <category android:name=\"android.intent.category.DEFAULT\" />\n" +
                        " *             </intent-filter>\n" +
                        " *\n" +
                        " *    </activity>\n" +
                        " */\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button_1,button_2;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        button_1=(Button) findViewById(R.id.Button_A_On_ActivityTransition);\n" +
                        "        button_2=(Button) findViewById(R.id.Button_B_On_ActivityTransition);\n" +
                        "\n" +
                        "        button_1.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                /**\n" +
                        "                 * 显性Intent传递\n" +
                        "                 */\n" +
                        "                Intent intent=new Intent();\n" +
                        "                intent.setClass(MainActivity.this,Main2Activity.class);\n" +
                        "                startActivity(intent);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        button_2.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                /**\n" +
                        "                 * 隐性Intent传递\n" +
                        "                 */\n" +
                        "                Intent intent=new Intent();\n" +
                        "                intent.setAction(\"com.Main2Activity\");\n" +
                        "                startActivity(intent);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 10:
                codeLoad("import android.content.Intent;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.EditText;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "    private EditText editText;\n" +
                        "    private String PassingValueExample_Put_String;\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        button=(Button) findViewById(R.id.Button_On_PassingValueExample);\n" +
                        "        editText=(EditText) findViewById(R.id.EditText_On_PassingValueExample);\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                PassingValueExample_Put_String=editText.getText().toString();\n" +
                        "                Intent intent=new Intent();\n" +
                        "                intent.setClass(MainActivity.this,Main2Activity.class);\n" +
                        "                intent.putExtra(\"PassingValueExample\",PassingValueExample_Put_String);\n" +
                        "                startActivity(intent);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "      }\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "}");
                break;
            case 11:
                codeLoad("import android.content.Intent;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "\n" +
                        "    public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "        private Button button;\n" +
                        "        private TextView textView;\n" +
                        "        private int ForResultExample_RequestCode=3210;\n" +
                        "        private String ForResultExample_GetPutString;\n" +
                        "        \n" +
                        "        @Override \n" +
                        "        protected void onCreate(Bundle savedInstanceState) { \n" +
                        "            super.onCreate(savedInstanceState);\n" +
                        "            setContentView(R.layout.activity_main);\n" +
                        "            \n" +
                        "            textView=(TextView) findViewById(R.id.TextView_On_ForResultExample);\n" +
                        "            button=(Button) findViewById(R.id.Button_On_ForResultExample);\n" +
                        "            button.setOnClickListener(new View.OnClickListener() {\n" +
                        "                \n" +
                        "                \n" +
                        "                @Override \n" +
                        "                public void onClick(View v) { \n" +
                        "                    Intent intent=new Intent(getApplicationContext(),Main2Activity.class);\n" +
                        "                    startActivityForResult(intent,ForResultExample_RequestCode ); \n" +
                        "                }\n" +
                        "            });\n" +
                        "\n" +
                        "      }\n" +
                        "\n" +
                        "      \n" +
                        "      \n" +
                        "      @Override \n" +
                        "      public void onActivityResult(int requestCode,int resultCode,Intent data){ \n" +
                        "            super.onActivityResult(requestCode,resultCode,data);\n" +
                        "            if(resultCode==ForResultExample_RequestCode){ \n" +
                        "                ForResultExample_GetPutString=data.getStringExtra(\"Result\");\n" +
                        "                if (ForResultExample_GetPutString.isEmpty()){ \n" +
                        "                    textView.setText(\"你没有输入返回参数哦\"); \n" +
                        "                }else { \n" +
                        "                    textView.setText(ForResultExample_GetPutString); \n" +
                        "                } \n" +
                        "            } \n" +
                        "        }\n" +
                        "}");
            default:
                break;
        }
    }

    private void xml(int i) {
        switch (i) {
            case 1:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "   <TextView\n" +
                        "       android:textSize=\"55dp\"\n" +
                        "       android:textColor=\"#4caf50\"\n" +
                        "       android:text=\"调用邮件\"\n" +
                        "       android:layout_centerHorizontal=\"true\"\n" +
                        "       android:layout_marginTop=\"90dp\"\n" +
                        "       android:layout_width=\"wrap_content\"\n" +
                        "       android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_On_EmailExample\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:background=\"#4caf50\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:text=\"Launch Email\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_width=\"120dp\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 2:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "   <TextView\n" +
                        "       android:textSize=\"55dp\"\n" +
                        "       android:textColor=\"#3fa3fe\"\n" +
                        "       android:text=\"调用地图\"\n" +
                        "       android:layout_centerHorizontal=\"true\"\n" +
                        "       android:layout_marginTop=\"90dp\"\n" +
                        "       android:layout_width=\"wrap_content\"\n" +
                        "       android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_On_MapsExample\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:background=\"#3fa3fe\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:text=\"Launch Maps\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_width=\"120dp\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 3:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "   <EditText\n" +
                        "       android:id=\"@+id/EditText_On_PhoneCallExample\"\n" +
                        "       android:textSize=\"35dp\"\n" +
                        "       android:textColor=\"#509398\"\n" +
                        "       android:inputType=\"phone\"\n" +
                        "       android:textColorHint=\"#f0f0f0\"\n" +
                        "       android:gravity=\"left\"\n" +
                        "       android:layout_centerHorizontal=\"true\"\n" +
                        "       android:hint=\"   Enter TelePhone Number   \"\n" +
                        "       android:layout_marginTop=\"90dp\"\n" +
                        "       android:layout_width=\"wrap_content\"\n" +
                        "       android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_On_PhoneCallExample\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:background=\"#509398\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:text=\"Call\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_width=\"60dp\"\n" +
                        "        android:layout_height=\"30dp\" />\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 4:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        " <ImageView\n" +
                        "     android:id=\"@+id/ImageView_On_CameraExample\"\n" +
                        "     android:background=\"@android:color/transparent\"\n" +
                        "     android:layout_width=\"match_parent\"\n" +
                        "     android:layout_above=\"@id/Button_On_CameraExample\"\n" +
                        "     android:layout_height=\"match_parent\" />\n" +
                        "\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_On_CameraExample\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:background=\"#fabc3d\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:text=\"Launch Camera\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_width=\"130dp\"\n" +
                        "        android:layout_height=\"30dp\" />\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 5:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "    <ScrollView\n" +
                        "        android:scrollbarThumbVertical=\"@android:color/transparent\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_above=\"@id/Button_On_GetPhoneDetailsExample\"\n" +
                        "        android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "        <TextView\n" +
                        "            android:id=\"@+id/TextView_On_GetPhoneDetailsExample\"\n" +
                        "            android:layout_marginLeft=\"30dp\"\n" +
                        "            android:lineSpacingExtra=\"16dp\"\n" +
                        "            android:textColor=\"#00dbaa\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:textStyle=\"bold\"\n" +
                        "            android:textSize=\"20sp\"\n" +
                        "            android:text=\"获取手机信息\"\n" +
                        "            android:layout_height=\"match_parent\"/>\n" +
                        "\n" +
                        "    </ScrollView>\n" +
                        "\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_On_GetPhoneDetailsExample\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:background=\"#00dbaa\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:text=\"Get PhoneDetails\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_width=\"140dp\"\n" +
                        "        android:layout_height=\"30dp\" />\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 6:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/TextView_On_ChangeWIFIStateExample\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:gravity=\"center\"\n" +
                        "        android:layout_marginTop=\"70dp\"\n" +
                        "        android:textColor=\"#fbd50a\"\n" +
                        "        android:text=\"改变WIFI状态\"\n" +
                        "        android:textSize=\"58dp\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:orientation=\"horizontal\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_A_On_ChangeWIFIStateExample\"\n" +
                        "        android:background=\"#fbd50a\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:text=\"开启WIFI\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_weight=\"1\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_B_On_ChangeWIFIStateExample\"\n" +
                        "        android:background=\"#fbd50a\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:text=\"关闭WIFI\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_weight=\"1\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 8:
                break;
            case 9:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "        <TextView\n" +
                        "            android:layout_marginLeft=\"22dp\"\n" +
                        "            android:lineSpacingExtra=\"16dp\"\n" +
                        "            android:textColor=\"#ff5f5f\"\n" +
                        "            android:layout_centerHorizontal=\"true\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_marginTop=\"90dp\"\n" +
                        "            android:textSize=\"50dp\"\n" +
                        "            android:text=\"This is Activity 1\"\n" +
                        "            android:layout_height=\"wrap_content\"/>\n" +
                        "\n" +
                        "\n" +
                        "<LinearLayout\n" +
                        "    android:layout_alignParentBottom=\"true\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_A_On_ActivityTransition\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:background=\"#ff5f5f\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:text=\"显性Intent\"\n" +
                        "        android:layout_weight=\"1\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_B_On_ActivityTransition\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:background=\"#e0e0e0\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:text=\"隐性Intent\"\n" +
                        "        android:layout_weight=\"1\"\n" +
                        "        android:textColor=\"@android:color/black\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "</LinearLayout>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 10:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "    <EditText\n" +
                        "        android:id=\"@+id/EditText_On_PassingValueExample\"\n" +
                        "        android:layout_marginLeft=\"22dp\"\n" +
                        "        android:lineSpacingExtra=\"16dp\"\n" +
                        "        android:textColor=\"#fb7437\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_marginTop=\"90dp\"\n" +
                        "        android:textSize=\"40dp\"\n" +
                        "        android:hint=\"请输入一个参数传递到Activity2\"\n" +
                        "        android:textColorHint=\"#e0e0e0\"\n" +
                        "        android:layout_height=\"wrap_content\"/>\n" +
                        "\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:textColor=\"#e0e0e0\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_above=\"@id/Button_On_PassingValueExample\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginBottom=\"40dp\"\n" +
                        "        android:text=\"传递参数会显示在Activity2\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_On_PassingValueExample\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:background=\"#fb7437\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:text=\"Goto Activity 2\"\n" +
                        "        android:paddingLeft=\"15dp\"\n" +
                        "        android:paddingRight=\"15dp\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 11:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/TextView_On_ForResultExample\"\n" +
                        "        android:layout_marginLeft=\"22dp\"\n" +
                        "        android:lineSpacingExtra=\"16dp\"\n" +
                        "        android:textColor=\"#0070c0\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_marginTop=\"90dp\"\n" +
                        "        android:textSize=\"50dp\"\n" +
                        "        android:text=\"Default Message\"\n" +
                        "        android:layout_height=\"wrap_content\"/>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_On_ForResultExample\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:background=\"#0070c0\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:text=\"Get Message\"\n" +
                        "        android:paddingLeft=\"15dp\"\n" +
                        "        android:paddingRight=\"15dp\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
            default:
                break;
        }
    }

    private void mainActivity2Java(int i) {
        switch (i) {
            case 9:
                codeLoad("import android.content.Intent;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "public class Main2Activity extends  AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main2);\n" +
                        "\n" +
                        "        button=(Button) findViewById(R.id.Button_Goto_On_ActivityTransitionExample);\n" +
                        "\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent=new Intent(Main2Activity.this,MainActivity.class);\n" +
                        "                startActivity(intent);\n" +
                        "                finish();\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "    }\n" +
                        "}");
                break;
            case 10:
                codeLoad("import android.content.Intent;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "public class Main2Activity extends  AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "    private String PassingValueExample_Get_String;\n" +
                        "    private TextView textView;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main2);\n" +
                        "\n" +
                        "        Intent intent=getIntent();\n" +
                        "        PassingValueExample_Get_String=intent.getStringExtra(\"PassingValueExample\");\n" +
                        "\n" +
                        "        button=(Button) findViewById(R.id.Button_Goto_On_PassingValueExample);\n" +
                        "        textView=(TextView) findViewById(R.id.TextView_On_PassingValueExample);\n" +
                        "\n" +
                        "        if (PassingValueExample_Get_String.isEmpty()){\n" +
                        "            textView.setText(\"你没有输入传递参数哦\");\n" +
                        "        }else {\n" +
                        "            textView.setText(PassingValueExample_Get_String);\n" +
                        "        }\n" +
                        "\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent=new Intent(Main2Activity.this,MainActivity.class);\n" +
                        "                startActivity(intent);\n" +
                        "                finish();\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "    }\n" +
                        "}");
                break;
            case 11:
                codeLoad("import android.content.Intent;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.EditText;\n" +
                        "\n" +
                        "public class Main2Activity extends  AppCompatActivity {\n" +
                        "\n" +
                        "    private String ForResultExample_Text;\n" +
                        "    private EditText editText;\n" +
                        "    private Button button;\n" +
                        "    private int ForResultExample_ResultCode=3210;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main2);\n" +
                        "\n" +
                        "        editText=(EditText) findViewById(R.id.EditText_On_ForResultExample);\n" +
                        "        button=(Button) findViewById(R.id.Button_Goto_On_ForResultExample);\n" +
                        "\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                ForResultExample_Text=editText.getText().toString();\n" +
                        "                Intent intent=new Intent();\n" +
                        "                intent.putExtra(\"Result\",ForResultExample_Text);\n" +
                        "                setResult(ForResultExample_ResultCode,intent);\n" +
                        "                finish();\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "}");
            default:
                break;
        }
    }

    private void xml2(int i) {
        switch (i) {
            case 9:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:layout_marginLeft=\"22dp\"\n" +
                        "        android:lineSpacingExtra=\"16dp\"\n" +
                        "        android:textColor=\"#ff5f5f\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_marginTop=\"90dp\"\n" +
                        "        android:textSize=\"50dp\"\n" +
                        "        android:text=\"This is Activity 2\"\n" +
                        "        android:layout_height=\"wrap_content\"/>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Goto_On_ActivityTransitionExample\"\n" +
                        "            android:layout_alignParentBottom=\"true\"\n" +
                        "            android:layout_centerHorizontal=\"true\"\n" +
                        "            android:background=\"#ff5f5f\"\n" +
                        "            style=\"?attr/borderlessButtonStyle\"\n" +
                        "            android:text=\"Goto Activity 1\"\n" +
                        "            android:paddingLeft=\"15dp\"\n" +
                        "            android:paddingRight=\"15dp\"\n" +
                        "            android:textColor=\"@android:color/white\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 10:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/TextView_On_PassingValueExample\"\n" +
                        "        android:layout_marginLeft=\"22dp\"\n" +
                        "        android:lineSpacingExtra=\"16dp\"\n" +
                        "        android:textColor=\"#fb7437\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_marginTop=\"90dp\"\n" +
                        "        android:textSize=\"50dp\"\n" +
                        "        android:text=\"This is Activity 2\"\n" +
                        "        android:layout_height=\"wrap_content\"/>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Goto_On_PassingValueExample\"\n" +
                        "            android:layout_alignParentBottom=\"true\"\n" +
                        "            android:layout_centerHorizontal=\"true\"\n" +
                        "            android:background=\"#fb7437\"\n" +
                        "            style=\"?attr/borderlessButtonStyle\"\n" +
                        "            android:text=\"Goto Activity 1\"\n" +
                        "            android:paddingLeft=\"15dp\"\n" +
                        "            android:paddingRight=\"15dp\"\n" +
                        "            android:textColor=\"@android:color/white\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 11:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "    \n" +
                        "    <EditText\n" +
                        "        android:id=\"@+id/EditText_On_ForResultExample\"\n" +
                        "        android:layout_marginLeft=\"22dp\"\n" +
                        "        android:lineSpacingExtra=\"16dp\"\n" +
                        "        android:textColor=\"#0070c0\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_marginTop=\"90dp\"\n" +
                        "        android:textSize=\"40dp\"\n" +
                        "        android:hint=\"请输入一个参数返回到上一活动\"\n" +
                        "        android:textColorHint=\"#e0e0e0\"\n" +
                        "        android:layout_height=\"wrap_content\"/>\n" +
                        "\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:textColor=\"#e0e0e0\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_above=\"@id/Button_Goto_On_ForResultExample\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginBottom=\"40dp\"\n" +
                        "        android:text=\"返回参数会显示在上一活动\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_Goto_On_ForResultExample\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:background=\"#0070c0\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:text=\"Submit\"\n" +
                        "        android:paddingLeft=\"15dp\"\n" +
                        "        android:paddingRight=\"15dp\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "</RelativeLayout>");
            default:
                break;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivityJava(getLoadValue());
    }


    public void topRightClick(View v) {
        findViewById(R.id.nextScrollviewTopRight).setVisibility(View.VISIBLE);
        findViewById(R.id.nextSeeRe).setVisibility(View.VISIBLE);
        findViewById(R.id.nextScrollviewTopRight).startAnimation(loadAnimation(R.anim.next_scrollview_top_right_show));

        if (getLoadValue() >= 9) {
            for (int i = 0; i < 4; i++) {
                findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1))).setVisibility(View.VISIBLE);
                ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getStringArray(R.array.nextTwoTopRightTextViewRightLoad)[i]);
            }

        } else {
            for (int i = 0; i < 2; i++) {
                findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1))).setVisibility(View.VISIBLE);
                ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getStringArray(R.array.nextTwoTopRightTextViewRightLoad)[i]);
            }
        }


        for (int i = 1; i <= 4; i++) {
            if (v.getId() == getId(SCROLLVIEW_BUTTON_NAME_ + i)) {
                ((Button) findViewById(R.id.nextTopRightButton)).setText(getStringArray(R.array.nextTwoTopRightTextViewRightLoad)[i - 1]);
                topRightHide();

                if (i == 1) mainActivityJava(getLoadValue());
                if (i == 2) xml(getLoadValue());
                if (i == 3) mainActivity2Java(getLoadValue());
                if (i == 4) xml2(getLoadValue());
            }
        }
    }
}
