package patterns.structural.bridge;

public class Warrior extends Hero {
    public Warrior(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        System.out.print("Warrior is fighting with ");
        weapon.use();
    }
}
