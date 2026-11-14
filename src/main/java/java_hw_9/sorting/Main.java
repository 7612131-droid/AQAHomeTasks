package java_hw_9.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Cars> carsList = new ArrayList<>();


        Cars car1 = new Cars("Volkswagen", 38000, 260);
        Cars car2 = new Cars("Toyota", 45000, 320);
        Cars car3 = new Cars("Lada", 8000, 120);
        Cars car4 = new Cars("Infinity", 65000, 280);
        Cars car5 = new Cars("Audi", 55000, 330);

        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);
        System.out.println("The list before sort:");
        System.out.println(carsList);

        Collections.sort(carsList);

        System.out.println("The list sorted by speed:");
        System.out.println(carsList);


        }

    }


