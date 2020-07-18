package com.meyou.where.Example;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.meyou.where.Common;
import com.meyou.where.R;

public class PassingValueExample2 extends Common {

    public final static String EXTRA_PASSING_VALUE_EXAMPLE = "PASSING_VALUE_EXAMPLE";

    @Override
    protected void onUIState() {
        setWindowDrawable(R.drawable.next_window_drawable);
        hideSystemBars();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_value_2__example);

        TextView textView = findViewById(R.id.TextView_On_PassingValueExample);
        textView.setTextColor(getLoadColor());

        if (getIntent().getStringExtra(EXTRA_PASSING_VALUE_EXAMPLE).isEmpty())
            textView.setText("你没有输入传递参数哦");
        else
            textView.setText(getIntent().getStringExtra(EXTRA_PASSING_VALUE_EXAMPLE));


        oneTouch(R.id.Button_Goto_On_PassingValueExample);

    }

    @Override
    public void onClick(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        finish(R.anim.next_show, R.anim.yan_to_next);
    }

}
