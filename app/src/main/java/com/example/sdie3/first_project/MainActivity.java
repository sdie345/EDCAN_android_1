package com.example.sdie3.first_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1;
    EditText inputtext1;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        inputtext1 = findViewById(R.id.input_text1);
        button1 = findViewById(R.id.button1);
    }
    public void Click(View v) {
        String s = inputtext1.getText().toString();
        text1.setText(s);
    }
}
