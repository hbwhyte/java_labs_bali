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
        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 != 0) {
                evenOdd[i / 2] = intArray[i];
            } else {
                switch (i) {
                    case 0:
                        evenOdd[9] = intArray[0];
                    case 2:
                        evenOdd[8] = intArray[2];
                    case 4:
                        evenOdd[7] = intArray[4];
                    case 6:
                        evenOdd[6] = intArray[6];
                    case 8:
                        evenOdd[5] = intArray[8];
                        break;
                    default:
                        continue;
                }
            }
        }
        return evenOdd;
    }
}