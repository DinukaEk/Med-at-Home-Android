package lk.sltc.medathome;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {
    private Button viewAll;
    private Button viewVegitables;
    private Button viewFruits;
    private Button viewPlants;
    private Button viewEquipments;
    private Button viewFertilizer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View View = inflater.inflate(R.layout.fragment_home, container, false);
        viewAll = (Button) View.findViewById(R.id.home_view_all);
        viewVegitables = (Button) View.findViewById(R.id.home_view_vegi);
        viewFruits = (Button) View.findViewById(R.id.home_view_fruits);
        viewPlants = (Button) View.findViewById(R.id.home_view_plants);
        viewEquipments = (Button) View.findViewById(R.id.home_view_eq);
        viewFertilizer = (Button) View.findViewById(R.id.home_view_fer);


        viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                Intent intent = new Intent(getActivity(), Home2Activity.class);
                startActivity(intent);
            }
        });

        viewVegitables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                Intent intent = new Intent(getActivity(), ViewVegitablesActivity.class);
                startActivity(intent);
            }
        });

        viewFruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                Intent intent = new Intent(getActivity(), ViewFruitsActivity.class);
                startActivity(intent);
            }
        });

        viewPlants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                Intent intent = new Intent(getActivity(), ViewPlantsActivity.class);
                startActivity(intent);
            }
        });

        viewEquipments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                Intent intent = new Intent(getActivity(), ViewEquipmentsActivity.class);
                startActivity(intent);
            }
        });

        viewFertilizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                Intent intent = new Intent(getActivity(), ViewFertilizerActivity.class);
                startActivity(intent);
            }
        });

        return View;
    }
}