package java_hw_12.java_hw_12_1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws DivisionByZeroException {


        while (true) {

            Scanner scanner = null;
            try {
                Calculator calculator = new Calculator();

                scanner = new Scanner(System.in);
                System.out.println("Enter first number:");
                Integer a = scanner.nextInt();

                System.out.println("Enter second number:");
                Integer b = scanner.nextInt();


                System.out.println("Enter sign operation +, -, /, *:");
                String c = scanner.next();


                if (c.equals("+")) {
                    int result = calculator.add(a, b);
                    System.out.println("Result:" + result);

                } else if (c.equals("-")) {
                    int result = calculator.minus(a, b);
                    System.out.println("Result:" + result);
                } else if (c.equals("*")) {
                    int result = calculator.multiply(a, b);
                    System.out.println("Result:" + result);
                } else if (c.equals("/")) {
                    int result = calculator.divide(a, b);
                    System.out.println("Result:" + result);
                }
            } catch (DivisionByZeroException ex) {
                System.out.println(ex.getMessage());
            } catch (InputMismatchException ex) {
                System.out.println("Sorry! This type are not number, pay attention! Write correct format!");
            } catch (Exception ex) {
                System.out.println("Opss. The unknown error is happend!");
            }
            System.out.println("Would you like to be continue? yes/no ");
            String answer = scanner.next();

            if(answer.equals("no")){
                break;
            }
        }
    }
}