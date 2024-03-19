package com.example.nuclearwarsurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class FoodPage5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_page5);
        Button next = (Button) findViewById(R.id.foodpage6);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openFoodPage6(); }
        });
    }

    public void openFoodPage6(){
        Intent intent = new Intent(this, FoodPage6.class);
        startActivity(intent);
    }
}