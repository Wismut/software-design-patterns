package patterns.behavioral.chainofresponsibility;


public class FirstCharacterUppercaseHandler extends FirstCharacterHandler {
    public FirstCharacterUppercaseHandler(FirstCharacterHandler handler) {
        super(handler);
    }

    @Override
    public void handle(String word) {
        if (Character.isUpperCase(word.charAt(0))) {
            System.out.println("First character of word '" + word + "' is uppercase");
        } else {
            if (handler != null) {
                handler.handle(word);
            }
        }
    }
}
