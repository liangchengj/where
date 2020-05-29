package com.meyou.where.Next;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.meyou.where.R;
import com.meyou.where.What;

public class One extends What {


    private void mainActivityJava(final int i) {

        switch (i) {
            case 1:
                codeLoad("import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
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
            case 2:
                codeLoad("import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.text.Editable;\n" +
                        "import android.text.TextWatcher;\n" +
                        "import android.widget.EditText;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    \n" +
                        "    private EditText editText;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        \n" +
                        "        editText.addTextChangedListener(new TextWatcher() {\n" +
                        "            @Override\n" +
                        "            public void beforeTextChanged(CharSequence s, int start, int count, int after) {\n" +
                        "                \n" +
                        "            }\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void onTextChanged(CharSequence s, int start, int before, int count) {\n" +
                        "\n" +
                        "            }\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void afterTextChanged(Editable s) {\n" +
                        "\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        \n" +
                        "    }\n" +
                        "}");
                break;
            case 3:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity implements View.OnClickListener {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        button=(Button) findViewById(R.id.Button_Example);\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                button.setText(\"你点击了我\");\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        button.setOnLongClickListener(new View.OnLongClickListener() {\n" +
                        "            @Override\n" +
                        "            public boolean onLongClick(View v) {\n" +
                        "                button.setText(\"你长按了我\");\n" +
                        "                return false;\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        button.setOnClickListener(this);\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    public void BUTTON_EXAMPLE(View view){\n" +
                        "        button.setText(\"你点击了我\");\n" +
                        "\n" +
                        "        //该方法等同于button.setOnClickListener，相比于前者此方法更方便管理点击事件\n" +
                        "        //与布局中的android:onClick配合使用，方法名为android:onClick的属性名称\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onClick(View v) {\n" +
                        "        button.setText(\"你点击了我\");\n" +
                        "\n" +
                        "        //该方法等同于button.setOnClickListener，相比于前者此方法更方便管理点击事件\n" +
                        "    }\n" +
                        "\n" +
                        "}");
                break;
            case 4:
                codeLoad("import android.graphics.Color;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.widget.RadioGroup;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "   private RadioGroup radioGroup;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        radioGroup=(RadioGroup) findViewById(R.id.radioGroup);\n" +
                        "        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {\n" +
                        "            @Override\n" +
                        "            public void onCheckedChanged(RadioGroup group, int checkedId) {\n" +
                        "                switch (checkedId){\n" +
                        "                    case R.id.r1:\n" +
                        "                        getWindow().getDecorView().setBackgroundColor(Color.RED);\n" +
                        "                        break;\n" +
                        "                    case R.id.r2:\n" +
                        "                        getWindow().getDecorView().setBackgroundColor(Color.GREEN);\n" +
                        "                        break;\n" +
                        "                    case R.id.r3:\n" +
                        "                        getWindow().getDecorView().setBackgroundColor(Color.BLUE);\n" +
                        "                        default:\n" +
                        "                            break;\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "}");
                break;
            case 5:
                codeLoad("import android.graphics.Color;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.CheckBox;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private CheckBox checkBox1,checkBox2,checkBox3;\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        button=(Button) findViewById(R.id.checkbox_Check);\n" +
                        "\n" +
                        "        checkBox1=(CheckBox) findViewById(R.id.c1);\n" +
                        "        checkBox2=(CheckBox) findViewById(R.id.c2);\n" +
                        "        checkBox3=(CheckBox) findViewById(R.id.c3);\n" +
                        "\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                if (checkBox1.isChecked()==true&&\n" +
                        "                        checkBox2.isChecked()==true&&\n" +
                        "                        checkBox3.isChecked()==true){\n" +
                        "\n" +
                        "                    getWindow().getDecorView().setBackgroundColor(Color.parseColor(\"#FFFFFF\"));\n" +
                        "\n" +
                        "                }else if (checkBox1.isChecked()==true&&checkBox2.isChecked()==true){\n" +
                        "\n" +
                        "                    getWindow().getDecorView().setBackgroundColor(Color.parseColor(\"#FFFF00\"));\n" +
                        "\n" +
                        "                }else if (checkBox1.isChecked()==true&&checkBox3.isChecked()==true){\n" +
                        "\n" +
                        "                    getWindow().getDecorView().setBackgroundColor(Color.parseColor(\"#FF00FF\"));\n" +
                        "\n" +
                        "                }else if (checkBox2.isChecked()==true&&checkBox3.isChecked()==true){\n" +
                        "\n" +
                        "                    getWindow().getDecorView().setBackgroundColor(Color.parseColor(\"#00FFFF\"));\n" +
                        "\n" +
                        "                }else if (checkBox1.isChecked()==true){\n" +
                        "\n" +
                        "                    getWindow().getDecorView().setBackgroundColor(Color.RED);\n" +
                        "\n" +
                        "                }else if (checkBox2.isChecked()==true){\n" +
                        "\n" +
                        "                    getWindow().getDecorView().setBackgroundColor(Color.GREEN);\n" +
                        "\n" +
                        "                }else if (checkBox3.isChecked()==true){\n" +
                        "\n" +
                        "                    getWindow().getDecorView().setBackgroundColor(Color.BLUE);\n" +
                        "                    \n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "}");
                break;
            case 6:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.RatingBar;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity  {\n" +
                        "    private Button button;\n" +
                        "    private RatingBar ratingBar;\n" +
                        "    private float rating_value; \n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        button=(Button) findViewById(R.id.Button_On_RatingBarExample);\n" +
                        "        ratingBar=(RatingBar) findViewById(R.id.RatingBar_Example);\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                rating_value=ratingBar.getRating();\n" +
                        "                button.setText(String.valueOf(rating_value));\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "}");
                break;
            case 7:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.widget.SeekBar;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "   private SeekBar seekBar;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {\n" +
                        "            @Override\n" +
                        "            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {\n" +
                        "                \n" +
                        "                //在进度变化时触发。第三个参数表示是否来自用户，为true表示用户拖动，为false表示代码修改进度。\n" +
                        "            }\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void onStartTrackingTouch(SeekBar seekBar) {\n" +
                        "\n" +
                        "                //开始拖动时触发\n" +
                        "                \n" +
                        "            }\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void onStopTrackingTouch(SeekBar seekBar) {\n" +
                        "\n" +
                        "                //结束拖动时触发。一般在该方法中添加用户拖动的处理逻辑。\n" +
                        "                \n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 8:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ProgressBar;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "    private ProgressBar progressBar;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        button=(Button) findViewById(R.id.ProgressBar_Button);\n" +
                        "        progressBar=(ProgressBar) findViewById(R.id.ProgressBar_Example);\n" +
                        "\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Thread thread=new Thread(){\n" +
                        "                    @Override\n" +
                        "                    public void run(){\n" +
                        "                        super.run();\n" +
                        "                        for(int i=0;i<=100;){\n" +
                        "                            try {\n" +
                        "                                sleep(1000);\n" +
                        "                            }catch (InterruptedException e){\n" +
                        "                                e.printStackTrace();\n" +
                        "                            }\n" +
                        "                            progressBar.setProgress(i);\n" +
                        "                            i+=10;\n" +
                        "                        }\n" +
                        "                    }\n" +
                        "                };\n" +
                        "                thread.start();\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "    }\n" +
                        "}");
                break;
            case 9:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Switch;\n" +
                        "import android.widget.TextView;\n" +
                        "import android.widget.ToggleButton;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity  {\n" +
                        "\n" +
                        "    private Switch aSwitch;\n" +
                        "    private ToggleButton toggleButton;\n" +
                        "    private TextView textView;\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        aSwitch=(Switch) findViewById(R.id.Switch_Example);\n" +
                        "        toggleButton=(ToggleButton) findViewById(R.id.ToggleButton_Example);\n" +
                        "        textView=(TextView) findViewById(R.id.TextView_On_Toggle_Switch_Example);\n" +
                        "\n" +
                        "        aSwitch.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                if (aSwitch.isChecked()){\n" +
                        "                    textView.setText(\"Switch处于开启状态\");\n" +
                        "                }else {\n" +
                        "                    textView.setText(\"Switch处于关闭状态\");\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        toggleButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                if (toggleButton.isChecked()){\n" +
                        "                    //用法同上\n" +
                        "                }else {\n" +
                        "                    //用法同上\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "\n" +
                        "}");
                break;
            case 10:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.AdapterView;\n" +
                        "import android.widget.ArrayAdapter;\n" +
                        "import android.widget.Spinner;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private String[] cities={\"衡阳\",\"长沙\",\"湘潭\",\"武汉\",\"北京\",\"重庆\",\"四川\",\"防城港\",\"上海\",\"大连\",\"株洲\",\"广州\",\"南宁\",\"乌鲁木齐\"};\n" +
                        "    private Spinner spinner;\n" +
                        "    private ArrayAdapter<String> arrayAdapter;\n" +
                        "    private TextView textView;\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        spinner=findViewById(R.id.Spinner_Example);\n" +
                        "        textView=findViewById(R.id.text_on_spinner);\n" +
                        "\n" +
                        "        arrayAdapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,cities);\n" +
                        "        spinner.setAdapter(arrayAdapter);\n" +
                        "\n" +
                        "        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {\n" +
                        "            @Override\n" +
                        "            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {\n" +
                        "                textView.setText(\"你最喜欢的城市是：\"+cities[position]);\n" +
                        "            }\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void onNothingSelected(AdapterView<?> parent) {\n" +
                        "\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 11:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.widget.ArrayAdapter;\n" +
                        "import android.widget.AutoCompleteTextView;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private AutoCompleteTextView autoCompleteTextView;\n" +
                        "    private ArrayAdapter<String> arrayAdapter;\n" +
                        "\n" +
                        "    private String[] citys={\"衡阳\",\"长沙\",\"湘潭\",\"武汉\",\"北京\",\"重庆\",\"四川\",\"防城港\",\"上海\",\"大连\",\"株洲\",\"广州\",\"南宁\",\"乌鲁木齐\"};\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        autoCompleteTextView=(AutoCompleteTextView) findViewById(R.id.AutoCompleteTextView_Example);\n" +
                        "        arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,citys);\n" +
                        "        autoCompleteTextView.setAdapter(arrayAdapter);\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "}");
                break;
            case 12:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.CheckedTextView;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private CheckedTextView checkedTextView;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        checkedTextView=(CheckedTextView) findViewById(R.id.CheckedTextView_Example);\n" +
                        "        checkedTextView.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                checkedTextView.toggle();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 13:
                codeLoad("import android.graphics.Color;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.Gravity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextSwitcher;\n" +
                        "import android.widget.TextView;\n" +
                        "import android.widget.ViewSwitcher;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private String[] TextSwitcherExampleTexts={\"A\",\"B\",\"C\",\"D\",\"E\",\"F\",\"G\",\"H\",\"I\",\"J\",\"K\",\"L\",\"M\",\"N\",\"O\",\"P\",\"Q\",\"R\",\"S\",\"T\",\"U\",\"V\",\"W\",\"X\",\"Y\",\"Z\"};\n" +
                        "    private TextSwitcher textSwitcher;\n" +
                        "    private Button btn_PREVIOUS,btn_NEXT;\n" +
                        "    private int position=-1;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        textSwitcher=(TextSwitcher) findViewById(R.id.TextSwitcher_Example);\n" +
                        "        btn_PREVIOUS=(Button) findViewById(R.id.TextSwitcher_Example_PREVIOUS);\n" +
                        "        btn_NEXT=(Button) findViewById(R.id.TextSwitcher_Example_NEXT);\n" +
                        "\n" +
                        "        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {\n" +
                        "            @Override\n" +
                        "            public View makeView() {\n" +
                        "                TextView textView=new TextView(getApplicationContext());\n" +
                        "                textView.setTextColor(Color.parseColor(\"#b968c7\"));\n" +
                        "                textView.setTextSize(34);\n" +
                        "                textView.setGravity(Gravity.CENTER);\n" +
                        "                return textView;\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        btn_NEXT.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                if(position<TextSwitcherExampleTexts.length-1){\n" +
                        "                    position+=1;\n" +
                        "                    textSwitcher.setText(TextSwitcherExampleTexts[position]);\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        btn_PREVIOUS.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                if(position>0){\n" +
                        "                    position-=1;\n" +
                        "                    textSwitcher.setText(TextSwitcherExampleTexts[position]);\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "}");
                break;
            case 14:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.ActionBar;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageSwitcher;\n" +
                        "import android.widget.ImageView;\n" +
                        "import android.widget.ViewSwitcher;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "   private int[] ImageSwitcherImages={R.drawable.xxx_1,R.drawable.xxx_2,R.drawable.xxx_3,R.drawable.xxx_4,R.drawable.xxx_5};\n" +
                        "   //ImageSwitcherImages数组用于存放ImageSwitcher所要切换图片的路径，实际编程学习时按自己所使用的图片路径填写\n" +
                        "    private ImageSwitcher imageSwitcher;\n" +
                        "    private Button btn_PREVIOUS,btn_NEXT;\n" +
                        "    private int position=-1;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        imageSwitcher=(ImageSwitcher) findViewById(R.id.ImageSwitcher_Example);\n" +
                        "        btn_PREVIOUS=(Button) findViewById(R.id.ImageSwitcher_Example_PREVIOUS);\n" +
                        "        btn_NEXT=(Button) findViewById(R.id.ImageSwitcher_Example_NEXT);\n" +
                        "\n" +
                        "        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {\n" +
                        "            @Override\n" +
                        "            public View makeView() {\n" +
                        "                ImageView imageView=new ImageView(getApplicationContext());\n" +
                        "                imageView.setScaleType(ImageView.ScaleType.CENTER);\n" +
                        "                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT));\n" +
                        "                return imageView;\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        btn_NEXT.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "               if(position<ImageSwitcherImages.length-1){\n" +
                        "                   position+=1;\n" +
                        "                   imageSwitcher.setBackgroundResource(ImageSwitcherImages[position]);\n" +
                        "               }\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        btn_PREVIOUS.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "               if(position>0){\n" +
                        "                   position-=1;\n" +
                        "                   imageSwitcher.setBackgroundResource(ImageSwitcherImages[position]);\n" +
                        "               }\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "}");
                break;
            case 15:
                codeLoad("import android.content.Context;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.LayoutInflater;\n" +
                        "import android.view.View;\n" +
                        "import android.view.ViewGroup;\n" +
                        "import android.widget.AdapterViewFlipper;\n" +
                        "import android.widget.BaseAdapter;\n" +
                        "import android.widget.ImageView;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "   private int[] AdapterViewFlipperImages={R.drawable.fff_1,R.drawable.fff_2,R.drawable.fff_3,R.drawable.fff_4,R.drawable.fff_5};\n" +
                        "   private String[] AdapterViewFlipperTexts={\"One\",\"Two\",\"Three\",\"Four\",\"Five\"};\n" +
                        "   private AdapterViewFlipper adapterViewFlipper;\n" +
                        "   private AdapterViewFlipperAdapter adapterViewFlipperAdapter;\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        adapterViewFlipperAdapter=new AdapterViewFlipperAdapter(this,AdapterViewFlipperImages,AdapterViewFlipperTexts);\n" +
                        "\n" +
                        "        adapterViewFlipper=(AdapterViewFlipper) findViewById(R.id.AdapterViewFlipper_Example);\n" +
                        "        adapterViewFlipper.setAutoStart(true);\n" +
                        "        adapterViewFlipper.setAdapter(adapterViewFlipperAdapter);\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    class AdapterViewFlipperAdapter extends BaseAdapter{\n" +
                        "        private int[] images;\n" +
                        "        private String[] texts;\n" +
                        "\n" +
                        "        public AdapterViewFlipperAdapter(Context context,int[] images,String[] texts){\n" +
                        "            this.images=images;\n" +
                        "            this.texts=texts;\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public int getCount() {\n" +
                        "            return texts.length;\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public Object getItem(int position) {\n" +
                        "            return null;\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public long getItemId(int position) {\n" +
                        "            return 0;\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public View getView(int position, View convertView, ViewGroup parent) {\n" +
                        "            convertView=LayoutInflater.from(parent.getContext()).inflate(R.layout.flipper_items,null);\n" +
                        "            TextView textView=(TextView) convertView.findViewById(R.id.AdapterViewFlipper_Example_TextView);\n" +
                        "            ImageView imageView=(ImageView) convertView.findViewById(R.id.AdapterViewFlipper_Example_ImageView);\n" +
                        "            textView.setText(texts[position]);\n" +
                        "            imageView.setImageResource(images[position]);\n" +
                        "            return convertView;\n" +
                        "        }\n" +
                        "    }\n" +
                        "}");
                break;
            case 16:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.ImageButton;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    \n" +
                        "    private ImageButton imageButton;\n" +
                        "    private TextView textView;\n" +
                        "    \n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        \n" +
                        "        imageButton=(ImageButton) findViewById(R.id.ImageButton_Example);\n" +
                        "        textView=(TextView) findViewById(R.id.TextView_On_ImageButtonExample);\n" +
                        "        \n" +
                        "        imageButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                textView.setText(\"你点击了ImageButton\");\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "\n" +
                        "    }\n" +
                        "}");
                break;
            case 17:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "\n" +
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
                        "\n" +
                        "    }\n" +
                        "}");
                break;
            case 18:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.widget.MediaController;\n" +
                        "import android.widget.VideoView;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private VideoView videoView;\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        videoView=(VideoView) findViewById(R.id.VideoView_Example);\n" +
                        "        videoView.setVideoPath(\"android.resource://\"+getPackageName()+\"/\"+ R.raw.videoview_example);\n" +
                        "        videoView.requestFocus();\n" +
                        "        videoView.setMediaController(new MediaController(this));\n" +
                        "        videoView.start();\n" +
                        "\n" +
                        "    }\n" +
                        "}");
                break;
            case 19:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "    }\n" +
                        "}");
                break;
            case 20:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.os.SystemClock;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.widget.Chronometer;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Chronometer chronometer;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        chronometer=(Chronometer) findViewById(R.id.Chronometer_Example);\n" +
                        "        chronometer.setBase(SystemClock.elapsedRealtime());\n" +
                        "        chronometer.start();\n" +
                        "\n" +
                        "    }\n" +
                        "}");
            default:
                break;
        }


    }

    private void xml(final int i) {
        switch (i) {
            case 1:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/textView\"\n" +
                        "        android:textColor=\"#0bc156\"\n" +
                        "        android:textSize=\"58dp\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:text=\"Hello World\"\n" +
                        "        tools:layout_editor_absoluteX=\"266dp\"\n" +
                        "        tools:layout_editor_absoluteY=\"182dp\" />\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/textView2\"\n" +
                        "        android:textColor=\"#e0e0e0\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginBottom=\"30dp\"\n" +
                        "        android:text=\"TextView用来显示文本\" />\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 2:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "    <EditText\n" +
                        "        android:gravity=\"center\"\n" +
                        "        android:id=\"@+id/EditText\"\n" +
                        "        android:textColor=\"#09c2fa\"\n" +
                        "        android:textSize=\"58dp\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:layout_width=\"360dp\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/textView2\"\n" +
                        "        android:textColor=\"#e0e0e0\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginBottom=\"30dp\"\n" +
                        "        android:text=\"你可以在EditText中输入文本\" />\n" +
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
                        "   <Button\n" +
                        "       android:id=\"@+id/Button_Example\"\n" +
                        "       android:layout_width=\"360dp\"\n" +
                        "       android:layout_height=\"120dp\"\n" +
                        "       android:text=\"BUTTON\"\n" +
                        "       android:onClick=\"BUTTON_EXAMPLE\"\n" +
                        "       android:textSize=\"58dp\"\n" +
                        "       android:textColor=\"@android:color/white\"\n" +
                        "       android:gravity=\"center\"\n" +
                        "       android:background=\"#ffe200\"\n" +
                        "       android:layout_centerInParent=\"true\"\n" +
                        "       style=\"?attr/borderlessButtonStyle\"\n" +
                        "       tools:ignore=\"OnClick\" />\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:textColor=\"#e0e0e0\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginBottom=\"30dp\"\n" +
                        "        android:text=\"Button可以用来响应点击和长按事件\" />\n" +
                        "    \n" +
                        "</RelativeLayout>");
                break;
            case 4:
                codeLoad("<RelativeLayout\n" +
                        "    xmlns:android=\"http://schemas.android.com/apk/res/android\" android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    android:id=\"@+id/showing_4_re\">\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    <RadioGroup\n" +
                        "        android:id=\"@+id/radioGroup\"\n" +
                        "        android:layout_marginLeft=\"12dp\"\n" +
                        "        android:layout_alignParentLeft=\"true\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:layout_width=\"90dp\"\n" +
                        "        android:layout_height=\"wrap_content\" >\n" +
                        "\n" +
                        "\n" +
                        "        <RadioButton\n" +
                        "            android:id=\"@+id/r1\"\n" +
                        "            android:text=\"红色\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        <RadioButton\n" +
                        "            android:id=\"@+id/r2\"\n" +
                        "            android:text=\"绿色\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        <RadioButton\n" +
                        "            android:id=\"@+id/r3\"\n" +
                        "            android:text=\"蓝色\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    </RadioGroup>\n" +
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
                        "    <LinearLayout\n" +
                        "        android:layout_width=\"90dp\"\n" +
                        "        android:orientation=\"vertical\"\n" +
                        "        android:layout_alignParentRight=\"true\"\n" +
                        "        android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "        <CheckBox\n" +
                        "            android:id=\"@+id/c1\"\n" +
                        "            android:text=\"Red\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        <CheckBox\n" +
                        "            android:id=\"@+id/c2\"\n" +
                        "            android:text=\"Green\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        <CheckBox\n" +
                        "            android:id=\"@+id/c3\"\n" +
                        "            android:text=\"Blue\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:background=\"#a0887e\"\n" +
                        "        android:text=\"Check\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:id=\"@+id/checkbox_Check\"\n" +
                        "        android:layout_width=\"90dp\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_alignParentRight=\"true\"\n" +
                        "        android:layout_alignParentBottom=\"true\"/>\n" +
                        "\n" +
                        "\n" +
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
                        "   <RatingBar\n" +
                        "       android:id=\"@+id/RatingBar_Example\"\n" +
                        "       android:layout_width=\"wrap_content\"\n" +
                        "       android:layout_height=\"wrap_content\"\n" +
                        "       android:layout_centerInParent=\"true\"/>\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_On_RatingBarExample\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"35dp\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:background=\"#9675ce\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:text=\"Rating\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"/>\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 7:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "android:layout_width=\"match_parent\"\n" +
                        "android:layout_height=\"match_parent\"\n" +
                        "tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "<SeekBar\n" +
                        "    android:layout_centerInParent=\"true\"\n" +
                        "    android:layout_width=\"150dp\"\n" +
                        "    android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 8:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\">\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    <ProgressBar\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_alignParentStart=\"true\"\n" +
                        "        android:layout_alignParentTop=\"true\"\n" +
                        "        android:layout_marginTop=\"90dp\"\n" +
                        "        tools:ignore=\"RtlCompat\" />\n" +
                        "\n" +
                        "    <ProgressBar\n" +
                        "        android:id=\"@+id/ProgressBar_Example\"\n" +
                        "        android:padding=\"50dp\"\n" +
                        "        style=\"@style/Widget.AppCompat.ProgressBar.Horizontal\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_alignParentStart=\"true\"\n" +
                        "        android:layout_alignParentTop=\"true\"\n" +
                        "        android:layout_marginTop=\"160dp\"\n" +
                        "        tools:ignore=\"RtlCompat\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:onClick=\"SHOW_CODE\"\n" +
                        "        android:id=\"@+id/ProgressBar_Button\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:background=\"#64b5f6\"\n" +
                        "        android:text=\"Click Progress\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_width=\"120dp\"\n" +
                        "        android:layout_height=\"50dp\" />\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 9:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "   <Switch\n" +
                        "       android:id=\"@+id/Switch_Example\"\n" +
                        "       android:textColor=\"#80cbc4\"\n" +
                        "       android:textSize=\"28dp\"\n" +
                        "       android:text=\"Switch         \"\n" +
                        "       android:layout_centerHorizontal=\"true\"\n" +
                        "       android:layout_marginTop=\"60dp\"\n" +
                        "       android:layout_width=\"wrap_content\"\n" +
                        "       android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    <ToggleButton\n" +
                        "        android:id=\"@+id/ToggleButton_Example\"\n" +
                        "        style=\"?attr/borderlessButtonStyle\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:textColor=\"@android:color/white\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:textSize=\"22dp\"\n" +
                        "        android:layout_marginBottom=\"120dp\"\n" +
                        "        android:background=\"#80cbc4\"/>\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/TextView_On_Toggle_Switch_Example\"\n" +
                        "        android:textColor=\"#e0e0e0\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginBottom=\"30dp\"\n" +
                        "        android:text=\"上面的方块也是可以点击的哦\" />\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 10:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "android:layout_width=\"match_parent\"\n" +
                        "android:layout_height=\"match_parent\"\n" +
                        "tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "    <Spinner\n" +
                        "        android:id=\"@+id/Spinner_Example\"\n" +
                        "        android:layout_width=\"200dp\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_alignParentTop=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginTop=\"140dp\" />\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:textColor=\"#e0e0e0\"\n" +
                        "        android:id=\"@+id/text_on_spinner\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginBottom=\"30dp\"\n" +
                        "        android:text=\"Spinner用于从一串列表中选择某项\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 11:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "android:layout_width=\"match_parent\"\n" +
                        "android:layout_height=\"match_parent\"\n" +
                        "tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    <AutoCompleteTextView\n" +
                        "        android:id=\"@+id/AutoCompleteTextView_Example\"\n" +
                        "        android:layout_marginTop=\"100dp\"\n" +
                        "        android:gravity=\"center\"\n" +
                        "        android:completionThreshold=\"1\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_width=\"200dp\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:textColor=\"#fad24e\"\n" +
                        "        android:layout_margin=\"30dp\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_marginBottom=\"30dp\"\n" +
                        "        android:text=\"你可以输入：\\n衡阳，长沙，湘潭，武汉，北京，重庆，四川，防城港，上海，\\n大连，株洲，广州，南宁，乌鲁木齐\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 12:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "android:layout_width=\"match_parent\"\n" +
                        "android:layout_height=\"match_parent\"\n" +
                        "tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    <CheckedTextView\n" +
                        "        android:id=\"@+id/CheckedTextView_Example\"\n" +
                        "        android:text=\"CheckedTextView\"\n" +
                        "        android:gravity=\"center\"\n" +
                        "        android:textColor=\"#fa7437\"\n" +
                        "        android:textSize=\"50dp\"\n" +
                        "        android:checked=\"true\"\n" +
                        "        android:checkMark=\"?android:attr/listChoiceIndicatorMultiple\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:layout_width=\"480dp\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 13:
                codeLoad("<TextView\n" +
                        "        android:text=\"TextSwitcher Example\"\n" +
                        "        android:gravity=\"center\"\n" +
                        "        android:textSize=\"50dp\"\n" +
                        "        android:textColor=\"#b968c7\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginTop=\"50dp\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "   <TextSwitcher\n" +
                        "       android:id=\"@+id/TextSwitcher_Example\"\n" +
                        "       android:layout_width=\"200dp\"\n" +
                        "       android:layout_centerInParent=\"true\"\n" +
                        "       android:layout_height=\"wrap_content\"/>\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:orientation=\"horizontal\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/TextSwitcher_Example_PREVIOUS\"\n" +
                        "            style=\"?attr/borderlessButtonStyle\"\n" +
                        "            android:layout_width=\"0dp\"\n" +
                        "            android:textColor=\"@android:color/black\"\n" +
                        "            android:text=\"PREVIOUS\"\n" +
                        "            android:background=\"#e0e0e0\"\n" +
                        "            android:layout_height=\"wrap_content\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            tools:ignore=\"Suspicious0dp\" />\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/TextSwitcher_Example_NEXT\"\n" +
                        "            style=\"?attr/borderlessButtonStyle\"\n" +
                        "            android:layout_width=\"0dp\"\n" +
                        "            android:textColor=\"@android:color/white\"\n" +
                        "            android:text=\"NEXT\"\n" +
                        "            android:background=\"#b968c7\"\n" +
                        "            android:layout_height=\"wrap_content\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            tools:ignore=\"Suspicious0dp\" />\n" +
                        "\n" +
                        "    </LinearLayout>");
                break;
            case 14:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "android:layout_width=\"match_parent\"\n" +
                        "android:layout_height=\"match_parent\"\n" +
                        "tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:text=\"ImageSwitcher Example\"\n" +
                        "        android:gravity=\"center\"\n" +
                        "        android:textSize=\"50dp\"\n" +
                        "        android:textColor=\"#78909c\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginTop=\"30dp\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "   <ImageSwitcher\n" +
                        "       android:id=\"@+id/ImageSwitcher_Example\"\n" +
                        "       android:layout_width=\"60dp\"\n" +
                        "       android:layout_centerInParent=\"true\"\n" +
                        "       android:layout_height=\"60dp\"/>\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:orientation=\"horizontal\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/ImageSwitcher_Example_PREVIOUS\"\n" +
                        "            style=\"?attr/borderlessButtonStyle\"\n" +
                        "            android:layout_width=\"0dp\"\n" +
                        "            android:textColor=\"@android:color/black\"\n" +
                        "            android:text=\"PREVIOUS\"\n" +
                        "            android:background=\"#e0e0e0\"\n" +
                        "            android:layout_height=\"wrap_content\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            tools:ignore=\"Suspicious0dp\" />\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/ImageSwitcher_Example_NEXT\"\n" +
                        "            style=\"?attr/borderlessButtonStyle\"\n" +
                        "            android:layout_width=\"0dp\"\n" +
                        "            android:textColor=\"@android:color/white\"\n" +
                        "            android:text=\"NEXT\"\n" +
                        "            android:background=\"#78909c\"\n" +
                        "            android:layout_height=\"wrap_content\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            tools:ignore=\"Suspicious0dp\" />\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 15:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "android:layout_width=\"match_parent\"\n" +
                        "android:layout_height=\"match_parent\"\n" +
                        "tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "<TextView\n" +
                        "        android:text=\"AdapterViewFlipper Example\"\n" +
                        "        android:id=\"@+id/Text_On_AdapterViewFlipper\"\n" +
                        "        android:gravity=\"center\"\n" +
                        "        android:textSize=\"38dp\"\n" +
                        "        android:textColor=\"#82be46\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginTop=\"30dp\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    <AdapterViewFlipper\n" +
                        "        android:id=\"@+id/AdapterViewFlipper_Example\"\n" +
                        "        android:layout_below=\"@id/Text_On_AdapterViewFlipper\"\n" +
                        "        android:flipInterval=\"1000\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_marginTop=\"60dp\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_height=\"wrap_content\"/>" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 16:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "android:layout_width=\"match_parent\"\n" +
                        "android:layout_height=\"match_parent\"\n" +
                        "tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "  <ImageButton\n" +
                        "      android:id=\"@+id/ImageButton_Example\"\n" +
                        "      android:layout_centerInParent=\"true\"\n" +
                        "      android:layout_width=\"60dp\"\n" +
                        "      android:layout_height=\"60dp\"\n" +
                        "      android:scaleType=\"fitXY\"\n" +
                        "      android:background=\"@android:color/transparent\"\n" +
                        "      android:src=\"@drawable/zzz_16\" />\n" +
                        "\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/TextView_On_ImageButtonExample\"\n" +
                        "        android:textSize=\"16dp\"\n" +
                        "        android:textColor=\"#e0e0e0\"\n" +
                        "        android:text=\"ImageButton可以将图片作为按钮控件\"\n" +
                        "        android:gravity=\"center\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_marginBottom=\"30dp\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 17:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "android:layout_width=\"match_parent\"\n" +
                        "android:layout_height=\"match_parent\"\n" +
                        "tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "  <ImageView\n" +
                        "      android:layout_centerInParent=\"true\"\n" +
                        "      android:layout_width=\"60dp\"\n" +
                        "      android:layout_height=\"60dp\"\n" +
                        "      android:scaleType=\"fitXY\"\n" +
                        "      android:background=\"@android:color/transparent\"\n" +
                        "      android:src=\"@drawable/zzz_17\" />\n" +
                        "\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:textSize=\"16dp\"\n" +
                        "        android:textColor=\"#e0e0e0\"\n" +
                        "        android:text=\"ImageView可用于显示图像\"\n" +
                        "        android:gravity=\"center\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_marginBottom=\"30dp\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 18:
                codeLoad("<VideoView xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "android:layout_width=\"match_parent\"\n" +
                        "    android:id=\"@+id/VideoView_Example\"\n" +
                        "android:layout_height=\"match_parent\"\n" +
                        "tools:context=\".MainActivity\"/>");
                break;
            case 19:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "    <TextClock\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:textSize=\"70dp\"\n" +
                        "        android:textColor=\"#be9615\"\n" +
                        "        tools:ignore=\"NewApi\" />\n" +
                        "</RelativeLayout>");
                break;
            case 20:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "    <Chronometer\n" +
                        "        android:id=\"@+id/Chronometer_Example\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:textSize=\"70dp\"\n" +
                        "        android:countDown=\"true\"\n" +
                        "        android:textColor=\"#45b678\"\n" +
                        "        tools:ignore=\"NewApi\" />\n" +
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

        if (getLoadValue() == 15) {
            for (int i = 0; i < 3; i++) {
                findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1))).setVisibility(View.VISIBLE);
                ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getResources().getStringArray(R.array.nextOneTopRightTextViewRightLoad)[i]);

            }
        } else {
            for (int i = 0; i < 2; i++) {
                findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1))).setVisibility(View.VISIBLE);
                ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getStringArray(R.array.nextOneTopRightTextViewRightLoad)[i]);
            }
        }

        for (int i = 1; i <= 3; i++) {
            if (v.getId() == getId(SCROLLVIEW_BUTTON_NAME_ + i)) {
                ((Button) findViewById(R.id.nextTopRightButton)).setText(getResources().getStringArray(R.array.nextOneTopRightTextViewRightLoad)[i - 1]);
                topRightHide();

                if (i == 1) mainActivityJava(getLoadValue());
                if (i == 2) xml(getLoadValue());
                if (i == 3) {
                    codeLoad("<LinearLayout\n" +
                            "    xmlns:android=\"http://schemas.android.com/apk/res/android\" android:layout_width=\"match_parent\"\n" +
                            "    android:layout_height=\"match_parent\"\n" +
                            "    android:orientation=\"vertical\">\n" +
                            "\n" +
                            "    <ImageView\n" +
                            "        android:id=\"@+id/AdapterViewFlipper_Example_ImageView\"\n" +
                            "        android:layout_width=\"60dp\"\n" +
                            "        android:layout_gravity=\"center_horizontal\"\n" +
                            "        android:layout_height=\"60dp\" />\n" +
                            "\n" +
                            "    <TextView\n" +
                            "        android:id=\"@+id/AdapterViewFlipper_Example_TextView\"\n" +
                            "        android:layout_marginTop=\"20dp\"\n" +
                            "        android:textSize=\"28dp\"\n" +
                            "        android:textColor=\"#82be46\"\n" +
                            "        android:layout_gravity=\"center_horizontal\"\n" +
                            "        android:gravity=\"center\"\n" +
                            "        android:layout_width=\"90dp\"\n" +
                            "        android:layout_height=\"wrap_content\" />\n" +
                            "\n" +
                            "</LinearLayout>");
                }
            }
        }


    }
}
