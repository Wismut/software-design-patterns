package patterns.creational.builder;

public class Director {
    private final SandwichBuilder builder;

    public Director(SandwichBuilder builder) {
        this.builder = builder;
    }

    public Sandwich buildSandwich() {
        builder.createSandwich();
        builder.setName();
        builder.setIngredient();
        builder.setPrice();
        return builder.getSandwich();
    }
}
