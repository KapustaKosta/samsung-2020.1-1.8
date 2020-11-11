package ru.konstantin.samsung.hw17;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.Display;
import android.view.MotionEvent;
import  android.view.View;

import java.util.ArrayList;
import java.util.Random;

public class MyView extends View{

    Paint paint = new Paint();
    ArrayList<MovingCircle> circles = new ArrayList<>();

    public MyView(Context context)
    {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        for (MovingCircle circle : circles) {
            circle.Draw(canvas);
            if(circle.getX() >= canvas.getWidth() - circle.getRadius() ||
                    circle.getX() <= 0 + circle.getRadius())
                circle.setDX(circle.getDX() * -1);
            if(circle.getY() >= canvas.getHeight() - circle.getRadius()||
                    circle.getY() <= 0 + circle.getRadius())
                circle.setDY(circle.getDY() * -1);
            circle.setX(circle.getX() + circle.getDX());
            circle.setY(circle.getY() + circle.getDY());
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        Random random = new Random();
        if(event.getX() == 0 || event.getY() == 0) return true; // кружки не появляются на границах
        // не работает с нижней границей и с правой границей, тк там нужно знать ширину и высоту экрана

        circles.add(new MovingCircle(event.getX(), event.getY(),
                random.nextInt(50),
                random.nextBoolean()? random.nextInt(Integer.MAX_VALUE) : -random.nextInt(Integer.MAX_VALUE),
                random.nextBoolean()? random.nextFloat(): -random.nextFloat(),
                random.nextBoolean()? random.nextFloat(): -random.nextFloat()));
        return true;
    }
}
