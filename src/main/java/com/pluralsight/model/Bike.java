package com.pluralsight.model;

public class Bike implements Vehicle {
    @Override
    public void drive(){
        System.out.println("Ride bike method");
    }
}
