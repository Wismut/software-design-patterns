package patterns.behavioral.command;


public class StopCarCommand implements CarCommand {
    private Car car;

    public StopCarCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stop();
    }
}
