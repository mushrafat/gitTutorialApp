package com.example.android.learngit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class thirdPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);

        //Next Button code
        ImageButton btnPage4 = (ImageButton) findViewById(R.id.btnPage4);
        btnPage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thirdPage.this, fourthPage.class);
                startActivity(intent);
            }
        });

        // Previous button code
        ImageButton btnPage4Prev = (ImageButton) findViewById(R.id.btnPage4Prev);
        btnPage4Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thirdPage.this, secondPage.class);
                startActivity(intent);
            }
        });

    }

}
