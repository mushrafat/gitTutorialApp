package com.example.android.learngit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class seventhPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_page);

        //Next Button code
        ImageButton btnPage8 = (ImageButton) findViewById(R.id.btnPage8);
        btnPage8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seventhPage.this, eightPage.class);
                startActivity(intent);
            }
        });

        // Previous button code
        ImageButton btnPage8Prev = (ImageButton) findViewById(R.id.btnPage8Prev);
        btnPage8Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(seventhPage.this, sixthPage.class);
                startActivity(intent);
            }
        });
    }

}
