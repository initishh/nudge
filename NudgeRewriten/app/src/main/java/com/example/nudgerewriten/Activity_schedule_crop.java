package com.example.nudgerewriten;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Activity_schedule_crop extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_crop);
        Toolbar scheduleCropToolbar= findViewById(R.id.scheduleCropToolbar);

        setSupportActionBar(scheduleCropToolbar);

        scheduleCropToolbar.setNavigationIcon(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
        scheduleCropToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }
        });

        Spinner addCrop = findViewById(R.id.addCrop);
        ArrayAdapter <CharSequence> addCropAdapter = ArrayAdapter.createFromResource(this,R.array.dummy_array_for_spinner,android.R.layout.simple_spinner_item);
        addCropAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        addCrop.setAdapter(addCropAdapter);


        Spinner cropVariety = findViewById(R.id.cropVariety);
        ArrayAdapter <CharSequence> cropVarietyAdapter = ArrayAdapter.createFromResource(this,R.array.dummy_array_for_spinner,android.R.layout.simple_spinner_item);
        cropVarietyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cropVariety.setAdapter(cropVarietyAdapter);

        addCrop.setOnItemSelectedListener(this);
        cropVariety.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (parent.getId()){
            case R.id.addCrop:
                Toast.makeText(this,"this is from Add Crops",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cropVariety:
                Toast.makeText(this,"this is from Crop Variety",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
