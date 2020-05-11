package patterns.creational.prototype;

public class Book implements Copyable {
    private final int id;
    private final String name;
    private final String content;

    public Book(int id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public Book copy() {
        return new Book(id, name, content);
    }
}
