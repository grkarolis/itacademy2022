package com.swedbank.itacademy.cleancode.liskovsubstitution;

public class ElectricCar implements Accelerate, Car {

    @Override
    public void accelerate() {
        System.out.println("electric");// Zoom, zoom very fast!
    }

    @Override
    public void turnOnEngine() {
        throw new RuntimeException("");
    }
}
