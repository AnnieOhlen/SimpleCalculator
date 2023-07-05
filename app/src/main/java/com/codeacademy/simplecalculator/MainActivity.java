package com.codeacademy.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//My imports.
import android.view.View;
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

        final EditText firstNumber = findViewById(R.id.number1);
        final EditText secondNumber = findViewById(R.id.number2);

        final RadioGroup operators = findViewById(R.id.operators);
        final RadioButton add = findViewById(R.id.add);
        final RadioButton subtract = findViewById(R.id.subtract);
        final RadioButton multiply = findViewById(R.id.multiply);
        final RadioButton divide = findViewById(R.id.divide);

        final Button equals = findViewById(R.id.equals);
        final TextView result = findViewById(R.id.result);

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final double firstNumberValue = Double.parseDouble(firstNumber.getText().toString());
                final double secondNumberValue = Double.parseDouble(secondNumber.getText().toString());

                final int operatorButtonId = operators.getCheckedRadioButtonId();

                Double answer;

                if (operatorButtonId == add.getId()) {
                    answer = firstNumberValue + secondNumberValue;
                } else if (operatorButtonId == subtract.getId()){
                    answer = firstNumberValue - secondNumberValue;
                } else if (operatorButtonId == multiply.getId()) {
                    answer = firstNumberValue * secondNumberValue;
                } else if (operatorButtonId == divide.getId()) {
                    answer = firstNumberValue / secondNumberValue;
                }else {
                    answer = 0.0;
                }

                result.setText(answer.toString());
            }
        });
    }
}