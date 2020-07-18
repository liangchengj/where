package com.meyou.where.Next;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.meyou.where.R;
import com.meyou.where.What;

public class Four extends What {


    private void mainActivityJava(int i) {
        switch (i) {
            case 1:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.widget.TextView;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private TextView textView;\n" +
                        "    private String ActivityLifecycleExampleText=\"\";\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        textView=(TextView) findViewById(R.id.TextView_B_On_ActivityLifecycleExample);\n" +
                        "        ActivityLifecycleExampleText+=\"onCreate was Called\\n\";\n" +
                        "        textView.setText(ActivityLifecycleExampleText);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onStart(){\n" +
                        "        super.onStart();\n" +
                        "        ActivityLifecycleExampleText+=\"onStart was Called\\n\";\n" +
                        "        textView.setText(ActivityLifecycleExampleText);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onResume(){\n" +
                        "        super.onResume();\n" +
                        "        ActivityLifecycleExampleText+=\"onResume was Called\\n\";\n" +
                        "        textView.setText(ActivityLifecycleExampleText);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onPause(){\n" +
                        "        super.onPause();\n" +
                        "        ActivityLifecycleExampleText+=\"onPause was Called\\n\";\n" +
                        "        textView.setText(ActivityLifecycleExampleText);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onStop(){\n" +
                        "        super.onStop();\n" +
                        "        ActivityLifecycleExampleText+=\"onStop was Called\\n\";\n" +
                        "        textView.setText(ActivityLifecycleExampleText);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onDestroy(){\n" +
                        "        super.onDestroy();\n" +
                        "        ActivityLifecycleExampleText+=\"onDestroy was Called\\n\";\n" +
                        "        textView.setText(ActivityLifecycleExampleText);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onRestart(){\n" +
                        "        super.onRestart();\n" +
                        "        ActivityLifecycleExampleText+=\"onRestart was Called\\n\";\n" +
                        "        textView.setText(ActivityLifecycleExampleText);\n" +
                        "    }\n" +
                        "}");
                break;
            case 2:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "\n" +
                        "}");
                break;
            case 4:
                codeLoad("import android.graphics.Color;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v4.app.FragmentManager;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.widget.RelativeLayout;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity implements MyInterface{\n" +
                        "\n" +
                        "    private RelativeLayout relativeLayout;\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        relativeLayout=(RelativeLayout) findViewById(R.id.RelativeLayout_On_InterFragmentCommunicationExample);\n" +
                        "        relativeLayout.setBackgroundColor(Color.RED);\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void set(String data) {\n" +
                        "        FragmentManager fragmentManager=getSupportFragmentManager();\n" +
                        "        FragmentB fragment_b=(FragmentB) fragmentManager.findFragmentById(R.id.Fragment_B_On_InterFragmentCommunicationExample);\n" +
                        "        fragment_b.TextSet(data);\n" +
                        "    }\n" +
                        "}");
                break;
            case 5:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "    }\n" +
                        "}");
                break;
            case 7:
                codeLoad("import android.content.ComponentName;\n" +
                        "import android.content.Intent;\n" +
                        "import android.content.ServiceConnection;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.os.IBinder;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button startServiceButton;\n" +
                        "    private Button stopServiceButton;\n" +
                        "    private Button bindServiceButton;\n" +
                        "    private Button unbindServiceButton;\n" +
                        "\n" +
                        "    private MyService.MyBinder myBinder;\n" +
                        "\n" +
                        "    private ServiceConnection serviceConnection=new ServiceConnection() {\n" +
                        "        @Override\n" +
                        "        public void onServiceConnected(ComponentName name, IBinder service) {\n" +
                        "            myBinder=(MyService.MyBinder) service;\n" +
                        "            myBinder.show(bindServiceButton);\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public void onServiceDisconnected(ComponentName name) { }\n" +
                        "    };\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        startServiceButton=findViewById(R.id.Button_Start_On_Service_Lifecycle_Example);\n" +
                        "        stopServiceButton=findViewById(R.id.Button_Stop_On_Service_Lifecycle_Example);\n" +
                        "        bindServiceButton=findViewById(R.id.Button_Bind_On_Service_Lifecycle_Example);\n" +
                        "        unbindServiceButton=findViewById(R.id.Button_Unbind_On_Service_Lifecycle_Example);\n" +
                        "\n" +
                        "        startServiceButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent=new Intent(MainActivity.this,MyService.class);\n" +
                        "                startService(intent);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        stopServiceButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent=new Intent(MainActivity.this,MyService.class);\n" +
                        "                stopService(intent);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        bindServiceButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent=new Intent(MainActivity.this,MyService.class);\n" +
                        "                bindService(intent,serviceConnection,BIND_AUTO_CREATE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        unbindServiceButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                unbindService(serviceConnection);\n" +
                        "                bindServiceButton.setText(\"绑定服务\");\n" +
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
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "    <ScrollView\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "        <LinearLayout\n" +
                        "            android:orientation=\"vertical\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/TextView_A_On_ActivityLifecycleExample\"\n" +
                        "        android:textSize=\"32dp\"\n" +
                        "        android:layout_marginTop=\"20dp\"\n" +
                        "        android:textStyle=\"bold\"\n" +
                        "        android:text=\"活动的生命周期：\"\n" +
                        "        android:textColor=\"#0071c1\"\n" +
                        "        android:paddingLeft=\"50dp\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/TextView_B_On_ActivityLifecycleExample\"\n" +
                        "        android:paddingLeft=\"160dp\"\n" +
                        "        android:paddingTop=\"60dp\"\n" +
                        "        android:lineSpacingExtra=\"20dp\"\n" +
                        "        android:textColor=\"#0071c1\"\n" +
                        "        android:textSize=\"26dp\"\n" +
                        "        android:layout_below=\"@id/TextView_A_On_ActivityLifecycleExample\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"match_parent\" />\n" +
                        "\n" +
                        "        </LinearLayout>\n" +
                        "\n" +
                        "    </ScrollView>\n" +
                        "\n" +
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
                        "\n" +
                        "\n" +
                        "    <fragment\n" +
                        "        android:id=\"@+id/Fragment_On_FragmentLifecycleExample\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"match_parent\"\n" +
                        "        android:name=\"com.pisces.listen.FragmentLifeCycle\"/>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 4:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    android:id=\"@+id/RelativeLayout_On_InterFragmentCommunicationExample\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    <fragment\n" +
                        "        android:id=\"@+id/Fragment_A_On_InterFragmentCommunicationExample\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:name=\"com.pisces.listen.FragmentA\"/>\n" +
                        "\n" +
                        "\n" +
                        "    <fragment\n" +
                        "        android:id=\"@+id/Fragment_B_On_InterFragmentCommunicationExample\"\n" +
                        "        android:layout_below=\"@id/Fragment_A_On_InterFragmentCommunicationExample\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"match_parent\"\n" +
                        "        android:name=\"com.pisces.listen.FragmentB\"/>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
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
                        "\n" +
                        "    <fragment\n" +
                        "        android:id=\"@+id/Fragment_A_On_ListFragmentExample\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:name=\"com.pisces.listen.Fragment_A\"/>\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 7:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:orientation=\"vertical\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_Start_On_Service_Lifecycle_Example\"\n" +
                        "        android:text=\"开启服务\"\n" +
                        "        android:layout_gravity=\"center_horizontal\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_Stop_On_Service_Lifecycle_Example\"\n" +
                        "        android:layout_marginTop=\"40dp\"\n" +
                        "        android:text=\"停止服务\"\n" +
                        "        android:layout_gravity=\"center_horizontal\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Bind_On_Service_Lifecycle_Example\"\n" +
                        "            android:layout_marginTop=\"40dp\"\n" +
                        "            android:text=\"绑定服务\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_gravity=\"center_horizontal\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Unbind_On_Service_Lifecycle_Example\"\n" +
                        "            android:layout_marginTop=\"40dp\"\n" +
                        "            android:text=\"解绑服务\"\n" +
                        "            android:layout_gravity=\"center_horizontal\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
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

        if (getLoadValue() != 2
                && getLoadValue() != 4
                && getLoadValue() != 5
                && getLoadValue() != 7) {

            for (int i = 0; i < 2; i++) {
                findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1))).setVisibility(View.VISIBLE);
                ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getStringArray(R.array.nextFourTopRightTextViewRightLoad)[i]);
            }
        } else if (getLoadValue() == 4) {
            for (int i = 0; i < 7; i++) {
                findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1))).setVisibility(View.VISIBLE);
                ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getStringArray(R.array.nextFourTopRightTextViewRightLoad2)[i]);
            }

        } else if (getLoadValue() == 7) {
            for (int i = 0; i < 3; i++) {
                findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1))).setVisibility(View.VISIBLE);
                ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getStringArray(R.array.nextFourTopRightTextViewRightLoad3)[i]);
            }
        } else {
            for (int i = 0; i < 4; i++) {
                findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1))).setVisibility(View.VISIBLE);
                ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getStringArray(R.array.nextFourTopRightTextViewRightLoad)[i]);
            }
        }


        for (int i = 1; i <= 7; i++) {
            if (v.getId() == getId(SCROLLVIEW_BUTTON_NAME_ + i)) {
                topRightHide();
                if (getLoadValue() != 4) {
                    ((Button) findViewById(R.id.nextTopRightButton)).setText(getStringArray(R.array.nextFourTopRightTextViewRightLoad)[i - 1]);
                } else {
                    ((Button) findViewById(R.id.nextTopRightButton)).setText(getStringArray(R.array.nextFourTopRightTextViewRightLoad2)[i - 1]);
                }

                if (i == 1) mainActivityJava(getLoadValue());
                if (i == 2) xml(getLoadValue());
                if (i == 3) {
                    switch (getLoadValue()) {
                        case 2:
                            codeLoad("import android.annotation.SuppressLint;\n" +
                                    "import android.content.Context;\n" +
                                    "import android.os.Bundle;\n" +
                                    "import android.support.annotation.Nullable;\n" +
                                    "import android.support.v4.app.Fragment;\n" +
                                    "import android.view.LayoutInflater;\n" +
                                    "import android.view.View;\n" +
                                    "import android.view.ViewGroup;\n" +
                                    "import android.widget.TextView;\n" +
                                    "import android.widget.Toast;\n" +
                                    "\n" +
                                    "\n" +
                                    "@SuppressLint(\"ValidFragment\")\n" +
                                    " class FragmentLifeCycle extends Fragment {\n" +
                                    "\n" +
                                    "     private TextView textView;\n" +
                                    "     private String FragmentExampleText=\"\";\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "    @Override\n" +
                                    "    public void onAttach(Context context){\n" +
                                    "        super.onAttach(context);\n" +
                                    "        Toast.makeText(getActivity(),\"onAttach was Called\",Toast.LENGTH_LONG).show();\n" +
                                    "    }\n" +
                                    "\n" +
                                    "\n" +
                                    "     @Override\n" +
                                    "     public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle){\n" +
                                    "         View view=layoutInflater.inflate(R.layout.fragment_example,viewGroup,false);\n" +
                                    "         textView=(TextView) view.findViewById(R.id.TextView_B_On_FragmentLifecycleExample);\n" +
                                    "         FragmentExampleText+=\"onCreateView was Called\\n\";\n" +
                                    "         textView.setText(FragmentExampleText);\n" +
                                    "         return view;\n" +
                                    "     }\n" +
                                    "\n" +
                                    "\n" +
                                    "     @Override\n" +
                                    "     public void onActivityCreated(@Nullable Bundle bundle){\n" +
                                    "        super.onActivityCreated(bundle);\n" +
                                    "         FragmentExampleText+=\"onActivityCreated was Called\\n\";\n" +
                                    "         textView.setText(FragmentExampleText);\n" +
                                    "\n" +
                                    "     }\n" +
                                    "\n" +
                                    "\n" +
                                    "     @Override\n" +
                                    "     public void onDestroyView(){\n" +
                                    "        super.onDestroyView();\n" +
                                    "         Toast.makeText(getActivity(),\"onDestroyView was Called\",Toast.LENGTH_SHORT).show();\n" +
                                    "     }\n" +
                                    "\n" +
                                    "     @Override\n" +
                                    "    public void onDetach(){\n" +
                                    "        super.onDetach();\n" +
                                    "         Toast.makeText(getActivity(),\"onDetach was Called\",Toast.LENGTH_SHORT).show();\n" +
                                    "     }\n" +
                                    "     \n" +
                                    "}");
                            break;
                        case 4:
                            codeLoad("import android.graphics.Color;\n" +
                                    "import android.os.Bundle;\n" +
                                    "import android.support.v4.app.Fragment;\n" +
                                    "import android.text.Editable;\n" +
                                    "import android.text.TextWatcher;\n" +
                                    "import android.view.LayoutInflater;\n" +
                                    "import android.view.View;\n" +
                                    "import android.view.ViewGroup;\n" +
                                    "import android.widget.EditText;\n" +
                                    "\n" +
                                    "public class FragmentA extends Fragment {\n" +
                                    "\n" +
                                    "    private EditText editText;\n" +
                                    "\n" +
                                    "    @Override\n" +
                                    "    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle){\n" +
                                    "\n" +
                                    "        View view=layoutInflater.inflate(R.layout.fragment_a,viewGroup,false);\n" +
                                    "        editText=(EditText) view.findViewById(R.id.EditText_On_InterFragmentCommunicationExample);\n" +
                                    "        editText.setBackgroundColor(Color.GREEN);\n" +
                                    "        editText.addTextChangedListener(new TextWatcher() {\n" +
                                    "            @Override\n" +
                                    "            public void beforeTextChanged(CharSequence s, int start, int count, int after) {\n" +
                                    "\n" +
                                    "            }\n" +
                                    "\n" +
                                    "            @Override\n" +
                                    "            public void onTextChanged(CharSequence s, int start, int before, int count) {\n" +
                                    "\n" +
                                    "               MyInterface myInterface;\n" +
                                    "               myInterface=(MyInterface) getActivity();\n" +
                                    "               myInterface.set(editText.getText().toString());\n" +
                                    "\n" +
                                    "            }\n" +
                                    "\n" +
                                    "            @Override\n" +
                                    "            public void afterTextChanged(Editable s) {\n" +
                                    "\n" +
                                    "            }\n" +
                                    "        });\n" +
                                    "        return view;\n" +
                                    "    }\n" +
                                    "\n" +
                                    "}");
                            break;
                        case 5:
                            codeLoad("import android.os.Bundle;\n" +
                                    "import android.support.v4.app.Fragment;\n" +
                                    "import android.view.LayoutInflater;\n" +
                                    "import android.view.View;\n" +
                                    "import android.view.ViewGroup;\n" +
                                    "import android.widget.AdapterView;\n" +
                                    "import android.widget.ArrayAdapter;\n" +
                                    "import android.widget.ListView;\n" +
                                    "import android.widget.Toast;\n" +
                                    "\n" +
                                    "public class FragmentExample extends Fragment {\n" +
                                    "\n" +
                                    "    private ListView listView;\n" +
                                    "    private String[] data={\"A\",\"B\",\"C\",\"D\",\"E\",\"F\",\"G\"};\n" +
                                    "    private ArrayAdapter<String> arrayAdapter;\n" +
                                    "\n" +
                                    "    @Override\n" +
                                    "    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle){\n" +
                                    "\n" +
                                    "        View view=layoutInflater.inflate(R.layout.fragment_a,viewGroup,false);\n" +
                                    "        listView=view.findViewById(R.id.ListView_On_ListFragmentExample);\n" +
                                    "        arrayAdapter=new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,data);\n" +
                                    "        listView.setAdapter(arrayAdapter);\n" +
                                    "        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n" +
                                    "            @Override\n" +
                                    "            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {\n" +
                                    "                Toast.makeText(getContext(),position+\"\",Toast.LENGTH_SHORT).show();\n" +
                                    "            }\n" +
                                    "        });\n" +
                                    "\n" +
                                    "        return view;\n" +
                                    "    }\n" +
                                    "\n" +
                                    "}");
                            break;
                        case 7:
                            codeLoad("import android.app.Service;\n" +
                                    "import android.content.Intent;\n" +
                                    "import android.os.Binder;\n" +
                                    "import android.os.IBinder;\n" +
                                    "import android.widget.Button;\n" +
                                    "import android.widget.Toast;\n" +
                                    "\n" +
                                    "/**\n" +
                                    " * 在AndroidManifest.xml文件配置如下：\n" +
                                    " *\n" +
                                    " * <service\n" +
                                    " *             android:name=\".MyService\"\n" +
                                    " *             android:enabled=\"true\"\n" +
                                    " *             android:exported=\"true\"/>\n" +
                                    " */\n" +
                                    "public class MyService extends Service {\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "    class MyBinder extends Binder{\n" +
                                    "        public void show(Button button){\n" +
                                    "            button.setText(\"onBinding...\");\n" +
                                    "        }\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    @Override\n" +
                                    "    public IBinder onBind(Intent intent) {\n" +
                                    "\n" +
                                    "        return new MyBinder();\n" +
                                    "\n" +
                                    "        /**\n" +
                                    "         * Default\n" +
                                    "         *\n" +
                                    "         * TODO: Return the communication channel to the service.\n" +
                                    "         * throw new UnsupportedOperationException(\"Not yet implemented\");\n" +
                                    "         */\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    @Override\n" +
                                    "    public void onCreate(){\n" +
                                    "        super.onCreate();\n" +
                                    "        Toast.makeText(this,\"onCreate in Service was Called\",Toast.LENGTH_SHORT).show();\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    @Override\n" +
                                    "    public int onStartCommand(Intent intent,int flags,int startId){\n" +
                                    "        Toast.makeText(this,\"onStartCommand in Service was Called\",Toast.LENGTH_SHORT).show();\n" +
                                    "        return super.onStartCommand(intent,flags,startId);\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    @Override\n" +
                                    "    public void onDestroy(){\n" +
                                    "        super.onDestroy();\n" +
                                    "        Toast.makeText(this,\"onDestroy in Service was Called\",Toast.LENGTH_SHORT).show();\n" +
                                    "    }\n" +
                                    "\n" +
                                    "}");
                        default:
                            break;
                    }


                }

                if (i == 4) {

                    switch (getLoadValue()) {
                        case 2:
                            codeLoad("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                                    "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                                    "    android:layout_width=\"match_parent\"\n" +
                                    "    android:layout_height=\"match_parent\"\n" +
                                    "    tools:context=\".FragmentLifeCycle\">\n" +
                                    "\n" +
                                    "\n" +
                                    "    <ScrollView\n" +
                                    "        android:layout_width=\"match_parent\"\n" +
                                    "        android:layout_height=\"match_parent\">\n" +
                                    "\n" +
                                    "        <LinearLayout\n" +
                                    "            android:orientation=\"vertical\"\n" +
                                    "            android:layout_width=\"match_parent\"\n" +
                                    "            android:layout_height=\"match_parent\">\n" +
                                    "\n" +
                                    "\n" +
                                    "            <TextView\n" +
                                    "                android:id=\"@+id/TextView_A_On_FragmentLifecycleExample\"\n" +
                                    "                android:textSize=\"32dp\"\n" +
                                    "                android:layout_marginTop=\"20dp\"\n" +
                                    "                android:textStyle=\"bold\"\n" +
                                    "                android:text=\"碎片的生命周期：\"\n" +
                                    "                android:textColor=\"#e4bf47\"\n" +
                                    "                android:paddingLeft=\"50dp\"\n" +
                                    "                android:layout_width=\"match_parent\"\n" +
                                    "                android:layout_height=\"wrap_content\" />\n" +
                                    "\n" +
                                    "            <TextView\n" +
                                    "                android:id=\"@+id/TextView_B_On_FragmentLifecycleExample\"\n" +
                                    "                android:paddingLeft=\"160dp\"\n" +
                                    "                android:paddingTop=\"60dp\"\n" +
                                    "                android:lineSpacingExtra=\"20dp\"\n" +
                                    "                android:textColor=\"#e4bf47\"\n" +
                                    "                android:textSize=\"26dp\"\n" +
                                    "                android:layout_below=\"@id/TextView_A_On_FragmentLifecycleExample\"\n" +
                                    "                android:layout_width=\"match_parent\"\n" +
                                    "                android:layout_height=\"match_parent\" />\n" +
                                    "\n" +
                                    "        </LinearLayout>\n" +
                                    "\n" +
                                    "    </ScrollView>\n" +
                                    "\n" +
                                    "</RelativeLayout>");
                            break;
                        case 4:
                            codeLoad("<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                                    "    android:layout_width=\"match_parent\"\n" +
                                    "    android:layout_height=\"match_parent\"\n" +
                                    "    android:orientation=\"vertical\"\n" +
                                    "    tools:context=\".FragmentA\">\n" +
                                    "\n" +
                                    "    <TextView\n" +
                                    "        android:layout_width=\"match_parent\"\n" +
                                    "        android:layout_height=\"wrap_content\"\n" +
                                    "        android:textSize=\"30dp\"\n" +
                                    "        android:textColor=\"@android:color/white\"\n" +
                                    "        android:paddingTop=\"10dp\"\n" +
                                    "        android:paddingBottom=\"10dp\"\n" +
                                    "        android:paddingLeft=\"20dp\"\n" +
                                    "        android:text=\"你可以输入一段文字哦\" />\n" +
                                    "\n" +
                                    "\n" +
                                    "    <EditText\n" +
                                    "        android:id=\"@+id/EditText_On_InterFragmentCommunicationExample\"\n" +
                                    "        android:layout_width=\"match_parent\"\n" +
                                    "        android:layout_height=\"wrap_content\"\n" +
                                    "        android:textSize=\"30dp\"\n" +
                                    "        android:imeOptions=\"flagNoFullscreen\"\n" +
                                    "        android:textColor=\"@android:color/white\"\n" +
                                    "        android:paddingTop=\"10dp\"\n" +
                                    "        android:paddingLeft=\"20dp\"\n" +
                                    "        android:paddingBottom=\"10dp\"/>\n" +
                                    "\n" +
                                    "\n" +
                                    "</LinearLayout>");
                            break;
                        case 5:
                            codeLoad("<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                                    "    android:layout_width=\"match_parent\"\n" +
                                    "    android:layout_height=\"match_parent\"\n" +
                                    "    android:orientation=\"vertical\"\n" +
                                    "    tools:context=\".Fragment_A\">\n" +
                                    "\n" +
                                    "    <ListView\n" +
                                    "        android:id=\"@+id/ListView_On_ListFragmentExample\"\n" +
                                    "        android:layout_width=\"match_parent\"\n" +
                                    "        android:layout_height=\"match_parent\"/>\n" +
                                    "\n" +
                                    "</LinearLayout>");
                            break;
                        default:
                            break;
                    }

                }

                if (i == 5)
                    codeLoad("import android.graphics.Color;\n" +
                            "import android.os.Bundle;\n" +
                            "import android.support.v4.app.Fragment;\n" +
                            "import android.view.LayoutInflater;\n" +
                            "import android.view.View;\n" +
                            "import android.view.ViewGroup;\n" +
                            "import android.widget.TextView;\n" +
                            "\n" +
                            "\n" +
                            "public class FragmentB extends Fragment {\n" +
                            "\n" +
                            "    private TextView textView;\n" +
                            "\n" +
                            "    @Override\n" +
                            "    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle){\n" +
                            "\n" +
                            "        View view=layoutInflater.inflate(R.layout.fragment_b,viewGroup,false);\n" +
                            "        textView=(TextView) view.findViewById(R.id.TextView_On_InterFragmentCommunicationExample);\n" +
                            "        textView.setBackgroundColor(Color.BLUE);\n" +
                            "        return view;\n" +
                            "    }\n" +
                            "\n" +
                            "    public void TextSet(String data){\n" +
                            "        textView.setText(data);\n" +
                            "    }\n" +
                            "\n" +
                            "}");
                if (i == 6)
                    codeLoad("<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                            "    android:layout_width=\"match_parent\"\n" +
                            "    android:layout_height=\"match_parent\"\n" +
                            "    tools:context=\".FragmentB\">\n" +
                            "\n" +
                            "\n" +
                            "    <TextView\n" +
                            "        android:layout_width=\"match_parent\"\n" +
                            "        android:layout_height=\"match_parent\"\n" +
                            "        android:textSize=\"40dp\"\n" +
                            "        android:textColor=\"@android:color/white\"\n" +
                            "        android:paddingLeft=\"20dp\"\n" +
                            "        android:paddingTop=\"20dp\"\n" +
                            "        android:id=\"@+id/TextView_On_InterFragmentCommunicationExample\" />\n" +
                            "\n" +
                            "</FrameLayout>");
                if (i == 7)
                    codeLoad("public interface MyInterface {\n" +
                            "\n" +
                            "    public void set(String data);\n" +
                            "\n" +
                            "}");
            }
        }
    }
}
