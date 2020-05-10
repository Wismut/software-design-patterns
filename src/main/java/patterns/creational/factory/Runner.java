package patterns.creational.factory;

public class Runner {
    public static void main(String[] args) {
        AnimalFactoryFactory.create(EAnimal.CAT).create().makeVoice();
        AnimalFactoryFactory.create(EAnimal.DOG).create().makeVoice();
        AnimalFactoryFactory.create(EAnimal.FOX).create().makeVoice();
    }
}
