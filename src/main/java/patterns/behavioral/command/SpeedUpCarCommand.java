package patterns.behavioral.command;


public class SpeedUpCarCommand implements CarCommand {
    private Car car;

    public SpeedUpCarCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.speedUp();
    }
}
