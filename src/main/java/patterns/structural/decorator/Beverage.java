package patterns.structural.decorator;

public class Beverage implements Ingredient {
    @Override
    public String getIngredient() {
        return "beverage with ";
    }
}
