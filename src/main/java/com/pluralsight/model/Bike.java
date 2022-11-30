package com.pluralsight.model;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    @Override
    public void drive(){
        System.out.println("Ride bike method");
    }
}
