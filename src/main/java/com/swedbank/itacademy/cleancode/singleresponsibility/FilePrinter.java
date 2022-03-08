package com.swedbank.itacademy.cleancode.singleresponsibility;

public class FilePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("File printer");
    }
}
