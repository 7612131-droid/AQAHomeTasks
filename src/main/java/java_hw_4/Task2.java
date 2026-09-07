package java_hw_4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число:");
        String userNumber = scanner.nextLine();

        String reversed = new StringBuilder(userNumber).reverse().toString();

        if (userNumber.equals(reversed)) {
            System.out.println("This number is palindrome");
        } else {
            System.out.println("This number is not palindrome");
        }


    }
}
