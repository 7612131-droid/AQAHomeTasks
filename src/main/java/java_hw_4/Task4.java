package java_hw_4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = {10, 12, 14, 16, 20};
        String[] array2 = {"Петя", "Маша", "Олена", "Федя", "Саша", "Антон", "Гліб"};
        String[] array3 = {"школи", "магазину", "церкви", "тренажерного залу", "кіно", "поліклініки"};

        System.out.println("Enter the first value between 0-4");

        int a = scanner.nextInt();

        System.out.println("Enter the second value between 0-6");

        int b = scanner.nextInt();

        System.out.println("Enter the third value between 0-5");

        int с = scanner.nextInt();

        System.out.println(array2[b] +" " + "буде йти до" + " " + array3[с]  + " " +"о" + " " + array1[a]);
    }
}
