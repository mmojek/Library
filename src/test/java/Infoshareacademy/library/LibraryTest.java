package Infoshareacademy.library;

import infoshare.library.Book;
import infoshare.library.Library;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
private List<Book> books;
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

    @Before
    public void setupLibrary() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Stanislaw Lem", "Solaris"));
        books.add(new Book("Stanislaw Lem", "Bajki"));

    }

    @Test
    public void shouldReturnTrueIfBookAvaiable() {

        //given
        List<Book> books = new ArrayList<>();
        books.add(new Book("Stanislaw Lem", "Solaris"));
        books.add(new Book("Stanislaw Lem", "Bajki"));

        Library library = new Library(books);
        Book testBook = new Book("Stanislaw Lem", "Solaris");

        //when
        boolean isAvailable = library.isBookAvailable(testBook);
        //then
        Assert.assertTrue(isAvailable);
    }
    }
