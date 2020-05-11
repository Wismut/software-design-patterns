package patterns.structural.bridge;

public class Bow implements Weapon {
    @Override
    public void use() {
        System.out.println("bow");
    }
}
