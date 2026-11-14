package java_hw_6_2_1;

public class Program {
    public static void main(String[] args) {
        Figure square = new Square(5);
        Figure triangle= new Triangle(6,4,4,5,6);
        Figure circle= new Circle(7);


        System.out.println("Square information:");
        System.out.println(square);
        System.out.println("Square area:");
        System.out.println(square.getArea());
        System.out.println("Square perimeter:");
        System.out.println(square.getPerimeter());

        System.out.println();

        System.out.println("Triangle information:");
        System.out.println(triangle);
        System.out.println("Triangle area:");
        System.out.println(triangle.getArea());
        System.out.println("Triangle perimeter:");
        System.out.println(triangle.getPerimeter());

        System.out.println();

        System.out.println("Circle information:");
        System.out.println(circle);
        System.out.println("Circle area:");
        System.out.println(circle.getArea());
        System.out.println("Circle perimeter:");
        System.out.println(circle.getPerimeter());

    }

}
