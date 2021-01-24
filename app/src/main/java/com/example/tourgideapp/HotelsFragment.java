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

public class HotelsFragment extends Fragment implements PlaceIn {
    RecyclerView recyclerView;
    PlaceIn placeIn;
    ArrayList<Places> placesList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hoteles, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AdapterPlace adapterPlace = new AdapterPlace(getContext(), placesList, placeIn);
        recyclerView = view.findViewById(R.id.recycler_view_hotels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapterPlace);
        setHotels();
    }

    public void setHotels() {
        placesList.add(new Places(R.drawable.marriott_mena_house, R.string.pyramids_title, R.string.pyramids_description));
        placesList.add(new Places(R.drawable.fairmont_nile_city, R.string.fairmont_nile_City_title, R.string.fairmont_nile_City_description));
        placesList.add(new Places(R.drawable.four_seasons_san_stefano, R.string.four_seasons_San_Stefano_title, R.string.four_seasons_San_Stefano_description));
        placesList.add(new Places(R.drawable.m_venpick_resort_aswan, R.string.mövenpick_resort_Aswan_title, R.string.mövenpick_resort_Aswan_description));
        placesList.add(new Places(R.drawable.sofitel_winter_palace_luxor, R.string.sofitel_winter_palace_Luxor_title, R.string.sofitel_winter_palace_Luxor_description));
        placesList.add(new Places(R.drawable.four_seasons_resort_sharm_el_sheikh, R.string.four_seasons_resort_sharm_El_Sheikh_title, R.string.four_seasons_resort_sharm_El_Sheikh_description));
    }





    @Override
    public void ViewData(Places places) {
        if (getActivity() instanceof MainActivity) {
            ((MainActivity)getActivity()).Data(places);
        }
    }
}