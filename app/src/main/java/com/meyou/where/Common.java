package com.meyou.where;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.meyou.Focus;
import com.meyou.FunTouchListener;
import com.meyou.Me;

import static com.meyou.where.What.NEXT_TO_HOME;

public abstract class Common extends Focus {


    protected final static int COLOR_GRAY_TOUCH_DOWN = Color.rgb(235, 235, 235);

    protected final static int BAC_GRAY_COLOR = Me.getGray(233);

    private int radius;

    public final static String SHOW_CODE_PASSING = "SHOW_CODE_PASSING";
    public final static String PROPERTY = "PROPERTY";
    public final static String PROPERTY_TITLE = "PROPERTY_TITLE";

    protected final int getRadius() {
        return radius;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        radius = 20;
    }


    @Override
    protected void onUIState() {
        setWindowDrawable(R.drawable.next_window_drawable);
        layoutInSystemBars();
        hideSystemBars();
    }


    protected final int getLoadValue() {
        return getIntent().getIntExtra(SHOW_CODE_PASSING, 0);
    }

    protected final String getPropertyTitle() {
        return getIntent().getStringExtra(PROPERTY_TITLE);
    }

    protected final int getLoadColor() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), getDrawableId("zzz_" + getLoadValue()));

        final int color = bitmap.getPixel(95, 95);

        return Color.rgb(Color.red(color), Color.green(color), Color.blue(color));

    }


    protected final void moreTouch(int leftId, int rightId) {

        Button left = findViewById(leftId);
        Button right = findViewById(rightId);


        left.setBackgroundColor(getLoadColor());
        left.setTextColor(Color.WHITE);

        right.setBackgroundColor(COLOR_GRAY_TOUCH_DOWN);
        right.setTextColor(Color.BLACK);

        funTouch(left, new FunTouchListener() {
            @Override
            public void onActionDown(View v, MotionEvent event) {
                v.setBackgroundColor(COLOR_GRAY_TOUCH_DOWN);
                ((Button) v).setTextColor(Color.BLACK);
            }

            @Override
            public void onActionUp(View v, MotionEvent event) {
                v.setBackgroundColor(getLoadColor());
                ((Button) v).setTextColor(Color.WHITE);
            }

            @Override
            public void onClick(View v) {
                Common.this.onClick(v);
            }
        });

        funTouch(right, new FunTouchListener() {
            @Override
            public void onActionDown(View v, MotionEvent event) {
                v.setBackgroundColor(getLoadColor());
                ((Button) v).setTextColor(Color.WHITE);
            }

            @Override
            public void onActionUp(View v, MotionEvent event) {
                v.setBackgroundColor(COLOR_GRAY_TOUCH_DOWN);
                ((Button) v).setTextColor(Color.BLACK);
            }

            @Override
            public void onClick(View v) {
                Common.this.onClick(v);
            }
        });

    }

    protected final void oneTouch(int buttonId) {

        final Button button = findViewById(buttonId);

        button.setBackgroundColor(getLoadColor());
        button.setTextColor(Color.WHITE);
        setViewRadius(12, button);

        funTouch(button, new FunTouchListener() {
            @Override
            public void onActionDown(View v, MotionEvent event) {
                v.setBackgroundColor(COLOR_GRAY_TOUCH_DOWN);
                ((Button) v).setTextColor(Color.BLACK);
            }

            @Override
            public void onActionUp(View v, MotionEvent event) {
                v.setBackgroundColor(getLoadColor());
                ((Button) v).setTextColor(Color.WHITE);
            }

            @Override
            public void onClick(View v) {
                Common.this.onClick(v);
            }
        });
    }


    public abstract void onClick(View view);


    public final void showingRgbClick(View v) {
        switch (v.getId()) {
            case R.id.codeBack:
                onBackPressed();
                break;
            case R.id.codeToProperty:
                startActivity(getIntent(More.class).
                        putExtra(PROPERTY, getLoadValue()).
                        putExtra(PROPERTY_TITLE, getPropertyTitle()));
                overridePendingTransition(R.anim.next_yan, R.anim.next_to_code);
                break;
            case R.id.codeToHome:
                putShare(NEXT_TO_HOME, true);
                startActivity(Home.class, R.anim.where_home_show, R.anim.where_to_home);
            default:
                break;
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish(R.anim.next_show, R.anim.yan_to_next);
    }

}
