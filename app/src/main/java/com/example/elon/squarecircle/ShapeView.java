package com.example.elon.squarecircle;

import android.content.Context;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by mthompson31 on 9/24/2015.
 */
public class ShapeView extends View {

    public static final int DEFAULT_CIRCLE_WIDTH = 50;
    public static final int DEFAULT_SQUARE_WIDTH = 50;
    public static final int ACTIVE_COLOR_VALUE = 255;
    public static final int INACTIVE_COLOR_VALUE = 0;
    private int theRed = INACTIVE_COLOR_VALUE;
    private int theGreen = INACTIVE_COLOR_VALUE;
    private int theBlue = INACTIVE_COLOR_VALUE;



    private ArrayList<Circle> theCircles;
    private ArrayList<Square> theSquares;


    public ShapeView(Context context, AttributeSet attrs) {
        super(context, attrs);

        theCircles = new ArrayList<Circle>();
        theSquares = new ArrayList<Square>();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        //FIXME need a conditional method for circle here
        Circle circle = new Circle(event.getX(), event.getY(), theRed, theGreen, theBlue, DEFAULT_CIRCLE_WIDTH);


        //FIXME need a conditional method to check for Square radiobutton selection here
        return true;
    }

}
