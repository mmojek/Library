package infoshare.library;

import java.util.List;

public class Library {


    private List<Book> bookRepository;

    public Library(List<Book> bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void lendBook() {

    }

    public boolean isBookAvailable(Book book) {

        for (Book bookinRepository : bookRepository) {
            if (bookinRepository.getAuthor() == book.getAuthor()) {
                return true;
            }
        }
        return false;
    }
}
