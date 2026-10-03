package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class gown_Activity extends AppCompatActivity {
    ImageView g1,g2,g3,g4,g5,g6,g7,g8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gown);
        g1=findViewById(R.id.g1);
        g2=findViewById(R.id.g2);
        g3=findViewById(R.id.g3);
        g4=findViewById(R.id.g4);
        g5=findViewById(R.id.g5);
        g6=findViewById(R.id.g6);
        g7=findViewById(R.id.g7);
        g8=findViewById(R.id.g8);
        g1.setOnClickListener(v -> {
            Intent intent=new Intent(this, gown1Activity.class);
            startActivity(intent);
        });

        g2.setOnClickListener(v -> {
            Intent intent=new Intent(this, gown2Activity.class);
            startActivity(intent);
        });

        g3.setOnClickListener(v -> {
            Intent intent=new Intent(this, gown3Activity.class);
            startActivity(intent);
        });
        g4.setOnClickListener(v -> {
            Intent intent=new Intent(this, gown4Activity.class);
            startActivity(intent);
        });
        g5.setOnClickListener(v -> {
            Intent intent=new Intent(this, gown5Activity.class);
            startActivity(intent);
        });
        g6.setOnClickListener(v -> {
            Intent intent=new Intent(this, gown6Activity.class);
            startActivity(intent);
        });
        g7.setOnClickListener(v -> {
            Intent intent=new Intent(this, gown8Activity.class);
            startActivity(intent);
        });
        g8.setOnClickListener(v -> {
            Intent intent=new Intent(this, gown8Activity.class);
            startActivity(intent);
        });


    }
}