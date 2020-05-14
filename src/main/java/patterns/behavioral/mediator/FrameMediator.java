package patterns.behavioral.mediator;


public class FrameMediator implements Mediator {
    private Button button;
    private Form form;
    private Textfield textfield;

    public FrameMediator(Button button, Form form, Textfield textfield) {
        this.button = button;
        this.form = form;
        this.textfield = textfield;
        createDependencies();
    }

    @Override
    public void clickButton() {
        System.out.println("Button was clicked");
        if (textfield.getValue().isEmpty()) {
            System.out.println("Please, fill the text field before clicking the button");
        } else {
            form.submit();
        }
    }

    @Override
    public void submitForm() {
        System.out.println("Form was submitted with value '" + textfield.getValue() + "'");
    }

    private void createDependencies() {
        button.setMediator(this);
        form.setMediator(this);
        textfield.setMediator(this);
    }
}
