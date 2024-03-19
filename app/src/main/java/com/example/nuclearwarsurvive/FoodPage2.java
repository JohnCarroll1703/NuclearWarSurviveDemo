package com.example.nuclearwarsurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class FoodPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_page2);
        Button next = (Button) findViewById(R.id.foodpage3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { gotoNextPage(); }
        });
    }
    public void gotoNextPage(){
        Intent intent = new Intent(this, FoodPage3.class);
        startActivity(intent);
    }
}