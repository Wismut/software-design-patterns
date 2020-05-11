package patterns.creational.builder;

public abstract class SandwichBuilder {
    protected Sandwich sandwich;

    public abstract void setName();

    public abstract void setPrice();

    public abstract void setIngredient();

    public void createSandwich() {
        this.sandwich = new Sandwich();
    }

    public Sandwich getSandwich() {
        return this.sandwich;
    }
}
