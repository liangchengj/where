package com.meyou.where.Next;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.meyou.where.R;
import com.meyou.where.What;


public class Five extends What {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivityJava(getLoadValue());
    }


    private void mainActivityJava(int i) {
        switch (i) {
            case 1:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.view.animation.AnimationUtils;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button fadeInButton;\n" +
                        "    private Button fadeOutButton;\n" +
                        "    private ImageView imageView;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        imageView=findViewById(R.id.ImageView_On_FadeAnimationExample);\n" +
                        "        fadeInButton=findViewById(R.id.Button_Left_On_FadeAnimationExample);\n" +
                        "        fadeOutButton=findViewById(R.id.Button_Right_On_FadeAnimationExample);\n" +
                        "\n" +
                        "        fadeInButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.fade_in));\n" +
                        "                imageView.setVisibility(View.VISIBLE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        fadeOutButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                imageView.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.fade_out));\n" +
                        "                imageView.setVisibility(View.GONE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 2:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "\n" +
                        "import android.view.View;\n" +
                        "import android.view.animation.AccelerateDecelerateInterpolator;\n" +
                        "import android.view.animation.Animation;\n" +
                        "import android.view.animation.ScaleAnimation;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button zoomInButton;\n" +
                        "    private Button zoomOutButton;\n" +
                        "\n" +
                        "    private ImageView imageView;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        imageView=findViewById(R.id.ImageView_On_ZoomAnimationExample);\n" +
                        "        zoomInButton=findViewById(R.id.Button_Left_On_ZoomAnimationExample);\n" +
                        "        zoomOutButton=findViewById(R.id.Button_Right_On_ZoomAnimationExample);\n" +
                        "\n" +
                        "        zoomInButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                ScaleAnimation zoomIn=new ScaleAnimation(1.0f,1.5f,1.0f,1.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f);\n" +
                        "                zoomIn.setDuration(300);\n" +
                        "                zoomIn.setInterpolator(new AccelerateDecelerateInterpolator());\n" +
                        "                zoomIn.setFillAfter(true);\n" +
                        "\n" +
                        "                imageView.startAnimation(zoomIn);\n" +
                        "                imageView.setVisibility(View.VISIBLE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        zoomOutButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                ScaleAnimation zoomOut=new ScaleAnimation(1.0f,0.5f,1.0f,0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f);\n" +
                        "                zoomOut.setDuration(300);\n" +
                        "                zoomOut.setInterpolator(new AccelerateDecelerateInterpolator());\n" +
                        "                zoomOut.setFillAfter(true);\n" +
                        "\n" +
                        "                imageView.startAnimation(zoomOut);\n" +
                        "                imageView.setVisibility(View.GONE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 3:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.view.animation.AccelerateDecelerateInterpolator;\n" +
                        "import android.view.animation.Animation;\n" +
                        "import android.view.animation.RotateAnimation;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button rotateLeftButton;\n" +
                        "    private Button rotateRightButton;\n" +
                        "    private ImageView imageView;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        imageView=findViewById(R.id.ImageView_On_RotateAnimationExample);\n" +
                        "        rotateLeftButton=findViewById(R.id.Button_Left_On_RotateAnimationExample);\n" +
                        "        rotateRightButton=findViewById(R.id.Button_Right_On_RotateAnimationExample);\n" +
                        "\n" +
                        "        rotateLeftButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                RotateAnimation rotateAnimation=new RotateAnimation(0,-90,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f);\n" +
                        "                //设置插值器\n" +
                        "                rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());\n" +
                        "                //设置动画时长\n" +
                        "                rotateAnimation.setDuration(300);\n" +
                        "                //设置动画执行完毕后，保留结束时的状态\n" +
                        "                rotateAnimation.setFillAfter(true);\n" +
                        "                imageView.startAnimation(rotateAnimation);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        rotateRightButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                RotateAnimation rotateAnimation=new RotateAnimation(0,90,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f);\n" +
                        "                //设置插值器\n" +
                        "                rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());\n" +
                        "                //设置动画时长\n" +
                        "                rotateAnimation.setDuration(300);\n" +
                        "                //设置动画执行完毕后，保留结束时的状态\n" +
                        "                rotateAnimation.setFillAfter(true);\n" +
                        "                imageView.startAnimation(rotateAnimation);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 4:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.view.animation.Animation;\n" +
                        "import android.view.animation.LinearInterpolator;\n" +
                        "import android.view.animation.TranslateAnimation;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button translateLeftButton;\n" +
                        "    private Button translateUpButton;\n" +
                        "    private Button translateRightButton;\n" +
                        "    private Button translateDownButton;\n" +
                        "    private ImageView imageView;\n" +
                        "\n" +
                        "    private float fromX=0.0f,\n" +
                        "            toX=0.0f,\n" +
                        "            fromY=0.0f,\n" +
                        "            toY=0.0f;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        imageView=findViewById(R.id.ImageView_On_TranslateAnimationExample);\n" +
                        "        translateLeftButton=findViewById(R.id.Button_Left_On_TranslateAnimationExample);\n" +
                        "        translateUpButton=findViewById(R.id.Button_Up_On_TranslateAnimationExample);\n" +
                        "        translateRightButton=findViewById(R.id.Button_Right_On_TranslateAnimationExample);\n" +
                        "        translateDownButton=findViewById(R.id.Button_Down_On_TranslateAnimationExample);\n" +
                        "\n" +
                        "        translateLeftButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                fromX=toX;\n" +
                        "                toX-=0.2f;\n" +
                        "                fromY=toY;\n" +
                        "                TranslateAnimation translateLeft=new TranslateAnimation(Animation.RELATIVE_TO_SELF,fromX,\n" +
                        "                        Animation.RELATIVE_TO_SELF,toX,\n" +
                        "                        Animation.RELATIVE_TO_SELF,fromY,\n" +
                        "                        Animation.RELATIVE_TO_SELF,toY);\n" +
                        "                //设置插值器\n" +
                        "                translateLeft.setInterpolator(new LinearInterpolator());\n" +
                        "                //设置动画时长\n" +
                        "                translateLeft.setDuration(300);\n" +
                        "                //设置动画执行完毕后，保留结束时的状态\n" +
                        "                translateLeft.setFillAfter(true);\n" +
                        "                imageView.startAnimation(translateLeft);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        translateUpButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                fromY=toY;\n" +
                        "                toY-=0.2f;\n" +
                        "                fromX=toX;\n" +
                        "                TranslateAnimation translateUp=new TranslateAnimation(Animation.RELATIVE_TO_SELF,fromX,\n" +
                        "                        Animation.RELATIVE_TO_SELF,toX,\n" +
                        "                        Animation.RELATIVE_TO_SELF,fromY,\n" +
                        "                        Animation.RELATIVE_TO_SELF,toY);\n" +
                        "                //设置插值器\n" +
                        "                translateUp.setInterpolator(new LinearInterpolator());\n" +
                        "                //设置动画时长\n" +
                        "                translateUp.setDuration(300);\n" +
                        "                //设置动画执行完毕后，保留结束时的状态\n" +
                        "                translateUp.setFillAfter(true);\n" +
                        "                imageView.startAnimation(translateUp);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        translateRightButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                fromX=toX;\n" +
                        "                toX+=0.2f;\n" +
                        "                fromY=toY;\n" +
                        "                TranslateAnimation translateRight=new TranslateAnimation(Animation.RELATIVE_TO_SELF,fromX,\n" +
                        "                        Animation.RELATIVE_TO_SELF,toX,\n" +
                        "                        Animation.RELATIVE_TO_SELF,fromY,\n" +
                        "                        Animation.RELATIVE_TO_SELF,toY);\n" +
                        "                //设置插值器\n" +
                        "                translateRight.setInterpolator(new LinearInterpolator());\n" +
                        "                //设置动画时长\n" +
                        "                translateRight.setDuration(300);\n" +
                        "                //设置动画执行完毕后，保留结束时的状态\n" +
                        "                translateRight.setFillAfter(true);\n" +
                        "                imageView.startAnimation(translateRight);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        translateDownButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                fromY=toY;\n" +
                        "                toY+=0.2f;\n" +
                        "                fromX=toX;\n" +
                        "                TranslateAnimation translateDown=new TranslateAnimation(Animation.RELATIVE_TO_SELF,fromX,\n" +
                        "                        Animation.RELATIVE_TO_SELF,toX,\n" +
                        "                        Animation.RELATIVE_TO_SELF,fromY,\n" +
                        "                        Animation.RELATIVE_TO_SELF,toY);\n" +
                        "                //设置插值器\n" +
                        "                translateDown.setInterpolator(new LinearInterpolator());\n" +
                        "                //设置动画时长\n" +
                        "                translateDown.setDuration(300);\n" +
                        "                //设置动画执行完毕后，保留结束时的状态\n" +
                        "                translateDown.setFillAfter(true);\n" +
                        "                imageView.startAnimation(translateDown);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 5:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.view.animation.Animation;\n" +
                        "import android.view.animation.LinearInterpolator;\n" +
                        "import android.view.animation.ScaleAnimation;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button slideLeftButton;\n" +
                        "    private Button slideUpButton;\n" +
                        "    private Button slideRightButton;\n" +
                        "    private Button slideDownButton;\n" +
                        "    private ImageView imageView;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        imageView=findViewById(R.id.ImageView_On_SlideAnimationExample);\n" +
                        "        slideLeftButton=findViewById(R.id.Button_Left_On_SlideAnimationExample);\n" +
                        "        slideUpButton=findViewById(R.id.Button_Up_On_SlideAnimationExample);\n" +
                        "        slideRightButton=findViewById(R.id.Button_Right_On_SlideAnimationExample);\n" +
                        "        slideDownButton=findViewById(R.id.Button_Down_On_SlideAnimationExample);\n" +
                        "\n" +
                        "        slideLeftButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                ScaleAnimation slideLeft=new ScaleAnimation(1.0f,0.0f,1.0f,1.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f);\n" +
                        "                //设置插值器\n" +
                        "                slideLeft.setInterpolator(new LinearInterpolator());\n" +
                        "                //设置动画时长\n" +
                        "                slideLeft.setDuration(300);\n" +
                        "                //设置动画执行完毕后，保留结束时的状态\n" +
                        "                slideLeft.setFillAfter(true);\n" +
                        "                imageView.startAnimation(slideLeft);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        slideUpButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                ScaleAnimation slideUp=new ScaleAnimation(1.0f,1.0f,1.0f,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.0f);\n" +
                        "                //设置插值器\n" +
                        "                slideUp.setInterpolator(new LinearInterpolator());\n" +
                        "                //设置动画时长\n" +
                        "                slideUp.setDuration(300);\n" +
                        "                //设置动画执行完毕后，保留结束时的状态\n" +
                        "                slideUp.setFillAfter(true);\n" +
                        "                imageView.startAnimation(slideUp);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        slideRightButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                ScaleAnimation slideRight=new ScaleAnimation(1.0f,0.0f,1.0f,1.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,1.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f);\n" +
                        "                //设置插值器\n" +
                        "                slideRight.setInterpolator(new LinearInterpolator());\n" +
                        "                //设置动画时长\n" +
                        "                slideRight.setDuration(300);\n" +
                        "                //设置动画执行完毕后，保留结束时的状态\n" +
                        "                slideRight.setFillAfter(true);\n" +
                        "                imageView.startAnimation(slideRight);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        slideDownButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                ScaleAnimation slideDown=new ScaleAnimation(1.0f,1.0f,1.0f,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,1.0f);\n" +
                        "                //设置插值器\n" +
                        "                slideDown.setInterpolator(new LinearInterpolator());\n" +
                        "                //设置动画时长\n" +
                        "                slideDown.setDuration(300);\n" +
                        "                //设置动画执行完毕后，保留结束时的状态\n" +
                        "                slideDown.setFillAfter(true);\n" +
                        "                imageView.startAnimation(slideDown);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 6:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.view.animation.Animation;\n" +
                        "import android.view.animation.BounceInterpolator;\n" +
                        "import android.view.animation.TranslateAnimation;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button bounceButton;\n" +
                        "    private ImageView imageView;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        imageView=findViewById(R.id.ImageView_On_BounceAnimationExample);\n" +
                        "        bounceButton=findViewById(R.id.Button_On_BounceAnimationExample);\n" +
                        "\n" +
                        "        bounceButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                TranslateAnimation bounce=new TranslateAnimation(Animation.RELATIVE_TO_SELF,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,-2.2f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.0f);\n" +
                        "                bounce.setDuration(1000);\n" +
                        "                bounce.setFillAfter(true);\n" +
                        "                bounce.setInterpolator(new BounceInterpolator());\n" +
                        "\n" +
                        "                imageView.startAnimation(bounce);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 7:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.view.animation.AccelerateDecelerateInterpolator;\n" +
                        "import android.view.animation.AlphaAnimation;\n" +
                        "import android.view.animation.Animation;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button blinkButton;\n" +
                        "    private ImageView imageView;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        imageView=findViewById(R.id.ImageView_On_BlinkAnimationExample);\n" +
                        "        blinkButton=findViewById(R.id.Button_On_BlinkAnimationExample);\n" +
                        "\n" +
                        "        blinkButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                AlphaAnimation blink=new AlphaAnimation(0.0f,1.0f);\n" +
                        "                blink.setDuration(500);\n" +
                        "                blink.setFillAfter(true);\n" +
                        "                blink.setInterpolator(new AccelerateDecelerateInterpolator());\n" +
                        "                blink.setRepeatCount(Animation.INFINITE);\n" +
                        "                blink.setRepeatMode(Animation.REVERSE);\n" +
                        "\n" +
                        "                imageView.startAnimation(blink);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 8:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "\n" +
                        "import android.view.View;\n" +
                        "import android.view.animation.AccelerateDecelerateInterpolator;\n" +
                        "import android.view.animation.Animation;\n" +
                        "import android.view.animation.ScaleAnimation;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button scaleUpButton;\n" +
                        "    private Button scaleDownButton;\n" +
                        "\n" +
                        "    private ImageView imageView;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        imageView=findViewById(R.id.ImageView_On_ScaleAnimationExample);\n" +
                        "        scaleUpButton=findViewById(R.id.Button_Left_On_ScaleAnimationExample);\n" +
                        "        scaleDownButton=findViewById(R.id.Button_Right_On_ScaleAnimationExample);\n" +
                        "\n" +
                        "        scaleUpButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                ScaleAnimation scaleUp=new ScaleAnimation(0.0f,1.0f,0.0f,1.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f);\n" +
                        "                scaleUp.setDuration(300);\n" +
                        "                scaleUp.setInterpolator(new AccelerateDecelerateInterpolator());\n" +
                        "                scaleUp.setFillAfter(true);\n" +
                        "\n" +
                        "                imageView.startAnimation(scaleUp);\n" +
                        "                imageView.setVisibility(View.VISIBLE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        scaleDownButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                ScaleAnimation scaleDown=new ScaleAnimation(1.0f,0.0f,1.0f,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f);\n" +
                        "                scaleDown.setDuration(300);\n" +
                        "                scaleDown.setInterpolator(new AccelerateDecelerateInterpolator());\n" +
                        "                scaleDown.setFillAfter(true);\n" +
                        "\n" +
                        "                imageView.startAnimation(scaleDown);\n" +
                        "                imageView.setVisibility(View.GONE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 9:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.view.animation.Animation;\n" +
                        "import android.view.animation.AnimationSet;\n" +
                        "import android.view.animation.LinearInterpolator;\n" +
                        "import android.view.animation.TranslateAnimation;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button sequentialButton;\n" +
                        "    private ImageView imageView;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        imageView=findViewById(R.id.ImageView_On_SequentialAnimationExample);\n" +
                        "        sequentialButton=findViewById(R.id.Button_On_SequentialAnimationExample);\n" +
                        "\n" +
                        "        sequentialButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "\n" +
                        "                //向左平移\n" +
                        "                TranslateAnimation t1=new TranslateAnimation(Animation.RELATIVE_TO_SELF,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,-0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.0f);\n" +
                        "                t1.setDuration(1000);\n" +
                        "                t1.setInterpolator(new LinearInterpolator());\n" +
                        "                t1.setFillAfter(true);\n" +
                        "\n" +
                        "\n" +
                        "                //向上平移\n" +
                        "                TranslateAnimation t2=new TranslateAnimation(Animation.RELATIVE_TO_SELF,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,-0.5f);\n" +
                        "                t2.setDuration(1000);\n" +
                        "                t2.setInterpolator(new LinearInterpolator());\n" +
                        "                t2.setFillAfter(true);\n" +
                        "                t2.setStartOffset(2000);\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "                //向右平移\n" +
                        "                TranslateAnimation t3=new TranslateAnimation(Animation.RELATIVE_TO_SELF,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.0f);\n" +
                        "                t3.setDuration(1000);\n" +
                        "                t3.setInterpolator(new LinearInterpolator());\n" +
                        "                t3.setFillAfter(true);\n" +
                        "                t3.setStartOffset(3000);\n" +
                        "\n" +
                        "                //向下平移\n" +
                        "                TranslateAnimation t4=new TranslateAnimation(Animation.RELATIVE_TO_SELF,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f);\n" +
                        "                t4.setDuration(1000);\n" +
                        "                t4.setInterpolator(new LinearInterpolator());\n" +
                        "                t4.setFillAfter(true);\n" +
                        "                t4.setStartOffset(4000);\n" +
                        "\n" +
                        "\n" +
                        "                //实现多个动画同时执行\n" +
                        "                AnimationSet animationSet=new AnimationSet(false);\n" +
                        "                animationSet.addAnimation(t1);\n" +
                        "                animationSet.addAnimation(t2);\n" +
                        "                animationSet.addAnimation(t3);\n" +
                        "                animationSet.addAnimation(t4);\n" +
                        "\n" +
                        "                imageView.startAnimation(animationSet);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");
                break;
            case 10:
                codeLoad("import android.os.Bundle;\n" +
                        "import android.support.v7.app.AppCompatActivity;\n" +
                        "import android.view.View;\n" +
                        "import android.view.animation.Animation;\n" +
                        "import android.view.animation.AnimationSet;\n" +
                        "import android.view.animation.LinearInterpolator;\n" +
                        "import android.view.animation.RotateAnimation;\n" +
                        "import android.view.animation.ScaleAnimation;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageView;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    private Button togetherButton;\n" +
                        "    private ImageView imageView;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        imageView=findViewById(R.id.ImageView_On_TogetherAnimationExample);\n" +
                        "        togetherButton=findViewById(R.id.Button_On_TogetherAnimationExample);\n" +
                        "\n" +
                        "        togetherButton.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "\n" +
                        "                //变大\n" +
                        "                ScaleAnimation t1=new ScaleAnimation(1.0f,1.6f,1.0f,1.6f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f);\n" +
                        "                t1.setDuration(4000);\n" +
                        "                t1.setInterpolator(new LinearInterpolator());\n" +
                        "                t1.setFillAfter(true);\n" +
                        "\n" +
                        "\n" +
                        "                //旋转\n" +
                        "                RotateAnimation t2=new RotateAnimation(0,360,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f);\n" +
                        "                t2.setDuration(600);\n" +
                        "                t2.setInterpolator(new LinearInterpolator());\n" +
                        "                t2.setFillAfter(true);\n" +
                        "                t2.setRepeatCount(Animation.INFINITE);\n" +
                        "                t2.setRepeatMode(Animation.RESTART);\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "                //变小\n" +
                        "                ScaleAnimation t3=new ScaleAnimation(1.6f,1.0f,1.6f,1.0f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f,\n" +
                        "                        Animation.RELATIVE_TO_SELF,0.5f);\n" +
                        "                t3.setDuration(4000);\n" +
                        "                t3.setInterpolator(new LinearInterpolator());\n" +
                        "                t3.setFillAfter(true);\n" +
                        "                t3.setStartOffset(4000);\n" +
                        "\n" +
                        "\n" +
                        "                //实现多个动画同时执行\n" +
                        "                AnimationSet animationSet=new AnimationSet(false);\n" +
                        "                animationSet.addAnimation(t1);\n" +
                        "                animationSet.addAnimation(t2);\n" +
                        "                animationSet.addAnimation(t3);\n" +
                        "\n" +
                        "\n" +
                        "                imageView.startAnimation(animationSet);\n" +
                        "            }\n" +
                        "        });\n" +
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
                        "    <ImageView\n" +
                        "        android:id=\"@+id/ImageView_On_FadeAnimationExample\"\n" +
                        "        android:visibility=\"gone\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:src=\"@drawable/zzz_54\"\n" +
                        "        android:layout_width=\"70dp\"\n" +
                        "        android:layout_height=\"70dp\" />\n" +
                        "\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:orientation=\"horizontal\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Left_On_FadeAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"50dp\"\n" +
                        "            android:layout_marginRight=\"50dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Fade In\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Right_On_FadeAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"50dp\"\n" +
                        "            android:layout_marginRight=\"50dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Fade Out\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
                        "\n" +
                        "\n" +
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
                        "    <ImageView\n" +
                        "        android:id=\"@+id/ImageView_On_ZoomAnimationExample\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:src=\"@drawable/zzz_55\"\n" +
                        "        android:layout_width=\"70dp\"\n" +
                        "        android:layout_height=\"70dp\" />\n" +
                        "\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:orientation=\"horizontal\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Left_On_ZoomAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"50dp\"\n" +
                        "            android:layout_marginRight=\"50dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Zoom In\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Right_On_ZoomAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"50dp\"\n" +
                        "            android:layout_marginRight=\"50dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Zoom Out\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
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
                        "    <ImageView\n" +
                        "        android:id=\"@+id/ImageView_On_RotateAnimationExample\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:src=\"@drawable/zzz_56\"\n" +
                        "        android:layout_width=\"70dp\"\n" +
                        "        android:layout_height=\"70dp\" />\n" +
                        "\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:orientation=\"horizontal\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Left_On_RotateAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"50dp\"\n" +
                        "            android:layout_marginRight=\"50dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Rotate Left\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Right_On_RotateAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"50dp\"\n" +
                        "            android:layout_marginRight=\"50dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Rotate Right\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
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
                        "    <ImageView\n" +
                        "        android:id=\"@+id/ImageView_On_TranslateAnimationExample\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:src=\"@drawable/zzz_57\"\n" +
                        "        android:layout_width=\"70dp\"\n" +
                        "        android:layout_height=\"70dp\" />\n" +
                        "\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:orientation=\"horizontal\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Left_On_TranslateAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"30dp\"\n" +
                        "            android:layout_marginRight=\"30dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Translate Left\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Up_On_TranslateAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"30dp\"\n" +
                        "            android:layout_marginRight=\"30dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Translate Up\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Right_On_TranslateAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"30dp\"\n" +
                        "            android:layout_marginRight=\"30dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Translate Right\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Down_On_TranslateAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"30dp\"\n" +
                        "            android:layout_marginRight=\"30dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Translate Down\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
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
                        "\n" +
                        "    <ImageView\n" +
                        "        android:id=\"@+id/ImageView_On_SlideAnimationExample\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:src=\"@drawable/zzz_58\"\n" +
                        "        android:layout_width=\"70dp\"\n" +
                        "        android:layout_height=\"70dp\" />\n" +
                        "\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:orientation=\"horizontal\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Left_On_SlideAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"30dp\"\n" +
                        "            android:layout_marginRight=\"30dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Slide Left\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Up_On_SlideAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"30dp\"\n" +
                        "            android:layout_marginRight=\"30dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Slide Up\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Right_On_SlideAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"30dp\"\n" +
                        "            android:layout_marginRight=\"30dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Slide Right\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Down_On_SlideAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"30dp\"\n" +
                        "            android:layout_marginRight=\"30dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Slide Down\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\"/>\n" +
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
                        "\n" +
                        "    <ImageView\n" +
                        "        android:id=\"@+id/ImageView_On_BounceAnimationExample\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:src=\"@drawable/zzz_59\"\n" +
                        "        android:layout_width=\"70dp\"\n" +
                        "        android:layout_height=\"70dp\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_On_BounceAnimationExample\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginLeft=\"30dp\"\n" +
                        "        android:layout_marginRight=\"30dp\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_weight=\"1\"\n" +
                        "        android:text=\"Bounce\"\n" +
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
                        "\n" +
                        "    <ImageView\n" +
                        "        android:id=\"@+id/ImageView_On_BlinkAnimationExample\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:src=\"@drawable/zzz_60\"\n" +
                        "        android:layout_width=\"70dp\"\n" +
                        "        android:layout_height=\"70dp\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_On_BlinkAnimationExample\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginLeft=\"30dp\"\n" +
                        "        android:layout_marginRight=\"30dp\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_weight=\"1\"\n" +
                        "        android:text=\"Blink\"\n" +
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
                        "    <ImageView\n" +
                        "        android:id=\"@+id/ImageView_On_ScaleAnimationExample\"\n" +
                        "        android:visibility=\"gone\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:src=\"@drawable/zzz_61\"\n" +
                        "        android:layout_width=\"70dp\"\n" +
                        "        android:layout_height=\"70dp\" />\n" +
                        "\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:orientation=\"horizontal\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Left_On_ScaleAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"50dp\"\n" +
                        "            android:layout_marginRight=\"50dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Scale Up\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/Button_Right_On_ScaleAnimationExample\"\n" +
                        "            android:layout_marginLeft=\"50dp\"\n" +
                        "            android:layout_marginRight=\"50dp\"\n" +
                        "            android:textAllCaps=\"false\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:text=\"Scale Down\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
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
                        "    <ImageView\n" +
                        "        android:id=\"@+id/ImageView_On_SequentialAnimationExample\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:src=\"@drawable/zzz_62\"\n" +
                        "        android:layout_width=\"70dp\"\n" +
                        "        android:layout_height=\"70dp\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_On_SequentialAnimationExample\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginLeft=\"30dp\"\n" +
                        "        android:layout_marginRight=\"30dp\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_weight=\"1\"\n" +
                        "        android:text=\"Sequential\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
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
                        "    <ImageView\n" +
                        "        android:id=\"@+id/ImageView_On_TogetherAnimationExample\"\n" +
                        "        android:layout_centerInParent=\"true\"\n" +
                        "        android:src=\"@drawable/zzz_63\"\n" +
                        "        android:layout_width=\"70dp\"\n" +
                        "        android:layout_height=\"70dp\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Button_On_TogetherAnimationExample\"\n" +
                        "        android:layout_alignParentBottom=\"true\"\n" +
                        "        android:layout_centerHorizontal=\"true\"\n" +
                        "        android:layout_marginLeft=\"30dp\"\n" +
                        "        android:layout_marginRight=\"30dp\"\n" +
                        "        android:textAllCaps=\"false\"\n" +
                        "        android:layout_weight=\"1\"\n" +
                        "        android:text=\"Together\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\" />\n" +
                        "\n" +
                        "</RelativeLayout>");
            default:
                break;
        }
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
