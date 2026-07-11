package java_hw_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Яка загальна вага металу має бути на складі?");
        Integer generalWeight = scanner.nextInt();

        Integer freeSpace = generalWeight;


        while (freeSpace > 0) {
            System.out.println("Склад може прийняти ще: " + freeSpace + " кг");
            System.out.println("Яку вагу металу Ви хочете здати на склад?");
            Integer weightPassed = scanner.nextInt();

            if (weightPassed < 5) {
                System.out.println("Ви не можете здати таку малу кількість металу на склад, треба не меньше 5 кг");

            } else if (weightPassed > freeSpace){
                System.out.println("Неможливо прийняти метал. На складі залишилось місця тільки: " + freeSpace + " кг");
            } else{
                freeSpace = freeSpace - weightPassed;
                System.out.println("Метал прийнято.");
            }

        }
        System.out.println("Склад заповнений. Прийом металу завершено.");
    }
}