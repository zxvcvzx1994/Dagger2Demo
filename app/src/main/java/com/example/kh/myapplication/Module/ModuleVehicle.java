package com.example.kh.myapplication.Module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kh on 6/3/2017.
 */
@Module
public class ModuleVehicle {
    @Provides
    @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
