package patterns.behavioral.strategy;

public class FreeKick implements Kick {
    @Override
    public void execute() {
        System.out.println("Free kick is being executed");
    }
}
