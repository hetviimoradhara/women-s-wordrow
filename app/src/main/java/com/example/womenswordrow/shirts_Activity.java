package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class shirts_Activity extends AppCompatActivity {
ImageView s1,s2,s3,s4,s5,s6,s7,s8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shirts);
        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        s3=findViewById(R.id.s3);
        s4=findViewById(R.id.s4);
        s5=findViewById(R.id.s5);
        s6=findViewById(R.id.s6);
        s7=findViewById(R.id.s7);
        s8=findViewById(R.id.s8);
        s1.setOnClickListener(v -> {
            Intent intent=new Intent(this, shirt1Activity.class);
            startActivity(intent);
        });
        s2.setOnClickListener(v -> {
            Intent intent=new Intent(this, shirt2Activity.class);
            startActivity(intent);
        });
        s3.setOnClickListener(v -> {
            Intent intent=new Intent(this, shirt3Activity.class);
            startActivity(intent);
        });
        s4.setOnClickListener(v -> {
            Intent intent=new Intent(this, shirt4Activity.class);
            startActivity(intent);
        });
        s5.setOnClickListener(v -> {
            Intent intent=new Intent(this, shirt5Activity.class);
            startActivity(intent);
        });
        s6.setOnClickListener(v -> {
            Intent intent=new Intent(this, shirt6Activity.class);
            startActivity(intent);
        });
        s7.setOnClickListener(v -> {
            Intent intent=new Intent(this, shirt7Activity.class);
            startActivity(intent);
        });
        s8.setOnClickListener(v -> {
            Intent intent=new Intent(this, shirt8Activity.class);
            startActivity(intent);
        });

    }
}