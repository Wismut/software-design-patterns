package patterns.structural.decorator;

public class WaterIngredient extends IngredientDecorator {
    public WaterIngredient(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public String getIngredient() {
        return ingredient.getIngredient() + " water";
    }
}
