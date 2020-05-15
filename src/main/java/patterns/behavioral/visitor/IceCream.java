package patterns.behavioral.visitor;

public class IceCream implements Food {
    @Override
    public void beEaten(ShopConsumer consumer) {
        consumer.eatIceCream(this);
    }
}
