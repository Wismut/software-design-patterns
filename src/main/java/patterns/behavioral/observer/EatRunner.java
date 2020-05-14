package patterns.behavioral.observer;


public class EatRunner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Hedgehog hedgehog = new Hedgehog();
        Food food = new Food();
        food.addObserver(cat);
        food.addObserver(dog);
        food.addObserver(hedgehog);
        food.setFoodPresent(true);
        food.setFoodPresent(false);
        food.setFoodPresent(false);
        food.removeObserver(hedgehog);
        food.setFoodPresent(false);
        food.setFoodPresent(true);
    }
}
