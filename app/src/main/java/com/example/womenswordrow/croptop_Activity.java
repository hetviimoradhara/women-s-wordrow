package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class croptop_Activity extends AppCompatActivity {

    ImageView c1,c2,c3,c4,c5,c6,c7,c8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_croptop);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);
        c7=findViewById(R.id.c7);
        c8=findViewById(R.id.c8);

        c1.setOnClickListener(v -> {
            Intent intent=new Intent(this, croptop1Activity.class);
            startActivity(intent);
        });
        c2.setOnClickListener(v -> {
            Intent intent=new Intent(this, croptop2Activity.class);
            startActivity(intent);
        });
        c3.setOnClickListener(v -> {
            Intent intent=new Intent(this, croptop3Activity.class);
            startActivity(intent);
        });
        c4.setOnClickListener(v -> {
            Intent intent=new Intent(this, croptop4Activity.class);
            startActivity(intent);
        });
        c5.setOnClickListener(v -> {
            Intent intent=new Intent(this, croptop5Activity.class);
            startActivity(intent);
        });
        c6.setOnClickListener(v -> {
            Intent intent=new Intent(this, croptop6Activity.class);
            startActivity(intent);
        });
        c7.setOnClickListener(v -> {
            Intent intent=new Intent(this, croptop7Activity.class);
            startActivity(intent);
        });
        c8.setOnClickListener(v -> {
            Intent intent=new Intent(this, croptop8Activity.class);
            startActivity(intent);
        });

    }
}