package com.example.dev.androidified;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class medium_puzzle extends Fragment {
    RecyclerView medium_puzzle_recycler ;
    RecyclerView.Adapter Adapter ;
    RecyclerView.LayoutManager layoutManager ;

    String[] mediumPuzzleNames = {"Medium Puzzle 1", "Medium Puzzle 2", "Medium Puzzle 3"};
    String[] mediumPuzzleDesc = {"Medium Puzzle 1 desc", "Medium Puzzle 2 desc", "Medium Puzzle 3 desc"};


    public medium_puzzle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_medium_puzzle, container, false);
        medium_puzzle_recycler = view.findViewById(R.id.medium_puzzle);
        Adapter = new puzzle_adapter(mediumPuzzleNames, mediumPuzzleDesc);
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        ViewCompat.setNestedScrollingEnabled(medium_puzzle_recycler,false);
        medium_puzzle_recycler.setLayoutManager(layoutManager);
        medium_puzzle_recycler.setAdapter(Adapter);
        medium_puzzle_recycler.setHasFixedSize(true);
        return view;

    }

}
