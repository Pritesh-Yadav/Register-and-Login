package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username, password;
    TextView btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView btn= findViewById(R.id.textViewSignUp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

        // try block to hide Action bar
        try {
            this.getSupportActionBar().hide();
        }
        // catch block to handle NullPointerException
        catch (NullPointerException e) {
        }

        login = (Button) findViewById(R.id.btnlogin);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });


        btn = findViewById(R.id.textViewSignUp);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    public void login(){
        String user = username.getText().toString().trim();
        String pwd = password.getText().toString().trim();

        if (user.equals("")){
            Toast.makeText(this, "Username is Blank", Toast.LENGTH_LONG).show();
        }
        else if (pwd.equals("")){
            Toast.makeText(this, "Password is Blank", Toast.LENGTH_LONG).show();
        }
        else if (user.equals("pritesh") && pwd.equals("pritesh")){
            Toast.makeText(this, "Username and Password matched", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Username and Password do not matched!", Toast.LENGTH_LONG).show();
        }
    }
}
