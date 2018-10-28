package com.example.jenni.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayOther extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_other);
//        TextView textView=findViewById(R.id.textView7);
//        textView.setText("All about recycling other materials!");
    }
    public void tech(View view){
        Intent intent=new Intent(DisplayOther.this,tech.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);
    }
    public void appliances(View view){
        Intent intent=new Intent(DisplayOther.this,appliances.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);
    }
    public void shoppingBags(View view){
        Intent intent=new Intent(DisplayOther.this,shoppingBags.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);
    }
    public void paper(View view){
        Intent intent=new Intent(DisplayOther.this,paper.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);
    }
}
