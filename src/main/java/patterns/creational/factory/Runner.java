package patterns.creational.factory;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Animals make sound...");
        System.out.print(EAnimal.CAT + " ");
        AnimalFactoryFactory.create(EAnimal.CAT).create().makeVoice();
        System.out.print(EAnimal.DOG + " ");
        AnimalFactoryFactory.create(EAnimal.DOG).create().makeVoice();
        System.out.print(EAnimal.FOX + " ");
        AnimalFactoryFactory.create(EAnimal.FOX).create().makeVoice();
    }
}
