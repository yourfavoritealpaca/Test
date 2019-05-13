package com.example.joshuahahn.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculator extends AppCompatActivity {

    int op1, op2, calculation;
    String operator = null;

    public void onCreate(Bundle icicle) {

        op1 = 0;
        op2 = 0;
        calculation = 0;


        super.onCreate(icicle);
        setContentView(R.layout.calculator);

        Button btn0 = findViewById(R.id.button0);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        Button btn8 = findViewById(R.id.button8);
        Button btn9 = findViewById(R.id.button9);
        Button btn_minus = findViewById(R.id.button_minus);
        Button btn_add = findViewById(R.id.button_add);
        Button btn_multiply = findViewById(R.id.button_multiply);
        Button btn_divide = findViewById(R.id.button_divide);
        Button btn_enter = findViewById(R.id.button_enter);
        Button btn_c = findViewById(R.id.button_c);
        final TextView calculatorTextView = findViewById(R.id.edt1);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorTextView.setText(calculatorTextView.getText() + "0");
                if (operator.equals(null))
                {
                    op1 = 10*op1 + 0;
                }
                else {
                    op2 = 10*op2 + 0;
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorTextView.setText(calculatorTextView.getText() + "1");
                if (operator.equals(null))
                {
                    op1 = 10*op1 + 1;
                }
                else {
                    op2 = 10*op2 + 1;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorTextView.setText(calculatorTextView.getText() + "2");
                if (operator.equals(null))
                {
                    op1 = 10*op1 + 2;
                }
                else {
                    op2 = 10*op2 + 2;
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorTextView.setText(calculatorTextView.getText() + "3");
                if (operator.equals(null))
                {
                    op1 = 10*op1 + 3;
                }
                else {
                    op2 = 10*op2 + 3;
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorTextView.setText(calculatorTextView.getText() + "4");
                if (operator.equals(null))
                {
                    op1 = 10*op1 + 4;
                }
                else {
                    op2 = 10*op2 + 4;
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorTextView.setText(calculatorTextView.getText() + "5");
                if (operator.equals(null))
                {
                    op1 = 10*op1 + 5;
                }
                else {
                    op2 = 10*op2 + 5;
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorTextView.setText(calculatorTextView.getText() + "6");
                if (operator.equals(null))
                {
                    op1 = 10*op1 + 6;
                }
                else {
                    op2 = 10*op2 + 6;
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorTextView.setText(calculatorTextView.getText() + "7");
                if (operator.equals(null))
                {
                    op1 = 10*op1 + 7;
                }
                else {
                    op2 = 10*op2 + 7;
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorTextView.setText(calculatorTextView.getText() + "8");
                if (operator.equals(null))
                {
                    op1 = 10*op1 + 8;
                }
                else {
                    op2 = 10*op2 + 8;
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorTextView.setText(calculatorTextView.getText() + "9");
                if (operator.equals(null))
                {
                    op1 = 10*op1 + 9;
                }
                else {
                    op2 = 10*op2 + 9;
                }
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (operator.equals(null)) {
                    calculatorTextView.setText(calculatorTextView.getText() + "+");
                    String operator = "+";
                }
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (operator.equals(null)) {
                    calculatorTextView.setText(calculatorTextView.getText() + "-");
                    String operator = "-";
                }
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (operator.equals(null)) {
                    calculatorTextView.setText(calculatorTextView.getText() + "*");
                    String operator = "*";
                }
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (operator.equals(null)) {
                    calculatorTextView.setText(calculatorTextView.getText() + "/");
                    String operator = "/";
                }
            }
        });

        btn_enter.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View view) {

                if (operator.equals("+")) {
                    calculation = op1 + op2;
                }

                else if (operator.equals("-")) {
                    calculation = op1 - op2;
                }

                else if (operator.equals("*")) {
                    calculation = op1 * op2;
                }

                else if (operator.equals("/")) {
                    calculation = op1 / op2;
                }
                calculatorTextView.setText(calculation);
            }
        });

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operator = null;
                op1 = 0;
                op2 = 0;
            }
        });

    }
}

