package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class settingActivity extends AppCompatActivity {
   Button btn_play,btn_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        btn_exit=findViewById(R.id.btn_exit);
        btn_play=findViewById(R.id.btn_play);

        btn_exit.setOnClickListener(view -> startActivity(new Intent(settingActivity.this , MainActivity.class)));
        btn_play.setOnClickListener(view -> startActivity(new Intent(settingActivity.this , selectActivity.class)));
    }
}