package com.example.quiz_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class selectActivity extends AppCompatActivity {
    Button c,cpp,java,python;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        c = findViewById(R.id.c);
        cpp = findViewById(R.id.cpp);
        java = findViewById(R.id.java);
        python = findViewById(R.id.python);
        findViewById(R.id.image_back).setOnClickListener(
                a -> finish()
        );

        c.setOnClickListener(view -> startActivity(new Intent(selectActivity.this,ClangActivity.class)));
        java.setOnClickListener(view -> startActivity(new Intent(selectActivity.this,playActivity.class)));
        cpp.setOnClickListener(view -> startActivity(new Intent(new Intent(selectActivity.this,CppLangActivity.class))));
        python.setOnClickListener(view -> startActivity(new Intent(selectActivity.this,pythonActivity.class)));

    }
}