package patterns.behavioral.mediator;


public class FrameRunner {
    public static void main(String[] args) {
        Form form = new Form();
        Button button = new Button();
        Textfield textfield = new Textfield();
        new FrameMediator(button, form, textfield);
        button.click();
        System.out.println();
        textfield.setValue("abc");
        button.click();
    }
}
