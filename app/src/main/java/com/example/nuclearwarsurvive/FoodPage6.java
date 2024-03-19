package com.example.nuclearwarsurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class FoodPage6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_page6);
        Button next = (Button) findViewById(R.id.foodpage7);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openFoodPage7(); }
        });
    }

    public void openFoodPage7(){
        Intent intent = new Intent(this, FoodPage6.class);
        startActivity(intent);
    }
}