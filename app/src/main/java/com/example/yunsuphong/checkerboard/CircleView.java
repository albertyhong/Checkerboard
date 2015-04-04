package com.example.yunsuphong.checkerboard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by yunsuphong on 4/3/15.
 */
public class CircleView extends View {
    Paint paint = new Paint();

    public CircleView(Context context) {
        super(context);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);	//vs. STROKE
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();
        float radius = .1f * Math.min(width, height);

        canvas.drawColor(Color.WHITE);	//background
        canvas.drawCircle(radius, radius, radius, paint); //Top-left
    }
}
