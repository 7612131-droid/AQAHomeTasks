package java_hw_5;

import java.util.Random;
import java.util.Scanner;

public class NumbersApplication {
    private String name;
    private int gameNumber;

    public NumbersApplication(String name) {
        this.name = name;
        Random random = new Random();
        this.gameNumber = random.nextInt(101);
    }

    public void startGame(Scanner scanner) {
        int[] turn = new int[100];
        int turnCount = 0;

        while (true) {
            System.out.println("Enter your number:");
            int userNumber = scanner.nextInt();
            if (turnCount < turn.length) {
                turn[turnCount] = userNumber;
                turnCount++;
            }
            if (userNumber < gameNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (userNumber > gameNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + " " + "you WIN!");
                break;

            }
        }


    }
}
