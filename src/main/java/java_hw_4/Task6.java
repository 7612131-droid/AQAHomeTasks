package java_hw_4;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[45];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Maximum number in the array: " + max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println("Minimum number in the array: " + min);
    }
}
