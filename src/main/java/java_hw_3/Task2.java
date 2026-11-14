package java_hw_3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Enter value of the first side of the triangle");
        a = scanner.nextInt();

        System.out.println("Enter value of the second side of the triangle");
        b = scanner.nextInt();

        System.out.println("Enter value of the third side of the triangle");
        c = scanner.nextInt();

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Congratulations! Your triangle is ready!");
        } else {
            System.out.println("Oh, you can't build triangle with sides like that");
        }
    }

}


