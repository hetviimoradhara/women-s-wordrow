package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class jeans2Activity extends AppCompatActivity {
Button txtjeans2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_jeans2);
        txtjeans2=findViewById(R.id.txtjeans2);
        txtjeans2.setOnClickListener(view->{
            Intent intent=new Intent(this, buyActivity.class);
            startActivity(intent);
        });
    }
}