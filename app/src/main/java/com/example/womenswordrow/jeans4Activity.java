package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class jeans4Activity extends AppCompatActivity {
Button txtjeans4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_jeans4);
        txtjeans4=findViewById(R.id.txtjeans4);
        txtjeans4.setOnClickListener(view->{
            Intent intent=new Intent(this, buyActivity.class);
            startActivity(intent);
        });
    }
}