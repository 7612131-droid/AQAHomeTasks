package java_hw_6_1_2;

public class Program {
    public static void main(String[] args) {
        Car car = new Car("BMW", 160, 5);
        Truck truck = new Truck("Volvo", 190, 34);


        car.move();
        truck.move();
    }
}
