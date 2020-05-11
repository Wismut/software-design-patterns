package patterns.creational.prototype;

public class CopyBookRunner {
    public static void main(String[] args) {
        Copyable book = new Book(1, "Alphabet", "abc");
        System.out.println("Original book:");
        System.out.println(book);
        CopyableObjectFactory factory = new CopyableObjectFactory(book);
        System.out.println("Copy of book:");
        System.out.println(factory.cloneObject());
    }
}
