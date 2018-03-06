package part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of minutes: ");
        int mins = scanner.nextInt();
        System.out.println(mins + " minutes is " + years(mins) + " years and " + days(mins) + " days.");
    }

    public static int days(int mins){
        int days = (mins / 60 / 24)%365;
        return days;
    }

    public static int years(int mins) {
        int years = mins / 60 / 24 / 365;
        return years;
    }

}


