package patterns.structural.bridge;

public class Archer extends Hero {
    public Archer(Weapon weapon) {
        super(weapon);
    }

    @Override
    void fight() {
        System.out.print("Archer is fighting with ");
        weapon.use();
    }
}
