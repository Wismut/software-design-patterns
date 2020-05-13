package patterns.behavioral.chainofresponsibility;


public class WordHandleRunner {
    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.handle("sdgsdf");
        chain.handle("5dgsdf");
        chain.handle("Tgsdf");
    }
}
