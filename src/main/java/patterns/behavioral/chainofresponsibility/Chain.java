package patterns.behavioral.chainofresponsibility;


public class Chain {
    FirstCharacterHandler chain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        this.chain = new FirstCharacterLowercaseHandler(
                new FirstCharacterUppercaseHandler(
                        new FirstCharacterNotLetter(null)
                ));
    }

    public void handle(String word) {
        if (word != null) {
            chain.handle(word);
        }
    }
}
