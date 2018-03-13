package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        boolean andand = false;
        boolean oror = false;
        boolean hat = false;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer from 1 to 999,999,999: ");
        int input = scanner.nextInt();

        // use the && operator to see if the user's number is divisible by both 4 and 7
        if (input % 4 == 0 && input % 7 == 0) {
            andand = true;
        }

        // use the || operator to see if the user's number is divisible by 4 or 7
        if (input % 4 == 0 || input % 7 == 0) {
            oror = true;
        }

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        if (input % 4 == 0 ^ input % 7 ==0) {
            hat = true;
        }

        // print out the results
        System.out.println(input + isNot(andand) + "divisible by both 4 and 7.");
        System.out.println(input + isNot(oror) + "divisible by either 4 or 7.");
        System.out.println(input + isNot(hat) + "divisible by 4 or 7 exclusively.");
    }

    public static String isNot(boolean result) {
        if (result == true) {
            return " is ";
        } else {
            return " is not ";
        }

    }

}


