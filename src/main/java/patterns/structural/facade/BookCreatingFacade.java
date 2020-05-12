package patterns.structural.facade;

public class BookCreatingFacade {
    Author author = new Author();
    Publisher publisher = new Publisher();
    Reviewer reviewer = new Reviewer();

    public void createBook() {
        author.createContent();
        author.writeContent();
        reviewer.findMistakes();
        author.fixMistakes();
        publisher.publishBook();
    }
}
