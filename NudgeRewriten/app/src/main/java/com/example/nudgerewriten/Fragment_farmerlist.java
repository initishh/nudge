package com.example.nudgerewriten;

import android.app.SearchManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import static android.content.ContentValues.TAG;

public class Fragment_farmerlist extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
        return inflater.inflate(R.layout.fragement_farmerlist, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView farmer_contact_recycler =view.findViewById(R.id.farmer_contact_recycler);
        Toolbar farmerlist_toolbar = view.findViewById(R.id.farmerlist_toolbar);

        farmer_contact_recycler.setLayoutManager(new LinearLayoutManager(view.getContext()));
        String[] data = {"Andrew","Arya","Anthony","Adnan","Bob","Brandon","Brandy","Castor","Denvers","Erwin","Farhaan","Gunther","Haris","Indy"};

        SearchView farmerlist_searchview = view.findViewById(R.id.farmerlist_searchview);
        farmerlist_searchview.setIconifiedByDefault(false);
        farmerlist_searchview.setQueryHint(getString(R.string.search_hint_farmer_list));

        farmerlist_searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Log.i("search", "onQueryTextSubmit: "+"submitted");
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                Log.i("search", "onQueryTextChange: "+"changed");
                return false;
            }
        });

        farmer_contact_recycler.setAdapter(new Adapter_contact_list_1(data));
    }
}