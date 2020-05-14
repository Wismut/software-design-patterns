package patterns.behavioral.strategy;

public class DropKick implements Kick {
    @Override
    public void execute() {
        System.out.println("Drop kick is being executed");
    }
}
