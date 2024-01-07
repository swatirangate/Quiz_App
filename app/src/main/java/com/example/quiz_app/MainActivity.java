package com.example.quiz_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  Button play,setting,exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.play);
        setting = findViewById(R.id.setting);
        exit = findViewById(R.id.exit);

        play.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,selectActivity.class)));

        setting.setOnClickListener(view -> startActivity(new Intent(MainActivity.this , settingActivity.class)));

        exit.setOnClickListener(view -> this.finishAffinity());
    }


    }
