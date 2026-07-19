package java_hw_6_1_1;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    public void swim() {
        System.out.println("I am sweeming");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

}
