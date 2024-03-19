package com.example.nuclearwarsurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class FoodPage3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_page3);
        Button next = (Button) findViewById(R.id.foodpage4);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openFoodPage4(); }
        });
    }

    public void openFoodPage4(){
        Intent intent = new Intent(this, FoodPage4.class);
        startActivity(intent);
    }
}