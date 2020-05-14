package patterns.behavioral.iterator;


public class FurnitureShopRunner {
    public static void main(String[] args) {
        Item[] items = {new Chair(), new Sofa(), new Table(), new Sofa()};
        Order order = new Order(items);
        Iterator<Item> iterator = order.getIterator();
        System.out.println("Order consists of:");
        while (iterator.hasNext()) {
            iterator.next().printName();
        }
    }
}
