package com.example.nuclearwarsurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class PageTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);
        Button important = (Button) findViewById(R.id.important);
        important.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openImportantPage(); }
        });
    }

    public void openImportantPage(){
        Intent intent2 = new Intent(this, Important.class);
        startActivity(intent2);
    }
}