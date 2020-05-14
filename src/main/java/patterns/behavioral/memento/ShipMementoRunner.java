package patterns.behavioral.memento;


import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class ShipMementoRunner {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Ship ship = new Ship(15.2342, 27.3458, "PaperShip", Arrays.asList("Sailor", "Captain", "Cook"), 2000);
        LocalDate firstDate = LocalDate.of(2018, Month.FEBRUARY, 9);
        LocalDate secondDate = LocalDate.of(2019, Month.APRIL, 4);
        LocalDate thirdDate = LocalDate.of(2020, Month.JANUARY, 24);
        caretaker.save(ship.createMemento(), firstDate);
        System.out.println();
        ship.setLat(43.34532);
        ship.setLng(21.345232);
        caretaker.save(ship.createMemento(), secondDate);
        System.out.println();
        ship.setLat(7.234232);
        ship.setLng(0.343232);
        caretaker.save(ship.createMemento(), thirdDate);
        System.out.println();
        System.out.println(caretaker.getMementosCount() + " mementos were saved");
        System.out.println();
        System.out.println("Ship coordinates before restore: lng = " +
                ship.getLng() +
                ", lat = " +
                ship.getLat());
        ship.restore(caretaker.load(secondDate));
    }
}
