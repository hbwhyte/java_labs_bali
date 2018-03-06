package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the radius of the cylinder? ");
        int radius = scanner.nextInt();
        System.out.println("What is the height of the cylinder? ");
        int height = scanner.nextInt();
        System.out.println("The surface area is " + area(radius, height) + " and the volume is " + volume(radius, height));
    }

    public static double area(int radius, int height) {
        double area = (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
        return area;
    }

    public static double volume(int radius, int height) {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }


}