package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class partywear_Activity extends AppCompatActivity {
ImageView pw1,pw2,pw3,pw4,pw5,pw6,pw7,pw8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_partywear);
        pw1=findViewById(R.id.pw1);
        pw2=findViewById(R.id.pw2);
        pw3=findViewById(R.id.pw3);
        pw4=findViewById(R.id.pw4);
        pw5=findViewById(R.id.pw5);
        pw6=findViewById(R.id.pw6);
        pw7=findViewById(R.id.pw7);
        pw8=findViewById(R.id.pw8);
        pw1.setOnClickListener(v -> {
            Intent intent=new Intent(this, partywear1Activity.class);
            startActivity(intent);
        });
        pw2.setOnClickListener(v -> {
            Intent intent=new Intent(this, partywear2Activity.class);
            startActivity(intent);
        });
        pw3.setOnClickListener(v -> {
            Intent intent=new Intent(this, partywear3Activity.class);
            startActivity(intent);
        });
        pw4.setOnClickListener(v -> {
            Intent intent=new Intent(this, partywear4Activity.class);
            startActivity(intent);
        });
        pw5.setOnClickListener(v -> {
            Intent intent=new Intent(this, partywear5Activity.class);
            startActivity(intent);
        });
        pw6.setOnClickListener(v -> {
            Intent intent=new Intent(this, partywear6Activity.class);
            startActivity(intent);
        });
        pw7.setOnClickListener(v -> {
            Intent intent=new Intent(this, partywear7Activity.class);
            startActivity(intent);
        });
        pw8.setOnClickListener(v -> {
            Intent intent=new Intent(this, partywear8Activity.class);
            startActivity(intent);
        });
        
    }
}