package patterns.behavioral.template;

public abstract class Program {
    public void create() {
        System.out.println("Create task");
        System.out.println("Create UML diagram");
        System.out.println("Open IDE");
        writeCode();
        System.out.println("Testing");
        System.out.println("Fixing");
        System.out.println("Show result");
    }

    protected abstract void writeCode();
}
