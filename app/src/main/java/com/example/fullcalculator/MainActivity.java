package com.example.fullcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.fullcalculator.util.CalculatorUtil;

import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText input;
    double val1, val2;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnSub, btnMul, btnDiv, btnMod, btnDecimal, btnEqual, btnClear;
    boolean add, sub, mul, div, mod, decimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeControls();
        addClickListener();
    }

    private void addClickListener() {
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMod.setOnClickListener(this);
        btnDecimal.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    private void initializeControls() {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnMod = findViewById(R.id.btnMod);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);

        input = findViewById(R.id.editText);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn0:
                input.setText(input.getText() + "0");
                break;
            case R.id.btn1:
                input.setText(input.getText() + "1");
                break;
            case R.id.btn2:
                input.setText(input.getText() + "2");
                break;
            case R.id.btn3:
                input.setText(input.getText() + "3");
                break;
            case R.id.btn4:
                input.setText(input.getText() + "4");
                break;
            case R.id.btn5:
                input.setText(input.getText() + "5");
                break;
            case R.id.btn6:
                input.setText(input.getText() + "6");
                break;
            case R.id.btn7:
                input.setText(input.getText() + "7");
                break;
            case R.id.btn8:
                input.setText(input.getText() + "8");
                break;
            case R.id.btn9:
                input.setText(input.getText() + "9");
                break;
            case R.id.btnAdd:
                input.setText(input.getText() + "+");
                break;
            case R.id.btnSub:
                input.setText(input.getText() + "-");
                break;
            case R.id.btnMul:
                input.setText(input.getText() + "*");
                break;
            case R.id.btnDiv:
                input.setText(input.getText() + "/");
                break;
            case R.id.btnMod:
                input.setText(input.getText() + "%");
                break;
            case R.id.btnDecimal:
                input.setText(input.getText() + ".");
                break;
            case R.id.btnClear:
                input.setText("");
                val1 = 0.0;
                val2 = 0.0;
                break;
            case R.id.btnEqual:
                input.setText(CalculatorUtil.solveExpression(input.getText().toString()));
                break;
        }
    }
}
