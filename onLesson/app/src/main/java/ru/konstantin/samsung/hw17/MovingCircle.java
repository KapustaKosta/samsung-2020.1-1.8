package ru.konstantin.samsung.hw17;

import android.view.MotionEvent;

public class MovingCircle extends Circle {
    private float dX;
    private float dY;

    public MovingCircle()
    {
        super();
        dX = 1;
        dY = 1;
    }

    public MovingCircle(float x, float y, float radius, int color)
    {
        super(x, y, radius, color);
        dX = 1;
        dY = 1;
    }

    public MovingCircle(float x, float y, float radius, int color, float dX, float dY)
    {
        super(x, y, radius, color);
        setDX(dX);
        setDY(dY);
    }

    public void setDX(float dX)
    {
        this.dX = dX;
    }

    public void setDY(float dY)
    {
        this.dY = dY;
    }

    public float getDX()
    {
        return dX;
    }

    public float getDY()
    {
        return dY;
    }
}
