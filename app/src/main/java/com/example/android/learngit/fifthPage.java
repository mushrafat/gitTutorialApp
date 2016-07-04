package com.example.android.learngit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class fifthPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_page);

        //Next Button code
        ImageButton btnPage6 = (ImageButton) findViewById(R.id.btnPage6);
        btnPage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fifthPage.this, sixthPage.class);
                startActivity(intent);
            }
        });

        // Previous button code
        ImageButton btnPage6Prev = (ImageButton) findViewById(R.id.btnPage6Prev);
        btnPage6Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fifthPage.this, fourthPage.class);
                startActivity(intent);
            }
        });
    }

}
