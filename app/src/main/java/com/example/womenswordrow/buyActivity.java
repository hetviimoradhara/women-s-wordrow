package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class buyActivity extends AppCompatActivity {
Button btnsave;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_buy);
        btnsave=findViewById(R.id.btnsave);
        btnsave.setOnClickListener(view->{
            Intent intent=new Intent(this, PaymentActivity.class);
            startActivity(intent);
        });
    }
}