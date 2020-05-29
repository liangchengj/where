package com.meyou;

import android.view.MotionEvent;
import android.view.View;

public interface FunTouchListener extends View.OnClickListener {
    void onActionDown(View v, MotionEvent event);

    void onActionUp(View v, MotionEvent event);
}
