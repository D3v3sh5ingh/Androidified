package com.example.dev.androidified;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Shivam Kumar on 25-03-2018.
 */

public class EGAdapter extends RecyclerView.Adapter<EGAdapter.EasyGameViewHolder> {
    Integer[] GamePhotos ;
    public EGAdapter(Integer[] gamePhotos) {
        this.GamePhotos = gamePhotos ;
    }

    @Override
    public EasyGameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_easy_game,parent,false) ;
        EasyGameViewHolder viewHolder= new EasyGameViewHolder(view) ;
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(EasyGameViewHolder holder,final int position) {
        holder.GameImage.setImageResource(GamePhotos[position]);

    }



    @Override
    public int getItemCount() {
        return GamePhotos.length ;
    }
  public static class EasyGameViewHolder extends RecyclerView.ViewHolder {
        ImageView GameImage ;
        public EasyGameViewHolder(View view) {
            super(view);
            GameImage = itemView.findViewById(R.id.game_photo) ;
        }
}

}

