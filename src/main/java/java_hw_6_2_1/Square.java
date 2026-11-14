package java_hw_6_2_1;

public class Square extends Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
   public double getPerimeter(){
        return 4*side;
    }
    @Override
   public double getArea(){
        return side*side;
    }
}
