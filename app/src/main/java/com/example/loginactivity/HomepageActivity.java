package com.example.loginactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomepageActivity extends AppCompatActivity {
    Button loginButton, registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        try {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e) {
        }


        loginButton = (Button) findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });

        registerButton = (Button) findViewById(R.id.register);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();
            }
        });
    }
    public void openLoginActivity(){
        Intent intent = new Intent(HomepageActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void openRegisterActivity(){
        Intent intent = new Intent(HomepageActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}

