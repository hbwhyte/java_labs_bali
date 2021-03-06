package part_01;

/**
 * Part 1 Exercise 7:
 *      Print pi to the console using the following formula: note that this is not the complete series to
 *      compute the true number pi.
 *
 *      4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 *
 *
 */

public class Exercise_07_2 {

    public static void main(String[] args) {
        double pi = 4 * (factor());
        System.out.println(pi);
    }

    public static double factor() {
        double factor = 0;
        double y = 1;

        for (double i = 1; i < 120000; i +=2) {
            factor += (y / i);
            y = -y;
        }
        return factor;
    }

}

