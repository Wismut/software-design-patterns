package patterns.structural.decorator;

public class MilkIngredient extends IngredientDecorator {
    public MilkIngredient(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public String getIngredient() {
        return ingredient.getIngredient() + " milk";
    }
}
