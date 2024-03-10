package com.example.myapplication;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button textButton = (Button) findViewById(R.id.button2);
        textButton.setOnClickListener(v -> {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("Hello World!");
        });

        Button colorButton = (Button) findViewById(R.id.button4);
        colorButton.setOnClickListener(v -> {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setTextColor(Color.RED);
        });
    }
}