package java_hw_9.factory;

public class AnimalFactory {

    public static Animal createAnimal(String animalType) {
        switch (animalType) {
            case "Cat":
                return new Cat();
            case "Dog":
                return new Dog();
            case "Bird":
                return new Bird();

            default:
                System.out.println("There is no such kind of animal: " + animalType);
                return null;
        }


        }
    }


