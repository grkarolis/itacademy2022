package com.swedbank.itacademy.cleancode.liskovsubstitution;

public class MotorCar implements Car, Accelerate {

    private Engine engine;

    public MotorCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void turnOnEngine() {
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.powerOn(300);
        System.out.println("motor car");
    }
}
