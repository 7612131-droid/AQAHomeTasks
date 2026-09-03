package java_hw_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter first number");
        a = scanner.nextInt();
        System.out.println("Enter second number");
        b = scanner.nextInt();


        System.out.println("Різниця між більшим числом та меньшим" + " = " + (a > b ? (a - b) : (b - a)));


    }
}
