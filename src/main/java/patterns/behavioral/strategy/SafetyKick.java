package patterns.behavioral.strategy;

public class SafetyKick implements Kick {
    @Override
    public void execute() {
        System.out.println("Safety kick is being executed");
    }
}
