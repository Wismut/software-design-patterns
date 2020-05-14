package patterns.behavioral.memento;


public class MementoCoordinates {
    private double lat;
    private double lng;

    public MementoCoordinates(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    @Override
    public String toString() {
        return "MementoCoordinates{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
