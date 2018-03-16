package com.example.dev.androidified;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
/**
 * Created by Devesh on 10-Mar-18.
 */


public class CustomAdapter extends BaseAdapter {

    Context context;
    Integer logos[];
    LayoutInflater inflter;
    public CustomAdapter(Context applicationContext, Integer[] logos) {
        this.context = applicationContext;
        this.logos = logos;
        inflter = (LayoutInflater.from(context));
    }
    @Override
    public int getCount() {
        return logos.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView icon;
        if(view == null)
        {
            view = inflter.inflate(R.layout.aboutus_gridview, null); // inflate the layout
            icon = view.findViewById(R.id.imageView);
        }
        else
        {
            icon = view.findViewById(R.id.imageView);
        }

         // get the reference of ImageView
        icon.setImageResource(logos[i]); // set logo images
        return icon;
    }
}
