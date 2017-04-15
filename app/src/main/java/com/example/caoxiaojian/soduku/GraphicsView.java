package com.example.caoxiaojian.soduku;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

public class GraphicsView extends View {
    //用于画路径、线条等
    static public Path circle;

    static public Paint cPaint;

    static public String quote = "now is the time for all. good men to come to the aid of their country.";

    static public Context mContext;
    static public int screenWidth;
    static public int screenHeight;

    public GraphicsView(Context context) {
        super(context);
        mContext = context;
        initView();
    }

    public GraphicsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        initView();
    }

    public GraphicsView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        // TODO Auto-generated constructor stub
        initView();
    }

    private void initView() {

        WindowManager wm = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);

        DisplayMetrics metric = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(metric);
        screenWidth = metric.widthPixels;     // 屏幕宽度（像素）
        screenHeight = metric.heightPixels;   // 屏幕高度（像素）

        circle = new Path();
        //画一个轮廓
        circle.addCircle(screenWidth / 2, screenHeight / 2, 400, Path.Direction.CW);
        //设置画笔
        cPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        cPaint.setStyle(Paint.Style.STROKE);
        cPaint.setColor(Color.BLACK);
        cPaint.setStrokeWidth(2);
        cPaint.setTextSize(40);
        //设置背景
        setBackgroundResource(R.drawable.shape);
    }

    @Override
    public void draw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.draw(canvas);
        canvas.drawPath(circle, cPaint);
        canvas.drawTextOnPath(quote, circle, (float) (400 * Math.PI), 50, cPaint);
    }

}