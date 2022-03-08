package com.swedbank.itacademy.cleancode.singleresponsibility;

import java.util.Arrays;
import java.util.List;

public class SimpleMain {

    public static void main(String[] args) {
        Book myBook = new Book("name", "author", "text");
        Printer bookPrinter = new BookPrinter();
        Printer filePrinter = new FilePrinter();
        List<Printer> printers = Arrays.asList(bookPrinter, filePrinter);

        printers.stream().forEach(p -> p.print());
    }

}
