package com.example.android.learngit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class tenthPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth_page);

        //Next Button code
        ImageButton btnPage11 = (ImageButton) findViewById(R.id.btnPage11);
        btnPage11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tenthPage.this, eleventhPage.class);
                startActivity(intent);
            }
        });

        // Previous button code
        ImageButton btnPage11Prev = (ImageButton) findViewById(R.id.btnPage11Prev);
        btnPage11Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tenthPage.this, ninthPage.class);
                startActivity(intent);
            }
        });
    }

}
