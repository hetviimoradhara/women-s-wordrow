package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
public class login extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(view->{
            Intent intent=new Intent(this, Registration.class);
            startActivity(intent);
        });

    }
}