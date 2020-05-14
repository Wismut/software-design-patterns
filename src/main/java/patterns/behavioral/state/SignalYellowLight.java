package patterns.behavioral.state;


public class SignalYellowLight implements State {
    @Override
    public void printColor() {
        System.out.println("Yellow");
    }

    @Override
    public void nextState(TrafficLight trafficLight) {
        trafficLight.setState(new SignalRedLight());
    }
}
