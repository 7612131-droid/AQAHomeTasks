package java_hw_3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String program;
        String operationSystem;

        System.out.println("Яка программа тобі цікава? (IntelliJ IDEA, Git, Java)");
        program = scanner.nextLine();
        System.out.println("Яка операційна система потрібна? (Linux, MacOS, Windows)");
        operationSystem = scanner.nextLine();

        switch (program) {
            case "IntelliJ IDEA":
                switch (operationSystem) {
                    case "Linux":
                        System.out.println("https://www.jetbrains.com/idea/download/?section=linux");
                        break;
                    case "MacOS":
                        System.out.println("https://www.jetbrains.com/idea/download/?section=mac");
                        break;
                    case "Windows":
                        System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
                        break;
                    default:
                        System.out.println("Такої ОС немає");

                }
                break;

            case "Git":
                switch (operationSystem) {
                    case "Linux":
                        System.out.println("https://git-scm.com/download/linux");
                        break;
                    case "MacOS":
                        System.out.println("https://git-scm.com/download/mac");
                        break;
                    case "Windows":
                        System.out.println("https://git-scm.com/download/win");
                        break;
                    default:
                        System.out.println("Такої ОС немає");

                }
                break;

            case "Java":
                switch (operationSystem) {
                    case "Linux":
                        System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk-linux");
                        break;
                    case "MacOS":
                        System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk-mac");
                        break;
                    case "Windows":
                        System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk-windows");
                        break;
                    default:
                        System.out.println("Такої ОС немає");
                }
                break;

            default:
                System.out.println("Такої програми не існує");

        }


    }
}
