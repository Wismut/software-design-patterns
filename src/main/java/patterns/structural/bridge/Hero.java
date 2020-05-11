package patterns.structural.bridge;

public abstract class Hero {
    protected Weapon weapon;

    public Hero(Weapon weapon) {
        this.weapon = weapon;
    }

    abstract void fight();

    @Override
    public String toString() {
        return "Hero{" +
                "weapon=" + weapon +
                '}';
    }
}
