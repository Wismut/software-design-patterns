package patterns.behavioral.command;


public class Driver {
    private CarCommand startCarCommand;
    private CarCommand stopCarCommand;
    private CarCommand speedUpCarCommand;

    public Driver(CarCommand startCarCommand, CarCommand stopCarCommand, CarCommand speedUpCarCommand) {
        this.startCarCommand = startCarCommand;
        this.stopCarCommand = stopCarCommand;
        this.speedUpCarCommand = speedUpCarCommand;
    }

    public void startCar() {
        startCarCommand.execute();
    }

    public void speedUpCar() {
        speedUpCarCommand.execute();
    }

    public void stopCar() {
        stopCarCommand.execute();
    }
}
