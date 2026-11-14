package java_hw_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What should be the total weight of the metal in the storage?");
        Integer generalWeight = scanner.nextInt();

        Integer freeSpace = generalWeight;


        while (freeSpace > 0) {
            System.out.println("Storage can get else: " + freeSpace + "kg");
            System.out.println("What weight of metal do you want to turn in to the storage?");
            Integer weightPassed = scanner.nextInt();

            if (weightPassed < 5) {
                System.out.println("You cannot turn in such a small amount of metal at the storage, you need at least 5 kg.");

            } else if (weightPassed > freeSpace){
                System.out.println("It is impossible to accept the metal. There is only enough space left in the storage: " + freeSpace + " kg");
            } else{
                freeSpace = freeSpace - weightPassed;
                System.out.println("Metal accepted.");
            }

        }
        System.out.println("Storage is full. Metal intake is complete.");
    }
}