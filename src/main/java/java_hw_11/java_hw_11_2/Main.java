package java_hw_11.java_hw_11_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Petrov", 35, 4500);
        Person person2 = new Person("Oksana", "Zabugko", 88, 5500);
        Person person3 = new Person("Lili", "Lavadenko", 72, 34500);
        Person person4 = new Person("Bogdan", "Nosenko", 48, 24500);
        Person person5 = new Person("Goran", "Zagaria", 58, 47500);


        List<Person> persons = new ArrayList<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        System.out.println(persons);

        List<String> filterAge = persons.stream()
                .filter(person -> person.getAge() < 70)
                .map(person -> person.getName())
                .collect(Collectors.toList());


        System.out.println(filterAge);
    }
}
