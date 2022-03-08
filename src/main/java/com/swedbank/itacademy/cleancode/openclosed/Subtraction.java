package com.swedbank.itacademy.cleancode.openclosed;

public class Subtraction implements CalculatorOperation {
    private double leftValue;

    private double rightValue;

    private double result;

    public Subtraction(double leftValue, double rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    @Override
    public double calculate() {
        result = leftValue - rightValue;
        return result;
    }
}
