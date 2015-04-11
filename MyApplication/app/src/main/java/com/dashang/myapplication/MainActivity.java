package com.dashang.myapplication;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    private FrameLayout die1;
    private FrameLayout die2;
    private Button roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        die1 = (FrameLayout)findViewById(R.id.die1);
        die2 = (FrameLayout)findViewById(R.id.die2);
        roll=(Button)findViewById(R.id.btnRoll);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });

    }

    public void rollDice(){
        Random r=new Random();
        int num1 =r.nextInt(6);
        int num2 =r.nextInt(6);
        setDie(num1,die1);
        setDie(num2,die2);
    }

    public void setDie(int num , FrameLayout layout){
        Drawable pic;
        switch(num)
        {
            case 1:
                pic=getResources().getDrawable(R.drawable.die_face_1);
                layout.setBackground(pic);
                break;
            case 2:
                pic=getResources().getDrawable(R.drawable.die_face_2);
                layout.setBackground(pic);
                break;
            case 3:
                pic=getResources().getDrawable(R.drawable.die_face_3);
                layout.setBackground(pic);
                break;
            case 4:
                pic=getResources().getDrawable(R.drawable.die_face_4);
                layout.setBackground(pic);
                break;
            case 5:
                pic=getResources().getDrawable(R.drawable.die_face_5);
                layout.setBackground(pic);
                break;
            case 6:
                pic=getResources().getDrawable(R.drawable.die_face_6);
                layout.setBackground(pic);
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
