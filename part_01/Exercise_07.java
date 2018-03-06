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

public class Exercise_07 {

    public static void main(String[] args) {
        double pi = 4 * (negFactor() + posFactor());
        System.out.println(pi);
     }

    public static double negFactor() {
        double negFactor = 0;

        for (double i = 1; i < 50000; i +=4) {
            negFactor += (-1 / i);
            //System.out.println(negFactor);
        }

        return negFactor;
    }

    public static double posFactor() {
        double posFactor = 0;

        for (double i = 3; i < 50000; i +=4) {
            posFactor += (1 / i);
            // System.out.println("i is " + i + " and pf is " + posFactor);
        }
        return posFactor;
    }



}

