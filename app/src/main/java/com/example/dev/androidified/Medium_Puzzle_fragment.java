package com.example.dev.androidified;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Medium_Puzzle_fragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager manager;
    String[] titles= {"Medium Puzzle 1", "Medium Puzzle 2", "Medium Puzzle 3", "Medium Puzzle 4"};
    String[] descriptions = {
            "This is the description of Medium puzzle #1",
            "This is the description of Medium puzzle #2",
            "This is the description of Medium puzzle #3",
            "This is the description of Medium puzzle #4"
    };

    public Medium_Puzzle_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hard__puzzle_fragment,container, false);
        recyclerView = view.findViewById(R.id.recyclerView_puzzle);
        adapter = new Puzzle_Adapter(titles, descriptions);
        manager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        ViewCompat.setNestedScrollingEnabled(recyclerView, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }

}
