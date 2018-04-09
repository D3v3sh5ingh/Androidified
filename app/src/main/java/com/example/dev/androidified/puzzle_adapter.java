package com.example.dev.androidified;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class puzzle_adapter extends RecyclerView.Adapter<puzzle_adapter.puzzleViewHolder> {
    String[] puzzleNames, puzzleDesc;

    public puzzle_adapter(String[] puzzleNames, String[] puzzleDesc) {
        this.puzzleNames = puzzleNames;
        this.puzzleDesc = puzzleDesc;
    }

    @Override
    public puzzleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_puzzle, parent, false);
        puzzleViewHolder viewHolder = new puzzleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(puzzleViewHolder holder, int position) {
    holder.puzzleName.setText(puzzleNames[position]);
    holder.puzzleDesc.setText(puzzleDesc[position]);
    }

    @Override
    public int getItemCount() {
        return puzzleNames.length;
    }

    public static class puzzleViewHolder extends RecyclerView.ViewHolder {
        TextView puzzleName, puzzleDesc;
        public puzzleViewHolder(View view) {
            super(view);
            puzzleName = itemView.findViewById(R.id.puzzle_name);
            puzzleDesc = itemView.findViewById(R.id.puzzle_desc);
        }
    }
}
