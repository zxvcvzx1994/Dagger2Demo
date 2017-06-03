package com.example.kh.myapplication.Module;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kh on 6/3/2017.
 */
@Singleton
@Component(modules = {ModuleVehicle.class})
public interface ComponentVehicle {
    Vehicle provideVehicle();
}
