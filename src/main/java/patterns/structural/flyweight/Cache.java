package patterns.structural.flyweight;


public class Cache {
    public String key;
    public String value;

    public Cache(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Cache{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
