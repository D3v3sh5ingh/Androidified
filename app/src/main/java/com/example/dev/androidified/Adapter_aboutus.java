package com.example.dev.androidified;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;


public class Adapter_aboutus extends RecyclerView.Adapter<Adapter_aboutus.RecyclerViewHolder> {

   // List<DeveloperLink> DevList = new ArrayList<>() ;
    String[] about_dev_name,about_dev_skill;
    Integer[] images;
    String[] GmailLinks;
    String[] GithubLink;
    String[] FacebookLink;
    Context context;
    public Adapter_aboutus(String[] about_dev_name,Integer[] images,String[] Gmail_links,String[] githubLink
            ,String[] facebookLink, Context context)
    {
        this.about_dev_name = about_dev_name ;
        //this.about_dev_skill = about_dev_skill ;
        this.images = images;
        this.GmailLinks = Gmail_links ;
        this.GithubLink=githubLink;
        this.FacebookLink=facebookLink;
        this.context = context;

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
        holder.iv_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGithub(position) ;
            }

        });
        if(position!=5)
        holder.iv_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {startFacebook(position);
            }
        });
        else holder.iv_facebook.setVisibility(View.INVISIBLE);
    }

    public void sendMail(String link)
    {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto",link, null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, " ");
        context.startActivity(Intent.createChooser(emailIntent, null));
    }
    private void startGmail(int position) {
        if(position==0)
        {
            sendMail(GmailLinks[0]);
        }
        else if (position==1)
        {
            sendMail(GmailLinks[1]);
        }
        else if (position==2)
        {
            sendMail(GmailLinks[2]);
        }
        else if (position==3)
        {
            sendMail(GmailLinks[3]);
        }
        else if(position==4){
            sendMail(GmailLinks[4]);
        }
        else if (position==5)
        {
            sendMail(GmailLinks[5]);
        }
        else if (position==6)
        {
            sendMail(GmailLinks[6]);
        }
        else if (position==7)
        {
            sendMail(GmailLinks[7]);
        }
    }
    private void startGithub(int position) {
            if(position==0){
                OpenGithub(GithubLink[0]);
            }
            if(position==1){
                OpenGithub(GithubLink[1]);
            }
            else if(position==2){
                OpenGithub(GithubLink[2]);
            }
            else if(position==3){
                OpenGithub(GithubLink[3]);
            }
            else if(position==4){
                OpenGithub(GithubLink[4]);
            }
            else if(position==5){
                OpenGithub(GithubLink[5]);
            }
            else if(position==6){
                OpenGithub(GithubLink[6]);
            }
            else if(position==7){
                OpenGithub(GithubLink[7]);
            }

    }

    private void startFacebook(int position) {
        if(position==0){
            OpenFacebook(FacebookLink[0]);
        }
        if(position==1){
            OpenFacebook(FacebookLink[1]);
        }
        else if(position==2){
            OpenFacebook(FacebookLink[2]);
        }
        else if(position==3){
            OpenFacebook(FacebookLink[3]);
        }
        else if(position==4){
            OpenFacebook(FacebookLink[4]);
        }
        else if(position==5){
            OpenFacebook(FacebookLink[4]);
        }
        else if(position==6){
            OpenFacebook(FacebookLink[6]);
        }
        else if(position==7){
            OpenFacebook(FacebookLink[7]);
        }

    }

    private void OpenGithub(String links)
    {
        Intent browserIntent  = new Intent(Intent.ACTION_VIEW, Uri.parse(links));
        context.startActivity(Intent.createChooser(browserIntent, null));

    }
   //To Directly open Facebook profiles in App(if installed) @author hg2199
    private void OpenFacebook(String links)
    {   PackageManager packageManager = context.getPackageManager();
        Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
        String facebookUrl = links;
        if(links==null) ;
        boolean activated=false;
        //Checks whether app present or not @author hg2199
        try {
            activated = packageManager.getApplicationInfo("com.facebook.katana", 0).enabled;
            //Assigns the app url
            if (activated) {
                String inital_part = "fb://facewebmodal/f?href=";
                facebookUrl = inital_part + links;

            }
        }catch (PackageManager.NameNotFoundException e){
            facebookUrl=links;
        }
        facebookIntent.setData(Uri.parse(facebookUrl));
        //Intent chooser=Intent.createChooser(facebookIntent,"Choose");
        //context.startActivity(facebookIntent);
        context.startActivity(Intent.createChooser(facebookIntent, null));
    }


    @Override
    public int getItemCount() {
        return about_dev_name.length;
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
      TextView Tv_dev_name, Tv_dev_skills ;
        ImageView imageView;
        ImageView iv_gmail ;
        ImageView iv_github;
        ImageView iv_facebook;
        public RecyclerViewHolder(View view) {
            super(view);
            Tv_dev_name = view.findViewById(R.id.tv_name);
           // Tv_dev_skills = view.findViewById(R.id.tv_skill);
            imageView = view.findViewById(R.id.pic);
            iv_gmail = view.findViewById(R.id.iv_gmail) ;
            iv_github = view.findViewById(R.id.iv_github) ;
            iv_facebook = view.findViewById(R.id.iv_facebook);

        }
    }
}