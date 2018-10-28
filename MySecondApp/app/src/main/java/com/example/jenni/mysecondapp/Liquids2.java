package com.example.jenni.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Liquids2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liquids2);
    }


    public void shampoo(View view){
        Intent intent=new Intent(Liquids2.this,shampoo.class);
        intent.putExtra("Water Bottles Yes","Yes, you can recycle water bottles!");
        startActivity(intent);
    }
    public void detergent(View view){
        Intent intent=new Intent(Liquids2.this,detergent.class);
        intent.putExtra("Water Bottles Yes","Yes, you can recycle water bottles!");
        startActivity(intent);
    }
    public void solution(View view){
        Intent intent=new Intent(Liquids2.this,solution.class);
        intent.putExtra("Water Bottles Yes","Yes, you can recycle water bottles!");
        startActivity(intent);
    }
    public void jugs(View view){
        Intent intent=new Intent(Liquids2.this,jugs.class);
        intent.putExtra("Water Bottles Yes","Yes, you can recycle water bottles!");
        startActivity(intent);
    }
}
