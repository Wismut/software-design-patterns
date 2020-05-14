package patterns.behavioral.mediator;


import java.util.Objects;

public class Textfield {
    private Mediator mediator;
    private String value = "";

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        Objects.requireNonNull(value);
        this.value = value;
        System.out.println("Text field was filled with new value '" + value + "'");
    }
}
