package com.meyou;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;

import static android.content.res.Configuration.ORIENTATION_PORTRAIT;
import static android.graphics.Color.BLACK;
import static android.graphics.Color.TRANSPARENT;
import static android.graphics.Color.WHITE;
import static android.graphics.Color.rgb;
import static android.view.MotionEvent.ACTION_DOWN;
import static android.view.MotionEvent.ACTION_UP;
import static android.view.View.GONE;
import static android.view.View.VISIBLE;
import static android.view.animation.Animation.RELATIVE_TO_SELF;
import static android.view.animation.AnimationUtils.loadAnimation;
import static com.meyou.Me.getGray;
import static com.meyou.Me.getWhite;
import static com.meyou.Me.isNight;
import static com.meyou.UIState.HIDE_SYSTEM_BARS;
import static java.lang.System.currentTimeMillis;

public final class Dialog extends android.app.Dialog {

    private final static int COLOR_NIGHT = getGray(52);

    private View view = null;

    private int highLightColor;

    private long touchDown;

    private View.OnClickListener leftListener, rightListener, cancelOnTouchOutSideListener;

    private boolean canceledOnTouchOutside = false;

    private Context context;

    public Dialog(Context context) {
        super(context);
        this.context = context;
        highLightColor = rgb(146, 215, 90);
        if (view == null) {
            synchronized (View.class) {
                if (view != null)
                    dismiss();
                view = new View();
            }
        }

        view.setVisibility(GONE);
    }

    private void onUIState() {
        getWindow().setDimAmount(0.32f);
        getWindow().getDecorView().setSystemUiVisibility(HIDE_SYSTEM_BARS);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        onUIState();
        super.onCreate(bundle);
        setContentView(view);
    }


    @Override
    public void setCanceledOnTouchOutside(boolean canceledOnTouchOutside) {
        this.canceledOnTouchOutside = canceledOnTouchOutside;
    }


