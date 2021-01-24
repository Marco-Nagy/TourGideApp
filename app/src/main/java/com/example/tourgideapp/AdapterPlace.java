package com.example.tourgideapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AdapterPlace extends RecyclerView.Adapter<AdapterPlace.PlaceViewHolder>{
Context context;
ArrayList<Places> placesList;
PlaceIn placeIn;
    private static final String TAG = "AdapterPlace";
    public AdapterPlace(Context context, ArrayList<Places> placesList, PlaceIn placeIn) {
        this.context = context;
        this.placesList = placesList;
        this.placeIn = placeIn;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        PlaceViewHolder placeViewHolder= new PlaceViewHolder(view);
        return placeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        holder.imageView.setImageResource(placesList.get(position).imageView);
        holder.title.setText(placesList.get(position).title);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeIn.ViewData(placesList.get(position));
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
            imageView=itemView.findViewById(R.id.imageView);
            title=itemView.findViewById(R.id.title);
        }
    }
}
