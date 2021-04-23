package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Intent intent = getIntent();
        String text=intent.getStringExtra(MainActivity.EXTRA_TEXT);
        TextView textView= (TextView) findViewById(R.id.textview1);
        textView.setText(text);
    }
}