package com.onegmail.sedrick.planet_homework;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ОБИ on 26.08.2016.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PlanetViewHolder> {

    private List<Planet> planets;

    public RVAdapter(List<Planet> planets) {
        this.planets = planets;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_planet,parent,false);
        PlanetViewHolder viewHolder=new PlanetViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PlanetViewHolder holder, int position) {
        holder.name.setText(planets.get(position).getName());
        holder.description.setText(planets.get(position).getDescription());
        holder.image.setImageResource(planets.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return planets.size();
    }

    public class PlanetViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView name;
        TextView description;
        ImageView image;

        public PlanetViewHolder(View itemView) {
            super(itemView);
            cv= (CardView) itemView.findViewById(R.id.cv);
            name= (TextView) itemView.findViewById(R.id.planet_name);
            description= (TextView) itemView.findViewById(R.id.planet_description);
            image= (ImageView) itemView.findViewById(R.id.planet_image);
        }
    }
}
