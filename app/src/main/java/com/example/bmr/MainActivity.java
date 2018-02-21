package com.example.bmr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText weightText = (EditText) findViewById(R.id.editText1);
        final EditText heightText = (EditText) findViewById(R.id.editText2);
        final EditText ageText = (EditText) findViewById(R.id.editText3);
        final TextView resultText = (TextView) findViewById(R.id.editText4);
        final Button calculateBMR = (Button) findViewById(R.id.calc);

        calculateBMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            double weight;
            double height;
            double age;
            double bmr;

            weight = Double.parseDouble(weightText.getText().toString());
            height = Double.parseDouble(heightText.getText().toString());
            age = Double.parseDouble(ageText.getText().toString());

            bmr = (66 + ((13.75 * weight)) + (5 * height) - (6.8 * age));

            resultText.setText(String.valueOf(bmr));

            }
        });


    }






}

