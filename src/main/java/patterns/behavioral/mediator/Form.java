package patterns.behavioral.mediator;


public class Form {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void submit() {
        mediator.submitForm();
    }
}
