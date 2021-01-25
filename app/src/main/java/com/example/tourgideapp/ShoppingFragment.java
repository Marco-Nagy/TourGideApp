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

public class ShoppingFragment extends Fragment {
    ArrayList<Places> placesList = new ArrayList<>();
    RecyclerView recyclerView;

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shopping, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AdapterPlace adapterPlace = new AdapterPlace(getContext(), placesList);
        recyclerView = view.findViewById(R.id.recycler_view_shopping);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapterPlace);
        setShopping();
    }

    private void setShopping() {
        placesList.add(new Places(R.drawable.mall_of_egypt, R.string.mall_of_egypt_title, R.string.mall_of_egypt_description));
        placesList.add(new Places(R.drawable.mall_of_arabia_cairo, R.string.mall_of_Arabia_Cairo_title, R.string.mall_of_Arabia_Cairo_description));
        placesList.add(new Places(R.drawable.khan_elkhalili, R.string.khan_el_khalili_title, R.string.khan_el_khalili_description));
        placesList.add(new Places(R.drawable.soho_square, R.string.sOHO_Square_title, R.string.sOHO_Square_description));
    }

}