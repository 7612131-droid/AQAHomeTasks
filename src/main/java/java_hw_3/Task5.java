package java_hw_3;


import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        String operator;
        System.out.println("Enter first value of number");
        a = scanner.nextInt();

        System.out.println("Enter second value of number");
        b = scanner.nextInt();

        System.out.println("Enter operator of math (-,+,*,/,%)");
        operator = scanner.next();

        double result = operator.equals("+") ? (a + b) : operator.equals("-") ? (a - b) :
                operator.equals("*") ? (a * b) : operator.equals("/") ? (b != 0 ? a / b : 0) :
                        operator.equals("%") ? (b != 0 ? a % b : 0) : 0;
        System.out.println(result);

    }
}
