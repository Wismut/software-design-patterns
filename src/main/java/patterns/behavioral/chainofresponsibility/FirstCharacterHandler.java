package patterns.behavioral.chainofresponsibility;


public abstract class FirstCharacterHandler {
    protected FirstCharacterHandler handler;

    public FirstCharacterHandler(FirstCharacterHandler handler) {
        this.handler = handler;
    }

    public abstract void handle(String word);
}
