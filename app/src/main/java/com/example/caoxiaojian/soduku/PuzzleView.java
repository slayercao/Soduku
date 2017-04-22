package com.example.caoxiaojian.soduku;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by caoxiaojian on 2017/4/22.
 */

class PuzzleView extends View {
    private float width;
    private float height;
    private int selX;
    private int selY;
    private final Rect selRect = new Rect();

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        width = w / 9f;
        height = h / 9f;
        getRect(selX, selY, selRect);

        super.onSizeChanged(w, h, oldw, oldh);
    }

    private void getRect(int x, int y, Rect rect) {
        rect.set((int) (x * width), (int) (y * height), (int) (x * width + width), (int) (y * height + height));
    }

    private final NewGameActivity newGameActivity;

    public PuzzleView(Context context) {
        super(context);
        this.newGameActivity = (NewGameActivity) context;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}
