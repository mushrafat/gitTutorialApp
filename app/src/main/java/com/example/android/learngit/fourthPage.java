package com.example.android.learngit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class fourthPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page);

        //Next Button code
        ImageButton btnPage5 = (ImageButton) findViewById(R.id.btnPage5);
        btnPage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fourthPage.this, fifthPage.class);
                startActivity(intent);
            }
        });

        // Previous button code
        ImageButton btnPage5Prev = (ImageButton) findViewById(R.id.btnPage5Prev);
        btnPage5Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fourthPage.this, thirdPage.class);
                startActivity(intent);
            }
        });
    }

}
