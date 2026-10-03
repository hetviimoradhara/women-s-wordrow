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

public class shorts_Activity extends AppCompatActivity {
ImageView sh1,sh2,sh3,sh4,sh5,sh6,sh7,sh8;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shorts);
        sh1=findViewById(R.id.sh1);
        sh2=findViewById(R.id.sh2);
        sh3=findViewById(R.id.sh3);
        sh4=findViewById(R.id.sh4);
        sh5=findViewById(R.id.sh5);
        sh6=findViewById(R.id.sh6);
        sh7=findViewById(R.id.sh7);
        sh8=findViewById(R.id.sh8);
        sh1.setOnClickListener(v -> {
            Intent intent=new Intent(this, short1Activity.class);
            startActivity(intent);
        });
        sh2.setOnClickListener(v -> {
            Intent intent=new Intent(this, short2Activity.class);
            startActivity(intent);
        });
        sh3.setOnClickListener(v -> {
            Intent intent=new Intent(this, short3Activity.class);
            startActivity(intent);
        });
        sh4.setOnClickListener(v -> {
            Intent intent=new Intent(this, short4Activity.class);
            startActivity(intent);
        });
        sh5.setOnClickListener(v -> {
            Intent intent=new Intent(this, short5Activity.class);
            startActivity(intent);
        });
        sh6.setOnClickListener(v -> {
            Intent intent=new Intent(this, short6Activity.class);
            startActivity(intent);
        });
        sh7.setOnClickListener(v -> {
            Intent intent=new Intent(this, short7Activity.class);
            startActivity(intent);
        });
        sh8.setOnClickListener(v -> {
            Intent intent=new Intent(this, short8Activity.class);
            startActivity(intent);
        });


    }
}