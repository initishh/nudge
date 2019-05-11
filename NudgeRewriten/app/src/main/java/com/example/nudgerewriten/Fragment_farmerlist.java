package com.example.nudgerewriten;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.content.ContentValues.TAG;

public class Fragment_farmerlist extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragement_farmerlist, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView farmer_contact_recycler =view.findViewById(R.id.farmer_contact_recycler);
        farmer_contact_recycler.setLayoutManager(new LinearLayoutManager(view.getContext()));
        String[] data = {"Aest 1","Aest 2","Aest 3","Aest 4","Best 1","Best 2","Best 3","Cest 3","Dest 4","Eest 5","Fest 6","Gest 7","Hest 8","Iest 9"};
        farmer_contact_recycler.setAdapter(new Adapter_contact_list_1(data));
    }
}