    @Override
    public void show() {
        super.show();

        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                RELATIVE_TO_SELF, 0.5f,
                RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        scaleAnimation.setDuration(300);
        scaleAnimation.setFillAfter(true);

        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300);
        alphaAnimation.setFillAfter(true);

        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);

        view.startAnimation(animationSet);
        view.setVisibility(VISIBLE);

    }


    @Override
    public void dismiss() {

        view.startAnimation(loadAnimation(context, android.R.anim.fade_out));
        getWindow().getDecorView().startAnimation(loadAnimation(context, android.R.anim.fade_out));

        view.setVisibility(GONE);
        getWindow().getDecorView().setVisibility(GONE);
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus)
            this.onUIState();
    }


    public Dialog setHighLightColor(int color) {
        highLightColor = color;
        view.textLeftColor = color;
        return this;
    }

    public Dialog setMessage(String message) {
        if (message.length() > 14)
            message = message.substring(0, 13) + "...";
        view.setMessage(message);
        return this;
    }

    public Dialog setLeftButton(String textOnButton, View.OnClickListener onClickListener) {
        leftListener = onClickListener;
        view.setTextOnLeft(textOnButton);
        return this;
    }

    public Dialog setRightButton(String textOnButton, View.OnClickListener onClickListener) {
        rightListener = onClickListener;
        view.setTextOnRight(textOnButton);
        return this;
    }

    public Dialog setCancelableOnBackPressed(boolean cancelable) {
        setCancelable(cancelable);
        return this;
    }

    public Dialog setCanceledByTouchOutside(View.OnClickListener onClickListener) {
        setCanceledByTouchOutside(true);
        cancelOnTouchOutSideListener = onClickListener;
        return this;
    }

    public Dialog setCanceledByTouchOutside(boolean cancel) {
        setCanceledOnTouchOutside(cancel);
        return this;
    }

    private final class View extends android.view.View implements android.view.View.OnTouchListener {

        private Paint paint = new Paint();

        private int bacLeftColor = TRANSPARENT;

        private int bacRightColor = bacLeftColor;

        private int textLeftColor = highLightColor;

        private int textRightColor;

        private String Message = "Message";

        private String textOnLeft = "OK";

        private String textOnRight = "Cancel";

        private float radius, max_width, max_height, line, middle, textSizeOnMessage, textSizeOnButton;

        private RectF main = new RectF();


        private View() {
            super(context);
            setOnTouchListener(this);

            if (isNight())
                textRightColor = getWhite(220);
            else
                textRightColor = BLACK;

        }


        @Override
        protected void onDraw(Canvas canvas) {

            super.onDraw(canvas);

            max_width = getWindow().getDecorView().getWidth();
            max_height = getWindow().getDecorView().getHeight();
            radius = max_width / 17f;
            line = max_height / 1.87f;
            middle = max_width / 2;


            if (getResources().getConfiguration().orientation == ORIENTATION_PORTRAIT) {
                if (((float) getResources().getDisplayMetrics().heightPixels / getResources().getDisplayMetrics().widthPixels) >= 1.88f) {
                    main.top = max_height / 2.47f;
                    main.left = max_width / 110;

                    textSizeOnButton = max_width / 17.4f;
                    textSizeOnMessage = max_width / 15.8f;
                } else {
                    main.top = max_height / 2.50f;
                    main.left = max_width / 12;

                    textSizeOnButton = max_width / 22.0f;
                    textSizeOnMessage = max_width / 18.0f;
                }
            } else {
                main.top = max_height / 3.11f;
                main.left = max_width / 110;

                textSizeOnButton = max_width / 17.4f;
                textSizeOnMessage = max_width / 15.8f;
            }
            main.bottom = max_height - main.top;
            main.right = max_width - main.left;


            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            if (isNight())
                paint.setColor(COLOR_NIGHT);
            else
                paint.setARGB(245, 255, 255, 255);

            canvas.drawRoundRect(main, radius, radius, paint);


            if (isNight())
                paint.setColor(getWhite(220));
            else
                paint.setColor(BLACK);

            paint.setTextSize(textSizeOnMessage);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.DEFAULT);

            canvas.drawText(Message, middle, main.top + (textSizeOnMessage / 2) + ((line - main.top) / 2), paint);


            paint.setStyle(Paint.Style.FILL);
            paint.setColor(bacLeftColor);

            canvas.drawRoundRect(main.left, line, middle, main.bottom, radius, radius, paint);

            canvas.drawRect(main.left, line, main.left + radius, line + radius, paint);

            canvas.drawRect(middle - radius, line, middle, line + radius, paint);

            canvas.drawRect(middle - radius, main.bottom - radius, middle, main.bottom, paint);


            paint.setColor(bacRightColor);

            canvas.drawRoundRect(middle, line, main.right, main.bottom, radius, radius, paint);

            canvas.drawRect(middle, main.bottom - radius, middle + radius, main.bottom, paint);

            canvas.drawRect(middle, line, middle + radius, line + radius, paint);

            canvas.drawRect(main.right - radius, line, main.right, line + radius, paint);


            if (isNight())
                paint.setColor(getWhite(120));
            else
                paint.setColor(highLightColor);

            paint.setStrokeWidth(0.1f);


            canvas.drawLine(main.left, line, main.right, line, paint);


            paint.setStrokeWidth(0.25f);

            canvas.drawLine(middle, line, middle, main.bottom, paint);


            paint.setColor(textLeftColor);
            paint.setTextSize(textSizeOnButton);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.DEFAULT_BOLD);

            canvas.drawText(textOnLeft, main.left + (middle - main.left) / 2, line + ((main.bottom - line) / 2) + (textSizeOnButton / 2), paint);


            paint.setColor(textRightColor);

            canvas.drawText(textOnRight, middle + ((middle - main.left) / 2), line + ((main.bottom - line) / 2) + (textSizeOnButton / 2), paint);

        }

        private void setMessage(String Message) {
            this.Message = Message;
            invalidate();
        }

        private void setTextOnLeft(String textOnLeft) {
            this.textOnLeft = textOnLeft;
            invalidate();
        }

        private void setTextOnRight(String textOnRight) {
            this.textOnRight = textOnRight;
            invalidate();
        }


        @Override
        public boolean onTouch(android.view.View v, MotionEvent event) {
            final float X = event.getX();
            final float Y = event.getY();


            if (X > view.main.left && X < view.middle && Y > view.line && Y < view.main.bottom - view.radius
                    || X > view.main.left + view.radius && X < view.middle && Y > view.line && Y < view.main.bottom) {

                if (event.getAction() == ACTION_DOWN) {

                    touchDown = currentTimeMillis();
                    bacLeftColor = highLightColor;
                    textLeftColor = WHITE;
                    invalidate();

                } else if (event.getAction() == ACTION_UP) {
                    if (currentTimeMillis() - touchDown <= 500) {
                        if (leftListener != null)
                            leftListener.onClick(v);
                        dismiss();
                    }

                    bacLeftColor = TRANSPARENT;
                    textLeftColor = highLightColor;
                    invalidate();
                }

            } else if (event.getAction() == ACTION_UP) {
                bacLeftColor = TRANSPARENT;
                textLeftColor = highLightColor;
                invalidate();
            }


            if (X < view.main.right && X > view.middle && Y > view.line && Y < view.main.bottom - view.radius
                    || X < view.main.right - view.radius && X > view.middle && Y > view.line && Y < view.main.bottom) {


                if (event.getAction() == ACTION_DOWN) {
                    touchDown = currentTimeMillis();
                    bacRightColor = highLightColor;
                    textRightColor = WHITE;
                    invalidate();
                } else if (event.getAction() == ACTION_UP) {
                    if (currentTimeMillis() - touchDown <= 500) {
                        if (rightListener != null)
                            rightListener.onClick(v);
                        dismiss();
                    }

                    bacRightColor = TRANSPARENT;
                    if (isNight())
                        textRightColor = getWhite(220);
                    else
                        textRightColor = BLACK;
                    invalidate();
                }

            } else if (event.getAction() == ACTION_UP) {

                bacRightColor = TRANSPARENT;
                if (isNight())
                    textRightColor = getWhite(220);
                else
                    textRightColor = BLACK;
                invalidate();
            }


            if (X < view.main.left || X > view.main.right || Y < view.main.top || Y > view.main.bottom) {
                if (event.getAction() == ACTION_DOWN) {
                    touchDown = currentTimeMillis();
                } else if (event.getAction() == ACTION_UP) {
                    if (currentTimeMillis() - touchDown <= 500 && canceledOnTouchOutside) {
                        if (cancelOnTouchOutSideListener != null)
                            cancelOnTouchOutSideListener.onClick(v);
                        dismiss();
                    }

                }
            }

            return true;
        }
    }

}
