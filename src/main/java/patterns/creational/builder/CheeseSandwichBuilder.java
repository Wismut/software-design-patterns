package patterns.creational.builder;

public class CheeseSandwichBuilder extends SandwichBuilder {
    @Override
    public void setName() {
        this.sandwich.setName("Cheese sandwich");
    }

    @Override
    public void setPrice() {
        this.sandwich.setPrice(100);
    }

    @Override
    public void setIngredient() {
        this.sandwich.setIngredient(Ingredient.CHEESE);
    }
}
