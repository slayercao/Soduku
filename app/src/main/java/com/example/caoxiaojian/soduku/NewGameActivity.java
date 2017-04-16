package com.example.caoxiaojian.soduku;

import android.app.Activity;
import android.os.Bundle;

public class NewGameActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GraphicsView graphicsView = new GraphicsView(this);

        setContentView(graphicsView);


    }

}
