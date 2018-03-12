package part_11;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

import java.util.Arrays;

public class Exercise_02 {
    public static <T> void exchange(T[] newArray, int pos1, int pos2) {
        System.out.println("The original string is " + Arrays.toString(newArray));
        T a = newArray[pos1];
        newArray[pos1] = newArray[pos2];
        newArray[pos2] = a;
        System.out.println("The new string is " + Arrays.toString(newArray));

    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] stringArray = {"the","quick","brown","fox","jumped","over","the","lazy","dog"};
        exchange(intArray,3,1);
        exchange(stringArray, 7,3);
    }
    
}

