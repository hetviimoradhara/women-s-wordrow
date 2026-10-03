package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
public class Logo_activity extends AppCompatActivity {
    private static final int SPLASH_SCREE_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Logo_activity.this, login.class);
                startActivity(i);
                finish();
            }
        },SPLASH_SCREE_TIME_OUT);
    }
}