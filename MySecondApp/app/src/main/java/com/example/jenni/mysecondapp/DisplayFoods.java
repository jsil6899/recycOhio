package com.example.jenni.mysecondapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class DisplayFoods extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_foods);
        //TextView textView=findViewById(R.id.textView2);
        //textView.setText("All about recycling food containers!");
    }
    public void displayPizzaBoxes(View view){
        Intent intent=new Intent(DisplayFoods.this,PizzaBoxes.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);
    }
    public void displayCerealBoxes(View view){
        Intent intent=new Intent(DisplayFoods.this,CerealBoxes.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);
    }
    public void displayToGoBoxes(View view){
        Intent intent=new Intent(DisplayFoods.this,ToGoBoxes.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);
    }

    public void displayChipBags(View view){
        Intent intent=new Intent(DisplayFoods.this,ChipBags.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);
    }



}
