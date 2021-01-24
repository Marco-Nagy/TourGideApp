package com.example.tourgideapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment implements PlaceIn {
    ArrayList<Places> placesList = new ArrayList<>();
    RecyclerView recyclerView;
    PlaceIn placeIn;

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_restaurants, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AdapterPlace adapterPlace = new AdapterPlace(getContext(), placesList, placeIn);
        recyclerView = view.findViewById(R.id.recycler_view_restaurants);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapterPlace);
        setRestaurants();
    }

    public void setRestaurants() {
        placesList.add(new Places(R.drawable.sobhy_kaber, R.drawable.sobhi1, R.string.sobhy_Kaber_title, R.string.sobhy_Kaber_description));
        placesList.add(new Places(R.drawable.kebdet_el_prince, R.drawable.kebda1, R.string.kebdet_el_prince_title, R.string.kebdet_el_prince_description));
        placesList.add(new Places(R.drawable.koshary_abou_atrek, R.drawable.koshary, R.string.koshary_Abou_ATrek_title, R.string.koshary_Abou_ATrek_description));
        placesList.add(new Places(R.drawable.white_and_blue_restaurant, R.drawable.white_food, R.string.white_and_blue_title, R.string.white_and_blue_description));
        placesList.add(new Places(R.drawable.el_dokka_restaurant, R.drawable.el_dokka_food, R.string.el_dokka_title, R.string.el_dokka_and_blue_description));
        placesList.add(new Places(R.drawable.al_sahaby_lane_restaurant, R.drawable.alsahaby_lane, R.string.al_sahaby_lane_title, R.string.al_sahaby_lane_description));
    }

    @Override
    public void ViewData(Places places) {
        if (getActivity() instanceof MainActivity) {
            ((MainActivity)getActivity()).Data(places);
        }
    }
}