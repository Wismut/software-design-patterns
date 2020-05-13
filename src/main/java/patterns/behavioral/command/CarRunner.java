package patterns.behavioral.command;


public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();
        Driver driver = new Driver(new StartCarCommand(car),
                new StopCarCommand(car),
                new SpeedUpCarCommand(car));
        driver.startCar();
        driver.speedUpCar();
        driver.stopCar();
    }
}
