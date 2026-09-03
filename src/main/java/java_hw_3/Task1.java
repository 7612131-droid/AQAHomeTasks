package java_hw_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1;
        String string2;
        String string3;
        String string4;
        System.out.println("Enter - Я");
        string1 = scanner.next();

        System.out.println("Enter - тестую");
        string2 = scanner.next();

        System.out.println("Enter - чудово");
        string3 = scanner.next();

        System.out.println("Enter - Що ще треба?");
        string4 = scanner.next() + " " + scanner.next() + " " + scanner.next();


        System.out.println("String1:" + string1);
        System.out.println("String2:" + string2);
        System.out.println("String3:" + string3);
        System.out.println("String4:" + string4);


    }
}
