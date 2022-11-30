package com.pluralsight.model;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Drive car method");
    }
}
