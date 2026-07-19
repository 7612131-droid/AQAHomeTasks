package java_hw_6_1_2;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }

    public void move() {
        System.out.println("The vehicle" + " " +getName()+ " "+ "with a load capacity of" +" "+ getLoadCapacity()+" " + "is moving at a speed of"
                + " "+ getSpeed() +" "+ "km/h");
    }
}
