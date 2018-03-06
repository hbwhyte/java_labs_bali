
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

import java.text.DecimalFormat;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an investment amount: ");
        int principal = scanner.nextInt();
        System.out.println("Please enter the interest rate in percentage: ");
        double interest = scanner.nextDouble();
        System.out.println("Please enter the number of years to invest: ");
        int years = scanner.nextInt();
        System.out.println("The future value of your investment is $" + df2.format(futVal(principal, interest, years)));
    }

    private static DecimalFormat df2 = new DecimalFormat(".##");

    private static double futVal(int principal, double interest, int years) {
        double iDecimal = interest / 100;
        double futVal = principal * Math.pow((1 + iDecimal), years);
        return futVal;
    }
}


