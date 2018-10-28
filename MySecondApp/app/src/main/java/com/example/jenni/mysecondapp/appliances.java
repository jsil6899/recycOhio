package com.example.jenni.mysecondapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class appliances extends AppCompatActivity {
    Context ctxt=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appliances);
    }


    public void accessMap(View view){
        Intent intent=new Intent(ctxt,ApplianceMap.class);
        startActivity(intent);
}


}
