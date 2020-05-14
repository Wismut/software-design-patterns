package patterns.behavioral.mediator;

public class Button {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void click() {
        mediator.clickButton();
    }
}
