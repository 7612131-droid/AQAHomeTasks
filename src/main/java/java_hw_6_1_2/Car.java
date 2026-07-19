package java_hw_6_1_2;

public class Car extends Vehicle {
    private int passpassengerCapacity;

    public Car(String name, int speed, int passpassengerCapacity) {
        super(name, speed);
        this.passpassengerCapacity = passpassengerCapacity;
    }

    public void setPasspassengerCapacity(int passpassengerCapacity) {
        this.passpassengerCapacity = passpassengerCapacity;
    }

    public int getPasspassengerCapacity() {
        return passpassengerCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "passpassengerCapacity=" + passpassengerCapacity +
                '}';
    }
@Override
    public void move(){
        super.move();
        System.out.println("The vehicle"+ " "+ getName() +" "+ "moving with a speed of " + " "+ getSpeed() + " "+ "km/h" +" "+
                "with" + " " + getPasspassengerCapacity() + " " + "people");
    }
}
