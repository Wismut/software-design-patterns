package patterns.behavioral.visitor;

public interface ShopConsumer {
    void eatHamburger(Food food);

    void eatIceCream(Food food);

    void eatFrenchFries(Food food);
}
