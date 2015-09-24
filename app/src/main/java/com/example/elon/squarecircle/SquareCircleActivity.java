package com.example.elon.squarecircle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Spinner;


public class SquareCircleActivity extends Activity {

    private ShapeView shapeView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_circle);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        shapeView = (ShapeView) findViewById(R.id.shapeview);
        shapeView.setSpinnerValue(spinner);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_square_circle, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }

    public void onRadioButtonClicked(View view){
        RadioGroup radioGroup =  (RadioGroup) findViewById(R.id.radio_group);
        int id = radioGroup.getCheckedRadioButtonId();

        switch (id){
            case R.id.radio_circle:
                shapeView.setDrawCircle(true);
                break;
            case R.id.radio_square:
                shapeView.setDrawCircle(false);
                break;
        }
    }



}
