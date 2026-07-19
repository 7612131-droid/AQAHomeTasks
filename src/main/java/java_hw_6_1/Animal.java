package java_hw_6_1;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }
}



