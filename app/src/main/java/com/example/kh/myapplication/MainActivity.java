package com.example.kh.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.kh.myapplication.Module.ComponentVehicle;
import com.example.kh.myapplication.Module.DaggerComponentVehicle;
import com.example.kh.myapplication.Module.ModuleVehicle;
import com.example.kh.myapplication.Module.Vehicle;

public class MainActivity extends AppCompatActivity {
    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ComponentVehicle component = DaggerComponentVehicle.builder().moduleVehicle(new ModuleVehicle()).build();
        vehicle = component.provideVehicle();
        vehicle.increaseSpeed(50);
        Toast.makeText(this, ""+vehicle.getSpeed(), Toast.LENGTH_SHORT).show();
    }
}
