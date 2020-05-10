package patterns.creational.factory;

public class Cat implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("meow");
    }
}
