package patterns.behavioral.observer;


public class Dog implements Observer {
    @Override
    public void handleEvent() {
        System.out.println("I'm dog. I'm on the way");
    }
}
