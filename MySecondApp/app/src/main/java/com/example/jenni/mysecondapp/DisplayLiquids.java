package com.example.jenni.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayLiquids extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_liquids);
    }

    public void displayWaterBottleYes(View view){
        Intent intent=new Intent(DisplayLiquids.this,WaterBottleYes.class);
        intent.putExtra("Water Bottles Yes","Yes, you can recycle water bottles!");
        startActivity(intent);
    }
    public void displayCoffeeCups(View view){
        Intent intent=new Intent(DisplayLiquids.this,CoffeeCups.class);
        intent.putExtra("Water Bottles Yes","Yes, you can recycle water bottles!");
        startActivity(intent);
    }
    public void displayGlassBottles(View view){
        Intent intent=new Intent(DisplayLiquids.this,GlassBottles.class);
        intent.putExtra("Water Bottles Yes","Yes, you can recycle water bottles!");
        startActivity(intent);
    }
    public void displaySodaCans(View view){
        Intent intent=new Intent(DisplayLiquids.this,SodaCans.class);
        intent.putExtra("Water Bottles Yes","Yes, you can recycle water bottles!");
        startActivity(intent);
    }
}
