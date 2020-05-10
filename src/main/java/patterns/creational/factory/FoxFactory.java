package patterns.creational.factory;

public class FoxFactory implements AnimalFactory {
    @Override
    public Animal create() {
        return new Fox();
    }
}
