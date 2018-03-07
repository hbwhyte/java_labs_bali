package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        System.out.println("Her average speed is " + miles() + " miles per hour.");
    }

    public static int miles() {
        int km = 12;
        double kmMin = 30.5;

        double kmHour = (km * 60) / kmMin;
        double miles = kmHour / 1.6;
        int intMiles = (int) miles;

        return intMiles;
    }
}