package java_hw_9.sorting;

import java.util.Comparator;

public class Cars implements Comparable<Cars>{
    String name;
    Integer price;
    Integer speed;

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }

    public Cars(String name, Integer price, Integer speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Cars o) {
        return  o.speed - this.speed;
    }
}
