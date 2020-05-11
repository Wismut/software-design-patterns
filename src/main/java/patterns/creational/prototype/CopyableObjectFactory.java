package patterns.creational.prototype;

public class CopyableObjectFactory {
    private final Copyable object;

    public CopyableObjectFactory(Copyable object) {
        this.object = object;
    }

    public Copyable cloneObject() {
        return object.copy();
    }
}
