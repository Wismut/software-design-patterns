package patterns.behavioral.visitor;

public class John implements ShopConsumer {
    @Override
    public void eatHamburger(Food food) {
        System.out.println("Hello. I'm John. I like hamburgers");
    }

    @Override
    public void eatIceCream(Food food) {
        System.out.println("Hello. I'm John. I'm allergic to ice cream");
    }

    @Override
    public void eatFrenchFries(Food food) {
        System.out.println("Hello. I'm John. I don't like french fries");
    }
}
