package com.example.dev.androidified;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class about_team extends AppCompatActivity {
    TextView desc, heading;
    private RecyclerView recyclerView ;
    private RecyclerView.Adapter adapter ;
    private RecyclerView.LayoutManager layoutManager ;

    String[] dev_name = {"Shivam kumar", "Devesh Singh", "Mohit Ranjan", "Harshit Gupta", "Shivang Garg", "Shubham", "Vaishali", "Sameep Yadav", "Yash Gautam"} ;
    Integer[] photos = {R.drawable.shivam_kumar_small, R.drawable.devesh, R.drawable.mohit, R.drawable.harshith,
            R.drawable.shivang, R.drawable.shubham, R.drawable.vaishali, R.drawable.sameep, R.drawable.yash_gautam};

    String[] dev_skills = {"Web and Android Developer","Web and Android Developer","Android Developer","Android Developer","Web and Android Developer","Web Developer","Android Developer","Android Developer","Android Developer" } ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_team);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("About the team");


        recyclerView = findViewById(R.id.aboutteam_recycler) ;
        adapter = new Adapter_aboutus(dev_name,dev_skills,photos) ;
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}
