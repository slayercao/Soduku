package com.example.caoxiaojian.soduku;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class NewGameActivity extends Activity {

    static public Path circle = new Path();

    static public Paint cPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    static public String quote = "now is the time for all. good men to come to the aid of their country.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);

        GraphicsView graphicsView = new GraphicsView(this);

        ((LinearLayout) findViewById(R.id.layout_new)).addView(graphicsView);

    }

    static public class GraphicsView extends View {

        public GraphicsView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            circle.addCircle(150, 150, 100, Path.Direction.CW);
            canvas.drawPath(circle, cPaint);

        }

    }


}
