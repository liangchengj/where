package com.meyou.where;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.meyou.Focus;
import com.meyou.UIState;
import com.meyou.where.Next.Five;
import com.meyou.where.Next.Four;
import com.meyou.where.Next.One;
import com.meyou.where.Next.Seven;
import com.meyou.where.Next.Six;
import com.meyou.where.Next.Three;
import com.meyou.where.Next.Two;

import java.util.HashMap;

import static com.meyou.UIState.HIDE_SYSTEM_BARS;
import static com.meyou.UIState.LAYOUT_IN_SYSTEM_BARS;


@UIState({HIDE_SYSTEM_BARS, LAYOUT_IN_SYSTEM_BARS})
public class What extends Focus implements View.OnClickListener, View.OnTouchListener {

    private final static HashMap<String, Integer> EXTRAS = new HashMap<>();

    static {
        EXTRAS.put(One.class.getSimpleName(), 0);
        EXTRAS.put(Two.class.getSimpleName(), 20);
        EXTRAS.put(Three.class.getSimpleName(), 31);
        EXTRAS.put(Four.class.getSimpleName(), 45);
        EXTRAS.put(Five.class.getSimpleName(), 53);
        EXTRAS.put(Six.class.getSimpleName(), 63);
        EXTRAS.put(Seven.class.getSimpleName(), 74);
    }

    public final static String HOME_TO_NEXT_TITLE = "HOME_TO_NEXT_TITLE";

    public final static String NEXT_TO_HOME = "NEXT_TO_HOME";

    protected final static String SCROLLVIEW_BUTTON_NAME_ = "nextScrollViewButton_";

    protected final void topRightHide() {
        findViewById(R.id.nextScrollviewTopRight).setVisibility(View.GONE);
        findViewById(R.id.nextSeeRe).setVisibility(View.GONE);
        findViewById(R.id.nextScrollviewTopRight).startAnimation(loadAnimation(R.anim.next_scrollview_top_right_hide));
    }

    protected final void codeLoad(String code) {
        findViewById(R.id.loadCodeTextView).setVisibility(View.VISIBLE);
        findViewById(R.id.loadCodeTextView).startAnimation(loadAnimation(R.anim.code_load_animation));
        ((TextView) findViewById(R.id.loadCodeTextView)).setText(code);
        ((ScrollView) findViewById(R.id.nextScrollViewWithCode)).smoothScrollTo(0, 0);
    }

    protected final int getLoadValue() {
        return getIntent().getIntExtra(getClass().getSimpleName(), 0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);

        ((TextView) findViewById(R.id.loadCodeTextView)).setTextIsSelectable(true);

        ((TextView) findViewById(R.id.nextTopTextView)).setText(getIntent().getStringExtra(HOME_TO_NEXT_TITLE));


        setViewRadius(12, R.id.nextTopRightButton);
        setViewRadius(10, R.id.nextScrollviewTopRight);

        findViewById(R.id.back).setOnClickListener(this);
        findViewById(R.id.nextProperty).setOnClickListener(this);
        findViewById(R.id.nextShow).setOnClickListener(this);

        findViewById(R.id.nextSeeRe).setOnClickListener(this);

        findViewById(R.id.nextTopRightButton).setOnTouchListener(this);

    }

    @Override
    protected void onUIState() {
        super.onUIState();
        setWindowDrawable(R.drawable.next_window_drawable);
    }

    @Override
    public void onBackPressed() {
        putShare(NEXT_TO_HOME, true);
        finish(R.anim.where_home_show, R.anim.where_to_home);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back)
            onBackPressed();
        if (v.getId() == R.id.nextSeeRe)
            topRightHide();

        if (v.getId() == R.id.nextProperty) {
            startActivity(getIntent(More.class).
                    putExtra(Common.PROPERTY, getLoadValue() + EXTRAS.get(getClass().getSimpleName())).
                    putExtra(Common.PROPERTY_TITLE, ((TextView) findViewById(R.id.nextTopTextView)).getText()));
            overridePendingTransition(R.anim.next_yan, R.anim.next_to_code);
        }

        if (v.getId() == R.id.nextShow) {
            startActivity(getIntent(Show.class).
                    putExtra(Common.SHOW_CODE_PASSING, getLoadValue() + EXTRAS.get(getClass().getSimpleName())).
                    putExtra(Common.PROPERTY_TITLE, ((TextView) findViewById(R.id.nextTopTextView)).getText()));
            overridePendingTransition(R.anim.next_yan, R.anim.next_to_code);
        }
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (v.getId() == R.id.nextTopRightButton) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                findViewById(R.id.nextTopRightButton).setBackgroundColor(Color.parseColor("#e0e0e0"));
                ((Button) findViewById(R.id.nextTopRightButton)).setTextColor(getColor(R.color.nextColorAccent));
            } else if (event.getAction() == MotionEvent.ACTION_UP) {
                findViewById(R.id.nextTopRightButton).setBackgroundColor(getColor(R.color.nextColorAccent));
                ((Button) findViewById(R.id.nextTopRightButton)).setTextColor(Color.WHITE);
            }
        }
        return false;
    }
}
