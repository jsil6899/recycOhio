package com.example.jenni.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayPlastic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_plastic);
//        TextView textView=findViewById(R.id.textView5);
//        textView.setText("All about recycling plastic containers!");
    }
    public void one(View view){
        Intent intent=new Intent(DisplayPlastic.this,one.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);
    }
    public void three(View view){
        Intent intent=new Intent(DisplayPlastic.this,three.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);
    }
    public void five(View view){
        Intent intent=new Intent(DisplayPlastic.this,five.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);
    }
    public void seven(View view){
        Intent intent=new Intent(DisplayPlastic.this,seven.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);
    }

}
