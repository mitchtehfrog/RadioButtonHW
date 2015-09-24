package com.example.elon.squarecircle;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by mthompson31 on 9/24/2015.
 */
public class Square {
    private float x, y;
    private int red, green, blue;
    private Paint paint;


    public Square(float x, float y, int red, int green, int blue){
        this.x = x;
        this.y = y;
        this.red = red;
        this.green = green;
        this.blue = blue;
        paint = new Paint();
        paint.setARGB(255, red, green, blue);
    }

    public void draw(Canvas canvas){
        canvas.drawRect(x,y,x+100,y+100, paint);
    }


}
