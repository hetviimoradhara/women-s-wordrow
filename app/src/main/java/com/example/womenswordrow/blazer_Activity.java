package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class blazer_Activity extends AppCompatActivity {

    ImageView blazer1,blazer2,blazer3,blazer4,blazer5,blazer6,blazer7,blazer8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_blazer);
        blazer1=findViewById(R.id.blazer1);
        blazer2=findViewById(R.id.blazer2);
        blazer3=findViewById(R.id.blazer3);
        blazer4=findViewById(R.id.blazer4);
        blazer5=findViewById(R.id.blazer5);
        blazer6=findViewById(R.id.blazer6);
        blazer7=findViewById(R.id.blazer7);
        blazer8=findViewById(R.id.blazer8);

        blazer1.setOnClickListener(v -> {
            Intent intent=new Intent(this, blazer1Activity.class);
            startActivity(intent);
        });

        blazer2.setOnClickListener(v -> {
            Intent intent=new Intent(this, blazer2Activity.class);
            startActivity(intent);
        });

        blazer3.setOnClickListener(v -> {
            Intent intent=new Intent(this, blazer3Activity.class);
            startActivity(intent);
        });

        blazer4.setOnClickListener(v -> {
            Intent intent=new Intent(this, blazer4Activity.class);
            startActivity(intent);
        });

        blazer5.setOnClickListener(v -> {
            Intent intent=new Intent(this, blazer5Activity.class);
            startActivity(intent);
        });

        blazer6.setOnClickListener(v -> {
            Intent intent=new Intent(this, blazer6Activity.class);
            startActivity(intent);
        });

        blazer7.setOnClickListener(v -> {
            Intent intent=new Intent(this, blazer7Activity.class);
            startActivity(intent);
        });

        blazer8.setOnClickListener(v -> {
            Intent intent=new Intent(this, blazer8Activity.class);
            startActivity(intent);
        });

    }
}