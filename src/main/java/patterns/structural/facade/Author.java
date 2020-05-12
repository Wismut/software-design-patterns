package patterns.structural.facade;

public class Author {
    public void createContent() {
        System.out.println("Author creates content");
    }

    public void writeContent() {
        System.out.println("Author writes content");
    }

    public void fixMistakes() {
        System.out.println("Author fixes mistakes");
    }
}
