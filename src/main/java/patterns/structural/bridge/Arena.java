package patterns.structural.bridge;

import java.util.Arrays;
import java.util.List;

public class Arena {
    public static void main(String[] args) {
        List<Hero> heroes = Arrays.asList(new Warrior(new Sword()),
                new Warrior(new Bow()),
                new Archer(new Sword()),
                new Archer(new Bow()));
        heroes.forEach(Hero::fight);
    }
}
