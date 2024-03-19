package com.example.nuclearwarsurvive;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Important extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important);
        Button emergency = (Button) findViewById(R.id.emergency_backpack);
        Button clothes = (Button) findViewById(R.id.whatToWear);
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startEBPage(); }
        });
        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startClothesPage(); }
        });
    }

    public void startEBPage(){
        Intent intent3 = new Intent(this, EmergencyBackpack.class);
        startActivity(intent3);
    }

    public void startClothesPage(){
        Intent intent = new Intent(this, Clothes.class);
        startActivity(intent);
    }
}