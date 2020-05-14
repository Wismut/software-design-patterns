package patterns.behavioral.memento;


import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Ship {
    private double lat;
    private double lng;
    private String name;
    private List<String> crew;
    private int yearOfCreation;

    public Ship(double lat, double lng, String name, List<String> crew, int yearOfCreation) {
        this.lat = lat;
        this.lng = lng;
        this.name = name;
        this.crew = crew;
        this.yearOfCreation = yearOfCreation;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
        System.out.println("New lat for ship '" + name + "' is " + lat);
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
        System.out.println("New lng for ship '" + name + "' is " + lng);
    }

    public MementoCoordinates createMemento() {
        return new MementoCoordinates(lat, lng);
    }

    public void restore(MementoCoordinates mementoCoordinates) {
        Objects.requireNonNull(mementoCoordinates);
        setLat(mementoCoordinates.getLat());
        setLng(mementoCoordinates.getLng());
        System.out.println("Coordinates were restored");
    }
}
