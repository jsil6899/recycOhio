package com.example.jenni.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayBottles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_bottles);
        TextView textView=findViewById(R.id.textView3);
        textView.setText("You can recycle water bottles here!");
    }
}
