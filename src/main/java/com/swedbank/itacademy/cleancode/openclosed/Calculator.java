package com.swedbank.itacademy.cleancode.openclosed;

public class Calculator {

    public static void main(String[] args) {
        CalculatorOperation addition = new Addition(2 ,4);
        CalculatorOperation multiplication = new Multiplication(2 ,4);
        calculate(addition);
        calculate(multiplication);
    }

    private static void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new RuntimeException("bad");
        }

        System.out.println(operation.calculate());
    }
}
