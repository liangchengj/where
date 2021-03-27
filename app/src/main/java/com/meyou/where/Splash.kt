package com.meyou.where

import android.content.Intent
import android.content.pm.ShortcutInfo
import android.graphics.drawable.Icon
import android.os.Build.VERSION_CODES.O
import android.os.Bundle
import com.meyou.Focus
import com.meyou.UIState
import com.meyou.UIState.HIDE_SYSTEM_BARS
import com.meyou.where.Common.SHOW_CODE_PASSING
import com.meyou.where.databinding.SplashBinding

//import kotlinx.android.synthetic.main.splash.*

@UIState(HIDE_SYSTEM_BARS)
class Splash : Focus() {

    private lateinit var binding: SplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        if (SDK_INT < O) {
            toast("不支持安卓8.0以下版本")
            finish(0, android.R.anim.fade_out)

        }

        binding.splashText.startAnimation(loadAnimation(R.anim.splash_text_hide))

        if (SDK_INT >= O)
            setShortCuts(ShortcutInfo.Builder(applicationContext, "TWO")
                    .setIcon(Icon.createWithResource(applicationContext, R.drawable.short_home))
                    .setLongLabel("主界面")
                    .setShortLabel("主界面")
                    .setIntent(getIntent(Splash::class.java).setAction(Intent.ACTION_VIEW))
                    .setRank(2)
                    .build(),
                    ShortcutInfo.Builder(applicationContext, "ONE")
                            .setIcon(Icon.createWithResource(applicationContext, R.drawable.short_code))
                            .setLongLabel("Hello World")
                            .setShortLabel("Hello World")
                            .setIntent(getIntent(Show::class.java).setAction(Intent.ACTION_VIEW).putExtra(SHOW_CODE_PASSING, 1))
                            .setRank(1)
                            .build())

        delay(1500) {
            startActivity(Home::class.java)
            finish()
        }
    }
}

