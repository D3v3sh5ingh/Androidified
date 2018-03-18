package com.example.dev.androidified;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by shiva on 18-03-2018.
 */

public class itemsViewHolder extends RecyclerView.ViewHolder {
    TextView Tv_dev_name, Tv_dev_skills ;
    ImageView imageView;
    public itemsViewHolder(View view) {
        super(view);
        Tv_dev_name = view.findViewById(R.id.tv_name);
        Tv_dev_skills = view.findViewById(R.id.tv_skill);
        imageView = view.findViewById(R.id.shivam_kumar_small);
        // photo_links = view.findViewById(R.id.shivam_kumar_small) ;
    }
}