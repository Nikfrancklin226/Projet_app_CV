package com.example.cvemploiandroid.httpconfig;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cvemploiandroid.R;

public class LoginActivity extends AppCompatActivity {
    private Button loginBt;
    private EditText emailtxt;
    private EditText passwordtxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginBt = (Button) findViewById(R.id.btnlogin);
        emailtxt = (EditText) findViewById(R.id.inputEmail);
        passwordtxt = (EditText) findViewById(R.id.inputPassword);

        loginBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Recuperation de la saisie de l'email
                String email = emailtxt.getText().toString();
                //Recuperation de la saisie du mot de passe
                String password = passwordtxt.getText().toString();
                //Toast.makeText(MainActivity.this,email, Toast.LENGTH_SHORT).show();
                if(email.equals("nikfrancklin2020@gmail.com") && password.equals("FRANCKLIN2022")){
                    Intent i = new Intent(LoginActivity.this,WelcomeActivity.class);
                    startActivity(i);
                }else {
                    Toast.makeText(LoginActivity.this, "email incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}