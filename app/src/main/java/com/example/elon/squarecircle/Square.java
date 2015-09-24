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


    //I screwed up and made alpha instead of width, but didn't want to change the wording. therefore,
    //paint.setARGB uses 255 as alpha value but the "alpha" is treated as width.
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
        canvas.drawRect(50,50,50,50, paint);
    }


}
