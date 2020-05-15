package patterns.behavioral.visitor;

public class Sara implements ShopConsumer {
    @Override
    public void eatHamburger(Food food) {
        System.out.println("Hi. My name is Sara. I don't like hamburgers");
    }

    @Override
    public void eatIceCream(Food food) {
        System.out.println("Hi. My name is Sara. I really like ice cream");
    }

    @Override
    public void eatFrenchFries(Food food) {
        System.out.println("Hi. My name is Sara. I have never eaten french fries");
    }
}
