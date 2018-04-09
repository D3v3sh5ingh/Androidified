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
public class expert_puzzle extends Fragment {
    RecyclerView expert_puzzle_recycler ;
    RecyclerView.Adapter Adapter ;
    RecyclerView.LayoutManager layoutManager ;

    String[] expertPuzzleNames = {"Expert Puzzle 1", "Expert Puzzle 2", "Expert Puzzle 3"};
    String[] expertPuzzleDesc = {"Expert Puzzle 1 desc", "Expert Puzzle 2 desc", "Expert Puzzle 3 desc"};

    public expert_puzzle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_expert_puzzle, container, false);
        expert_puzzle_recycler = view.findViewById(R.id.expert_puzzle);
        Adapter = new puzzle_adapter(expertPuzzleNames, expertPuzzleDesc);
        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        ViewCompat.setNestedScrollingEnabled(expert_puzzle_recycler,false);
        expert_puzzle_recycler.setLayoutManager(layoutManager);
        expert_puzzle_recycler.setAdapter(Adapter);
        expert_puzzle_recycler.setHasFixedSize(true);
        return view;
    }

}
