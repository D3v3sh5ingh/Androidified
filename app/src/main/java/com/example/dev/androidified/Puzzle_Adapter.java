package com.example.dev.androidified;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Puzzle_Adapter extends RecyclerView.Adapter<Puzzle_Adapter.PuzzleViewHolder> {
    String[] puzzletitles;
    String[] puzzledesc;
    public Puzzle_Adapter(String[] puzzletitles, String[] puzzledesc) {
        this.puzzledesc = puzzledesc;
        this.puzzletitles= puzzletitles;
    }

    @Override

    public PuzzleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_puzzle,parent, false);
        PuzzleViewHolder viewHolder = new PuzzleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PuzzleViewHolder holder, int position) {
        holder.puzzlename.setText(puzzletitles[position]);
        holder.puzzledesc.setText(puzzledesc[position]);
    }

    @Override
    public int getItemCount() {
        return puzzledesc.length;
    }

    public static class PuzzleViewHolder extends RecyclerView.ViewHolder{
        TextView puzzlename, puzzledesc;
        public PuzzleViewHolder(View itemView) {
            super(itemView);
            puzzlename = itemView.findViewById(R.id.puzzle_name);
            puzzledesc = itemView.findViewById(R.id.puzzle_desc);
        }
    }
}
