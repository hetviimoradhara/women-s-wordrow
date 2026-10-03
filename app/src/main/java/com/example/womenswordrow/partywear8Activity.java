package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class partywear8Activity extends AppCompatActivity {
Button txtpw8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_partywear8);
        txtpw8=findViewById(R.id.txtpw8);
        txtpw8.setOnClickListener(view->{
            Intent intent=new Intent(this, buyActivity.class);
            startActivity(intent);
        });
    }
}