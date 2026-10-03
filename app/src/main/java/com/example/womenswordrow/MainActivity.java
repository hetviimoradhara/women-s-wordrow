package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
ImageView blazer,croptop,frock,gown,shorts,partywear,jeans,shirts,tshirt,trousers,skirts,kurti_pair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        blazer=findViewById(R.id.blazer);

         blazer.setOnClickListener(v -> {
            Intent intent=new Intent(this, blazer_Activity.class);
            startActivity(intent);
        });
        croptop=findViewById(R.id.croptop);

        croptop.setOnClickListener(v -> {
            Intent intent=new Intent(this, croptop_Activity.class);
            startActivity(intent);
        });
        frock=findViewById(R.id.frock);

        frock.setOnClickListener(v -> {
            Intent intent=new Intent(this, frock_Activity.class);
            startActivity(intent);
        });
        gown=findViewById(R.id.gown);

        gown.setOnClickListener(v -> {
            Intent intent=new Intent(this, gown_Activity.class);
            startActivity(intent);
        });
        shorts=findViewById(R.id.shorts);

        shorts.setOnClickListener(v -> {
            Intent intent=new Intent(this, shorts_Activity.class);
            startActivity(intent);
        });
        partywear=findViewById(R.id.partywear);

        partywear.setOnClickListener(v -> {
            Intent intent=new Intent(this, partywear_Activity.class);
            startActivity(intent);
        });
        jeans=findViewById(R.id.jeans);

        jeans.setOnClickListener(v -> {
            Intent intent=new Intent(this, jeans_Activity.class);
            startActivity(intent);
        });
        shirts=findViewById(R.id.shirts);

        shirts.setOnClickListener(v -> {
            Intent intent=new Intent(this, shirts_Activity.class);
            startActivity(intent);
        });
        tshirt=findViewById(R.id.tshirt);

        tshirt.setOnClickListener(v -> {
            Intent intent=new Intent(this, tshirt_Activity.class);
            startActivity(intent);
        });
        trousers=findViewById(R.id.trousers);

        trousers.setOnClickListener(v -> {
            Intent intent=new Intent(this, trousers_Activity.class);
            startActivity(intent);
        });
        skirts=findViewById(R.id.skirts);

        skirts.setOnClickListener(v -> {
            Intent intent=new Intent(this, skirts_Activity.class);
            startActivity(intent);
        });
        kurti_pair=findViewById(R.id.kurti_pair);

        kurti_pair.setOnClickListener(v -> {
            Intent intent=new Intent(this, kurtipair_Activity.class);
            startActivity(intent);
        });

    }
}