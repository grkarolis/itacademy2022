package com.swedbank.itacademy.cleancode.openclosed;

public class Multiplication implements CalculatorOperation {

    private double leftValue;

    private double rightValue;

    private double result;

    public Multiplication(double leftValue, double rightValue) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    @Override
    public double calculate() {
        result = rightValue * leftValue;
        return result;
    }
}
