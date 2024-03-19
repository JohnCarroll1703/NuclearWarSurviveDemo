package com.example.nuclearwarsurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class EmergencyBackpack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_backpack);
        Button next = (Button) findViewById(R.id.nextpage);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turnToTheNP();
            }
        });
    }
    public void turnToTheNP(){
        Intent intent4 = new Intent(this, EmergencyBackpack2.class);
        startActivity(intent4);
    }
}