package patterns.behavioral.visitor;

import java.util.List;

public class FoodItem implements Food {
    private final List<Food> foods;

    public FoodItem(List<Food> foods) {
        this.foods = foods;
    }

    @Override
    public void beEaten(ShopConsumer consumer) {
        foods.forEach(f -> f.beEaten(consumer));
    }
}
