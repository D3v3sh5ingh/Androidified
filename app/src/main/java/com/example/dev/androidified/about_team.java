package com.example.dev.androidified;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class about_team extends AppCompatActivity {
    TextView desc, heading;
    GridView simpleGrid;
    Integer logos[] = {R.drawable.dev1, R.drawable.dev2, R.drawable.dev3, R.drawable.dev4,
            R.drawable.dev5, R.drawable.dev6, R.drawable.dev7, R.drawable.dev8, R.drawable.dev9,
            R.drawable.dev10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Log.v("about_team.java", "In the about_team.java class");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_team);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("About the team");
        desc=findViewById(R.id.descript);
        desc.setText(R.string.desc_content);
        heading = findViewById(R.id.head);
        heading.setText("Core Team");
        //Log.v("Text set", "The Grid view hasn't initialised yet");

        simpleGrid = (GridView) findViewById(R.id.gridview); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        CustomAdapter customAdapter = new CustomAdapter(about_team.this, logos);
        simpleGrid.setAdapter(customAdapter);
        // implement setOnItemClickListener event on GridView
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(about_team.this, SecondActivity.class);
                intent.putExtra("image", logos[position]); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });


    }
}
