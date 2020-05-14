package patterns.behavioral.observer;


public class Cat implements Observer {
    @Override
    public void handleEvent() {
        System.out.println("I'm cat. I'm on the way");
    }
}
