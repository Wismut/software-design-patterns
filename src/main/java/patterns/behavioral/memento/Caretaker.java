package patterns.behavioral.memento;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Caretaker {
    private Map<LocalDate, MementoCoordinates> mementos = new HashMap<>();

    public void save(MementoCoordinates mementoCoordinates, LocalDate date) {
        mementos.put(date, mementoCoordinates);
        System.out.println("MementoCoordinates with date " + date + " was saved");
        System.out.println(mementoCoordinates);
    }

    public MementoCoordinates load(LocalDate date) {
        return mementos.get(date);
    }

    public int getMementosCount() {
        return mementos.size();
    }
}
