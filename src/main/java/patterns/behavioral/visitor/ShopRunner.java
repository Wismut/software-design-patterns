package patterns.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class ShopRunner {
    public static void main(String[] args) {
        ShopConsumer john = new John();
        ShopConsumer sara = new Sara();
        List<Food> foods = Arrays.asList(new IceCream(), new Hamburger(), new FrenchFries());
        FoodItem foodItem = new FoodItem(foods);
        foodItem.beEaten(john);
        System.out.println();
        foodItem.beEaten(sara);
    }
}
