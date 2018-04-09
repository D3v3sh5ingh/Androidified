package com.example.dev.androidified;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class puzzle extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPager_Adapter viewPagerAdapter;
    TextView scoretext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);
        toolbar = findViewById(R.id.toolbar) ;
        setSupportActionBar(toolbar);
        tabLayout = findViewById(R.id.tab_layout) ;
        viewPager = findViewById(R.id.puzzle_viewpager) ;
        viewPagerAdapter = new ViewPager_Adapter(getSupportFragmentManager()) ;
        viewPagerAdapter.addFragments(new easy_puzzle(), "Easy");
        viewPagerAdapter.addFragments(new medium_puzzle(), "Medium");
        viewPagerAdapter.addFragments(new hard_puzzle(), "Hard");
        viewPagerAdapter.addFragments(new expert_puzzle(), "Expert");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        getSupportActionBar().setTitle("Puzzles");
        scoretext = findViewById(R.id.score);
        scoretext.setText("Your Score is : ");
    }

}
