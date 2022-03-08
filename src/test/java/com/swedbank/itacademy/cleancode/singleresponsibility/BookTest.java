package com.swedbank.itacademy.cleancode.singleresponsibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void Should_ThrowRuntimeException_When_WordIsNull() {
        Book actual = new Book("1", "", "");


        Assertions.assertThrows(RuntimeException.class, () -> {
            actual.isWordInText(null);
        });

    }

}
