package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class kurtipair_Activity extends AppCompatActivity {
    ImageView k1,k2,k3,k4,k5,k6,k7,k8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kurtipair);

        k1=findViewById(R.id.k1);
        k2=findViewById(R.id.k2);
        k3=findViewById(R.id.k3);
        k4=findViewById(R.id.k4);
        k5=findViewById(R.id.k5);
        k6=findViewById(R.id.k6);
        k7=findViewById(R.id.k7);
        k8=findViewById(R.id.k8);
        k1.setOnClickListener(v -> {
            Intent intent=new Intent(this, kurtipair1Activity.class);
            startActivity(intent);
        });
        k2.setOnClickListener(v -> {
            Intent intent=new Intent(this, kurtipair2Activity.class);
            startActivity(intent);
        });
        k3.setOnClickListener(v -> {
            Intent intent=new Intent(this, kurtipair3Activity.class);
            startActivity(intent);
        });
        k4.setOnClickListener(v -> {
            Intent intent=new Intent(this, kurtipair4Activity.class);
            startActivity(intent);
        });
        k5.setOnClickListener(v -> {
            Intent intent=new Intent(this, kurtipair5Activity.class);
            startActivity(intent);
        });
        k6.setOnClickListener(v -> {
            Intent intent=new Intent(this, kurtipair6Activity.class);
            startActivity(intent);
        });
        k7.setOnClickListener(v -> {
            Intent intent=new Intent(this, kurtipair7Activity.class);
            startActivity(intent);
        });
        k8.setOnClickListener(v -> {
            Intent intent=new Intent(this, kurtipair8Activity.class);
            startActivity(intent);
        });
    }
}