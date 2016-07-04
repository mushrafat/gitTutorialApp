package com.example.android.learngit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class sixthPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_page);

        //Next Button code
        ImageButton btnPage7 = (ImageButton) findViewById(R.id.btnPage7);
        btnPage7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sixthPage.this, seventhPage.class);
                startActivity(intent);
            }
        });

        // Previous button code
        ImageButton btnPage7Prev = (ImageButton) findViewById(R.id.btnPage7Prev);
        btnPage7Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sixthPage.this, fifthPage.class);
                startActivity(intent);
            }
        });
    }

}
