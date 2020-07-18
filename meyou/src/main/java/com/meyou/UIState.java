package com.meyou;


import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static android.view.View.SYSTEM_UI_FLAG_FULLSCREEN;
import static android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
import static android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
import static android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
import static android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;
import static android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
import static android.view.View.SYSTEM_UI_FLAG_VISIBLE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(TYPE)
@Inherited
@Retention(RUNTIME)
public @interface UIState {


    int HIDE_SYSTEM_BARS = SYSTEM_UI_FLAG_FULLSCREEN
            | SYSTEM_UI_FLAG_HIDE_NAVIGATION
            | SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            | SYSTEM_UI_FLAG_LAYOUT_STABLE;

    int LAYOUT_IN_SYSTEM_BARS = SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            | SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            | SYSTEM_UI_FLAG_LAYOUT_STABLE;

    int LIGHT_SYSTEM_BARS = 11;

    int[] value() default SYSTEM_UI_FLAG_VISIBLE;
}
