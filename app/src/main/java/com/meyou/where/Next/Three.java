package com.meyou.where.Next;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.meyou.where.R;
import com.meyou.where.What;

public class Three extends What {


    private void mainActivityJava(int i) {
        switch (i) {
            case 1:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.AdapterView;\n" +
                        "import android.widget.ArrayAdapter;\n" +
                        "import android.widget.ListView;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "        private String[] ListViewExample_Texts={\"ListViewItem     1\",\n" +
                        "                \"ListViewItem     2\",\"ListViewItem     3\",\"ListViewItem     4\",\n" +
                        "                \"ListViewItem     5\",\"ListViewItem     6\",\"ListViewItem     7\",\"ListViewItem     8\"};\n" +
                        "        private ListView listView;\n" +
                        "        private ArrayAdapter<String> arrayAdapter;\n" +
                        "\n" +
                        "        @Override\n" +
                        "        protected void onCreate(Bundle savedInstanceState) {\n" +
                        "            super.onCreate(savedInstanceState);\n" +
                        "            setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "            listView=(ListView) findViewById(R.id.ListView_On_ListViewExample);\n" +
                        "            arrayAdapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,ListViewExample_Texts);\n" +
                        "            listView.setAdapter(arrayAdapter);\n" +
                        "\n" +
                        "            //ListView的点击事件：\n" +
                        "            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n" +
                        "                @Override\n" +
                        "                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {\n" +
                        "\n" +
                        "                }\n" +
                        "            });\n" +
                        "\n" +
                        "      }\n" +
                        "\n" +
                        "}");
                break;
            case 2:
                codeLoad("import android.content.Context;\n" +
                        "import android.graphics.Typeface;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.LayoutInflater;\n" +
                        "import android.view.View;\n" +
                        "import android.view.ViewGroup;\n" +
                        "import android.widget.BaseExpandableListAdapter;\n" +
                        "import android.widget.ExpandableListView;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "import java.util.ArrayList;\n" +
                        "import java.util.HashMap;\n" +
                        "import java.util.List;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private ExpandableListView expandableListView;\n" +
                        "    private HashMap<String,List<String>> myChild;\n" +
                        "    private List<String> myHeader;\n" +
                        "    private MyExpandableListViewAdapter myExpandableListViewAdapter;\n" +
                        "\n" +
                        "        @Override\n" +
                        "        protected void onCreate(Bundle savedInstanceState) {\n" +
                        "            super.onCreate(savedInstanceState);\n" +
                        "            setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "            expandableListView=(ExpandableListView) findViewById(R.id.ExpandableListView_On_ExpandableListViewExample);\n" +
                        "\n" +
                        "            myChild=MyExpandableListViewAdapter.ChildProvider.getInfo();\n" +
                        "            myHeader=new ArrayList<>(myChild.keySet());\n" +
                        "            myExpandableListViewAdapter=new MyExpandableListViewAdapter(getApplicationContext(),myChild,myHeader);\n" +
                        "\n" +
                        "            expandableListView.setAdapter(myExpandableListViewAdapter);\n" +
                        "\n" +
                        "\n" +
                        "      }\n" +
                        "\n" +
                        "      static class MyExpandableListViewAdapter extends BaseExpandableListAdapter{\n" +
                        "            private Context context;\n" +
                        "            private HashMap<String,List<String>> ChildTitles;\n" +
                        "            private List<String> HeaderTitles;\n" +
                        "\n" +
                        "\n" +
                        "            public MyExpandableListViewAdapter(Context context,HashMap<String,List<String>> ChildTitles,List<String> HeaderTitles){\n" +
                        "                this.context=context;\n" +
                        "                this.ChildTitles=ChildTitles;\n" +
                        "                this.HeaderTitles=HeaderTitles;\n" +
                        "            }\n" +
                        "\n" +
                        "          @Override\n" +
                        "          public int getGroupCount() {\n" +
                        "              return HeaderTitles.size();\n" +
                        "          }\n" +
                        "\n" +
                        "          @Override\n" +
                        "          public int getChildrenCount(int groupPosition) {\n" +
                        "              return ChildTitles.get(HeaderTitles.get(groupPosition)).size();\n" +
                        "          }\n" +
                        "\n" +
                        "          @Override\n" +
                        "          public Object getGroup(int groupPosition) {\n" +
                        "              return HeaderTitles.get(groupPosition);\n" +
                        "          }\n" +
                        "\n" +
                        "          @Override\n" +
                        "          public Object getChild(int groupPosition, int childPosition) {\n" +
                        "              return ChildTitles.get(HeaderTitles.get(groupPosition)).get(childPosition);\n" +
                        "          }\n" +
                        "\n" +
                        "          @Override\n" +
                        "          public long getGroupId(int groupPosition) {\n" +
                        "              return groupPosition;\n" +
                        "          }\n" +
                        "\n" +
                        "          @Override\n" +
                        "          public long getChildId(int groupPosition, int childPosition) {\n" +
                        "              return childPosition;\n" +
                        "          }\n" +
                        "\n" +
                        "          @Override\n" +
                        "          public boolean hasStableIds() {\n" +
                        "              return false;\n" +
                        "          }\n" +
                        "\n" +
                        "          @Override\n" +
                        "          public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {\n" +
                        "              String title=(String) this.getGroup(groupPosition);\n" +
                        "              if(convertView==null){\n" +
                        "                  LayoutInflater layoutInflater=(LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);\n" +
                        "                  convertView=layoutInflater.inflate(R.layout.header,null);\n" +
                        "              }\n" +
                        "\n" +
                        "              TextView textView=(TextView) convertView.findViewById(R.id.TextViewHeader_On_ExpandableListViewExample);\n" +
                        "              textView.setTypeface(null,Typeface.BOLD);\n" +
                        "              textView.setText(title);\n" +
                        "              return convertView;\n" +
                        "          }\n" +
                        "\n" +
                        "          @Override\n" +
                        "          public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {\n" +
                        "              String title=(String) this.getChild(groupPosition,childPosition);\n" +
                        "              if(convertView==null){\n" +
                        "                  LayoutInflater layoutInflater=(LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);\n" +
                        "                  convertView=layoutInflater.inflate(R.layout.childitems,null);\n" +
                        "              }\n" +
                        "\n" +
                        "              TextView textView=(TextView) convertView.findViewById(R.id.TextViewChild_On_ExpandableListViewExample);\n" +
                        "              textView.setText(title);\n" +
                        "              return convertView;\n" +
                        "          }\n" +
                        "\n" +
                        "          @Override\n" +
                        "          public boolean isChildSelectable(int groupPosition, int childPosition) {\n" +
                        "              return true;\n" +
                        "          }\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "          public static class ChildProvider{\n" +
                        "              public static HashMap<String,List<String>> getInfo(){\n" +
                        "                  HashMap<String,List<String>> HeaderDetails=new HashMap<>();\n" +
                        "\n" +
                        "                  List<String> ChildDetails_1=new ArrayList<>();\n" +
                        "                  ChildDetails_1.add(\"This is Children 11\");\n" +
                        "                  ChildDetails_1.add(\"This is Children 12\");\n" +
                        "                  ChildDetails_1.add(\"This is Children 13\");\n" +
                        "                  ChildDetails_1.add(\"This is Children 14\");\n" +
                        "\n" +
                        "                  List<String> ChildDetails_2=new ArrayList<>();\n" +
                        "                  ChildDetails_2.add(\"This is Children 21\");\n" +
                        "                  ChildDetails_2.add(\"This is Children 22\");\n" +
                        "                  ChildDetails_2.add(\"This is Children 23\");\n" +
                        "                  ChildDetails_2.add(\"This is Children 24\");\n" +
                        "\n" +
                        "                  List<String> ChildDetails_3=new ArrayList<>();\n" +
                        "                  ChildDetails_3.add(\"This is Children 31\");\n" +
                        "                  ChildDetails_3.add(\"This is Children 32\");\n" +
                        "                  ChildDetails_3.add(\"This is Children 33\");\n" +
                        "                  ChildDetails_3.add(\"This is Children 34\");\n" +
                        "\n" +
                        "                  List<String> ChildDetails_4=new ArrayList<>();\n" +
                        "                  ChildDetails_4.add(\"This is Children 41\");\n" +
                        "                  ChildDetails_4.add(\"This is Children 42\");\n" +
                        "                  ChildDetails_4.add(\"This is Children 43\");\n" +
                        "                  ChildDetails_4.add(\"This is Children 44\");\n" +
                        "\n" +
                        "                  HeaderDetails.put(\"Header 1\",ChildDetails_1);\n" +
                        "                  HeaderDetails.put(\"Header 2\",ChildDetails_2);\n" +
                        "                  HeaderDetails.put(\"Header 3\",ChildDetails_3);\n" +
                        "                  HeaderDetails.put(\"Header 4\",ChildDetails_4);\n" +
                        "\n" +
                        "                  return HeaderDetails;\n" +
                        "              }\n" +
                        "          }\n" +
                        "\n" +
                        "\n" +
                        "      }\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "}");
                break;
            case 3:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.widget.ArrayAdapter;\n" +
                        "import android.widget.GridView;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private String[] GridViewExampleTexts={\"GridViewItem    1\",\"GridViewItem    2\",\n" +
                        "            \"GridViewItem    3\",\"GridViewItem    4\",\"GridViewItem    5\",\n" +
                        "            \"GridViewItem    6\",\"GridViewItem    7\"};\n" +
                        "    private GridView gridView;\n" +
                        "    private ArrayAdapter<String> arrayAdapter;\n" +
                        "\n" +
                        "        @Override\n" +
                        "        protected void onCreate(Bundle savedInstanceState) {\n" +
                        "            super.onCreate(savedInstanceState);\n" +
                        "            setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "            gridView=(GridView) findViewById(R.id.GridView_On_GridViewExample);\n" +
                        "            arrayAdapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,GridViewExampleTexts);\n" +
                        "            gridView.setAdapter(arrayAdapter);\n" +
                        "\n" +
                        "\n" +
                        "      }\n" +
                        "}");
                break;
            case 4:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.webkit.WebView;\n" +
                        "import android.webkit.WebViewClient;\n" +
                        "\n" +
                        "\n" +
                        "//注意在AndroidManifest.xml配置文件中添加<uses-permission android:name=\"android.permission.INTERNET\"/>权限\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private WebView webView;\n" +
                        "\n" +
                        "        @Override\n" +
                        "        protected void onCreate(Bundle savedInstanceState) {\n" +
                        "            super.onCreate(savedInstanceState);\n" +
                        "            setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "            webView=(WebView) findViewById(R.id.WebView_On_WebViewExample);\n" +
                        "            webView.getSettings().setJavaScriptEnabled(true);\n" +
                        "            webView.setWebViewClient(new WebViewClient());\n" +
                        "            webView.getSettings().setLoadsImagesAutomatically(true);\n" +
                        "            webView.loadUrl(\"http://www.dgtle.com\");\n" +
                        "\n" +
                        "\n" +
                        "      }\n" +
                        "}");
                break;
            case 5:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.widget.ArrayAdapter;\n" +
                        "import android.widget.ListView;\n" +
                        "import android.widget.SearchView;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private String[] SearchViewExampleTexts={\"衡阳\",\"长沙\",\"湘潭\",\"武汉\",\"北京\",\"重庆\",\"四川\",\"防城港\",\"上海\",\"大连\",\"株洲\",\"广州\",\"南宁\",\"乌鲁木齐\"};\n" +
                        "    private SearchView searchView;\n" +
                        "    private ListView listView;\n" +
                        "    private ArrayAdapter<String> arrayAdapter;\n" +
                        "\n" +
                        "        @Override\n" +
                        "        protected void onCreate(Bundle savedInstanceState) {\n" +
                        "            super.onCreate(savedInstanceState);\n" +
                        "            setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "            searchView=(SearchView) findViewById(R.id.SearchView_On_SearchViewExample);\n" +
                        "            listView=(ListView) findViewById(R.id.ListView_On_SearchViewExample);\n" +
                        "\n" +
                        "            arrayAdapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,SearchViewExampleTexts);\n" +
                        "\n" +
                        "            listView.setAdapter(arrayAdapter);\n" +
                        "            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {\n" +
                        "                @Override\n" +
                        "                public boolean onQueryTextSubmit(String query) {\n" +
                        "                    return false;\n" +
                        "                }\n" +
                        "\n" +
                        "                @Override\n" +
                        "                public boolean onQueryTextChange(String newText) {\n" +
                        "                    arrayAdapter.getFilter().filter(newText);\n" +
                        "                    return false;\n" +
                        "                }\n" +
                        "            });\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "      }\n" +
                        "}");
                break;
            case 6:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.MenuItem;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.PopupMenu;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "        @Override\n" +
                        "        protected void onCreate(Bundle savedInstanceState) {\n" +
                        "            super.onCreate(savedInstanceState);\n" +
                        "            setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "            button=(Button) findViewById(R.id.Button_On_PopUpMenuExample);\n" +
                        "            button.setOnClickListener(new View.OnClickListener() {\n" +
                        "                @Override\n" +
                        "                public void onClick(View v) {\n" +
                        "                    PopupMenu popupMenu=new PopupMenu(MainActivity.this,button);\n" +
                        "                    popupMenu.getMenuInflater().inflate(R.menu.menu_popup,popupMenu.getMenu());\n" +
                        "                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {\n" +
                        "                        @Override\n" +
                        "                        public boolean onMenuItemClick(MenuItem item) {\n" +
                        "                            button.setText(\"你点击了菜单项：\"+item.getTitle());\n" +
                        "                            return false;\n" +
                        "                        }\n" +
                        "                    });\n" +
                        "                    popupMenu.show();\n" +
                        "                }\n" +
                        "            });\n" +
                        "\n" +
                        "\n" +
                        "      }\n" +
                        "}");
                break;
            case 7:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.widget.DatePicker;\n" +
                        "\n" +
                        "import java.util.Calendar;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private DatePicker datePicker;\n" +
                        "    private Calendar calendar;\n" +
                        "\n" +
                        "        @Override\n" +
                        "        protected void onCreate(Bundle savedInstanceState) {\n" +
                        "            super.onCreate(savedInstanceState);\n" +
                        "            setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "            datePicker=(DatePicker) findViewById(R.id.DatePicker_On_DatePickerExample);\n" +
                        "            calendar=Calendar.getInstance();\n" +
                        "            datePicker.init(calendar.get(Calendar.YEAR),\n" +
                        "                    calendar.get(Calendar.MONTH),\n" +
                        "                    calendar.get(Calendar.DAY_OF_MONTH),\n" +
                        "                    new DatePicker.OnDateChangedListener() {\n" +
                        "                        @Override\n" +
                        "                        public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {\n" +
                        "                            //当DatePicker中的日期发生变化时会触发该事件\n" +
                        "                        }\n" +
                        "                    });\n" +
                        "\n" +
                        "      }\n" +
                        "}");
                break;
            case 8:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.widget.TimePicker;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private TimePicker timePicker;\n" +
                        "\n" +
                        "        @Override\n" +
                        "        protected void onCreate(Bundle savedInstanceState) {\n" +
                        "            super.onCreate(savedInstanceState);\n" +
                        "            setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "            timePicker=(TimePicker) findViewById(R.id.TimePicker_On_TimePickerExample);\n" +
                        "            timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {\n" +
                        "                @Override\n" +
                        "                public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {\n" +
                        "                    //当TimePicker中的时间发生变化时会触发该事件\n" +
                        "                }\n" +
                        "            });\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "      }\n" +
                        "}");
                break;
            case 9:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.design.widget.TextInputEditText;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.text.TextUtils;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private TextInputEditText textInputEditText_UserName,textInputEditText_PassWord;\n" +
                        "    private Button Login;\n" +
                        "    private TextView textView;\n" +
                        "\n" +
                        "        @Override\n" +
                        "        protected void onCreate(Bundle savedInstanceState) {\n" +
                        "            super.onCreate(savedInstanceState);\n" +
                        "            setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "            textInputEditText_UserName=(TextInputEditText) findViewById(R.id.TextInputEditText_A_OnExample);\n" +
                        "            textInputEditText_PassWord=(TextInputEditText) findViewById(R.id.TextInputEditText_B_OnExample);\n" +
                        "            textView=(TextView) findViewById(R.id.TextView_On_TextInputEditTextExample);\n" +
                        "            Login=(Button) findViewById(R.id.Button_On_TextInputEditTextExample);\n" +
                        "            Login.setOnClickListener(new View.OnClickListener() {\n" +
                        "                @Override\n" +
                        "                public void onClick(View v) {\n" +
                        "                    Login();\n" +
                        "                }\n" +
                        "            });\n" +
                        "\n" +
                        "      }\n" +
                        "\n" +
                        "      private void Login(){\n" +
                        "            if(TextUtils.isEmpty(textInputEditText_UserName.getText().toString().trim())&&TextUtils.isEmpty(textInputEditText_PassWord.getText().toString().trim())){\n" +
                        "                textInputEditText_UserName.setError(\"UserName can't be Empty\");\n" +
                        "                textInputEditText_PassWord.setError(\"PassWord can't be Empty\");\n" +
                        "            }else if (TextUtils.isEmpty(textInputEditText_UserName.getText().toString().trim())){\n" +
                        "                textInputEditText_UserName.setError(\"UserName can't be Empty\");\n" +
                        "            }else if(TextUtils.isEmpty(textInputEditText_PassWord.getText().toString().trim())){\n" +
                        "                textInputEditText_PassWord.setError(\"PassWord can't be Empty\");\n" +
                        "            }else {\n" +
                        "                textView.setText(\"Login Success\");\n" +
                        "                textInputEditText_UserName.setText(null);\n" +
                        "                textInputEditText_PassWord.setText(null);\n" +
                        "            }\n" +
                        "      }\n" +
                        "}");
                break;
            case 10:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.design.widget.FloatingActionButton;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private FloatingActionButton floatingActionButton;\n" +
                        "    private TextView textView;\n" +
                        "\n" +
                        "        @Override\n" +
                        "        protected void onCreate(Bundle savedInstanceState) {\n" +
                        "            super.onCreate(savedInstanceState);\n" +
                        "            setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "            floatingActionButton=(FloatingActionButton) findViewById(R.id.FloatingActionButton_FloatingActionButtonExample);\n" +
                        "            textView=(TextView) findViewById(R.id.TextView_On_FloatingActionButtonExample);\n" +
                        "            floatingActionButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "                @Override\n" +
                        "                public void onClick(View v) {\n" +
                        "                    textView.setText(\"你点击了FloatingActionButton\");\n" +
                        "                }\n" +
                        "            });\n" +
                        "\n" +
                        "\n" +
                        "      }\n" +
                        "}");
                break;
            case 11:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.annotation.NonNull;\n" +
                        "import android.support.design.widget.BottomNavigationView;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.MenuItem;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private TextView textView;\n" +
                        "    private BottomNavigationView bottomNavigationView;\n" +
                        "\n" +
                        "\n" +
                        "        @Override\n" +
                        "        protected void onCreate(Bundle savedInstanceState) {\n" +
                        "            super.onCreate(savedInstanceState);\n" +
                        "            setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "            textView=(TextView) findViewById(R.id.TextView_On_BottomNavigationViewExample);\n" +
                        "            bottomNavigationView=(BottomNavigationView) findViewById(R.id.BottomNavigationView_On_BottomNavigationViewExample);\n" +
                        "\n" +
                        "            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {\n" +
                        "                @Override\n" +
                        "                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {\n" +
                        "                    switch (menuItem.getItemId()){\n" +
                        "                        case R.id.action_1:\n" +
                        "                            textView.setText(\"你点击了One\");\n" +
                        "                            break;\n" +
                        "                        case R.id.action_2:\n" +
                        "                            textView.setText(\"你点击了Two\");\n" +
                        "                            break;\n" +
                        "                        case R.id.action_3:\n" +
                        "                            textView.setText(\"你点击了Three\");\n" +
                        "                            default:\n" +
                        "                                break;\n" +
                        "                    }\n" +
                        "                    return false;\n" +
                        "                }\n" +
                        "            });\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "      }\n" +
                        "}");
                break;
            case 12:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    @Override\n" +
                        "        protected void onCreate(Bundle savedInstanceState) {\n" +
                        "            super.onCreate(savedInstanceState);\n" +
                        "            setContentView(R.layout.activity_main); \n" +
                        "    \n" +
                        "    }\n" +
                        "}\n");
                break;
            case 13:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
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
            case 14:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.annotation.NonNull;\n" +
                        "import android.support.design.widget.BottomSheetBehavior;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "    private Button button;\n" +
                        "    private View bottomSheet;\n" +
                        "    private  BottomSheetBehavior bottomSheetBehavior;\n" +
                        "    private TextView textView;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        bottomSheet=findViewById(R.id.RelativeLayout_On_NestedScrollViewExample);\n" +
                        "        bottomSheetBehavior=BottomSheetBehavior.from(bottomSheet);\n" +
                        "        textView=(TextView) findViewById(R.id.TextView_On_NestedScrollViewExample);\n" +
                        "        button=(Button) findViewById(R.id.Button_On_NestedScrollViewExample);\n" +
                        "        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {\n" +
                        "            @Override\n" +
                        "            public void onStateChanged(@NonNull View view, int i) {\n" +
                        "                if(i==BottomSheetBehavior.STATE_COLLAPSED){\n" +
                        "                    textView.setText(\"上滑以打开NestedScrollView\");\n" +
                        "                }else if (i==BottomSheetBehavior.STATE_EXPANDED){\n" +
                        "                    textView.setText(\"下滑以关闭NestedScrollView\");\n" +
                        "                }\n" +
                        "            }\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void onSlide(@NonNull View view, float v) {\n" +
                        "\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                if(bottomSheetBehavior.getState()==BottomSheetBehavior.STATE_COLLAPSED){\n" +
                        "                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);\n" +
                        "                }else {\n" +
                        "                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
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
                        "\n" +
                        "  <ListView\n" +
                        "      android:id=\"@+id/ListView_On_ListViewExample\"\n" +
                        "      android:layout_width=\"match_parent\"\n" +
                        "      android:layout_height=\"match_parent\"/>\n" +
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
                        "  <ExpandableListView\n" +
                        "      android:id=\"@+id/ExpandableListView_On_ExpandableListViewExample\"\n" +
                        "      android:layout_width=\"match_parent\"\n" +
                        "      android:layout_height=\"match_parent\"/>\n" +
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
                        "\n" +
                        "  <GridView\n" +
                        "      android:id=\"@+id/GridView_On_GridViewExample\"\n" +
                        "      android:numColumns=\"2\"\n" +
                        "      android:layout_width=\"match_parent\"\n" +
                        "      android:layout_height=\"match_parent\"/>\n" +
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
                        "\n" +
                        " <WebView\n" +
                        "     android:id=\"@+id/WebView_On_WebViewExample\"\n" +
                        "     android:layout_width=\"match_parent\"\n" +
                        "     android:layout_height=\"match_parent\"/>\n" +
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
                        " <SearchView\n" +
                        "     android:id=\"@+id/SearchView_On_SearchViewExample\"\n" +
                        "     android:layout_width=\"match_parent\"\n" +
                        "     android:layout_height=\"wrap_content\"\n" +
                        "     android:iconifiedByDefault=\"false\">\n" +
                        "  \n" +
                        "  <requestFocus/>\n" +
                        " \n" +
                        " </SearchView>\n" +
                        "\n" +
                        " <ListView\n" +
                        "     android:id=\"@+id/ListView_On_SearchViewExample\"\n" +
                        "     android:layout_below=\"@id/SearchView_On_SearchViewExample\"\n" +
                        "     android:layout_width=\"match_parent\"\n" +
                        "     android:layout_height=\"match_parent\"/>\n" +
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
                        "\n" +
                        " <Button\n" +
                        "     android:id=\"@+id/Button_On_PopUpMenuExample\"\n" +
                        "     style=\"?attr/borderlessButtonStyle\"\n" +
                        "     android:background=\"#f05a29\"\n" +
                        "     android:layout_width=\"wrap_content\"\n" +
                        "     android:paddingLeft=\"40dp\"\n" +
                        "     android:paddingRight=\"40dp\"\n" +
                        "     android:layout_height=\"110dp\"\n" +
                        "     android:text=\"PopUpMenu\"\n" +
                        "     android:textAllCaps=\"false\"\n" +
                        "     android:textSize=\"38dp\"\n" +
                        "     android:textColor=\"@android:color/white\"\n" +
                        "     android:layout_centerInParent=\"true\"/>\n" +
                        "\n" +
                        " <TextView\n" +
                        "     android:textColor=\"#e0e0e0\"\n" +
                        "     android:layout_width=\"wrap_content\"\n" +
                        "     android:layout_height=\"wrap_content\"\n" +
                        "     android:layout_alignParentBottom=\"true\"\n" +
                        "     android:layout_centerHorizontal=\"true\"\n" +
                        "     android:layout_marginBottom=\"30dp\"\n" +
                        "     android:text=\"单击按钮打开PopUpMenu菜单\" />\n" +
                        "\n" +
                        "\n" +
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
                        "\n" +
                        " <DatePicker\n" +
                        "     android:id=\"@+id/DatePicker_On_DatePickerExample\"\n" +
                        "     android:layout_width=\"match_parent\"\n" +
                        "     android:layout_height=\"match_parent\"/>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 8:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        " <TimePicker\n" +
                        "     android:id=\"@+id/TimePicker_On_TimePickerExample\"\n" +
                        "     android:layout_width=\"match_parent\"\n" +
                        "     android:layout_height=\"match_parent\"/>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 9:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        " <ScrollView\n" +
                        "     android:scrollbarThumbVertical=\"@android:color/transparent\"\n" +
                        "     android:layout_width=\"match_parent\"\n" +
                        "     android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "  <LinearLayout\n" +
                        "      android:orientation=\"vertical\"\n" +
                        "      android:layout_width=\"match_parent\"\n" +
                        "      android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        " <TextView\n" +
                        "     android:id=\"@+id/TextView_On_TextInputEditTextExample\"\n" +
                        "     android:textColor=\"#35ccff\"\n" +
                        "     android:text=\"Welcome\"\n" +
                        "     android:layout_gravity=\"center\"\n" +
                        "     android:textSize=\"40dp\"\n" +
                        "     android:layout_marginTop=\"20dp\"\n" +
                        "     android:layout_width=\"wrap_content\"\n" +
                        "     android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        " <LinearLayout\n" +
                        "     android:layout_below=\"@id/TextView_On_TextInputEditTextExample\"\n" +
                        "     android:orientation=\"vertical\"\n" +
                        "     android:layout_width=\"match_parent\"\n" +
                        "     android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "\n" +
                        "  <android.support.design.widget.TextInputLayout\n" +
                        "      android:layout_width=\"match_parent\"\n" +
                        "      android:layout_marginTop=\"60dp\"\n" +
                        "      android:layout_marginLeft=\"20dp\"\n" +
                        "      android:layout_marginRight=\"20dp\"\n" +
                        "      android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "   <android.support.design.widget.TextInputEditText\n" +
                        "       android:id=\"@+id/TextInputEditText_A_OnExample\"\n" +
                        "       android:layout_width=\"match_parent\"\n" +
                        "       android:layout_height=\"wrap_content\"\n" +
                        "       android:hint=\"UserName\"\n" +
                        "       android:inputType=\"text\"\n" +
                        "       android:maxLines=\"1\"/>\n" +
                        "  </android.support.design.widget.TextInputLayout>\n" +
                        "\n" +
                        "  <android.support.design.widget.TextInputLayout\n" +
                        "      android:layout_marginTop=\"30dp\"\n" +
                        "      android:layout_marginLeft=\"20dp\"\n" +
                        "      android:layout_marginRight=\"20dp\"\n" +
                        "      app:passwordToggleEnabled=\"true\"\n" +
                        "      android:layout_width=\"match_parent\"\n" +
                        "      android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "   <android.support.design.widget.TextInputEditText\n" +
                        "       android:id=\"@+id/TextInputEditText_B_OnExample\"\n" +
                        "       android:layout_width=\"match_parent\"\n" +
                        "       android:layout_height=\"wrap_content\"\n" +
                        "       android:hint=\"PassWord\"\n" +
                        "       android:inputType=\"textPassword\"\n" +
                        "       android:maxLines=\"1\"/>\n" +
                        "  </android.support.design.widget.TextInputLayout>\n" +
                        "\n" +
                        "  <Button\n" +
                        "      android:id=\"@+id/Button_On_TextInputEditTextExample\"\n" +
                        "      style=\"?attr/borderlessButtonStyle\"\n" +
                        "      android:background=\"#35ccff\"\n" +
                        "      android:textColor=\"@android:color/white\"\n" +
                        "      android:layout_marginTop=\"50dp\"\n" +
                        "      android:layout_marginBottom=\"30dp\"\n" +
                        "      android:layout_marginLeft=\"30dp\"\n" +
                        "      android:layout_marginRight=\"30dp\"\n" +
                        "      android:text=\"Login\"\n" +
                        "      android:textSize=\"30dp\"\n" +
                        "      android:layout_width=\"match_parent\"\n" +
                        "      android:layout_height=\"60dp\" />\n" +
                        " </LinearLayout>\n" +
                        "\n" +
                        "  </LinearLayout>\n" +
                        " </ScrollView>\n" +
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
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        " <TextView\n" +
                        "     android:id=\"@+id/TextView_On_FloatingActionButtonExample\"\n" +
                        "     android:layout_width=\"wrap_content\"\n" +
                        "     android:layout_height=\"wrap_content\"\n" +
                        "     android:layout_alignParentTop=\"true\"\n" +
                        "     android:layout_centerHorizontal=\"true\"\n" +
                        "     android:layout_marginTop=\"120dp\"\n" +
                        "     android:text=\"FloatingActionButton\"\n" +
                        "     android:textColor=\"#98a20d\"\n" +
                        "     android:textSize=\"38dp\" />\n" +
                        "\n" +
                        " <android.support.design.widget.FloatingActionButton\n" +
                        "     android:id=\"@+id/FloatingActionButton_FloatingActionButtonExample\"\n" +
                        "     android:layout_width=\"wrap_content\"\n" +
                        "     android:layout_height=\"wrap_content\"\n" +
                        "     android:layout_alignParentEnd=\"true\"\n" +
                        "     android:layout_alignParentRight=\"true\"\n" +
                        "     android:layout_alignParentBottom=\"true\"\n" +
                        "     android:layout_marginEnd=\"30dp\"\n" +
                        "     android:layout_marginRight=\"30dp\"\n" +
                        "     android:layout_marginBottom=\"32dp\"\n" +
                        "     android:clickable=\"true\"\n" +
                        "     app:elevation=\"0dp\"\n" +
                        "     app:fabSize=\"mini\"\n" +
                        "     app:srcCompat=\"@drawable/shuxing_to_home_pressed\" />\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 11:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        " <TextView\n" +
                        "     android:id=\"@+id/TextView_On_BottomNavigationViewExample\"\n" +
                        "     android:layout_width=\"wrap_content\"\n" +
                        "     android:layout_height=\"wrap_content\"\n" +
                        "     android:layout_centerHorizontal=\"true\"\n" +
                        "     android:layout_marginTop=\"90dp\"\n" +
                        "     android:text=\"BottomNavigationView\"\n" +
                        "     android:textColor=\"#b968c7\"\n" +
                        "     android:textSize=\"38dp\" />\n" +
                        "\n" +
                        " <android.support.design.widget.BottomNavigationView\n" +
                        "     android:id=\"@+id/BottomNavigationView_On_BottomNavigationViewExample\"\n" +
                        "     android:layout_alignParentBottom=\"true\"\n" +
                        "     android:layout_width=\"match_parent\"\n" +
                        "     android:layout_height=\"wrap_content\"\n" +
                        "     android:background=\"#b968c7\"\n" +
                        "     app:itemIconTint=\"@android:color/white\"\n" +
                        "     app:itemTextColor=\"@android:color/white\"\n" +
                        "     app:menu=\"@menu/bottom_navi\"/>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 12:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        " <android.support.v4.widget.DrawerLayout\n" +
                        "  android:layout_width=\"match_parent\"\n" +
                        "  android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        " <TextView\n" +
                        "     android:layout_width=\"wrap_content\"\n" +
                        "     android:layout_height=\"wrap_content\"\n" +
                        "     android:layout_centerInParent=\"true\"\n" +
                        "     android:gravity=\"center\"\n" +
                        "     android:text=\"NavigationView\\n左滑屏幕边缘以打开滑动菜单\"\n" +
                        "     android:textColor=\"#78909c\"\n" +
                        "     android:textSize=\"38dp\" />\n" +
                        "\n" +
                        "  <android.support.design.widget.NavigationView\n" +
                        "   android:layout_height=\"match_parent\"\n" +
                        "      android:layout_gravity=\"start\"\n" +
                        "      app:headerLayout=\"@layout/header_navi\"\n" +
                        "      app:menu=\"@menu/bottom_navi\"\n" +
                        "   android:layout_width=\"340dp\"/>\n" +
                        "\n" +
                        " </android.support.v4.widget.DrawerLayout>\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 13:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "    <ScrollView\n" +
                        "        android:scrollbarThumbVertical=\"@android:color/transparent\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "        <LinearLayout\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"match_parent\"\n" +
                        "            android:orientation=\"vertical\">\n" +
                        "\n" +
                        "            <android.widget.Toolbar\n" +
                        "                android:layout_width=\"match_parent\"\n" +
                        "                android:layout_height=\"100dp\"\n" +
                        "                android:background=\"@android:color/transparent\">\n" +
                        "\n" +
                        "                <ImageView\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_marginLeft=\"150dp\"\n" +
                        "                    android:background=\"#5c6bc0\"\n" +
                        "                    android:layout_width=\"40dp\"\n" +
                        "                    android:layout_height=\"40dp\" />\n" +
                        "\n" +
                        "                <TextView\n" +
                        "                    android:textSize=\"38dp\"\n" +
                        "                    android:layout_marginLeft=\"60dp\"\n" +
                        "                    android:text=\"One\"\n" +
                        "                    android:textColor=\"@android:color/black\"\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_width=\"wrap_content\"\n" +
                        "                    android:layout_height=\"wrap_content\" />\n" +
                        "            </android.widget.Toolbar>\n" +
                        "\n" +
                        "\n" +
                        "            <android.widget.Toolbar\n" +
                        "                android:layout_width=\"match_parent\"\n" +
                        "                android:layout_height=\"100dp\"\n" +
                        "                android:background=\"@android:color/transparent\">\n" +
                        "\n" +
                        "                <ImageView\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_marginLeft=\"150dp\"\n" +
                        "                    android:background=\"#ffbe3c\"\n" +
                        "                    android:layout_width=\"40dp\"\n" +
                        "                    android:layout_height=\"40dp\" />\n" +
                        "\n" +
                        "                <TextView\n" +
                        "                    android:textSize=\"38dp\"\n" +
                        "                    android:layout_marginLeft=\"60dp\"\n" +
                        "                    android:text=\"Two\"\n" +
                        "                    android:textColor=\"@android:color/black\"\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_width=\"wrap_content\"\n" +
                        "                    android:layout_height=\"wrap_content\" />\n" +
                        "            </android.widget.Toolbar>\n" +
                        "\n" +
                        "\n" +
                        "            <android.widget.Toolbar\n" +
                        "                android:layout_width=\"match_parent\"\n" +
                        "                android:layout_height=\"100dp\"\n" +
                        "                android:background=\"@android:color/transparent\">\n" +
                        "\n" +
                        "                <ImageView\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_marginLeft=\"150dp\"\n" +
                        "                    android:background=\"#0071c1\"\n" +
                        "                    android:layout_width=\"40dp\"\n" +
                        "                    android:layout_height=\"40dp\" />\n" +
                        "\n" +
                        "                <TextView\n" +
                        "                    android:textSize=\"38dp\"\n" +
                        "                    android:layout_marginLeft=\"60dp\"\n" +
                        "                    android:text=\"Three\"\n" +
                        "                    android:textColor=\"@android:color/black\"\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_width=\"wrap_content\"\n" +
                        "                    android:layout_height=\"wrap_content\" />\n" +
                        "            </android.widget.Toolbar>\n" +
                        "\n" +
                        "\n" +
                        "            <android.widget.Toolbar\n" +
                        "                android:layout_width=\"match_parent\"\n" +
                        "                android:layout_height=\"100dp\"\n" +
                        "                android:background=\"@android:color/transparent\">\n" +
                        "\n" +
                        "                <ImageView\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_marginLeft=\"150dp\"\n" +
                        "                    android:background=\"#e27c3e\"\n" +
                        "                    android:layout_width=\"40dp\"\n" +
                        "                    android:layout_height=\"40dp\" />\n" +
                        "\n" +
                        "                <TextView\n" +
                        "                    android:textSize=\"38dp\"\n" +
                        "                    android:layout_marginLeft=\"60dp\"\n" +
                        "                    android:text=\"Four\"\n" +
                        "                    android:textColor=\"@android:color/black\"\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_width=\"wrap_content\"\n" +
                        "                    android:layout_height=\"wrap_content\" />\n" +
                        "            </android.widget.Toolbar>\n" +
                        "\n" +
                        "\n" +
                        "            <android.widget.Toolbar\n" +
                        "                android:layout_width=\"match_parent\"\n" +
                        "                android:layout_height=\"100dp\"\n" +
                        "                android:background=\"@android:color/transparent\">\n" +
                        "\n" +
                        "                <ImageView\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_marginLeft=\"150dp\"\n" +
                        "                    android:background=\"#f55623\"\n" +
                        "                    android:layout_width=\"40dp\"\n" +
                        "                    android:layout_height=\"40dp\" />\n" +
                        "\n" +
                        "                <TextView\n" +
                        "                    android:textSize=\"38dp\"\n" +
                        "                    android:layout_marginLeft=\"60dp\"\n" +
                        "                    android:text=\"Five\"\n" +
                        "                    android:textColor=\"@android:color/black\"\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_width=\"wrap_content\"\n" +
                        "                    android:layout_height=\"wrap_content\" />\n" +
                        "            </android.widget.Toolbar>\n" +
                        "\n" +
                        "\n" +
                        "            <android.widget.Toolbar\n" +
                        "                android:layout_width=\"match_parent\"\n" +
                        "                android:layout_height=\"100dp\"\n" +
                        "                android:background=\"@android:color/transparent\">\n" +
                        "\n" +
                        "                <ImageView\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_marginLeft=\"150dp\"\n" +
                        "                    android:background=\"#7030a0\"\n" +
                        "                    android:layout_width=\"40dp\"\n" +
                        "                    android:layout_height=\"40dp\" />\n" +
                        "\n" +
                        "                <TextView\n" +
                        "                    android:textSize=\"38dp\"\n" +
                        "                    android:layout_marginLeft=\"60dp\"\n" +
                        "                    android:text=\"Six\"\n" +
                        "                    android:textColor=\"@android:color/black\"\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_width=\"wrap_content\"\n" +
                        "                    android:layout_height=\"wrap_content\" />\n" +
                        "            </android.widget.Toolbar>\n" +
                        "\n" +
                        "            <android.widget.Toolbar\n" +
                        "                android:layout_width=\"match_parent\"\n" +
                        "                android:layout_height=\"100dp\"\n" +
                        "                android:background=\"@android:color/transparent\">\n" +
                        "\n" +
                        "                <ImageView\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_marginLeft=\"150dp\"\n" +
                        "                    android:background=\"#46b578\"\n" +
                        "                    android:layout_width=\"40dp\"\n" +
                        "                    android:layout_height=\"40dp\" />\n" +
                        "\n" +
                        "                <TextView\n" +
                        "                    android:textSize=\"38dp\"\n" +
                        "                    android:layout_marginLeft=\"60dp\"\n" +
                        "                    android:text=\"Seven\"\n" +
                        "                    android:textColor=\"@android:color/black\"\n" +
                        "                    android:layout_gravity=\"center_vertical|left\"\n" +
                        "                    android:layout_width=\"wrap_content\"\n" +
                        "                    android:layout_height=\"wrap_content\" />\n" +
                        "            </android.widget.Toolbar>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "        </LinearLayout>\n" +
                        "\n" +
                        "    </ScrollView>\n" +
                        "\n" +
                        "\n" +
                        "</RelativeLayout>");
                break;
            case 14:
                codeLoad("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "\n" +
                        "    <android.support.design.widget.CoordinatorLayout\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "        <android.support.v4.widget.NestedScrollView\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"match_parent\"\n" +
                        "            app:layout_behavior=\"@string/appbar_scrolling_view_behavior\">\n" +
                        "\n" +
                        "            <RelativeLayout\n" +
                        "                android:layout_width=\"match_parent\"\n" +
                        "                android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "                <Button\n" +
                        "                    android:id=\"@+id/Button_On_NestedScrollViewExample\"\n" +
                        "                    android:layout_marginTop=\"140dp\"\n" +
                        "                    style=\"?attr/borderlessButtonStyle\"\n" +
                        "                    android:layout_width=\"wrap_content\"\n" +
                        "                    android:layout_height=\"90dp\"\n" +
                        "                    android:paddingLeft=\"40dp\"\n" +
                        "                    android:paddingRight=\"40dp\"\n" +
                        "                    android:layout_centerHorizontal=\"true\"\n" +
                        "                    android:background=\"#ffbe3c\"\n" +
                        "                    android:text=\"Show NestedScrollView\"\n" +
                        "                    android:textAllCaps=\"false\"\n" +
                        "                    android:textColor=\"@android:color/white\"\n" +
                        "                    android:textSize=\"35dp\" />\n" +
                        "\n" +
                        "            </RelativeLayout>\n" +
                        "\n" +
                        "        </android.support.v4.widget.NestedScrollView>\n" +
                        "\n" +
                        "        <RelativeLayout\n" +
                        "            android:id=\"@+id/RelativeLayout_On_NestedScrollViewExample\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"match_parent\"\n" +
                        "            android:background=\"#ffbe3c\"\n" +
                        "            app:behavior_hideable=\"true\"\n" +
                        "            app:behavior_peekHeight=\"40dp\"\n" +
                        "            app:elevation=\"5dp\"\n" +
                        "            app:layout_behavior=\"@string/bottom_sheet_behavior\"\n" +
                        "            tools:ignore=\"MissingPrefix\">\n" +
                        "\n" +
                        "            <TextView\n" +
                        "                android:id=\"@+id/TextView_On_NestedScrollViewExample\"\n" +
                        "                android:layout_width=\"wrap_content\"\n" +
                        "                android:layout_height=\"wrap_content\"\n" +
                        "                android:layout_centerHorizontal=\"true\"\n" +
                        "                android:layout_marginTop=\"6dp\"\n" +
                        "                android:text=\"上滑以打开NestedScrollView\"\n" +
                        "                android:textColor=\"@android:color/white\"\n" +
                        "                android:textSize=\"22dp\" />\n" +
                        "\n" +
                        "        </RelativeLayout>\n" +
                        "\n" +
                        "    </android.support.design.widget.CoordinatorLayout>\n" +
                        "\n" +
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
        if (getLoadValue() != 2 && getLoadValue() != 12) {
            if (getLoadValue() == 11) {
                for (int i = 0; i < 3; i++) {
                    findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1))).setVisibility(View.VISIBLE);
                    ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getStringArray(R.array.nextThreeTopRightTextViewRightLoad3)[i]);
                }
            } else if (getLoadValue() == 6) {
                for (int i = 0; i < 3; i++) {
                    findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1))).setVisibility(View.VISIBLE);
                    ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getStringArray(R.array.nextThreeTopRightTextViewRightLoad2)[i]);
                }
            } else {
                for (int i = 0; i < 2; i++) {
                    findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1))).setVisibility(View.VISIBLE);
                    ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getStringArray(R.array.nextThreeTopRightTextViewRightLoad)[i]);
                }
            }

        } else {
            for (int i = 0; i < 4; i++) {
                findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1))).setVisibility(View.VISIBLE);
                if (getLoadValue() == 2) {
                    ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getStringArray(R.array.nextThreeTopRightTextViewRightLoad)[i]);
                } else {
                    ((Button) findViewById(getId(SCROLLVIEW_BUTTON_NAME_ + (i + 1)))).setText(getStringArray(R.array.nextThreeTopRightTextViewRightLoad4)[i]);

                }
            }
        }


        for (int i = 1; i <= 4; i++) {
            if (v.getId() == getId(SCROLLVIEW_BUTTON_NAME_ + i)) {
                topRightHide();
                ((Button) findViewById(R.id.nextTopRightButton)).setText(getStringArray(R.array.nextThreeTopRightTextViewRightLoad)[i - 1]);


                if (i == 1) mainActivityJava(getLoadValue());
                if (i == 2) xml(getLoadValue());
                if (i == 3) {
                    if (getLoadValue() == 11) {
                        ((Button) findViewById(R.id.nextTopRightButton)).setText(getStringArray(R.array.nextThreeTopRightTextViewRightLoad3)[i - 1]);
                        codeLoad("<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                                "\n" +
                                "    <item\n" +
                                "        android:id=\"@+id/action_1\"\n" +
                                "        android:icon=\"@drawable/ic_skip_previous_black_24dp\"\n" +
                                "        android:title=\"One\"/>\n" +
                                "\n" +
                                "    <item\n" +
                                "        android:id=\"@+id/action_2\"\n" +
                                "        android:icon=\"@drawable/ic_panorama_horizontal_black_24dp\"\n" +
                                "        android:title=\"Two\"/>\n" +
                                "\n" +
                                "    <item\n" +
                                "        android:id=\"@+id/action_3\"\n" +
                                "        android:icon=\"@drawable/ic_skip_next_black_24dp\"\n" +
                                "        android:title=\"Three\"/>\n" +
                                "\n" +
                                "</menu>");
                    } else if (getLoadValue() == 6) {
                        ((Button) findViewById(R.id.nextTopRightButton)).setText(getStringArray(R.array.nextThreeTopRightTextViewRightLoad2)[i - 1]);
                        codeLoad("<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                                "\n" +
                                "    <item android:title=\"PopUpMenuItem   1\"/>\n" +
                                "\n" +
                                "    <item android:title=\"PopUpMenuItem   2\"/>\n" +
                                "\n" +
                                "    <item android:title=\"PopUpMenuItem   3\"/>\n" +
                                "\n" +
                                "    <item android:title=\"PopUpMenuItem   4\"/>\n" +
                                "\n" +
                                "</menu>");
                    } else if (getLoadValue() == 2) {
                        codeLoad("<RelativeLayout\n" +
                                "    xmlns:android=\"http://schemas.android.com/apk/res/android\" android:layout_width=\"match_parent\"\n" +
                                "    android:layout_height=\"match_parent\">\n" +
                                "\n" +
                                "    <TextView\n" +
                                "        android:layout_width=\"match_parent\"\n" +
                                "        android:paddingTop=\"10dp\"\n" +
                                "        android:paddingBottom=\"10dp\"\n" +
                                "        android:textSize=\"30dp\"\n" +
                                "        android:textColor=\"#01b0c1\"\n" +
                                "        android:layout_marginLeft=\"50dp\"\n" +
                                "        style=\"@android:style/TextAppearance.Large\"\n" +
                                "        android:layout_height=\"wrap_content\"\n" +
                                "        android:id=\"@+id/TextViewHeader_On_ExpandableListViewExample\"/>\n" +
                                "\n" +
                                "</RelativeLayout>");
                    } else {
                        ((Button) findViewById(R.id.nextTopRightButton)).setText(getStringArray(R.array.nextThreeTopRightTextViewRightLoad4)[i - 1]);
                        codeLoad("<RelativeLayout\n" +
                                "    xmlns:android=\"http://schemas.android.com/apk/res/android\" android:layout_width=\"match_parent\"\n" +
                                "    android:layout_height=\"70dp\">\n" +
                                "\n" +
                                "    <ImageView\n" +
                                "        android:layout_centerInParent=\"true\"\n" +
                                "        android:src=\"@drawable/listen\"\n" +
                                "        android:layout_width=\"50dp\"\n" +
                                "        android:layout_height=\"50dp\" />\n" +
                                "\n" +
                                "</RelativeLayout>");
                    }
                }

                if (i == 4) {
                    if (getLoadValue() == 2) {
                        codeLoad("<RelativeLayout\n" +
                                "    xmlns:android=\"http://schemas.android.com/apk/res/android\" android:layout_width=\"match_parent\"\n" +
                                "    android:layout_height=\"match_parent\">\n" +
                                "\n" +
                                "    <TextView\n" +
                                "        android:layout_width=\"wrap_content\"\n" +
                                "        android:layout_height=\"wrap_content\"\n" +
                                "        android:textSize=\"24dp\"\n" +
                                "        android:layout_marginLeft=\"30dp\"\n" +
                                "        android:padding=\"8dp\"\n" +
                                "        android:id=\"@+id/TextViewChild_On_ExpandableListViewExample\"/>\n" +
                                "\n" +
                                "</RelativeLayout>");
                    } else {
                        ((Button) findViewById(R.id.nextTopRightButton)).setText(getStringArray(R.array.nextThreeTopRightTextViewRightLoad4)[i - 1]);
                        codeLoad("<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                                "\n" +
                                "    <item\n" +
                                "        android:id=\"@+id/action_1\"\n" +
                                "        android:icon=\"@drawable/ic_skip_previous_black_24dp\"\n" +
                                "        android:title=\"One\"/>\n" +
                                "\n" +
                                "    <item\n" +
                                "        android:id=\"@+id/action_2\"\n" +
                                "        android:icon=\"@drawable/ic_panorama_horizontal_black_24dp\"\n" +
                                "        android:title=\"Two\"/>\n" +
                                "\n" +
                                "    <item\n" +
                                "        android:id=\"@+id/action_3\"\n" +
                                "        android:icon=\"@drawable/ic_skip_next_black_24dp\"\n" +
                                "        android:title=\"Three\"/>\n" +
                                "\n" +
                                "</menu>");
                    }
                }

            }
        }
    }
}
