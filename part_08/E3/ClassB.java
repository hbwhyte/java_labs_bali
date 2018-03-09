package part_08.E3;

import java.util.Arrays;

public class ClassB {

    public int[] arrayExcTest() throws ArrayIndexOutOfBoundsException {
        // generate and throw and exception back to ClassA
        int[] intArray = new int[8];
        try {
            for (int i = 0; i < intArray.length+1; i++) {
                intArray[i] = i * 2;
            }
            System.out.println(Arrays.toString(intArray));
        } catch (ArrayIndexOutOfBoundsException aioob) {
           throw aioob;
        }
        return intArray;

    }
}
