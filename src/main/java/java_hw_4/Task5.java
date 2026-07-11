package java_hw_4;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) + 1;
             }

        System.out.println("Введіть число:");
        int userNumber = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == userNumber) {
                found = true;
                break;
            }
        }

        if (found) {
                System.out.println("Таке число є в масиві.");
            } else {
                System.out.println("Такого числа немає в масиві.");
            }

        }

    }


