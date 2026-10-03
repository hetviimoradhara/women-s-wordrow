package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class skirts_Activity extends AppCompatActivity {
ImageView sk1,sk2,sk3,sk4,sk5,sk6,sk7,sk8;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_skirts);
        sk1=findViewById(R.id.sk1);
        sk2=findViewById(R.id.sk2);
        sk3=findViewById(R.id.sk3);
        sk4=findViewById(R.id.sk4);
        sk5=findViewById(R.id.sk5);
        sk6=findViewById(R.id.sk6);
        sk7=findViewById(R.id.sk7);
        sk8=findViewById(R.id.sk8);
        sk1.setOnClickListener(v -> {
            Intent intent=new Intent(this, skirts1Activity.class);
            startActivity(intent);
        });
        sk2.setOnClickListener(v -> {
            Intent intent=new Intent(this, skirts2Activity.class);
            startActivity(intent);
        });
        sk3.setOnClickListener(v -> {
            Intent intent=new Intent(this, skirts3Activity.class);
            startActivity(intent);
        });
        sk4.setOnClickListener(v -> {
            Intent intent=new Intent(this, skirts4Activity.class);
            startActivity(intent);
        });
        sk5.setOnClickListener(v -> {
            Intent intent=new Intent(this, skirts5Activity.class);
            startActivity(intent);
        });
        sk6.setOnClickListener(v -> {
            Intent intent=new Intent(this, skirts6Activity.class);
            startActivity(intent);
        });
        sk7.setOnClickListener(v -> {
            Intent intent=new Intent(this, skirts7Activity.class);
            startActivity(intent);
        });
        sk8.setOnClickListener(v -> {
            Intent intent=new Intent(this, skirts8Activity.class);
            startActivity(intent);
        });
    }
}