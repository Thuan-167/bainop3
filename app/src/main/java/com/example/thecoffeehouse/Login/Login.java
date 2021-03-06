package com.example.thecoffeehouse.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.thecoffeehouse.R;

public class Login extends AppCompatActivity {

    Button signin_244, signup_244;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        signin_244 = findViewById(R.id.btn_signin);
        signup_244= findViewById(R.id.btnSignUp);

        signin_244.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Login has been clicked", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Login.this, SignIn_Activity.class);
                startActivity(intent);

            }
        });

        signup_244.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login.this, SignUp_Activity.class);
                startActivity(intent);

            }
        });

    }
}