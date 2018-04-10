package com.example.sdie3.first_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by sdie3 on 2018-04-10.
 */

public class anotherClass extends AppCompatActivity {
    TextView textview5go;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        textview5 = findViewById(R.id.text5);
        Intent intent = getIntent();
        textview5.setText(intent.getStringExtra("key"));
    }
}
