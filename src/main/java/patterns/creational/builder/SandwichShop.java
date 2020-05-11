package patterns.creational.builder;

public class SandwichShop {
    public static void main(String[] args) {
        Director director = new Director(new SausageSandwichBuilder());
        System.out.println(director.buildSandwich());
        director = new Director(new CheeseSandwichBuilder());
        System.out.println(director.buildSandwich());
    }
}
