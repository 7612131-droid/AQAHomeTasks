package java_hw_8.listOfPeople;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Welcome to the program!");

        int id = 1;

        while (true) {
            System.out.println("Choose what do you want to do: Add person, get person, exit. Write please:");
            String enteringText = scanner.nextLine();

            if (enteringText.equalsIgnoreCase("exit")) {
                System.out.println("Program finished");
                break;
            }

            if (enteringText.equalsIgnoreCase("Add person")) {
                System.out.println("Write name:");
                String name = scanner.nextLine();

                System.out.println("Write surname:");
                String surname = scanner.nextLine();

                System.out.println("Write age:");
                int age = scanner.nextInt();
                scanner.nextLine();

                String foundId = findPersonId(map, name, surname);

                if (foundId == null) {
                    Person person = new Person(name, surname, age);
                    map.put(String.valueOf(id), person);

                    System.out.println("Person was added with id: " + id);
                    id++;
                } else {
                    System.out.println("This person already exists with id: " + foundId);
                    System.out.println(map.get(foundId));
                }
            } else if (enteringText.equalsIgnoreCase("Get person")) {
                System.out.println("Write name:");
                String name = scanner.nextLine();

                System.out.println("Write surname:");
                String surname = scanner.nextLine();

                String foundId = findPersonId(map, name, surname);

                if (foundId == null) {
                    System.out.println("This person is new. Add to map? yes/no");
                    String answer = scanner.nextLine();

                    if (answer.equalsIgnoreCase("yes")) {
                        System.out.println("Write age:");
                        int age = scanner.nextInt();
                        scanner.nextLine();

                        Person person = new Person(name, surname, age);
                        map.put(String.valueOf(id), person);

                        System.out.println("Person added with id: " + id);
                        id++;
                    } else {
                        System.out.println("Person was not added.");
                    }
                } else {
                    System.out.println("Person found:");
                    System.out.println(map.get(foundId));
                }
            } else {
                System.out.println("Unknown command");
            }
        }

        scanner.close();
    }

    public static String findPersonId(Map<String, Person> map, String name, String surname) {
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            Person person = entry.getValue();

            if (person.getName().equalsIgnoreCase(name)
                    && person.getSurname().equalsIgnoreCase(surname)) {
                return entry.getKey();
            }
        }

        return null;
    }
}