package com.onegmail.sedrick.planet_homework;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private RVAdapter adapter;
    private List<Planet> planets;
    private String []planet_names;
    private String []planet_des;
    private int[] planet_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        rv= (RecyclerView) findViewById(R.id.rv);

        LinearLayoutManager manager=new LinearLayoutManager(this);
        rv.setLayoutManager(manager);

        adapter=new RVAdapter(loadPlanet());
        rv.setAdapter(adapter);
}
    private List<Planet> loadPlanet() {
        planets=new ArrayList<>();
        Resources res=getResources();
        planet_names=res.getStringArray(R.array.planet_names);
        planet_des=res.getStringArray(R.array.planet_descriptions);
        planet_img=res.getIntArray(R.array.planet_images);
        for (int i = 0; i <9 ; i++) {
           planets.add(new Planet(planet_names[i],planet_des[i],planet_img[i]));
        }
        return  planets;
    }


}
