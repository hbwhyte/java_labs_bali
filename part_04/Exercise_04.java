package part_04;

import com.sun.tools.jdi.IntegerValueImpl;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };
        // uncomment the lines below when your methods are ready
        System.out.println("The max value is " + getMaxVal(dataArray));
        System.out.println("The min value is " + getMinVal(dataArray));
    }

    // write a method called getMaxVal that takes in a 2D array and iterates through the array to determine the max value in array
    public static int getMaxVal(int[][] dataArray){
        int maxVal = dataArray[0][0];
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray[i].length; j++) {
                if (dataArray[i][j] > maxVal) {
                    maxVal = dataArray[i][j];
                } else {
                    continue;
                }
            }
        }
        return maxVal;
    }

    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array
    public static int getMinVal(int[][] dataArray) {
        int minVal = dataArray[0][0];
        for (int[] row: dataArray) {
            for (int val : row) {
                if(val < minVal) {
                    minVal = val;
                }
            }
        }
        return minVal;
    }
}
















