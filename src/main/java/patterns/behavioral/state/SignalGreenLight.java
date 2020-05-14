package patterns.behavioral.state;


public class SignalGreenLight implements State {
    @Override
    public void printColor() {
        System.out.println("Green");
    }

    @Override
    public void nextState(TrafficLight trafficLight) {
        trafficLight.setState(new SignalYellowLight());
    }
}
