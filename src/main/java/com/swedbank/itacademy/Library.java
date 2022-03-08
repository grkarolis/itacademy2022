package com.swedbank.itacademy;

import java.util.List;

public record Library(List<Book> books) {

    public List<Book> getBooks() {
        return books;
    }

}
