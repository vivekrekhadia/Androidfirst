package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT="com.example.first.EXTRA_TEXT";
    private Button btn1;
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        btn2=(Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

    }
    public void openActivity2(){
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);

    }
    public void openActivity3(){
        EditText edit1=(EditText) findViewById(R.id.edit1);
        String text=edit1.getText().toString();
        Intent intent = new Intent(this,activity_3.class);
        intent.putExtra(EXTRA_TEXT, (Parcelable) edit1);
        startActivity(intent);

    }
}