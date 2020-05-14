package patterns.behavioral.state;


public class TrafficLightRunner {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(new SignalGreenLight());
        for (int i = 0; i < 10; i++) {
            trafficLight.printColor();
            trafficLight.changeState();
        }
    }
}
