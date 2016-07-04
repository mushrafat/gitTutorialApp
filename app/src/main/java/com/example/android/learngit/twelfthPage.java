package com.example.android.learngit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class twelfthPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelfth_page);


        // Previous button code
        ImageButton btnPage12Prev = (ImageButton) findViewById(R.id.btnPage12Prev);
        btnPage12Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(twelfthPage.this, eleventhPage.class);
                startActivity(intent);
            }
        });
    }

}
