package patterns.structural.decorator;

public abstract class IngredientDecorator implements Ingredient {
    protected final Ingredient ingredient;

    public IngredientDecorator(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public abstract String getIngredient();
}
