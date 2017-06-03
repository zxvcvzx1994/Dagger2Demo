package com.example.kh.myapplication.Module;

/**
 * Created by kh on 6/3/2017.
 */

public class Motor {
    private int rpm;
    public Motor(){
        rpm = 0;
    }

    public void brake(){
        rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int value){
        rpm+=value;
    }
}
