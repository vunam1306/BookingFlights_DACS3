package com.example.bookingflights_dacs3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import Adapter.FuncionAdapter;
import Domain.FuncitonDomain;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterFuncion, adapterIntroduce;
    private RecyclerView recyclerViewFuncionList, recyclerViewIntroduceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookingflight);

//        recyclerViewFuncionList();

    }

    private void recyclerViewFuncionList() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewFuncionList = findViewById(R.id.recyclerViewFuncion);
        recyclerViewFuncionList.setLayoutManager(linearLayoutManager);

        ArrayList<FuncitonDomain> funcitonList = new ArrayList<>();
        funcitonList.add(new FuncitonDomain("Plane", "plane"));
        funcitonList.add(new FuncitonDomain("Hotel", "hotel"));
        funcitonList.add(new FuncitonDomain("Flight Schedules", "schedule"));
        funcitonList.add(new FuncitonDomain("Support", "support"));

        adapterFuncion = new FuncionAdapter(funcitonList);
        recyclerViewFuncionList.setAdapter(adapterFuncion);

    }
}