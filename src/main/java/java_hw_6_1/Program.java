package java_hw_6_1;

public class Program {
    public static void main(String[] args) {
        Bird bird =new Bird("Kar");
        Fish fish = new Fish("Nemo");
        Dog dog = new Dog("Sharik");

        bird.eat();
        bird.sleep();
        bird.fly();

        fish.eat();
        fish.sleep();
        fish.swim();

        dog.eat();
        dog.sleep();
        dog.bark();
    }

}
