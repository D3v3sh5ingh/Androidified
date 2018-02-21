package com.example.dev.androidified;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class about_team extends AppCompatActivity {
    TextView desc, heading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_team);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("About the team");
        desc=findViewById(R.id.descript);
        desc.setText(R.string.desc_content);
        heading = findViewById(R.id.head);
        heading.setText("Core Team");
    }

}
