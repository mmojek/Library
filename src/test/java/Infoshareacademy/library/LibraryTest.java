package Infoshareacademy.library;

import infoshare.library.Book;
import infoshare.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    @Test
    public void shouldReturnFalseIfBookNotAvailable() {
//        //given
//        Library library = new Library();
//        Book testBook = new Book("Henryk Sienkiewicz", "W Pustyni i w Puszczy");
//
//        //when
//        boolean isAvailable = library.isBookAvailable();
//        //then
//        Assert.assertFalse(isAvailable);
    }

    @Test
    public void shouldReturnTrueIfBookAvaiable() {

        //given
        List<Book> books = new ArrayList<>();
        books.add(new Book("Stanislaw Lem", "Solaris"));
        books.add(new Book("Stanislaw Lem", "Bajki"));

        Library library = new Library(books);
        Book testBook = new Book("Adam Mickiewicz", "Solaris");

        //when
        boolean isAvailable = library.isBookAvailable(testBook);
        //then
        Assert.assertTrue(isAvailable);
    }
    }
