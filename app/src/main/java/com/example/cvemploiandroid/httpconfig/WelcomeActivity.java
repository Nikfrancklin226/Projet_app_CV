package com.example.cvemploiandroid.httpconfig;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cvemploiandroid.R;
import com.example.cvemploiandroid.model.retrofit.ListActivity;

public class WelcomeActivity extends AppCompatActivity {
    private Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(otherActivity);
                finish();
             }
            });

            }
    }



