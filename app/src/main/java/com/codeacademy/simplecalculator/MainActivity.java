package com.codeacademy.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNumber = findViewById(R.id.number1);
        final EditText secondNumber = findViewById(R.id.number2);

        final RadioGroup operators = findViewById(R.id.operators);
        final RadioButton add = findViewById(R.id.add);
        final RadioButton subtract = findViewById(R.id.subtract);
        final RadioButton multiply = findViewById(R.id.multiply);
        final RadioButton divide = findViewById(R.id.divide);

        final Button equals = findViewById(R.id.equals);
        final TextView result = findViewById(R.id.result);

        equals.setOnClickListener(view -> {

            String firstNumberText = firstNumber.getText().toString();
            String secondNumberText = secondNumber.getText().toString();

            if (firstNumberText.isEmpty() || secondNumberText.isEmpty()) {
                result.setText("Please enter both numbers");
                return; // Exit the method if either number is empty
            }

            final double firstNumberValue = Double.parseDouble(firstNumber.getText().toString());
            final double secondNumberValue = Double.parseDouble(secondNumber.getText().toString());

            final int operatorButtonId = operators.getCheckedRadioButtonId();

            double answer;

            if (operatorButtonId == add.getId()) {
                answer = firstNumberValue + secondNumberValue;
            } else if (operatorButtonId == subtract.getId()){
                answer = firstNumberValue - secondNumberValue;
            } else if (operatorButtonId == multiply.getId()) {
                answer = firstNumberValue * secondNumberValue;
            } else if (operatorButtonId == divide.getId()) {
                if (firstNumberValue == 0 || secondNumberValue == 0) {
                    result.setText("Error: Division with zero.");
                    return;
                }
                answer = firstNumberValue / secondNumberValue;
            }else {
                answer = 0.0;
            }

            result.setText(Double.toString(answer));
        });
    }
}