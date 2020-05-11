package patterns.creational.builder;

public class Sandwich {
    private String name;
    private Ingredient ingredient;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "name='" + name + '\'' +
                ", ingredient=" + ingredient +
                ", price=" + price +
                '}';
    }
}
