package com.meyou.where.Next;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.meyou.where.R;
import com.meyou.where.What;

public class Six extends What {


    private void mainActivityJava(int i) {
        switch (i) {
            case 1:
                codeLoad("import android.content.SharedPreferences;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.EditText;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button writeButton;\n" +
                        "    private Button readButton;\n" +
                        "    private EditText editText;\n" +
                        "    private SharedPreferences sharedPreferences;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        writeButton=findViewById(R.id.Button_Left_On_SharedPreferenceExample);\n" +
                        "        readButton=findViewById(R.id.Button_Right_On_SharedPreferenceExample);\n" +
                        "        editText=findViewById(R.id.EditText_On_SharedPreferenceExample);\n" +
                        "\n" +
                        "        sharedPreferences=getSharedPreferences(\"SHARED_PREFERENCE_EXAMPLE\",MODE_PRIVATE);\n" +
                        "\n" +
                        "        writeButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                sharedPreferences.edit().putString(\"DATA\",editText.getText().toString()).apply();\n" +
                        "                Toast.makeText(getApplicationContext(),\"Data Saved Successfully\",Toast.LENGTH_SHORT).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        readButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                String text=\"DATA:\"+sharedPreferences.getString(\"DATA\",\"\");\n" +
                        "                Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 6:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "import org.json.JSONArray;\n" +
                        "import org.json.JSONException;\n" +
                        "import org.json.JSONObject;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button parsingButton;\n" +
                        "    private TextView textView;\n" +
                        "    private String jsonString=\"{\\\"example\\\":[A,B,C,D,E,F,G]}\";\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        parsingButton=findViewById(R.id.Button_On_JSPNParsingExample);\n" +
                        "        textView=findViewById(R.id.TextView_On_JSONParsingExample);\n" +
                        "\n" +
                        "        textView.setText(\"JSON:            \"+jsonString);\n" +
                        "\n" +
                        "        parsingButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                try {\n" +
                        "                    JSONObject jsonObject=new JSONObject(jsonString);\n" +
                        "                    JSONArray jsonArray=jsonObject.getJSONArray(\"example\");\n" +
                        "                    String result=\"\";\n" +
                        "\n" +
                        "                    for (int i=0;i<jsonArray.length();i++)\n" +
                        "                        result+=jsonArray.getString(i);\n" +
                        "\n" +
                        "                    textView.setText(textView.getText()+\"\\n\\n\\n\\n\"+\"Result:\"+\"\\n\\n\"+result);\n" +
                        "                } catch (JSONException e) {\n" +
                        "                    e.printStackTrace();\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 7:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "import org.w3c.dom.Document;\n" +
                        "import org.w3c.dom.Element;\n" +
                        "import org.w3c.dom.Node;\n" +
                        "import org.w3c.dom.NodeList;\n" +
                        "import org.xml.sax.InputSource;\n" +
                        "import org.xml.sax.SAXException;\n" +
                        "\n" +
                        "import java.io.IOException;\n" +
                        "import java.io.StringReader;\n" +
                        "\n" +
                        "import javax.xml.parsers.DocumentBuilder;\n" +
                        "import javax.xml.parsers.DocumentBuilderFactory;\n" +
                        "import javax.xml.parsers.ParserConfigurationException;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button parsingButton;\n" +
                        "    private TextView textLeftView;\n" +
                        "    private TextView textRightView;\n" +
                        "    private Document document;\n" +
                        "    private DocumentBuilder documentBuilder;\n" +
                        "    private String xmlString=\"<example>\\n\" +\n" +
                        "            \"    <student>\\n\" +\n" +
                        "            \"        <name>Marry</name>\\n\" +\n" +
                        "            \"        <class>1</class>\\n\" +\n" +
                        "            \"        <age>13</age>\\n\" +\n" +
                        "            \"    </student>\\n\" +\n" +
                        "            \"\\n\" +\n" +
                        "            \"    <student>\\n\" +\n" +
                        "            \"        <name>Jon</name>\\n\" +\n" +
                        "            \"        <class>2</class>\\n\" +\n" +
                        "            \"        <age>22</age>\\n\" +\n" +
                        "            \"    </student>\\n\" +\n" +
                        "            \"\\n\" +\n" +
                        "            \"    <student>\\n\" +\n" +
                        "            \"        <name>Tom</name>\\n\" +\n" +
                        "            \"        <class>3</class>\\n\" +\n" +
                        "            \"        <age>18</age>\\n\" +\n" +
                        "            \"    </student>\\n\" +\n" +
                        "            \"</example>\";\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        parsingButton=findViewById(R.id.Button_On_XMLParsingExample);\n" +
                        "        textLeftView=findViewById(R.id.TextView_Left_On_XMLParsingExample);\n" +
                        "        textRightView=findViewById(R.id.TextView_Right_On_XMLParsingExample);\n" +
                        "\n" +
                        "        textLeftView.setText(xmlString);\n" +
                        "\n" +
                        "        StringReader stringReader=new StringReader(xmlString);\n" +
                        "        InputSource inputSource=new InputSource(stringReader);\n" +
                        "\n" +
                        "\n" +
                        "        try {\n" +
                        "            documentBuilder= DocumentBuilderFactory.newInstance().newDocumentBuilder();\n" +
                        "            document=documentBuilder.parse(inputSource);\n" +
                        "            document.getDocumentElement().normalize();\n" +
                        "        } catch (ParserConfigurationException e) {\n" +
                        "            e.printStackTrace();\n" +
                        "        } catch (SAXException e) {\n" +
                        "            e.printStackTrace();\n" +
                        "        } catch (IOException e) {\n" +
                        "            e.printStackTrace();\n" +
                        "        }\n" +
                        "\n" +
                        "        parsingButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                String result=\"Result:\\n\\n\\n\";\n" +
                        "                NodeList nodeList=document.getElementsByTagName(\"student\");\n" +
                        "                for (int i=0;i<nodeList.getLength();i++){\n" +
                        "                    Node node=nodeList.item(i);\n" +
                        "                    if(node.getNodeType()==Node.ELEMENT_NODE){\n" +
                        "                        Element element=(Element) node;\n" +
                        "                        String name=element.getElementsByTagName(\"name\").item(0).getTextContent();\n" +
                        "                        String cl=element.getElementsByTagName(\"class\").item(0).getTextContent();\n" +
                        "                        String age=element.getElementsByTagName(\"age\").item(0).getTextContent();\n" +
                        "\n" +
                        "                        result+=\"     Name:\"+name+\"\\n\"+\n" +
                        "                                \"     Class:\"+cl+\"\\n\"+\n" +
                        "                                \"     Age:\"+age+\"\\n\\n\";\n" +
                        "\n" +
                        "                    }\n" +
                        "                }\n" +
                        "\n" +
                        "                textRightView.setText(result);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 8:
                codeLoad("import android.content.ContentValues;\n" +
                        "import android.database.sqlite.SQLiteDatabase;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.EditText;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "    private EditText nameEdit;\n" +
                        "    private EditText sexEdit;\n" +
                        "    private EditText hobbiesEdit;\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        nameEdit=findViewById(R.id.EditText_Name_On_SQLiteInsertExample);\n" +
                        "        sexEdit=findViewById(R.id.EditText_Sex_On_SQLiteInsertExample);\n" +
                        "        hobbiesEdit=findViewById(R.id.EditText_Hobbies_On_SQLiteInsertExample);\n" +
                        "\n" +
                        "        button=findViewById(R.id.Button_On_SQLiteInsertExample);\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                String name=nameEdit.getText().toString();\n" +
                        "                String sex=sexEdit.getText().toString();\n" +
                        "                String hobbies=hobbiesEdit.getText().toString();\n" +
                        "\n" +
                        "                boolean insertOK=new SQLiteOpenHelper().insertData(name,sex,hobbies);\n" +
                        "\n" +
                        "                if(insertOK)\n" +
                        "                    Toast.makeText(getApplicationContext(),\"Data Inserted Successfully\",Toast.LENGTH_SHORT).show();\n" +
                        "                else\n" +
                        "                    Toast.makeText(getApplicationContext(),\"Data Insertion Failed\",Toast.LENGTH_SHORT).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "\n" +
                        "\n" +
                        "    class SQLiteOpenHelper extends android.database.sqlite.SQLiteOpenHelper{\n" +
                        "\n" +
                        "        public SQLiteOpenHelper() {\n" +
                        "            super(MainActivity.this, \"FirstSQLite.db\", null, 1);\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public void onCreate(SQLiteDatabase db) {\n" +
                        "            db.execSQL(\"CREATE TABLE Tell(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SEX TEXT,HOBBIES TEXT)\");\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }\n" +
                        "\n" +
                        "        public boolean insertData(String name,String sex,String hobbies){\n" +
                        "            SQLiteDatabase sqLiteDatabase=getWritableDatabase();\n" +
                        "\n" +
                        "            ContentValues contentValues=new ContentValues();\n" +
                        "            contentValues.put(\"NAME\",name);\n" +
                        "            contentValues.put(\"SEX\",sex);\n" +
                        "            contentValues.put(\"HOBBIES\",hobbies);\n" +
                        "\n" +
                        "            long result=sqLiteDatabase.insert(\"Tell\",null,contentValues);\n" +
                        "\n" +
                        "            sqLiteDatabase.close();\n" +
                        "\n" +
                        "            return result!=-1;\n" +
                        "        }\n" +
                        "    }\n" +
                        "}");
                break;
            case 9:
                codeLoad("import android.database.sqlite.SQLiteDatabase;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.EditText;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "    private EditText idEdit;\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        idEdit=findViewById(R.id.EditText_Id_On_SQLiteDeleteExample);\n" +
                        "\n" +
                        "        button=findViewById(R.id.Button_On_SQLiteDeleteExample);\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                String id=idEdit.getText().toString();\n" +
                        "                Toast.makeText(getApplicationContext(),\n" +
                        "                        \"Rows:  \"+new SQLiteOpenHelper().deleteData(id)+\"Affected\",\n" +
                        "                        Toast.LENGTH_SHORT).show();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "\n" +
                        "\n" +
                        "    class SQLiteOpenHelper extends android.database.sqlite.SQLiteOpenHelper{\n" +
                        "\n" +
                        "        public SQLiteOpenHelper() {\n" +
                        "            super(MainActivity.this, \"FirstSQLite.db\", null, 1);\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public void onCreate(SQLiteDatabase db) {\n" +
                        "            db.execSQL(\"CREATE TABLE Tell(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SEX TEXT,HOBBIES TEXT)\");\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }\n" +
                        "\n" +
                        "        public int deleteData(String id){\n" +
                        "            SQLiteDatabase sqLiteDatabase=getWritableDatabase();\n" +
                        "            int rows=sqLiteDatabase.delete(\"Tell\",\"ID=?\",new String[]{id});\n" +
                        "            sqLiteDatabase.close();\n" +
                        "            return rows;\n" +
                        "        }\n" +
                        "    }\n" +
                        "}");
                break;
            case 10:
                codeLoad("import android.content.ContentValues;\n" +
                        "import android.database.sqlite.SQLiteDatabase;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.EditText;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "    private EditText idEdit;\n" +
                        "    private EditText nameEdit;\n" +
                        "    private EditText sexEdit;\n" +
                        "    private EditText hobbiesEdit;\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        idEdit=findViewById(R.id.EditText_Id_On_SQLiteUpdateExample);\n" +
                        "        nameEdit=findViewById(R.id.EditText_Name_On_SQLiteUpdateExample);\n" +
                        "        sexEdit=findViewById(R.id.EditText_Sex_On_SQLiteUpdateExample);\n" +
                        "        hobbiesEdit=findViewById(R.id.EditText_Hobbies_On_SQLiteUpdateExample);\n" +
                        "\n" +
                        "        button=findViewById(R.id.Button_On_SQLiteUpdateExample);\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                String id=idEdit.getText().toString();\n" +
                        "                String name=nameEdit.getText().toString();\n" +
                        "                String sex=sexEdit.getText().toString();\n" +
                        "                String hobbies=hobbiesEdit.getText().toString();\n" +
                        "\n" +
                        "                boolean updateOK=new SQLiteOpenHelper().updateData(id,name,sex,hobbies);\n" +
                        "\n" +
                        "                if(updateOK)\n" +
                        "                    Toast.makeText(getApplicationContext(),\"Data Updated Successfully\",Toast.LENGTH_SHORT).show();\n" +
                        "                else\n" +
                        "                    Toast.makeText(getApplicationContext(),\"No Rows Affected\",Toast.LENGTH_SHORT).show();\n" +
                        "\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "\n" +
                        "\n" +
                        "    class SQLiteOpenHelper extends android.database.sqlite.SQLiteOpenHelper{\n" +
                        "\n" +
                        "        public SQLiteOpenHelper() {\n" +
                        "            super(MainActivity.this, \"FirstSQLite.db\", null, 1);\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public void onCreate(SQLiteDatabase db) {\n" +
                        "            db.execSQL(\"CREATE TABLE Tell(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SEX TEXT,HOBBIES TEXT)\");\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }\n" +
                        "\n" +
                        "        public boolean updateData(String id,String name,String sex,String hobbies){\n" +
                        "            SQLiteDatabase sqLiteDatabase=getWritableDatabase();\n" +
                        "\n" +
                        "            ContentValues contentValues=new ContentValues();\n" +
                        "            contentValues.put(\"NAME\",name);\n" +
                        "            contentValues.put(\"SEX\",sex);\n" +
                        "            contentValues.put(\"HOBBIES\",hobbies);\n" +
                        "\n" +
                        "            int result=sqLiteDatabase.update(\"Tell\",contentValues,\"ID=?\",new String[]{id});\n" +
                        "\n" +
                        "            sqLiteDatabase.close();\n" +
                        "\n" +
                        "            return result>0;\n" +
                        "        }\n" +
                        "    }\n" +
                        "}");
                break;
            case 11:
                codeLoad("import android.database.Cursor;\n" +
                        "import android.database.sqlite.SQLiteDatabase;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button button;\n" +
                        "\n" +
                        "    private TextView textView;\n" +
                        "\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        textView=findViewById(R.id.TextView_On_SQLiteReadExample);\n" +
                        "\n" +
                        "        button=findViewById(R.id.Button_On_SQLiteReadExample);\n" +
                        "        button.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                textView.setText(new SQLiteOpenHelper().readData());\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "\n" +
                        "\n" +
                        "    class SQLiteOpenHelper extends android.database.sqlite.SQLiteOpenHelper{\n" +
                        "\n" +
                        "        public SQLiteOpenHelper() {\n" +
                        "            super(MainActivity.this, \"FirstSQLite.db\", null, 1);\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public void onCreate(SQLiteDatabase db) {\n" +
                        "            db.execSQL(\"CREATE TABLE Tell(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SEX TEXT,HOBBIES TEXT)\");\n" +
                        "        }\n" +
                        "\n" +
                        "        @Override\n" +
                        "        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }\n" +
                        "\n" +
                        "\n" +
                        "        public String readData(){\n" +
                        "            SQLiteDatabase sqLiteDatabase=getWritableDatabase();\n" +
                        "            Cursor cursor=sqLiteDatabase.query(\"Tell\",null,null,null,null,null,null);\n" +
                        "\n" +
                        "            String query;\n" +
                        "\n" +
                        "            if(cursor!=null&&cursor.getCount()>0){\n" +
                        "                query=\"\";\n" +
                        "                while (cursor.moveToNext()){\n" +
                        "                    query+=\"Id:  \"+cursor.getInt(cursor.getColumnIndex(\"ID\"))+\"\\n\";\n" +
                        "                    query+=\"Name:  \"+cursor.getString(cursor.getColumnIndex(\"NAME\"))+\"\\n\";\n" +
                        "                    query+=\"Sex:  \"+cursor.getString(cursor.getColumnIndex(\"SEX\"))+\"\\n\";\n" +
                        "                    query+=\"Hobbies:  \"+cursor.getString(cursor.getColumnIndex(\"HOBBIES\"))+\"\\n\\n\\n\";\n" +
                        "                }\n" +
                        "\n" +
                        "            }else\n" +
                        "                query=\"No Data to Retrieve\";\n" +
                        "\n" +
                        "            cursor.close();\n" +
                        "            sqLiteDatabase.close();\n" +
                        "\n" +
                        "            return query;\n" +
                        "        }\n" +
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
                        "    <EditText\n" +
                        "        android:id=\"@+id/EditText_On_SharedPreferenceExample\"\n" +
                        "        android:layout_marginTop=\"60dp\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:hint=\"DATA:\"\n" +
                        "        android:imeOptions=\"flagNoFullscreen|flagNoExtractUi\"\n" +
                        "        android:layout_width=\"240dp\"\n" +
                        "        android:paddingLeft=\"10dp\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "        <requestFocus/>\n" +
                        "    </EditText>\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_marginBottom=\"10dp\"\n" +
                        "        android:orientation=\"horizontal\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Left_On_SharedPreferenceExample\"\n" +
                        "            android:text=\"WRITE\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:layout_marginLeft=\"50dp\"\n" +
                        "            android:layout_marginRight=\"50dp\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Right_On_SharedPreferenceExample\"\n" +
                        "            android:text=\"READ\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:layout_marginLeft=\"50dp\"\n" +
                        "            android:layout_marginRight=\"50dp\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
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
                        "        android:id=\"@+id/TextView_On_JSONParsingExample\"\n" +
                        "        android:layout_marginTop=\"60dp\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:textColor=\"@android:color/black\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:paddingLeft=\"10dp\"\n" +
                        "        android:textSize=\"22dp\"\n" +
                        "        android:layout_height=\"wrap_content\"/>\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:id=\"@+id/Button_On_JSPNParsingExample\"\n" +
                        "        android:text=\"Parse\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_weight=\"1\"\n" +
                        "        android:layout_marginLeft=\"50dp\"\n" +
                        "        android:layout_marginRight=\"50dp\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
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
                        "    <ScrollView\n" +
                        "        android:layout_above=\"@id/Button_On_XMLParsingExample\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:orientation=\"horizontal\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "        <TextView\n" +
                        "            android:id=\"@+id/TextView_Left_On_XMLParsingExample\"\n" +
                        "            android:layout_marginTop=\"20dp\"\n" +
                        "            android:layout_marginLeft=\"30dp\"\n" +
                        "            android:layout_centerHorizontal=\"true\"\n" +
                        "            android:textColor=\"@android:color/black\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:paddingLeft=\"10dp\"\n" +
                        "            android:textSize=\"22dp\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:layout_height=\"wrap_content\"/>\n" +
                        "\n" +
                        "        <TextView\n" +
                        "            android:id=\"@+id/TextView_Right_On_XMLParsingExample\"\n" +
                        "            android:layout_marginTop=\"20dp\"\n" +
                        "            android:layout_centerHorizontal=\"true\"\n" +
                        "            android:textColor=\"@android:color/black\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:paddingLeft=\"10dp\"\n" +
                        "            android:textSize=\"22dp\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:layout_height=\"wrap_content\"/>\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
                        "\n" +
                        "    </ScrollView>\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:id=\"@+id/Button_On_XMLParsingExample\"\n" +
                        "        android:text=\"Parse\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_marginLeft=\"50dp\"\n" +
                        "        android:layout_marginRight=\"50dp\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
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
                        "    <LinearLayout\n" +
                        "        android:layout_marginTop=\"10dp\"\n" +
                        "        android:orientation=\"vertical\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "        <EditText\n" +
                        "            android:hint=\"Name\"\n" +
                        "            android:imeOptions=\"flagNoFullscreen\"\n" +
                        "            android:textColor=\"@android:color/black\"\n" +
                        "            android:paddingLeft=\"5dp\"\n" +
                        "            android:id=\"@+id/EditText_Name_On_SQLiteInsertExample\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        <EditText\n" +
                        "            android:hint=\"Sex\"\n" +
                        "            android:imeOptions=\"flagNoFullscreen\"\n" +
                        "            android:textColor=\"@android:color/black\"\n" +
                        "            android:paddingLeft=\"5dp\"\n" +
                        "            android:id=\"@+id/EditText_Sex_On_SQLiteInsertExample\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        <EditText\n" +
                        "            android:hint=\"Hobbies\"\n" +
                        "            android:imeOptions=\"flagNoFullscreen\"\n" +
                        "            android:textColor=\"@android:color/black\"\n" +
                        "            android:paddingLeft=\"5dp\"\n" +
                        "            android:id=\"@+id/EditText_Hobbies_On_SQLiteInsertExample\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:text=\"Insert\"\n" +
                        "            android:id=\"@+id/Button_On_SQLiteInsertExample\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
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
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:layout_marginTop=\"10dp\"\n" +
                        "        android:orientation=\"vertical\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "        <EditText\n" +
                        "            android:hint=\"Id\"\n" +
                        "            android:imeOptions=\"flagNoFullscreen\"\n" +
                        "            android:textColor=\"@android:color/black\"\n" +
                        "            android:paddingLeft=\"5dp\"\n" +
                        "            android:id=\"@+id/EditText_Id_On_SQLiteDeleteExample\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:text=\"Delete\"\n" +
                        "            android:id=\"@+id/Button_On_SQLiteDeleteExample\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
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
                        "    <LinearLayout\n" +
                        "        android:layout_marginTop=\"10dp\"\n" +
                        "        android:orientation=\"vertical\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "\n" +
                        "        <EditText\n" +
                        "            android:hint=\"Id\"\n" +
                        "            android:imeOptions=\"flagNoFullscreen\"\n" +
                        "            android:textColor=\"@android:color/black\"\n" +
                        "            android:paddingLeft=\"5dp\"\n" +
                        "            android:id=\"@+id/EditText_Id_On_SQLiteUpdateExample\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        <EditText\n" +
                        "            android:hint=\"Name\"\n" +
                        "            android:imeOptions=\"flagNoFullscreen\"\n" +
                        "            android:textColor=\"@android:color/black\"\n" +
                        "            android:paddingLeft=\"5dp\"\n" +
                        "            android:id=\"@+id/EditText_Name_On_SQLiteUpdateExample\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        <EditText\n" +
                        "            android:hint=\"Sex\"\n" +
                        "            android:imeOptions=\"flagNoFullscreen\"\n" +
                        "            android:textColor=\"@android:color/black\"\n" +
                        "            android:paddingLeft=\"5dp\"\n" +
                        "            android:id=\"@+id/EditText_Sex_On_SQLiteUpdateExample\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        <EditText\n" +
                        "            android:hint=\"Hobbies\"\n" +
                        "            android:imeOptions=\"flagNoFullscreen\"\n" +
                        "            android:textColor=\"@android:color/black\"\n" +
                        "            android:paddingLeft=\"5dp\"\n" +
                        "            android:id=\"@+id/EditText_Hobbies_On_SQLiteUpdateExample\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:text=\"Update\"\n" +
                        "            android:id=\"@+id/Button_On_SQLiteUpdateExample\"\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
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
                        "    <ScrollView\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "        <LinearLayout\n" +
                        "            android:layout_width=\"match_parent\"\n" +
                        "            android:layout_height=\"match_parent\">\n" +
                        "\n" +
                        "            <TextView\n" +
                        "                android:layout_margin=\"40dp\"\n" +
                        "                android:textSize=\"18dp\"\n" +
                        "                android:textColor=\"@android:color/black\"\n" +
                        "                android:id=\"@+id/TextView_On_SQLiteReadExample\"\n" +
                        "                android:layout_width=\"wrap_content\"\n" +
                        "                android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        </LinearLayout>\n" +
                        "\n" +
                        "    </ScrollView>\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:text=\"Read\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:id=\"@+id/Button_On_SQLiteReadExample\"\n" +
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
