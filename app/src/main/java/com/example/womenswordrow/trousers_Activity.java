package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class trousers_Activity extends AppCompatActivity {
ImageView t1,t2,t3,t4,t5,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_trousers);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        t6=findViewById(R.id.t6);
        t7=findViewById(R.id.t7);
        t8=findViewById(R.id.t8);
        t1.setOnClickListener(v -> {
            Intent intent=new Intent(this, trousers1Activity.class);
            startActivity(intent);
        });
        t2.setOnClickListener(v -> {
            Intent intent=new Intent(this, trousers2Activity.class);
            startActivity(intent);
        });
        t3.setOnClickListener(v -> {
            Intent intent=new Intent(this, trousers3Activity.class);
            startActivity(intent);
        });
        t4.setOnClickListener(v -> {
            Intent intent=new Intent(this, trousers4Activity.class);
            startActivity(intent);
        });
        t5.setOnClickListener(v -> {
            Intent intent=new Intent(this, trousers5Activity.class);
            startActivity(intent);
        });
        t6.setOnClickListener(v -> {
            Intent intent=new Intent(this, trousers6Activity.class);
            startActivity(intent);
        });
        t7.setOnClickListener(v -> {
            Intent intent=new Intent(this, trousers7Activity.class);
            startActivity(intent);
        });
        t8.setOnClickListener(v -> {
            Intent intent=new Intent(this, trousers8Activity.class);
            startActivity(intent);
        });
    }
}