package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class jeans_Activity extends AppCompatActivity {
    ImageView j1,j2,j3,j4,j5,j6,j7,j8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_jeans);
        j1=findViewById(R.id.j1);
        j2=findViewById(R.id.j2);
        j3=findViewById(R.id.j3);
        j4=findViewById(R.id.j4);
        j5=findViewById(R.id.j5);
        j6=findViewById(R.id.j6);
        j7=findViewById(R.id.j7);
        j8=findViewById(R.id.j8);
        j1.setOnClickListener(v -> {
            Intent intent=new Intent(this, jeans1Activity.class);
            startActivity(intent);
        });
        j2.setOnClickListener(v -> {
            Intent intent=new Intent(this, jeans2Activity.class);
            startActivity(intent);
        });
        j3.setOnClickListener(v -> {
            Intent intent=new Intent(this, jeans3Activity.class);
            startActivity(intent);
        });
        j4.setOnClickListener(v -> {
            Intent intent=new Intent(this, jeans4Activity.class);
            startActivity(intent);
        });
        j5.setOnClickListener(v -> {
            Intent intent=new Intent(this, jeans5Activity.class);
            startActivity(intent);
        });
        j6.setOnClickListener(v -> {
            Intent intent=new Intent(this, jeans6Activity.class);
            startActivity(intent);
        });
        j7.setOnClickListener(v -> {
            Intent intent=new Intent(this, jeans7Activity.class);
            startActivity(intent);
        });
        j8.setOnClickListener(v -> {
            Intent intent=new Intent(this, jeans8Activity.class);
            startActivity(intent);
        });
        }
}