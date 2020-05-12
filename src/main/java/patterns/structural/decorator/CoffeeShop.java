package patterns.structural.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Ingredient beverage = new WaterIngredient(new CoffeeIngredient(new MilkIngredient(new CoffeeIngredient(new Beverage()))));
        System.out.println(beverage.getIngredient());
    }
}
