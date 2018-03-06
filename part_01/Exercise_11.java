package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {


    public static void main(String[] args) {
        int startPop = 380123456;
        int endPop = startPop + change();
        System.out.println("The total population in 3 years will be " + change());
    }

    public static int seconds() {
        int seconds = 3 * 365 * 24 * 60 * 60;
        return seconds;

    }
    public static int change() {
        int births = seconds() / 6;
        int deaths = seconds() / -12;
        int imm = seconds() / 40;
        int change = births + deaths + imm;
        return change;
    }
}