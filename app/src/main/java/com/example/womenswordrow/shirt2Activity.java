package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class shirt2Activity extends AppCompatActivity {
Button txtshirt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shirt2);
        txtshirt2=findViewById(R.id.txtshirt2);
        txtshirt2.setOnClickListener(view->{
            Intent intent=new Intent(this, buyActivity.class);
            startActivity(intent);
        });
    }
}