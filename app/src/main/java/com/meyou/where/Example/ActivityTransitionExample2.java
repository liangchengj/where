package com.meyou.where.Example;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.meyou.where.Common;
import com.meyou.where.R;

public class ActivityTransitionExample2 extends Common {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_2_example);

        oneTouch(R.id.Button_Goto_On_ActivityTransitionExample);
        ((TextView) findViewById(R.id.TextView_On_ActivityTransitionExample2)).setTextColor(getLoadColor());
    }

    @Override
    public void onClick(View view) {
        onBackPressed();
    }
}
