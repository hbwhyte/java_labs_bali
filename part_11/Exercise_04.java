package part_11;

/**
 make a new generic method called sumArray that will return the
 sum of all numbers in the array (no matter data type of numbers
 the array has in it)
 */

import java.util.List;
import java.util.Arrays;

class Exercise_04 {


    public static <N extends Number> double sumArray(N[] array) {
        double sum = 0.0;
        for (N number : array) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Double[] dubArray = {3.5, 55.4, 3.44434, 6.66667};
        Float[] floatArray = {4.5F, 5.555F, 1232.3F};
        Integer[] intArray = {2, 4, 6, 7, 0};

        System.out.println("The sum of intArray is: " + sumArray(intArray));
        System.out.println("The sum of dubArray is: " + sumArray(dubArray));
        System.out.println("The sum of floatArray is: " + sumArray(floatArray));
    }

}

class Exercise_04_List {

    public static double sumArray(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intArray = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Double> dubArray = Arrays.asList(3.5, 55.4, 3.44434, 6.66667);
        List<Float> floatArray = Arrays.asList(4.5F, 5.555F, 1232.3F);

        System.out.println("The sum of intArray is: " + sumArray(intArray));
        System.out.println("The sum of dubArray is: " + sumArray(dubArray));
        System.out.println("The sum of floatArray is: " + sumArray(floatArray)); }
}


