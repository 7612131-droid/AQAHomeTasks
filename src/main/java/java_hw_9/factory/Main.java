package java_hw_9.factory;

import static java_hw_9.factory.AnimalFactory.createAnimal;


public class Main {
    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();

        Animal cat = animalFactory.createAnimal("Cat");
        Animal bird = animalFactory.createAnimal("Bird");
        Animal dog = animalFactory.createAnimal("Dog");


        System.out.println(cat);
        System.out.println(bird);
        System.out.println(dog);
        dog.speak();
        cat.speak();
        bird.speak();
    }
}
