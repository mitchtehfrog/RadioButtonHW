package com.example.elon.squarecircle;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by mthompson31 on 9/24/2015.
 */
public class Circle {
    private float x, y;
    private int red, green, blue, width;
    private Paint paint;


    //I screwed up and made alpha instead of width, but didn't want to change the wording. therefore,
    //paint.setARGB uses 255 as alpha value but the "alpha" is treated as width.
    public Circle(float x, float y, int red, int green, int blue, int width){
        this.x = x;
        this.y = y;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.width = width;
        paint = new Paint();
        paint.setARGB(255, red, green, blue);
    }

    public void draw(Canvas canvas){
        canvas.drawCircle(x, y, width, paint);
    }


}
