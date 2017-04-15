package com.example.caoxiaojian.soduku;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;

public class NewGameActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        GraphicsView graphicsView = new GraphicsView(this);
        graphicsView.getWidth();
        graphicsView.getHeight();
        setContentView(graphicsView);


    }

}
