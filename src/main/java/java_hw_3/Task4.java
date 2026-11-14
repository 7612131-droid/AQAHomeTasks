package java_hw_3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Enter any value of number");
        a = scanner.nextInt();

        if (a == 1) {
            System.out.println("Понеділок");
        } else if (a == 2) {
            System.out.println("Вівторок");
        } else if (a == 3) {
            System.out.println("Середовище");
        } else if (a == 4) {
            System.out.println("Четверг");
        } else if (a == 5) {
            System.out.println("П'ятниця");
        } else if (a == 6) {
            System.out.println("Суббота");
        } else if (a == 7) {
            System.out.println("Неділя");
        } else {
            System.out.println("Краще б була п'ятниця");
        }
    }
}
