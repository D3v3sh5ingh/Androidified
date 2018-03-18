package com.example.dev.androidified;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
/**
 * Created by Shivam Kumar on 17-03-2018.
 */

public class Adapter_aboutus extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final String TAG = Adapter_aboutus.class.getSimpleName();
    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;
    private List<ItemObject> itemObjects;
    public Adapter_aboutus(List<ItemObject> itemObjects)
    {

        this.itemObjects = itemObjects;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == 0) {
            View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_layout, parent, false);
            return new HeaderViewHolder(layoutView);
        } else{
            View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.aboutus_row_layout, parent, false);
            return new itemsViewHolder(layoutView);
        }

    }

    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {
        ItemObject mObject = itemObjects.get(position);
        if(holder instanceof HeaderViewHolder){
            ((HeaderViewHolder) holder).headerTitle.setText(mObject.getName());
        }else if (holder instanceof itemsViewHolder ){
            ((itemsViewHolder) holder).Tv_dev_name.setText(mObject.getName());
            ((itemsViewHolder) holder).Tv_dev_skills.setText(mObject.getSkill());
            ((itemsViewHolder) holder).imageView.setImageResource(mObject.getNo());
        }
    }

    @Override
    public int getItemCount() {
        return itemObjects.size();
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }


    }
