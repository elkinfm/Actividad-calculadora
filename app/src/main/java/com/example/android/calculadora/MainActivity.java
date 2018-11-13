package com.example.android.calculadora;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {



    String textCadena = "";
    int total, a, b;

    TextView textView;

    Button btnPlus;

    Button btn7;
    String sBtn7;
    int intBnt7;

    Button btn8;
    String sBtn8;
    int intBnt8;


    Button btn9;
    String sBtn9;
    int intBnt9;


    Button btn4;
    String sBtn4;
    int intBnt4;

    Button btn5;
    String sBtn5;
    int intBnt5;

    Button btn6;
    String sBtn6;
    int intBnt6;


    Button btn3;
    String sBtn3;
    int intBnt3;

    Button btn2;
    String sBtn2;
    int intBnt2;

    Button btn1;
    String sBtn1;
    int intBnt1;

    Button btn0;
    String sBtn0;
    int intBnt0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        /**FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick (View v){

                if ( a == 0 && b == 0 && total == 0){
                    textCadena = "";
                    total = getValueTextView();
                    setTextView("");
                } else if ( b == 0 && total == 0){
                    b = getValueTextView();
                    total  = a + b;
                    setTextView(Integer.toString(total));
                    a = b = 0;
                    textCadena = "";
                } else if ( a == 0 && total == 0){
                    a = getValueTextView();
                    total  = a + b;
                    setTextView(Integer.toString(total));
                    a = b = 0;
                    textCadena = "";
                } else  if (a == 0 && b == 0){
                    a = getValueTextView();
                    total  = a+b;
                    setTextView(Integer.toString(total));
                    a = b = 0;
                    textCadena = "";
                }else if (b == 0){
                    b = getValueTextView();
                    total  = a + b;
                    setTextView(Integer.toString(total));
                    a = b = 0;
                    textCadena = "";
                }
            }
        });

        Button btnMul = findViewById(R.id.btnMul);
        Button btnMin = findViewById(R.id.btnMin);
        Button btnDot = findViewById(R.id.btnDot);
        Button btnEqual = findViewById(R.id.btnEqual);
        btnEqual.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick (View v){

                if (a == 0 && b == 0 && total == 0){
                    total = getValueTextView();
                }else if ( b == 0 && total == 0 ){
                    b = getValueTextView();
                    total = a + b;
                    setTextView(Integer.toString(total));
                    a = b = 0;
                }else if (a == 0 && total == 0){
                    setTextView(Integer.toString(b));
                    total = b;
                    a = b = 0;
                }else if (a == 0 && b == 0){
                    a = getValueTextView();
                    total += a;
                    setTextView(Integer.toString(total));
                    a = b = 0;
                }else if (b == 0){
                    b = getValueTextView();
                    total = a + b;
                    setTextView(Integer.toString(total));
                    a = b = 0;
                }
            }
        });

        btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick (View v){
                sBtn7 = "7";
                intBnt7 = Integer.parseInt(sBtn7);
                textCadena += sBtn7;
                setTextView(textCadena);
            }
        });

        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick (View v){
                sBtn8 = "8";
                intBnt8 = Integer.parseInt(sBtn8);
                textCadena += sBtn8;
                setTextView(textCadena);
            }
        });

        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick (View v){
                sBtn9 = "9";
                intBnt9 = Integer.parseInt(sBtn9);
                textCadena += sBtn9;
                setTextView(textCadena);
            }
        });

        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick (View v){
                sBtn4 = "4";
                intBnt4 = Integer.parseInt(sBtn4);
                textCadena += sBtn4;
                setTextView(textCadena);
            }
        });

        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick (View v){
                sBtn5 = "5";
                intBnt5 = Integer.parseInt(sBtn5);
                textCadena += sBtn5;
                setTextView(textCadena);
            }
        });

        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick (View v){
                sBtn6 = "6";
                intBnt6 = Integer.parseInt(sBtn6);
                textCadena += sBtn6;
                setTextView(textCadena);
            }
        });

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick (View v){
                sBtn1 = "7";
                intBnt1 = Integer.parseInt(sBtn1);
                textCadena += sBtn1;
                setTextView(textCadena);
            }
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick (View v){
                sBtn2 = "2";
                intBnt2 = Integer.parseInt(sBtn2);
                textCadena += sBtn2;
                setTextView(textCadena);
            }
        });

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick (View v){
                sBtn3 = "3";
                intBnt3 = Integer.parseInt(sBtn3);
                textCadena += sBtn3;
                setTextView(textCadena);
            }
        });

        btn0 = findViewById(R.id.btnZero);
        btn0.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick (View v){
                sBtn0 = "0";
                intBnt0 = Integer.parseInt(sBtn0);
                textCadena += sBtn0;
                setTextView(textCadena);
            }
        });
    }

    public void setTextView (String value) {
        textView = (TextView)findViewById(R.id.textView);
        textView.setText(value);
    }

    public int getValueTextView (){
        textView = (TextView)findViewById(R.id.textView);
        return  Integer.parseInt(textView.getText().toString());
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
