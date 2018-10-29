package com.example.taruc.lab2bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private ImageView imageViewBMI;
    private TextView textViewStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageViewBMI = findViewById(R.id.imageViewBMI);
        textViewStatus = findViewById(R.id.textViewBMIStatus);

        Intent intent = getIntent();

        double bmi = intent.getDoubleExtra("BMI",0);
        if(bmi > 24.5){
            imageViewBMI.setImageResource(R.drawable.over);
            textViewStatus.setText("OverWeight");
        }
        else if(bmi < 18.5){
            imageViewBMI.setImageResource(R.drawable.over);
            textViewStatus.setText("UnderWeight");
        }
        else{
            imageViewBMI.setImageResource(R.drawable.over);
            textViewStatus.setText("Normal");
        }
    }
}
