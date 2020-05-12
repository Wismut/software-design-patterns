package patterns.structural.facade;

public class BookCreatingRunner {
    public static void main(String[] args) {
        BookCreatingFacade bookCreator = new BookCreatingFacade();
        bookCreator.createBook();
    }
}
