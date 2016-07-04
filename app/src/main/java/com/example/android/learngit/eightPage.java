package com.example.android.learngit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class eightPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_page);

        //Next Button code
        ImageButton btnPage9 = (ImageButton) findViewById(R.id.btnPage9);
        btnPage9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eightPage.this, ninthPage.class);
                startActivity(intent);
            }
        });

        // Previous button code
        ImageButton btnPage9Prev = (ImageButton) findViewById(R.id.btnPage9Prev);
        btnPage9Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eightPage.this, seventhPage.class);
                startActivity(intent);
            }
        });
    }

}
