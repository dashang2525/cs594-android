package com.dashang.pig;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.widget.Toast.*;

/**
 * Created by bhaumik on 4/10/2015.
 */
public class Player2 extends ActionBarActivity{
    private FrameLayout die1;
    private FrameLayout die2;
    private Button roll,hold;
    private long pl1score,score2;
    private long total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player2);

        Intent intent = getIntent();
        pl1score = intent.getExtras().getLong("pl1score");
        score2 = intent.getExtras().getLong("pl2score");
        total=score2;
        Toast.makeText(this,"This score is : " + pl1score,LENGTH_LONG).show();
        final TextView round = (TextView) findViewById(R.id.p1);
        round.setText("P1 : "+pl1score);
        final TextView p1t = (TextView) findViewById(R.id.p2);
        p1t.setText("P2 : "+total);
        die1 = (FrameLayout)findViewById(R.id.die1);
        die2 = (FrameLayout)findViewById(R.id.die2);
        roll=(Button)findViewById(R.id.btnRoll);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });

        hold = (Button)findViewById(R.id.hold);
        hold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent;
                intent = new Intent(Player2.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                intent.putExtra("pl2score",total);
                intent.putExtra("pl1score",pl1score);
                startActivity(intent);
            }
        });

    }

    public void rollDice(){
        Random r=new Random();
        int num1 = 1 + (int) (6 * Math.random());
        int num2 = 1 + (int) (6 * Math.random());
        setDie(num1,die1);
        setDie(num2,die2);
        int sum;
        if (num1 == 1 || num2 == 1){
            total=score2;
            final TextView round = (TextView) findViewById(R.id.round);
            round.setText("Round : "+0);
            Intent intent;
            intent = new Intent(Player2.this,MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            intent.putExtra("pl2score",total);
            intent.putExtra("pl1score",pl1score);
            startActivity(intent);
        }else{
            total = total + num1 + num2;
            if(total >= 100){
                final TextView round = (TextView) findViewById(R.id.round);
                round.setText("Player 2 WIN : " + total);
            }
            final TextView round = (TextView) findViewById(R.id.round);
            round.setText("Round : " + total);
        }
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
