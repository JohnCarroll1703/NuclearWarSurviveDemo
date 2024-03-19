package com.example.nuclearwarsurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class EmergencyBackpack3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_backpack3);
        ImageButton apoteke = (ImageButton) findViewById(R.id.apoteke);
        ImageButton food = (ImageButton) findViewById(R.id.food);
        apoteke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openApoteke(); }
        });
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openFood(); }
        });
    }
    public void openApoteke(){
        Intent intent = new Intent(this, ApotekePage.class);
        startActivity(intent);
    }
    public void openFood(){
        Intent intent = new Intent(this, FoodPage.class);
        startActivity(intent);
    }
}