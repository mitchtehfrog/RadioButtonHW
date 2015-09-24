package com.example.elon.squarecircle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by mthompson31 on 9/24/2015.
 */
public class ShapeView extends View {

    @Override
    protected void onDraw(Canvas canvas){

        for (Circle circle: theCircles){
            circle.draw(canvas);
        }
        for (Square square: theSquares){
            square.draw(canvas);
        }
        invalidate();
    }

    public static final int DEFAULT_CIRCLE_WIDTH = 50;
    public static final int DEFAULT_SQUARE_WIDTH = 50;
    public static final int ACTIVE_COLOR_VALUE = 255;
    public static final int INACTIVE_COLOR_VALUE = 0;
    private int theRed = ACTIVE_COLOR_VALUE;
    private int theGreen = ACTIVE_COLOR_VALUE;
    private int theBlue = ACTIVE_COLOR_VALUE;
    private boolean drawCircle = true;
    private Spinner spinner;

    public void setDrawCircle(boolean drawCircle){
        this.drawCircle = drawCircle;
    }

    public void setSpinnerValue(Spinner spinner){
        this.spinner = spinner;
    }

    public void setColor()
    {
        String color = String.valueOf(spinner.getSelectedItem());
        if (color.equals("Red")) {
            theRed = ACTIVE_COLOR_VALUE;
            theBlue = INACTIVE_COLOR_VALUE;
            theGreen = INACTIVE_COLOR_VALUE;
        }
        if(color.equals("Green")){
            theRed = INACTIVE_COLOR_VALUE;
            theGreen = ACTIVE_COLOR_VALUE;
            theBlue = INACTIVE_COLOR_VALUE;
        }
        if(color.equals("Blue")){
            theRed = INACTIVE_COLOR_VALUE;
            theGreen = INACTIVE_COLOR_VALUE;
            theBlue = ACTIVE_COLOR_VALUE;
        }
    }


    private ArrayList<Circle> theCircles;
    private ArrayList<Square> theSquares;


    public ShapeView(Context context, AttributeSet attrs) {
        super(context, attrs);

        theCircles = new ArrayList<Circle>();
        theSquares = new ArrayList<Square>();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        setColor();
        if(drawCircle == true && event.getAction()==MotionEvent.ACTION_DOWN) {
            Circle circle = new Circle(event.getX(), event.getY(), theRed, theGreen, theBlue, DEFAULT_CIRCLE_WIDTH);
            theCircles.add(circle);
        }
        else if (drawCircle == false && event.getAction() == MotionEvent.ACTION_DOWN) {
            Square square = new Square(event.getX(), event.getY(), theRed, theGreen, theBlue);
            theSquares.add(square);
        }


        return true;
    }

}
