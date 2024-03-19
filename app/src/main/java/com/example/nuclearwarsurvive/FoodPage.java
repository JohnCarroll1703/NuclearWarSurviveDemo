package com.example.nuclearwarsurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class FoodPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_page);
        Button next = (Button) findViewById(R.id.foodpage2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startFoodPage2(); }
        });
    }

    public void startFoodPage2(){
        Intent intent = new Intent(this, FoodPage2.class);
        startActivity(intent);
    }
}