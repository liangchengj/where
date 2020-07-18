package com.meyou.where.Next;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.meyou.where.R;
import com.meyou.where.What;

public class Seven extends What {


    private void mainActivityJava(int i) {
        switch (i) {
            case 1:
                codeLoad("import android.app.Notification;\n" +
                        "import android.app.NotificationChannel;\n" +
                        "import android.app.NotificationManager;\n" +
                        "import android.graphics.BitmapFactory;\n" +
                        "import android.os.Build;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v4.app.NotificationCompat;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "    private final static String NOTIFICATION_ID=\"777\";\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        button=findViewById(R.id.Button_On_SimpleNotificationExample);\n" +
                        "\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "\n" +
                        "                NotificationManager notificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);\n" +
                        "\n" +
                        "                /**\n" +
                        "                 * 安卓8.0或安卓8.0以上推送通知需要创建NotificationChannel\n" +
                        "                 */\n" +
                        "                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O)\n" +
                        "                    notificationManager.createNotificationChannel(new NotificationChannel(NOTIFICATION_ID,\"Simple\", NotificationManager.IMPORTANCE_HIGH));\n" +
                        "\n" +
                        "                Notification notification=new NotificationCompat.Builder(MainActivity.this,NOTIFICATION_ID)\n" +
                        "                        .setAutoCancel(false)\n" +
                        "                        .setWhen(System.currentTimeMillis())\n" +
                        "                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),0))\n" +
                        "                        .setSmallIcon(R.drawable.ic_explore)\n" +
                        "                        .setContentTitle(\"Simple Notification\")\n" +
                        "                        .setContentText(\"Example\")\n" +
                        "                        .build();\n" +
                        "\n" +
                        "                notificationManager.notify(Integer.parseInt(NOTIFICATION_ID),notification);\n" +
                        "\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 2:
                codeLoad("import android.app.Notification;\n" +
                        "import android.app.NotificationChannel;\n" +
                        "import android.app.NotificationManager;\n" +
                        "import android.graphics.BitmapFactory;\n" +
                        "import android.os.Build;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v4.app.NotificationCompat;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "    private final static String NOTIFICATION_ID=\"888\";\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        button=findViewById(R.id.Button_On_InboxStyleNotificationExample);\n" +
                        "\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "\n" +
                        "                NotificationManager notificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);\n" +
                        "\n" +
                        "                /**\n" +
                        "                 * 安卓8.0或安卓8.0以上推送通知需要创建NotificationChannel\n" +
                        "                 */\n" +
                        "                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O)\n" +
                        "                    notificationManager.createNotificationChannel(new NotificationChannel(NOTIFICATION_ID,\"Simple\", NotificationManager.IMPORTANCE_HIGH));\n" +
                        "\n" +
                        "                NotificationCompat.InboxStyle inboxStyle=new NotificationCompat.InboxStyle();\n" +
                        "                inboxStyle.setBigContentTitle(\"Inbox\");\n" +
                        "                inboxStyle.addLine(\"A\");\n" +
                        "                inboxStyle.addLine(\"B\");\n" +
                        "                inboxStyle.addLine(\"C\");\n" +
                        "                inboxStyle.addLine(\"D\");\n" +
                        "                inboxStyle.addLine(\"E\");\n" +
                        "                inboxStyle.addLine(\"F\");\n" +
                        "                inboxStyle.addLine(\"G\");\n" +
                        "\n" +
                        "                Notification notification=new NotificationCompat.Builder(MainActivity.this,NOTIFICATION_ID)\n" +
                        "                        .setAutoCancel(false)\n" +
                        "                        .setWhen(System.currentTimeMillis())\n" +
                        "                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),0))\n" +
                        "                        .setSmallIcon(R.drawable.ic_explore)\n" +
                        "                        .setContentTitle(\"Inbox Style Notification\")\n" +
                        "                        .setContentText(\"Example\")\n" +
                        "                        .setStyle(inboxStyle)\n" +
                        "                        .build();\n" +
                        "\n" +
                        "                notificationManager.notify(Integer.parseInt(NOTIFICATION_ID),notification);\n" +
                        "\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 3:
                codeLoad("import android.app.Notification;\n" +
                        "import android.app.NotificationChannel;\n" +
                        "import android.app.NotificationManager;\n" +
                        "import android.graphics.BitmapFactory;\n" +
                        "import android.os.Build;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v4.app.NotificationCompat;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "    private final static String NOTIFICATION_ID=\"999\";\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        button=findViewById(R.id.Button_On_BigTextStyleNotificationExample);\n" +
                        "\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "\n" +
                        "                NotificationManager notificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);\n" +
                        "\n" +
                        "                /**\n" +
                        "                 * 安卓8.0或安卓8.0以上推送通知需要创建NotificationChannel\n" +
                        "                 */\n" +
                        "                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O)\n" +
                        "                    notificationManager.createNotificationChannel(new NotificationChannel(NOTIFICATION_ID,\"Simple\", NotificationManager.IMPORTANCE_HIGH));\n" +
                        "\n" +
                        "                NotificationCompat.BigTextStyle bigTextStyle=new NotificationCompat.BigTextStyle();\n" +
                        "\n" +
                        "                bigTextStyle.bigText(\"My family\\n\" +\n" +
                        "                        \"　　I love my family, because I have a happy family. My father is an English teacher.\" +\n" +
                        "                        \" His name is Jacky. He is thirty-eight. \" +\n" +
                        "                        \"He likes playing basketball. What’s my mother job? \" +\n" +
                        "                        \"Is she a teacher? Yes, you’re right! \" +\n" +
                        "                        \"My mother is very kind and nice, she is thirty-seven.\" +\n" +
                        "                        \" My mother is always laborious work. I love my parents!\" +\n" +
                        "                        \" On Saturday and Sunday, I often go to the library and play the piano, My father go to play basketball. \" +\n" +
                        "                        \"Sometimes, we watch TV and listen to music at home. I love my family.\" +\n" +
                        "                        \" Because I’m very happy to live with my parents together!\");\n" +
                        "                bigTextStyle.setBigContentTitle(\"Big Text Style\");\n" +
                        "                bigTextStyle.setSummaryText(\"else\");\n" +
                        "\n" +
                        "                Notification notification=new NotificationCompat.Builder(MainActivity.this,NOTIFICATION_ID)\n" +
                        "                        .setAutoCancel(false)\n" +
                        "                        .setWhen(System.currentTimeMillis())\n" +
                        "                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),0))\n" +
                        "                        .setSmallIcon(R.drawable.ic_explore)\n" +
                        "                        .setContentTitle(\"Big Text Style Notification\")\n" +
                        "                        .setContentText(\"Example\")\n" +
                        "                        .setStyle(bigTextStyle)\n" +
                        "                        .build();\n" +
                        "\n" +
                        "                notificationManager.notify(Integer.parseInt(NOTIFICATION_ID),notification);\n" +
                        "\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 4:
                codeLoad("import android.app.Notification;\n" +
                        "import android.app.NotificationChannel;\n" +
                        "import android.app.NotificationManager;\n" +
                        "import android.graphics.BitmapFactory;\n" +
                        "import android.os.Build;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v4.app.NotificationCompat;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "    private final static String NOTIFICATION_ID=\"1111\";\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        button=findViewById(R.id.Button_On_BigPictureStyleNotificationExample);\n" +
                        "\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "\n" +
                        "                NotificationManager notificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);\n" +
                        "\n" +
                        "                /**\n" +
                        "                 * 安卓8.0或安卓8.0以上推送通知需要创建NotificationChannel\n" +
                        "                 */\n" +
                        "                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O)\n" +
                        "                    notificationManager.createNotificationChannel(new NotificationChannel(NOTIFICATION_ID,\"Simple\", NotificationManager.IMPORTANCE_HIGH));\n" +
                        "\n" +
                        "                NotificationCompat.BigPictureStyle bigPictureStyle=new NotificationCompat.BigPictureStyle();\n" +
                        "                bigPictureStyle.bigPicture(BitmapFactory.decodeResource(getResources(),R.drawable.zzz_78));\n" +
                        "\n" +
                        "                Notification notification=new NotificationCompat.Builder(MainActivity.this,NOTIFICATION_ID)\n" +
                        "                        .setAutoCancel(false)\n" +
                        "                        .setWhen(System.currentTimeMillis())\n" +
                        "                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),0))\n" +
                        "                        .setSmallIcon(R.drawable.ic_explore)\n" +
                        "                        .setContentTitle(\"Big Picture Style Notification\")\n" +
                        "                        .setContentText(\"Example\")\n" +
                        "                        .setStyle(bigPictureStyle)\n" +
                        "                        .build();\n" +
                        "\n" +
                        "                notificationManager.notify(Integer.parseInt(NOTIFICATION_ID),notification);\n" +
                        "\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 5:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.design.widget.Snackbar;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "/**\n" +
                        " * 注意在Module:app的Gradle文件中添加以下依赖：\n" +
                        " *\n" +
                        " * implementation 'com.android.support:design:28.0.0'\n" +
                        " */\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button snackBarButton;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        snackBarButton=findViewById(R.id.Button_On_SnackBarExample);\n" +
                        "\n" +
                        "        snackBarButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Snackbar.make(v,\"Welcome\",Snackbar.LENGTH_SHORT)\n" +
                        "                        .setAction(\"OK\", new View.OnClickListener() {\n" +
                        "                            @Override\n" +
                        "                            public void onClick(View v) {\n" +
                        "                                Toast.makeText(getApplicationContext(),\"Clicked OK\",Toast.LENGTH_SHORT).show();\n" +
                        "                            }\n" +
                        "                        }).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 6:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.Gravity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.FrameLayout;\n" +
                        "import android.widget.ImageView;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button toastButton;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        toastButton=findViewById(R.id.Button_On_ToastExample);\n" +
                        "\n" +
                        "        toastButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                ImageView imageView=new ImageView(getApplicationContext());\n" +
                        "                imageView.setImageResource(R.drawable.zzz_80);\n" +
                        "\n" +
                        "                FrameLayout frameLayout=new FrameLayout(getApplicationContext());\n" +
                        "                frameLayout.addView(imageView);\n" +
                        "                frameLayout.setPadding(450,450,450,450);\n" +
                        "\n" +
                        "                Toast toast=new Toast(getApplicationContext());\n" +
                        "                toast.setDuration(Toast.LENGTH_LONG);\n" +
                        "                toast.setGravity(Gravity.CENTER,0,0);\n" +
                        "                toast.setView(frameLayout.getRootView());\n" +
                        "                toast.show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
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
                        "    <Button\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:id=\"@+id/Button_On_SimpleNotificationExample\"\n" +
                        "        android:text=\"Send Notification\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_marginLeft=\"50dp\"\n" +
                        "        android:layout_marginRight=\"50dp\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
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
                        "    <Button\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:id=\"@+id/Button_On_InboxStyleNotificationExample\"\n" +
                        "        android:text=\"Send Inbox Style Notification\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_marginLeft=\"50dp\"\n" +
                        "        android:layout_marginRight=\"50dp\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
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
                        "    <Button\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:id=\"@+id/Button_On_BigTextStyleNotificationExample\"\n" +
                        "        android:text=\"Send Big Text Style Notification\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_marginLeft=\"50dp\"\n" +
                        "        android:layout_marginRight=\"50dp\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
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
                        "    <Button\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:id=\"@+id/Button_On_BigPictureStyleNotificationExample\"\n" +
                        "        android:text=\"Send Big Picture Style Notification\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_marginLeft=\"50dp\"\n" +
                        "        android:layout_marginRight=\"50dp\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
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
                        "    <Button\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:id=\"@+id/Button_On_SnackBarExample\"\n" +
                        "        android:text=\"Show SnackBar\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_marginLeft=\"50dp\"\n" +
                        "        android:layout_marginRight=\"50dp\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
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
                        "    <Button\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:id=\"@+id/Button_On_ToastExample\"\n" +
                        "        android:text=\"Toast\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_marginLeft=\"50dp\"\n" +
                        "        android:layout_marginRight=\"50dp\"\n" +
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

        for (int i = 0; i < 2; i++) {
            findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1))).setVisibility(View.VISIBLE);
            ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getStringArray(R.array.nextFourTopRightTextViewRightLoad)[i]);
        }

        for (int i = 1; i <= 2; i++) {
            if (v.getId() == getId(SCROLLVIEW_BUTTON_NAME_ + i)) {
                topRightHide();
                ((Button) findViewById(R.id.nextTopRightButton)).setText(getStringArray(R.array.nextFourTopRightTextViewRightLoad)[i - 1]);
                if (i == 1) mainActivityJava(getLoadValue());
                if (i == 2) xml(getLoadValue());
            }
        }
    }
}
