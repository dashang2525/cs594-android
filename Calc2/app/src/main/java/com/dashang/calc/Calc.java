package com.dashang.calc;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Calc extends ActionBarActivity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn_dpoint,btnplus,btnequal,btnmin,btnmulti,btndiv,btndel,btnadv;
    private String one="";
    private String firstvalue="",secondvalue="";
    private Double total;
    private int flag=0,threeval=0;
    String operator="";
    String sinopr="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn_zero);
        btn_dpoint=(Button)findViewById(R.id.btn_dpoint);

        btnplus=(Button)findViewById(R.id.btn_plus);
        btnequal=(Button)findViewById(R.id.btn_equal);
        btnmin=(Button)findViewById(R.id.btn_min);
        btndiv=(Button)findViewById(R.id.btn_div);
        btnmulti=(Button)findViewById(R.id.btn_multi);
        btndel=(Button)findViewById(R.id.btn_del);
        btnadv=(Button)findViewById(R.id.btn_adv);

        Intent intent = getIntent();
        if(intent.getExtras()  != null) {
            operator = intent.getExtras().getString("sin");
            final TextView p1t = (TextView) findViewById(R.id.txt_box);
            p1t.setText(operator);

        }

        btnadv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                Intent intent;
                intent = new Intent(Calc.this,SinCalc.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);



            }
        });


        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                String temp = one.substring(0,one.length()-1);
                one = temp;
                p1t.setText(""+ one );

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                if(flag==0) {
                    one = one + 1;
                }else{
                    one="";
                    one = one + 1;
                    flag=0;
                    p1t.setText("");
                }
                p1t.setText(""+ one );

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                if(flag==0) {
                    one = one + 2;
                }else{
                    one="";
                    one = one + 2;
                    flag=0;
                    p1t.setText("");
                }
                p1t.setText(""+ one );

            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                if(flag==0) {
                    one = one + 3;
                }else{
                    one="";
                    one = one + 3;
                    flag=0;
                    p1t.setText("");
                }
                p1t.setText(""+ one );

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                if(flag==0) {
                    one = one + 4;
                }else{
                    one="";
                    one = one + 4;
                    flag=0;
                    p1t.setText("");
                }
                p1t.setText(""+ one );

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                if(flag==0) {
                    one = one + 5;
                }else{
                    one="";
                    one = one + 5;
                    flag=0;
                    p1t.setText("");
                }
                p1t.setText(""+ one );

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                if(flag==0) {
                    one = one + 6;
                }else{
                    one="";
                    one = one + 6;
                    flag=0;
                    p1t.setText("");
                }
                p1t.setText(""+ one );

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                if(flag==0) {
                    one = one + 7;
                }else{
                    one="";
                    one = one + 7;
                    flag=0;
                    p1t.setText("");
                }
                p1t.setText(""+ one );

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                if(flag==0) {
                    one = one + 8;
                }else{
                    one="";
                    one = one + 8;
                    flag=0;
                    p1t.setText("");
                }
                p1t.setText(""+ one );

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                if(flag==0) {
                    one = one + 9;
                }else{
                    one="";
                    one = one + 9;
                    flag=0;
                    p1t.setText("");
                }
                p1t.setText(""+ one );

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                if(flag==0) {
                    one = one + 0;
                }else{
                    one="";
                    one = one + 0;
                    flag=0;
                    p1t.setText("");
                }
                p1t.setText(""+ one );

            }
        });

        btn_dpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                one = one + ".";
                /*if(flag==0) {
                    one = one + 0 + 0;
                }else{
                    one="";
                    one = one + 0 + 0;
                    flag=0;
                    p1t.setText("");
                }*/
                Toast.makeText(getApplicationContext(), "ONE:"+one, Toast.LENGTH_LONG).show();
                p1t.setText(""+ one );

            }
        });







        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                Double a=0.0;
                Toast.makeText(getApplicationContext(), "PLUS Firstvalue 1 :" + firstvalue, Toast.LENGTH_LONG).show();
                if(firstvalue.equals("")){
                    a=0.0;
                    firstvalue = p1t.getText().toString();
                    Toast.makeText(getApplicationContext(), "PLUS INSIDE :" + firstvalue, Toast.LENGTH_LONG).show();

                }else {
                    if(operator.equals("-")) {
                        a = Double.parseDouble(firstvalue);
                        firstvalue = p1t.getText().toString();
                        Double b = Double.parseDouble(firstvalue);
                        Double tot = a + b;
                        firstvalue = "" + tot;
                        threeval = 1;
                    }else{
                    Toast.makeText(getApplicationContext(), "ONE :" + one, Toast.LENGTH_LONG).show();
                    a = Double.parseDouble(firstvalue);
                    Double b = Double.parseDouble(one);
                    Double tot1=0.0;
                    if(operator.equals("+")) {
                        tot1 = a + b;
                    } else if(operator.equals("-")){
                        tot1 = a - b;
                    } else if(operator.equals("*")){
                        tot1 = a * b;
                    }else{

                    }
                    firstvalue = "" + tot1;
                    Toast.makeText(getApplicationContext(), "MIN Firstvalue 3 :" + firstvalue, Toast.LENGTH_LONG).show();
                }
                }
                Toast.makeText(getApplicationContext(), "PLUS Firstvalue 11 :" + firstvalue, Toast.LENGTH_LONG).show();
                one="";
                p1t.setText("");
                operator = "+";
            }
        });

        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                Double a=0.0;
                Toast.makeText(getApplicationContext(), "MIN Firstvalue 1 :" + firstvalue, Toast.LENGTH_LONG).show();
                if(firstvalue.equals("")){
                    firstvalue = p1t.getText().toString();
                }else {
                    if(operator.equals("-")) {
                        Toast.makeText(getApplicationContext(), "MIN Firstvalue 1 :" + firstvalue, Toast.LENGTH_LONG).show();
                        a = Double.parseDouble(firstvalue);
                        firstvalue = p1t.getText().toString();
                        Double b = Double.parseDouble(firstvalue);
                        Double tot = a - b;
                        firstvalue = "" + tot;
                        Toast.makeText(getApplicationContext(), "MIN Firstvalue 2 :" + firstvalue, Toast.LENGTH_LONG).show();
                        threeval = 1;
                    }else{
                        Toast.makeText(getApplicationContext(), "ONE :" + one, Toast.LENGTH_LONG).show();
                        a = Double.parseDouble(firstvalue);
                        Double b = Double.parseDouble(one);
                        Double tot1=0.0;
                        if(operator.equals("+")) {
                            tot1 = a + b;
                        } else if(operator.equals("-")){
                            tot1 = a - b;
                        } else if(operator.equals("*")){
                            tot1 = a * b;
                        }else{

                        }
                        firstvalue = "" + tot1;
                        Toast.makeText(getApplicationContext(), "MIN Firstvalue 3 :" + firstvalue, Toast.LENGTH_LONG).show();
                    }
                }
                Toast.makeText(getApplicationContext(), "MIN Firstvalue 11 :" + firstvalue, Toast.LENGTH_LONG).show();

                //firstvalue = p1t.getText().toString();
                one="";
                p1t.setText("");
                operator = "-";
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                firstvalue = p1t.getText().toString();
                one="";
                p1t.setText("");
                operator = "/";
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                firstvalue = p1t.getText().toString();
                one="";
                p1t.setText("");
                operator = "*";
            }
        });




        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView p1t = (TextView) findViewById(R.id.txt_box);
                secondvalue = p1t.getText().toString();

                Toast.makeText(getApplicationContext(), "Sec:"+secondvalue, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Fir:"+firstvalue, Toast.LENGTH_LONG).show();
                if(firstvalue.equals("")){
                    firstvalue="0";
                }
                if(secondvalue.equals("")){
                    firstvalue="0";
                }
                Double a= Double.parseDouble(firstvalue);
                Double b= Double.parseDouble(secondvalue);

                if(operator.equals("+")) {
                    total = a + b;
                }else if(operator.equals("-")) {
                    total = a - b;
                }else if(operator.equals("/")) {
                    total = a / b;
                }else if(operator.equals("*")) {
                    total = a * b;
                }else if(operator.equals("sin")) {
                    double value = Math.sin(Math.toRadians(Double.parseDouble(one)));
                    value = ((double) Math.round(value * 1000)) / 1000;
                    total=value;
                }else if(operator.equals("tan")) {
                    double value = Math.tan(Math.toRadians(Double.parseDouble(one)));
                    value = ((double) Math.round(value * 1000)) / 1000;
                    total=value;
                }else if(operator.equals("cos")) {
                double value = Math.cos(Math.toRadians(Double.parseDouble(one)));
                value = ((double) Math.round(value * 1000)) / 1000;
                total=value;
                }
                else{

                }
                firstvalue="";
                secondvalue="";
                Toast.makeText(getApplicationContext(), "total:"+total, Toast.LENGTH_LONG).show();
                //total = Double.parseDouble(firstvalue) + Double.parseDouble(secondvalue);
                p1t.setText(""+total);
                flag=1;




            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calc, menu);
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
