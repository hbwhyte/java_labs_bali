package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pounds? ");
        int lbs = scanner.nextInt();
        System.out.println(lbs + " pounds is " + kilos(lbs) + " kilos.");
    }
    public static float kilos(int lbs) {
        float kilos = lbs * 0.454F;
        return kilos;
    }
}