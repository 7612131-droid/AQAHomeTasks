package java_hw_6_2_1;

public class Circle extends Figure {
    private double radius;
    private static final double PI = 3.141592653589793;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

        public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
