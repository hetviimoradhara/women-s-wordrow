package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class frock_Activity extends AppCompatActivity {
    ImageView f1,f2,f3,f4,f5,f6,f7,f8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_frock);
        f1=findViewById(R.id.f1);
        f2=findViewById(R.id.f2);
        f3=findViewById(R.id.f3);
        f4=findViewById(R.id.f4);
        f5=findViewById(R.id.f5);
        f6=findViewById(R.id.f6);
        f7=findViewById(R.id.f7);
        f8=findViewById(R.id.f8);

        f1.setOnClickListener(v -> {
            Intent intent=new Intent(this, frock1Activity.class);
            startActivity(intent);
        });

        f2.setOnClickListener(v -> {
            Intent intent=new Intent(this, frock2Activity.class);
            startActivity(intent);
        });

        f3.setOnClickListener(v -> {
            Intent intent=new Intent(this, frock3Activity.class);
            startActivity(intent);
        });
        f4.setOnClickListener(v -> {
            Intent intent=new Intent(this, frock4Activity.class);
            startActivity(intent);
        });
        f5.setOnClickListener(v -> {
            Intent intent=new Intent(this, frock5Activity.class);
            startActivity(intent);
        });
        f6.setOnClickListener(v -> {
            Intent intent=new Intent(this, frock6Activity.class);
            startActivity(intent);
        });
        f7.setOnClickListener(v -> {
            Intent intent=new Intent(this, frock8Activity.class);
            startActivity(intent);
        });
        f8.setOnClickListener(v -> {
            Intent intent=new Intent(this, frock8Activity.class);
            startActivity(intent);
        });
    }
}