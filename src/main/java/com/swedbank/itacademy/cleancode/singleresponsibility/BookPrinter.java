package com.swedbank.itacademy.cleancode.singleresponsibility;

public class BookPrinter implements Printer {

    void printTextToConsole(String text) {
        //our code for formatting and printing the text
    }

    void printTextToConsole(Book book) {
        System.out.println(book);
    }

    void printTextToAnotherMedium(String text) {
        // code for writing to any other location
    }

    @Override
    public void print() {
        System.out.println("Book printer");
    }
}
