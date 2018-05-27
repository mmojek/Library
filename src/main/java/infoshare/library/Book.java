package infoshare.library;

public class Book {

    private String author;
    private String title;
    private int id;
    private boolean isBorrowed;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.isBorrowed = false;
    }

    public void setAuthor(String author) {

        this.author = author;

    }

    public String getAuthor() {
        return this.author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

