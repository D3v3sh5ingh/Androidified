package com.example.dev.androidified;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Shivam Kumar on 21-03-2018.
 */

public class ViewPager_Adapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments = new ArrayList<>() ;
    ArrayList<String> tabTitles = new ArrayList<>();

    public void  addFragments(Fragment fragment, String tabTitles){
        this.fragments.add(fragment) ;
        this.tabTitles.add(tabTitles) ;

    }
    public ViewPager_Adapter(FragmentManager fm)
    {
        super(fm);

    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles.get(position) ;
    }
}
