package com.example.dev.androidified;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class about_team extends AppCompatActivity {
    TextView desc, heading;
    private RecyclerView recyclerView ;
    private RecyclerView.Adapter adapter ;
    private RecyclerView.LayoutManager layoutManager ;

    List<DeveloperLink> DevList ;

 String[] dev_name = {"Shivam kumar", "Devesh Singh", "Mohit Ranjan", "Harshit Gupta", "Shivang Garg", "Vaishali Kashyap", "Sameep Yadav", "Yash Gautam"} ;
 Integer[] images = {R.drawable.shivam_kumar_small, R.drawable.devesh, R.drawable.mohit, R.drawable.harshit,
        R.drawable.shivang, R.drawable.vaishali, R.drawable.sameep, R.drawable.yash};

  // String[] dev_skills = {"Web and Android Developer","Web and Android Developer","Android Developer","Android Developer","Web and Android Developer","Android Developer","Android Developer","Android Developer" } ;
/*
   String[] githubLink = {
           "https://github.com/shivamkumard107",
           "https://www.github.com/d3v3sh5ingh",
           "https://github.com/MohitR1999",
           "https://github.com/hg2199",
           "https://github.com/shivanggarg1998",
           "https://www.github.com/d3v3sh5ingh",
           "https://github.com/Sam9905",
           "https://github.com/yashgautam1221"
   };*/
   String[] GmailLink = {
           "shivam.kumard107@gmail.com",
           "d3v3sh.singh@gmail.com",
           "mohitr1999@gmail.com",
           "harshitgupta.219@gmail.com",
           "shivanggarg1998@gmail.com",
           "kashyapvaishali1998@gmail.com",
           "Sameepyadav@gmail.com",
           "yash.gautam0003@gmail.com"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_team);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("About the team");


        recyclerView = findViewById(R.id.aboutteam_recycler) ;
        adapter = new Adapter_aboutus(dev_name,images,GmailLink, this) ;
        layoutManager = new GridLayoutManager(this,2);
        ViewCompat.setNestedScrollingEnabled(recyclerView, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);


    }

}
