package part_02;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("How many miles to drive?");
        int miles = scanner.nextInt();
        System.out.println("What is the MPG of the car?");
        int mpg = scanner.nextInt();
        System.out.println("What is the price per gallon of fuel?");
        double price = scanner.nextDouble();
        System.out.println("The trip will cost $" + df2.format(cost(miles, mpg, price)) + " in gas.");
    }

    public static DecimalFormat df2 = new DecimalFormat(".##");

    public static double cost(int miles, int mpg, double price) {
        double gallons = miles / mpg;
        double cost = gallons * price;
        return cost;
    }

}