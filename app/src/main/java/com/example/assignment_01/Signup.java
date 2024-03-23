package com.example.assignment_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    AppCompatButton acb_signup, acb_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        acb_signup = findViewById(R.id.acb_signup);
        acb_exit = findViewById(R.id.acb_exit);

        acb_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this, HomePage.class);
                startActivity(intent);
                finish();
            }
        });

        acb_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }

        });
    }
}