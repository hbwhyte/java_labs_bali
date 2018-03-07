package part_03;

import java.lang.reflect.Array;
import java.util.Arrays;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */

class Exercise_02 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacci()));
        System.out.println(Arrays.toString(doubleFib()));
        System.out.println(Arrays.toString(goldenRatio()));
    }

    // generate an array with the Fibonacci sequence
    private static int[] fibonacci() {
        int[] fibArray = new int[10];
        fibArray[0] = 1;
        fibArray[1] = 1;
        for (int i = 2; i < fibArray.length; i++) {
            fibArray[i] = fibArray[(i-1)] + fibArray[(i-2)];
            //System.out.println(fibArray[i]);
        }
        return fibArray;
    }
    // Doubles each Fibonacci number, just to practice modifying arrays
    private static int[] doubleFib() {
        int[] fibArray = fibonacci();
        int[] doubleFib = new int[fibArray.length];
        for (int i = 0; i < fibArray.length; i++) {
            doubleFib[i] = fibArray[i] * 2;
        }
        return doubleFib;

    }

    // Demonstrates how numbers of the Fibonacci sequence slowly converge on the golden ratio!
    private static double[] goldenRatio() {
        int[] fibArray = fibonacci();
        double[] fibArrayDub = Arrays.stream(fibArray).asDoubleStream().toArray();
        double[] goldenRatio = new double[fibArrayDub.length-1];
        for (int i = 1; i < fibArrayDub.length-1; i++) {
            goldenRatio[i] = fibArrayDub[i + 1] / fibArrayDub[i];
        }
        return goldenRatio;
    }
}