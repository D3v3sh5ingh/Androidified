package com.example.dev.androidified;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shivam Kumar on 17-03-2018.
 */

public class Adapter_aboutus extends RecyclerView.Adapter<Adapter_aboutus.RecyclerViewHolder> {

    String[] about_dev_name,about_dev_skill;
    Integer[] images;
    public Adapter_aboutus(String[] about_dev_name,String[] about_dev_skill,Integer[] images)
    {
        this.about_dev_name = about_dev_name ;
        this.about_dev_skill = about_dev_skill ;
                this.images = images;

    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.aboutus_row_layout,parent,false) ;
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view) ;
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.Tv_dev_name.setText(about_dev_name[position]);
        holder.Tv_dev_skills.setText(about_dev_skill[position]);
        holder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return about_dev_name.length;
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
      TextView Tv_dev_name, Tv_dev_skills ;
        ImageView imageView;
        public RecyclerViewHolder(View view) {
            super(view);
            Tv_dev_name = view.findViewById(R.id.tv_name);
            Tv_dev_skills = view.findViewById(R.id.tv_skill);
            imageView = view.findViewById(R.id.pic);

        }
    }
}