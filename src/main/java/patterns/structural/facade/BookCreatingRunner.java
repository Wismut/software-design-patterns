package patterns.structural.facade;

public class BookCreatingRunner {
    public static void main(String[] args) {
        BookFacade bookCreator = new BookFacade();
        bookCreator.createBook();
    }
}
