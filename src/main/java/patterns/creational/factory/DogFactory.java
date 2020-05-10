package patterns.creational.factory;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal create() {
        return new Dog();
    }
}
