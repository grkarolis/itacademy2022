package com.swedbank.itacademy.unittests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyTest {

    @BeforeAll
    public static void setup() {
        System.out.println("I will run before everything else!");
    }

    @BeforeEach
    public void init() {
        System.out.println("I will run before each test!");
    }

    @Test
    @DisplayName("My super cool test name!")
    public void customDisplayNameTest() {
        System.out.println("I have a cool display name!");
    }

    @Test
    @Disabled
    public void disabledTest() {
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("I will run after each test!");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("I will run after every test has ran!");
    }

    @Test
    public void groupAssertions() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertAll("numbers",
            () -> assertEquals(numbers[0], 1),
            () -> assertEquals(numbers[2], 1),
            () -> assertEquals(numbers[3], 4)
        );
    }

    @Test
    public void catchThrowable() {
        Throwable actual = assertThrows(UnsupportedOperationException.class, () -> {
            throw new UnsupportedOperationException("Not supported");
        });
        assertEquals("Not supported", actual.getMessage());
    }

    @Test
    public void assertException() {
        String str = null;
        assertThrows(IllegalArgumentException.class, () -> Integer.parseInt(str));
    }
}
