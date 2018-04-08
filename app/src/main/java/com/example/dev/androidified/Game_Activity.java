package com.example.dev.androidified;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Game_Activity extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar ;
    TabLayout tabLayout ;
    ViewPager viewPager ;
    ViewPager_Adapter viewPagerAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar) ;
        setSupportActionBar(toolbar);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout) ;
        viewPager = (ViewPager)findViewById(R.id.viewpager) ;
        viewPagerAdapter = new ViewPager_Adapter(getSupportFragmentManager()) ;
        viewPagerAdapter.addFragments(new Easy_Game_fragment(), "Easy");
        viewPagerAdapter.addFragments(new Medium_Game_fragment(), "Medium");
        viewPagerAdapter.addFragments(new Hard_Game_fragment(), "Hard");
        viewPagerAdapter.addFragments(new Expert_Game_fragment(), "Expert");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
