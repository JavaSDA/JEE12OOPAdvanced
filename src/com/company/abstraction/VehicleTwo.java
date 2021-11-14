package com.company.abstraction;

public abstract class VehicleTwo {

    int noOfTires = 5;

    public void doThis() {
        System.out.println("I did it!");
    }

    abstract void startEngine();

    abstract void stopEngine();
}
