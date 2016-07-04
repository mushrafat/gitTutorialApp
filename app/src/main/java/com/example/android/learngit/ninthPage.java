package com.example.android.learngit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class ninthPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth_page);

        //Next Button code
        ImageButton btnPage10 = (ImageButton) findViewById(R.id.btnPage10);
        btnPage10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ninthPage.this, tenthPage.class);
                startActivity(intent);
            }
        });

        // Previous button code
        ImageButton btnPage10Prev = (ImageButton) findViewById(R.id.btnPage10Prev);
        btnPage10Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ninthPage.this, eightPage.class);
                startActivity(intent);
            }
        });
    }

}
