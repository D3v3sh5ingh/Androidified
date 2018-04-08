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
public class hard_puzzle extends Fragment {
    RecyclerView hard_puzzle_recycler ;
    RecyclerView.Adapter Adapter ;
    RecyclerView.LayoutManager layoutManager ;

    String[] hardPuzzleNames = {"Hard Puzzle 1", "Hard Puzzle 2", "Hard Puzzle 3"};
    String[] hardPuzzleDesc = {"Hard Puzzle 1 desc", "Hard Puzzle 2 desc", "Hard Puzzle 3 desc"};


    public hard_puzzle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hard_puzzle, container, false);
        hard_puzzle_recycler = view.findViewById(R.id.hard_puzzle);
        Adapter = new puzzle_adapter(hardPuzzleNames, hardPuzzleDesc);
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        ViewCompat.setNestedScrollingEnabled(hard_puzzle_recycler,false);
        hard_puzzle_recycler.setLayoutManager(layoutManager);
        hard_puzzle_recycler.setAdapter(Adapter);
        hard_puzzle_recycler.setHasFixedSize(true);
        return view;
    }

}
