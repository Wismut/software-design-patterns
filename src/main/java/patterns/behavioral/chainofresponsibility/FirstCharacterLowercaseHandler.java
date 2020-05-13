package patterns.behavioral.chainofresponsibility;


public class FirstCharacterLowercaseHandler extends FirstCharacterHandler {
    public FirstCharacterLowercaseHandler(FirstCharacterHandler handler) {
        super(handler);
    }

    @Override
    public void handle(String word) {
        if (Character.isLowerCase(word.charAt(0))) {
            System.out.println("First character of word '" + word + "' is lowercase");
        } else {
            if (handler != null) {
                handler.handle(word);
            }
        }
    }
}
