package com.example.tourgideapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterPlace extends RecyclerView.Adapter<AdapterPlace.PlaceViewHolder> {
    Context context;
    ArrayList<Places> placesList;
    Dialog dialog;
    ImageView imageData, imageView2;
    TextView textTitle, textDescription;
    private static final String TAG = "AdapterPlace";

    public AdapterPlace(Context context, ArrayList<Places> placesList) {
        this.context = context;
        this.placesList = placesList;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        PlaceViewHolder placeViewHolder = new PlaceViewHolder(view);
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.fragment_data);

        return placeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        holder.imageView.setImageResource(placesList.get(position).imageView);
        holder.title.setText(placesList.get(position).title);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageData = dialog.findViewById(R.id.image_data);
                imageView2 = dialog.findViewById(R.id.imageView2);//
                textTitle = dialog.findViewById(R.id.text_title);
                textDescription = dialog.findViewById(R.id.text_description);
                textDescription.setMovementMethod(new ScrollingMovementMethod());
                imageData.setImageResource(placesList.get(position).getImageView());
                imageView2.setImageResource(placesList.get(position).getImage1());
                textTitle.setText(placesList.get(position).getTitle());
                textDescription.setText(placesList.get(position).getDescription());
                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }

    public class PlaceViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;

        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.title);
        }
    }
}
