package com.example.nuclearwarsurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class FoodPage4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_page4);
        Button next = (Button) findViewById(R.id.foodpage5);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openFoodPage5(); }
        });
    }
    public void openFoodPage5(){
        Intent intent = new Intent(this, FoodPage5.class);
        startActivity(intent);
    }
}