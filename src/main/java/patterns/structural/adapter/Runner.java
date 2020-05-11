package patterns.structural.adapter;

public class Runner {
    public static void main(String[] args) {
        APIv2 api = new APIv1ToAPIv2Adapter(new APIv1Impl());
        System.out.println("API v2 readAll() is calling");
        api.readAll();
        System.out.println();
        System.out.println("API v2 printAll() is calling");
        api.printAll();
    }
}
