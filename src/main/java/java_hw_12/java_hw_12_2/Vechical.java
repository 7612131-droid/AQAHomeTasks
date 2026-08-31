package java_hw_12.java_hw_12_2;

public class Vechical {
    String name;
   Integer speed;
    Integer price;
    Integer countOfWheels;

    public Vechical(String name, Integer speed,Integer price, Integer countOfWheels ) {
        this.name = name;
        this.speed = speed;
        this.price = price;
        this.countOfWheels = countOfWheels;
    }

    @Override
    public String toString() {
        return "Vechical{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                ", countOfWheels=" + countOfWheels +
                '}';
    }

    public Integer getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(Integer countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
