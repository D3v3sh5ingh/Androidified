package com.example.dev.androidified;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;



public class Easy_Game_fragment extends Fragment {

    Integer[] GamePhotos = {R.drawable.shivam_kumar_small, R.drawable.devesh, R.drawable.mohit, R.drawable.harshit,
            R.drawable.shivang, R.drawable.vaishali, R.drawable.sameep, R.drawable.yash} ;
    RecyclerView RV_easy ;
    RecyclerView.Adapter Adapter ;
    RecyclerView.LayoutManager layoutManager ;

    public Easy_Game_fragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view =  inflater.inflate(R.layout.fragment_easy__game_fragment, container, false);
        RV_easy = (RecyclerView)view.findViewById(R.id.easy_game_fragment_Recycler) ;
        Adapter = new EGAdapter(GamePhotos) ;
        layoutManager= new GridLayoutManager(getActivity(),2) ;
        ViewCompat.setNestedScrollingEnabled(RV_easy,false);
        RV_easy.setLayoutManager(layoutManager);
        RV_easy.setAdapter(Adapter);
        RV_easy.setHasFixedSize(true);
        return view ;
    }


}
