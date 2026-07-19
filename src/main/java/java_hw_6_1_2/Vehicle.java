package java_hw_6_1_2;

public class Vehicle {
    private String name;
    private Integer speed;

    public Vehicle(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }


    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

}
