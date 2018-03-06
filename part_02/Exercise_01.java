package part_02;

/**
 * Part 2 Exercise 1:
 *      Celsius to Fahrenheit
 *
 *      Write the necessary code to read a degree in Celsius (as a double) from the console
 *      then convert it to fahrenheit and print it to the console.
 *
 *          F = 9 * (C / 5) + 32;
 *
 *      Output should read like - "27.4 degrees celsius = 81.32 degrees fahrenheit"
 */

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit(celsius) + " degrees fahrenheit.");

    }
    public static double fahrenheit(double celsius) {
        double f = 9 * (celsius / 5) + 32;
        return f;
    }

}