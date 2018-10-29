package com.example.taruc.lab2bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Lab2BMI extends AppCompatActivity {
private EditText editTextHeight, editTextWeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_bmi);

        editTextHeight = findViewById(R.id.editTextHeight);
        editTextWeight = findViewById(R.id.editTextWeight);
    }

    public void calculateBMI(View view){
        Intent intent = new Intent(this,SecondActivity.class);

        double weight, height;
        if(TextUtils.isEmpty(editTextWeight.getText())){
            editTextWeight.setError("Please enter body weight");
        }
        if(TextUtils.isEmpty(editTextHeight.getText())){
            editTextHeight.setError("Please enter body height");
        }
        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());

        double bmi = weight / (height * height);

        intent.putExtra("BMI",bmi);
    }

}
