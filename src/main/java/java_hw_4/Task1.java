package java_hw_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        String word = "";

        while (!word.equals("STOP")) {
            System.out.println("Enter something. For end write STOP:");
            word = scanner.nextLine();
            if (!word.equals("STOP")) {
                result.append(word).append(" ");
            }
        }
        System.out.println("Result");
        System.out.println(result);
    }
}