package patterns.behavioral.visitor;

public class Hamburger implements Food {
    @Override
    public void beEaten(ShopConsumer consumer) {
        consumer.eatHamburger(this);
    }
}
