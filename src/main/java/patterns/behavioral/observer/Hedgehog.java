package patterns.behavioral.observer;


public class Hedgehog implements Observer {
    @Override
    public void handleEvent() {
        System.out.println("I'm hedgehog. I'm on the way");
    }
}
