package com.example.dev.androidified;

import android.content.Context;
import android.net.Uri;
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
public class easy_puzzle extends Fragment {

    RecyclerView easy_puzzle_recycler ;
    RecyclerView.Adapter Adapter ;
    RecyclerView.LayoutManager layoutManager ;
    String[] easyPuzzleNames = {"Easy Puzzle 1", "Easy Puzzle 2", "Easy Puzzle 3"};
    String[] easyPuzzleDesc = {"Easy Puzzle 1 desc", "Easy Puzzle 2 desc", "Easy Puzzle 3 desc"};

    public easy_puzzle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_easy_puzzle, container, false);
        easy_puzzle_recycler = view.findViewById(R.id.easy_puzzle);
        Adapter = new puzzle_adapter(easyPuzzleNames, easyPuzzleDesc);
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        ViewCompat.setNestedScrollingEnabled(easy_puzzle_recycler,false);
        easy_puzzle_recycler.setLayoutManager(layoutManager);
        easy_puzzle_recycler.setAdapter(Adapter);
        easy_puzzle_recycler.setHasFixedSize(true);
        return view;
    }

}
