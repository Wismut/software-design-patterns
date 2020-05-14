package patterns.behavioral.state;


public interface State {
    void printColor();

    void nextState(TrafficLight trafficLight);
}
