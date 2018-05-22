package com.example.a.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,zero,dot,plus,minus,divide,multiply,equals,clear;
    TextView screen;
    String screenString="";
    Double num1,num2,result;
    boolean plusIsPressed=false,minusIsPressed=false,divideIsPressed=false,multiplyIsPressed=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.buttonOne);
        two = findViewById(R.id.buttonTwo);
        three = findViewById(R.id.buttonThree);
        four = findViewById(R.id.buttonFour);
        five = findViewById(R.id.buttonFive);
        six = findViewById(R.id.buttonSix);
        seven = findViewById(R.id.buttonSeven);
        eight = findViewById(R.id.buttonEight);
        nine = findViewById(R.id.buttonNine);
        zero = findViewById(R.id.buttonZero);
        dot = findViewById(R.id.buttonDot);
        plus = findViewById(R.id.buttonPlus);
        minus = findViewById(R.id.buttonMinus);
        divide = findViewById(R.id.buttonDivide);
        multiply = findViewById(R.id.buttonMultiply);
        equals = findViewById(R.id.buttonEquals);
        clear = findViewById(R.id.buttonClear);
        screen = findViewById(R.id.textViewScreen);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenString = screen.getText()+"1";
                screen.setText(screenString);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenString = screen.getText()+"2";
                screen.setText(screenString);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenString = screen.getText()+"3";
                screen.setText(screenString);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenString = screen.getText()+"4";
                screen.setText(screenString);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenString = screen.getText()+"5";
                screen.setText(screenString);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenString = screen.getText()+"6";
                screen.setText(screenString);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenString = screen.getText()+"7";
                screen.setText(screenString);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenString = screen.getText()+"8";
                screen.setText(screenString);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenString = screen.getText()+"9";
                screen.setText(screenString);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenString = screen.getText()+"0";
                screen.setText(screenString);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenString = screen.getText()+".";
                screen.setText(screenString);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(screen.getText() + "");
                plusIsPressed = true;
                screenString="";
                screen.setText(screenString);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(screen.getText()+"");
                minusIsPressed=true;
                screenString="";
                screen.setText(screenString);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(screen.getText()+"");
                divideIsPressed=true;
                screenString="";
                screen.setText(screenString);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(screen.getText()+"");
                multiplyIsPressed=true;
                screenString="";
                screen.setText(screenString);
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            num2 = Double.parseDouble(screen.getText()+"");
            if (plusIsPressed){
                result=num1+num2;
                screenString=result.toString();
                screen.setText(screenString);
                plusIsPressed=false;
            }
            if (minusIsPressed){
                result=num1-num2;
                screenString=result.toString();
                screen.setText(screenString);
                minusIsPressed=false;
            }
            if (divideIsPressed){
                result=num1/num2;
                screenString=result.toString();
                screen.setText(screenString);
                divideIsPressed=false;
                }
            if (multiplyIsPressed){
                result=num1*num2;
                screenString=result.toString();
                screen.setText(screenString);
                multiplyIsPressed=false;
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("");
            }
        });
    }
}
