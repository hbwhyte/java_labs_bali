package part_05;

import java.util.Scanner;

/**
 * Write one class. This class must have two methods, a main() + a recursive method. The recursive method must take in
 * an integer as a parameter. The recursive method must then print out "Hello Recursion!" as many times as the "initial"
 * input parameter dictates. For instance if the int passed to the recursive method is 10. The recursive method must print
 * out "Hello Recursion!" 10 times.
 *
 */

class TestRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times should I say hello?");
        int input = scanner.nextInt();

        recursive(input);
        scanner.close();
    }

    public static void recursive(int input) {
        if (input <= 0) {
            return;
        }
        recursive(input - 1);
        System.out.println("Hello Recursion! " + input);
    }
}