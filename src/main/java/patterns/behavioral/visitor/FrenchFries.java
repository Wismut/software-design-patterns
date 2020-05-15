package patterns.behavioral.visitor;

public class FrenchFries implements Food {
    @Override
    public void beEaten(ShopConsumer consumer) {
        consumer.eatFrenchFries(this);
    }
}
