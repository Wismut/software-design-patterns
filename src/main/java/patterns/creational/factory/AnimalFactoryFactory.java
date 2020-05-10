package patterns.creational.factory;

public class AnimalFactoryFactory {
    public static AnimalFactory create(EAnimal animal) {
        switch (animal) {
            case CAT:
                return new CatFactory();
            case DOG:
                return new DogFactory();
            case FOX:
                return new FoxFactory();
            default:
                throw new RuntimeException("Have no factory for " + animal);
        }
    }
}
