package patterns.structural.decorator;

public class CoffeeIngredient extends IngredientDecorator {
    public CoffeeIngredient(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public String getIngredient() {
        return this.ingredient.getIngredient() + " coffee";
    }
}
