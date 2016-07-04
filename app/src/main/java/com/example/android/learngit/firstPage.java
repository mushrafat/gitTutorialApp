package com.example.android.learngit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class firstPage extends AppCompatActivity {
    private ImageButton btnPage2;
    private ImageButton btnPage2Prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        //Next Button code
        ImageButton btnPage2 = (ImageButton) findViewById(R.id.btnPage2);
        btnPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstPage.this, secondPage.class);
                startActivity(intent);
            }
        });

        // Previous button code
        ImageButton btnPage2Prev = (ImageButton) findViewById(R.id.btnPage2Prev);
        btnPage2Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}
