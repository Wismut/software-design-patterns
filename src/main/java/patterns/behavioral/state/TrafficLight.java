package patterns.behavioral.state;


public class TrafficLight {
    private State state;

    public TrafficLight(State state) {
        this.state = state;
    }

    public void changeState() {
        state.nextState(this);
    }

    public void printColor() {
        state.printColor();
    }

    public void setState(State state) {
        this.state = state;
    }
}
