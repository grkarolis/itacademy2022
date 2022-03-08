package com.swedbank.itacademy.cleancode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public record Manage(String name) {

    private static List<Customer> customerList;

    private static final int DAYS_IN_MONTH = 28;

    private static int elapsedTimeInDays; //elapsed time in days
    private static int dsm; //days since modification

    private static String addressCity;
    private static String addresshomenumber;
    private static String addresspostcode;

    private int multiplyNumber(int number, int multiplier) {
        Map<String, String> myMap;
        return number * multiplier;
    }

    // This will multiply number by a multiplier
    private int mltpnmbr(int q, int w) {
        return q * w;
    }

    private record Computer(String hardDrive, String ram, String cdRom) {}

    private static void printComputerParts(Computer myPc) {
        Computer computer = new Computer("drive", "ram", "cdRom");
        System.out.println(computer.cdRom());
    }

    private void printCarSpecification(int doors, int wheels, int mirrors, int seats) {
        System.out.println(String.format("The car has %d doors, %d wheels, %d mirrors, %d seats",
                doors, wheels, mirrors, seats));
    }

    private void printCarSpecification(Car car) {
        System.out.printf("The car has %d doors, %d wheels, %d mirrors, %d seats%n",
                car.doors(), car.wheels(), car.mirrors(), car.seats());
    }

    private void printAllListOfCustomers(List<Customer> customers) {
        System.out.println(Arrays.toString(customers.toArray()));
    }

    private String fetchName() {
        return name();
    }

    private record Car (int doors,
            int wheels,
            int mirrors,
            int seats) {}

}
