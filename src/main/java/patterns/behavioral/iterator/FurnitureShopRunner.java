package patterns.behavioral.iterator;


public class FurnitureShopRunner {
    public static void main(String[] args) {
        Item[] items = {new Chair(), new Sofa(), new Table(), new Sofa()};
        Order order = new Order(items);
        Iterator iterator = order.getIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }
}
