package java_hw_10;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("-----Now date-----");
        System.out.println(localDateTime);

        LocalDateTime dateTime = LocalDateTime.of(2023, 10, 25, 14, 30);
        LocalDateTime result = calculateFutureDateTime(dateTime, 3, 5);
        System.out.println("Result of calculate future date time ");
        System.out.println(result);

        System.out.println("Day Saturday is weekend?");
        System.out.println(isWeekend(LocalDateTime.of(2023, 10, 28, 10, 0)));
        System.out.println("Day Monday is weekend?");
        System.out.println(isWeekend(LocalDateTime.of(2023, 10, 30, 10, 0)));


        System.out.println("New format date:");
        System.out.println(formatDateTime(LocalDateTime.of(2023, 10, 25, 14, 30), "dd-MM-yyyy HH:mm"));

        System.out.println("Difference between two days:");
        System.out.println(calculateDifference(
                LocalDateTime.of(2023, 10, 25, 14, 30),
                LocalDateTime.of(2023, 10, 28, 16, 45)));


    }

    public static LocalDateTime calculateFutureDateTime(LocalDateTime dateTime, int days, int hours) {
        return dateTime.plusDays(days).plusHours(hours);

    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        DayOfWeek day = dateTime.getDayOfWeek();

        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            return true;
        } else {
            return false;
        }
    }

    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }

    public static String calculateDifference(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);

        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;

        return days + " днів, " + hours + " годин, " + minutes + " хвилин";
    }

}
    
