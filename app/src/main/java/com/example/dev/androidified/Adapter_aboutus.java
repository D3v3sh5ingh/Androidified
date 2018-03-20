package com.example.dev.androidified;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Shivam Kumar on 17-03-2018.
 */

public class Adapter_aboutus extends RecyclerView.Adapter<Adapter_aboutus.RecyclerViewHolder> {

   // List<DeveloperLink> DevList = new ArrayList<>() ;
    String[] about_dev_name,about_dev_skill;
    Integer[] images;
    String[] GmailLinks ;
    public Adapter_aboutus(String[] about_dev_name,Integer[] images,String[] Gmail_links)
    {
        this.about_dev_name = about_dev_name ;
        //this.about_dev_skill = about_dev_skill ;
        this.images = images;
        this.GmailLinks = Gmail_links ;


    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.aboutus_row_layout,parent,false) ;
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view) ;
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        holder.Tv_dev_name.setText(about_dev_name[position]);
        //holder.Tv_dev_skills.setText(about_dev_skill[position]);
        holder.imageView.setImageResource(images[position]);
        holder.iv_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   startGmail(position) ;
            }

        });
    }
    private void startGmail(int position) {
        if(position==0){
            Log.i("shivam","gmail") ;
            /*Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                    "mailto", "abc@gmail.com", null));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "This is my subject text");
            context.startActivity(Intent.createChooser(emailIntent, null));*/
        }else if (position==1){
            Log.i("devesh","gmail") ;
        }else if (position==2){
            Log.i("mohit","gmail") ;
        }else if (position==3){
            Log.i("Harshith","gmail") ;
        }else if(position==4){
            Log.i("Shivang","gmail") ;
        }else if (position==5){
            Log.i("Vaishali","gmail") ;
        }else if (position==6){
            Log.i("Sameep","gmail") ;
        }else if (position==7){
            Log.i("Yash","gmail") ;
        }
    }

    @Override
    public int getItemCount() {
        return about_dev_name.length;
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
      TextView Tv_dev_name, Tv_dev_skills ;
        ImageView imageView;
        ImageView iv_gmail ;
        public RecyclerViewHolder(View view) {
            super(view);
            Tv_dev_name = view.findViewById(R.id.tv_name);
           // Tv_dev_skills = view.findViewById(R.id.tv_skill);
            imageView = view.findViewById(R.id.pic);
            iv_gmail = view.findViewById(R.id.iv_gmail) ;

        }
    }
}