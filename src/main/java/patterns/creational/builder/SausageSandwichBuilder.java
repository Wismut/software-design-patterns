package patterns.creational.builder;

public class SausageSandwichBuilder extends SandwichBuilder {
    @Override
    public void setName() {
        this.sandwich.setName("Sausage sandwich");
    }

    @Override
    public void setPrice() {
        this.sandwich.setPrice(150);
    }

    @Override
    public void setIngredient() {
        this.sandwich.setIngredient(Ingredient.SAUSAGE);
    }
}
