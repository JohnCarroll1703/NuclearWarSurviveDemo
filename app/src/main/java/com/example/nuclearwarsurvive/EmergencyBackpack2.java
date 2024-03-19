package com.example.nuclearwarsurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class EmergencyBackpack2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_backpack2);
        Button important2 = (Button) findViewById(R.id.nextpage2);
        important2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startNewImportantPage(); }
        });
    }

    public void startNewImportantPage(){
        Intent intent = new Intent(this, EmergencyBackpack3.class);
        startActivity(intent);
    }

}