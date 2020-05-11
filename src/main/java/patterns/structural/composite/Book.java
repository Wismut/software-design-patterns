package patterns.structural.composite;

public class Book implements Gift {
    @Override
    public void printName() {
        System.out.println("Book");
    }
}
