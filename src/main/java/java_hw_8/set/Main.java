package java_hw_8.set;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Oksana", "Zabushko", 20);
        Person person2 = new Person("Ivan", "Petrenko", 21);
        Person person3 = new Person("Vasil", "Shklyar", 18);
        Person person4 = new Person("Alisa", "Solonar", 19);
        Person person5 = new Person("Igor", "Mukolaev", 23);
        Person person6 = new Person("Taras", "Shevchenko", 20);
        Person person7 = new Person("Lesya", "Ukrainka", 22);
        Person person8 = new Person("Oksana", "Zabushko", 20);
        Person person9 = new Person("Vasil", "Shklyar", 18);

        Set<Person> personsSet = new HashSet<>();

        personsSet.add(person1);
        personsSet.add(person2);
        personsSet.add(person3);
        personsSet.add(person4);
        personsSet.add(person5);
        personsSet.add(person6);
        personsSet.add(person7);
        personsSet.add(person8);
        personsSet.add(person9);


        System.out.println("Adding elements without dublcate:");
        System.out.println(personsSet);

        System.out.println("Size our set:");
        System.out.println(personsSet.size());

        System.out.println("Delete one person with name Igor and show all set now:");
        personsSet.remove(person5);

        System.out.println(personsSet);

        System.out.println("Size our set:");
        System.out.println(personsSet.size());

        System.out.println("Is the set empty?");
        System.out.println(personsSet.isEmpty());

        System.out.println("Delete all elements");
        personsSet.clear();

        System.out.println(personsSet);
        System.out.println(personsSet.size());

        System.out.println("Is the set empty?");
        System.out.println(personsSet.isEmpty());


    }


}
