package com.example.tourgideapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class DataFragment extends DialogFragment {
    ImageView imageData, imageView2;
    TextView textTitle, textDescription;
    Places places;

    public DataFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_data, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageData = view.findViewById(R.id.image_data);
        imageView2 = view.findViewById(R.id.imageView2);
        textTitle = view.findViewById(R.id.text_title);
        textDescription = view.findViewById(R.id.text_description);
    }


}