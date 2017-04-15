package com.example.caoxiaojian.soduku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_new).setOnClickListener(this);
        findViewById(R.id.btn_resume).setOnClickListener(this);
        findViewById(R.id.btn_about).setOnClickListener(this);
        findViewById(R.id.btn_exit).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_new:
                Intent new_game_intent = new Intent(this, NewGameActivity.class);
                startActivity(new_game_intent);
                break;
            case R.id.btn_resume:

                break;
            case R.id.btn_about:
                Intent about_intent = new Intent(this, AboutActivity.class);
                startActivity(about_intent);
                break;
            case R.id.btn_exit:
                finish();
                break;
        }
    }
}
