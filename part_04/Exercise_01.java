package part_04;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.Arrays;
import java.util.Scanner;
/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */


class Exercise_01 {
    public static void main(String[] args) {
        int i = 0;
        int[] intArray = new int[10];

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter an integer:");
            intArray[i] = scanner.nextInt();
            i++;
        } while (i < intArray.length);
        System.out.println(Arrays.toString(evenOdd(intArray)));
    }


    public static int[] evenOdd(int[] intArray) {
        int[] evenOdd = new int[intArray.length];
        for (int i = 1; i < intArray.length; i+=2) {
            if (i % 2 != 0) {
                evenOdd[i / 2] = intArray[i];
            }
        }
        int part2 = intArray.length/2;
        for (int i = 8; i >= 0 ; i -=2) {
            evenOdd[part2] = intArray[i];
            part2++;
        }
        return evenOdd;
    }
}