package patterns.behavioral.strategy;

public class KickOff implements Kick {
    @Override
    public void execute() {
        System.out.println("Kick off is being executed");
    }
}
