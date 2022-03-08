package com.swedbank.itacademy;

import com.swedbank.itacademy.Book;
import com.swedbank.itacademy.Library;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LibraryTest {

    @Mock
    private List<Book> mockedBooks;

    @InjectMocks
    private Library library;

    @Test
    public void Should_Get_Books() {
        Mockito.when(mockedBooks.size()).thenReturn(1);
        Mockito.when(mockedBooks.get(0)).thenReturn(new Book(5, "title"));

        assertEquals(1, library.getBooks().size());
        assertEquals(5, library.getBooks().get(0).pages());
        assertEquals("title", library.getBooks().get(0).title());
    }
}
