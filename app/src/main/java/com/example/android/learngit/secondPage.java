package com.example.android.learngit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class secondPage extends AppCompatActivity {

    private ImageButton btnPage3;
    private ImageButton btnPage3Prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        //Next Button code
        ImageButton btnPage3 = (ImageButton) findViewById(R.id.btnPage3);
        btnPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secondPage.this, thirdPage.class);
                startActivity(intent);
            }
        });

        // Previous button code
        ImageButton btnPage3Prev = (ImageButton) findViewById(R.id.btnPage3Prev);
        btnPage3Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secondPage.this, firstPage.class);
                startActivity(intent);
            }
        });

    }

}
