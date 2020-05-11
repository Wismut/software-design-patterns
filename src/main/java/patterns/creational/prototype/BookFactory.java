package patterns.creational.prototype;

public class BookFactory {
    private final Book book;

    public BookFactory(Book book) {
        this.book = book;
    }

    public Book cloneObject() {
        return book.copy();
    }
}
