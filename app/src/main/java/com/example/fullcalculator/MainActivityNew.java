package com.example.fullcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fullcalculator.util.CalculatorUtil;

public class MainActivityNew extends AppCompatActivity  {
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_new);
        initializeControls();
    }

    private void initializeControls() {
        input = findViewById(R.id.editText);
    }

     public void onClick(View v)
     {
         if(v instanceof Button)
         {
             Button btn = (Button) v;
             String btnText = "" + btn.getText();
             String inputText=input.getText().toString();
             if ("c".equalsIgnoreCase(btnText))
                 input.setText("");
             else if ("=".equalsIgnoreCase(btnText))
                 input.setText(CalculatorUtil.solveExpression(inputText));
             else {
                 input.setText( inputText + btnText);
             }
         }
     }
}
