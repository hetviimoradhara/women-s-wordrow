package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tshirt_Activity extends AppCompatActivity {
ImageView ts1,ts2,ts3,ts4,ts5,ts6,ts7,ts8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tshirt);
        ts1=findViewById(R.id.ts1);
        ts2=findViewById(R.id.ts2);
        ts3=findViewById(R.id.ts3);
        ts4=findViewById(R.id.ts4);
        ts5=findViewById(R.id.ts5);
        ts6=findViewById(R.id.ts6);
        ts7=findViewById(R.id.ts7);
        ts8=findViewById(R.id.ts8);
        ts1.setOnClickListener(v -> {
            Intent intent=new Intent(this, tshirt1Activity.class);
            startActivity(intent);
        });
        ts2.setOnClickListener(v -> {
            Intent intent=new Intent(this, tshirt2Activity.class);
            startActivity(intent);
        });
        ts3.setOnClickListener(v -> {
            Intent intent=new Intent(this, tshirt3Activity.class);
            startActivity(intent);
        });
        ts4.setOnClickListener(v -> {
            Intent intent=new Intent(this, tshirt4Activity.class);
            startActivity(intent);
        });
        ts5.setOnClickListener(v -> {
            Intent intent=new Intent(this, tshirt5Activity.class);
            startActivity(intent);
        });
        ts6.setOnClickListener(v -> {
            Intent intent=new Intent(this, tshirt6Activity.class);
            startActivity(intent);
        });
        ts7.setOnClickListener(v -> {
            Intent intent=new Intent(this, tshirt7Activity.class);
            startActivity(intent);
        });
        ts8.setOnClickListener(v -> {
            Intent intent=new Intent(this, tshirt8Activity.class);
            startActivity(intent);
        });
    }
}