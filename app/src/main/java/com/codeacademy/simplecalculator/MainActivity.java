package com.codeacademy.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//My imports.
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Check what final does.
        final EditText firstNumber = findViewById(R.id.number1);
        final EditText secondNumber = findViewById(R.id.number2);
        RadioGroup operators = findViewById(R.id.operators);
        RadioButton add = findViewById(R.id.add);
        RadioButton subtract = findViewById(R.id.subtract);
        Button equals = findViewById(R.id.equals);
        TextView result = findViewById(R.id.result);



    }
}