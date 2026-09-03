package java_hw_9.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setModel("Audi")
                .setMaxSpeed(320)
                .setPrice(38000)
                .setCountOfWheels(4)
                .build();
        System.out.println(car);
    }


}