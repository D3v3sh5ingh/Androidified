package com.example.dev.androidified;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Puzzle_Adapter extends RecyclerView.Adapter<Puzzle_Adapter.PuzzleViewHolder> {
    Integer PuzzlePics[];
    public Puzzle_Adapter(Integer PuzzlePics[]) {
        this.PuzzlePics = PuzzlePics;
    }

    @Override

    public PuzzleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_puzzle,parent, false);
        PuzzleViewHolder viewHolder = new PuzzleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PuzzleViewHolder holder, int position) {
        holder.puzzleImage.setImageResource(PuzzlePics[position]);
    }

    @Override
    public int getItemCount() {
        return PuzzlePics.length;
    }

    public static class PuzzleViewHolder extends RecyclerView.ViewHolder{
        ImageView puzzleImage;
        public PuzzleViewHolder(View itemView) {
            super(itemView);
            puzzleImage = itemView.findViewById(R.id.puzzle_image);
        }
    }
}
