package patterns.behavioral.chainofresponsibility;


public class FirstCharacterNotLetter extends FirstCharacterHandler {
    public FirstCharacterNotLetter(FirstCharacterHandler handler) {
        super(handler);
    }

    @Override
    public void handle(String word) {
        if (!Character.isLetter(word.charAt(0))) {
            System.out.println("First character of word '" + word + "' is not a letter");
        } else {
            if (handler != null) {
                handler.handle(word);
            }
        }
    }
}
