package patterns.creational.prototype;

public class CopyBookRunner {
    public static void main(String[] args) {
        Book book = new Book(1, "Alphabet", "abc");
        System.out.println("Original book:");
        System.out.println(book);
        BookFactory factory = new BookFactory(book);
        System.out.println("Copy of book:");
        System.out.println(factory.cloneObject());
    }
}
