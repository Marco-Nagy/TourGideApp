package com.example.tourgideapp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class PlacesFragment extends Fragment {
RecyclerView recyclerView;
ArrayList<Places>placesList =new ArrayList<>();

    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_places, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AdapterPlace adapterPlace =new AdapterPlace(getContext(),placesList);
        recyclerView= view.findViewById(R.id.recycler_view_places);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapterPlace);
        setPlaces();

    }
public void setPlaces() {
    placesList.add(new Places(R.drawable.pyramids_of_giza, R.string.pyramids_title, R.string.pyramids_description));
    placesList.add(new Places(R.drawable.nile_cruising, R.string.nile_cruising_title, R.string.nile_cruising_description));
    placesList.add(new Places(R.drawable.alexandria, R.string.alexandria_title, R.string.alexandria_description));
    placesList.add(new Places(R.drawable.aswan_nile_view, R.string.aswan_title, R.string.aswan_description));
    placesList.add(new Places(R.drawable.luxor_karnak_temple, R.string.louxor_karnak_temple_title, R.string.louxor_karnak_temple_description));
    placesList.add(new Places(R.drawable.sinai_st_katherines_monastery, R.string.sinai_st_Catherin_title, R.string.aswan_description));
    placesList.add(new Places(R.drawable.thistlegorm_dive_site, R.string.thistlegorm_dive_site_title, R.string.thistlegorm_dive_site_description));
    }


}

