package patterns.structural.adapter;

public class APIv1ToAPIv2Adapter implements APIv2 {
    private APIv1 apIv1;

    public APIv1ToAPIv2Adapter(APIv1 apIv1) {
        this.apIv1 = apIv1;
    }

    @Override
    public void readAll() {
        apIv1.getAll();
    }

    @Override
    public void printAll() {
        apIv1.drawAll();
    }
}
