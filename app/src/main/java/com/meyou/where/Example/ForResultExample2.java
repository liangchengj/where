package com.meyou.where.Example;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.meyou.where.Common;
import com.meyou.where.R;
import com.meyou.where.Show;

public class ForResultExample2 extends Common {

    public final static int REQUEST_OR_RESULT_CODE_FOR_RESULT_EXAMPLE = 3210;
    public final static String EXTRA_FOR_RESULT_EXAMPLE = "RESULT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_result_2__example);

        ((EditText) findViewById(R.id.EditText_On_ForResultExample)).setTextColor(getLoadColor());
        findViewById(R.id.EditText_On_ForResultExample).setBackgroundColor(BAC_GRAY_COLOR);
        setViewRadius(getRadius(), R.id.EditText_On_ForResultExample);

        oneTouch(R.id.Button_Goto_On_ForResultExample);
    }

    @Override
    public void onClick(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        setResult(REQUEST_OR_RESULT_CODE_FOR_RESULT_EXAMPLE,
                getIntent(Show.class)
                        .putExtra(EXTRA_FOR_RESULT_EXAMPLE, ((EditText) findViewById(R.id.EditText_On_ForResultExample)).getText().toString())
                        .putExtra(SHOW_CODE_PASSING, getLoadValue()));
        finish(R.anim.next_show, R.anim.yan_to_next);
    }
}
