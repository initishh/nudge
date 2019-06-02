package com.example.nudgerewriten;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Activity_farmerlist_1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmerlist_2);
        Toolbar profilePicToolbar = findViewById(R.id.profilePicToolbar);
        setSupportActionBar(profilePicToolbar);

        profilePicToolbar.setNavigationIcon(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
        profilePicToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_farmerlist_2,menu);
        return true;
    }

    public void onScheduleClick(View view){
        Intent intent = new Intent(getApplicationContext(),Activity_schedule_crop.class);
        startActivity(intent);
    }
}
