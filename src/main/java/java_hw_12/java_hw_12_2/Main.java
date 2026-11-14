package java_hw_12.java_hw_12_2;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Vechical vechical1 = new Vechical("Car", 320, 68000, 4);
        Vechical vechical2 = new Vechical(null, 320, 68000, 4);

        System.out.println("------------------Vechical1--------------------");
        Optional<String> result = Optional.ofNullable(vechical1.getName());
        boolean present = result.isPresent();

        System.out.println(result);
        System.out.println(present);

        String resultGet = result.orElse("Unknown");
        System.out.println(resultGet);

        result.ifPresent(name -> System.out.println(name));

        System.out.println("------------------Vechical2--------------------");
        Optional<String> result1 = Optional.ofNullable(vechical2.getName());
        boolean present1 = result1.isPresent();

        System.out.println(result1);
        System.out.println(present1);

        String resultGet1 = result1.orElse("Unknown");
        System.out.println(resultGet1);

        result1.ifPresent(name -> System.out.println(name));


    }
}
