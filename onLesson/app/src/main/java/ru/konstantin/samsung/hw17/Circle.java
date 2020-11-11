package ru.konstantin.samsung.hw17;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Circle {
    Paint paint;

    private float x;
    private float y;

    private float radius;
    private int color;

    public Circle()
    {
        paint = new Paint();

        setX(0);
        setY(0);

        setRadius(20);
        setColor(Color.BLUE);
    }

    public Circle(float x, float y, float radius, int color)
    {
        paint = new Paint();

        setX(x);
        setY(y);

        setRadius(radius);
        setColor(color);
    }

    public void Draw(Canvas canvas)
    {
        canvas.drawCircle(x, y, radius, paint);
    }

    public void setX(float x)
    {
        this.x = x;
    }

    public void setY(float y)
    {
        this.y = y;
    }

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public void setColor(int color)
    {
        this.color = color;
        paint.setColor(this.color);
    }

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public float getRadius()
    {
        return radius;
    }

    public int getColor()
    {
        return color;
    }
}
