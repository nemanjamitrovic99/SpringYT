package com.pluralsight.model;

public class Car implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Drive car method");
    }
}
