package patterns.structural.adapter;

public class APIv1Impl implements APIv1 {
    @Override
    public void getAll() {
        System.out.println("API v1 getAll() called");
    }

    @Override
    public void drawAll() {
        System.out.println("API v1 drawAll() called");
    }
}
