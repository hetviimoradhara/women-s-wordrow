package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class trousers5Activity extends AppCompatActivity {
Button txttrouser5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_trousers5);
        txttrouser5=findViewById(R.id.txttrouser5);
        txttrouser5.setOnClickListener(view->{
            Intent intent=new Intent(this, buyActivity.class);
            startActivity(intent);
        });
    }
}