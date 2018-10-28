package com.example.jenni.mysecondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="com.example.jenni.mysecondapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    public void sendMessage (View view){
//        Intent intent=new Intent(this,DisplayMessageActivity.class);
//        EditText editText=(EditText) findViewById(R.id.editText);
//        String message=editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE,message);
//        startActivity(intent);
//    }

    public void displayFoods(View view){
        Intent intent=new Intent(this,DisplayFoods.class);
        intent.putExtra("FOODS","[INSERT STUFF ABOUT RECYCLING FOOD CONTAINERS");
        startActivity(intent);

    }
    public void displayLiquids(View view){
        Intent intent=new Intent(this,DisplayLiquids.class);
        intent.putExtra("LIQUIDS","[INSERT STUFF ABOUT RECYCLING LIQUID CONTAINERS");
        startActivity(intent);

    }
    public void displayPlastics(View view){
        Intent intent=new Intent(this,DisplayPlastic.class);
        intent.putExtra("PLASTICS","[INSERT STUFF ABOUT RECYCLING PLASTICS");
        startActivity(intent);

    }
    public void displayOther(View view){
        Intent intent=new Intent(this,DisplayOther.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);

    }
    public void displayLiquids2(View view){
        Intent intent=new Intent(this,Liquids2.class);
        intent.putExtra("OTHER","[INSERT STUFF ABOUT RECYCLING OTHER STUFF");
        startActivity(intent);

    }





}
