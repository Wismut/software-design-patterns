package patterns.behavioral.command;


public class StartCarCommand implements CarCommand {
    private Car car;

    public StartCarCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.start();
    }
}
