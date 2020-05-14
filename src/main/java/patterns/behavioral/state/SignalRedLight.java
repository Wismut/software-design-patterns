package patterns.behavioral.state;


public class SignalRedLight implements State {
    @Override
    public void printColor() {
        System.out.println("Red");
    }

    @Override
    public void changeState() {

    }
}
