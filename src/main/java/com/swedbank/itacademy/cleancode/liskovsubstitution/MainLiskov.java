package com.swedbank.itacademy.cleancode.liskovsubstitution;

public class MainLiskov {

    public static void main(String[] args) {
        MotorCar motorCar = new MotorCar(new Engine());
        ElectricCar electricCar = new ElectricCar();
        electricCar.accelerate();
        turnOnEngine(motorCar);
        accelerate(motorCar);
        accelerate(electricCar);
    }

    private static void turnOnEngine(Car bmw) {
        bmw.turnOnEngine();
    }

    private static void accelerate(Car car) {
        car.accelerate();
    }
}
