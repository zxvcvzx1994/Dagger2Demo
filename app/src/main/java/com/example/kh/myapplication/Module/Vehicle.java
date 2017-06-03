package com.example.kh.myapplication.Module;

import javax.inject.Inject;

/**
 * Created by kh on 6/3/2017.
 */

public class Vehicle {
    Motor motor;
    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public int getSpeed(){
        return motor.getRpm();
    }

    public void stop(){
        motor.brake();
    }
}
