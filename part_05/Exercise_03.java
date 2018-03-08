package part_05;

import com.sun.org.apache.xpath.internal.operations.Mult;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class MyIntMath {
    public static void main(String[] args) {
        MultiplyInt intObj = new MultiplyInt();
        int intOverload = intObj.multiply(4,13);
        System.out.println("With int inputs, the result is: " + intOverload + "\n");
        int doubleOverload = intObj.multiply(3.4, 4.999);
        System.out.println("With double inputs, the result is: " + doubleOverload + "\n");
        int floatOverload = intObj.multiply(4.5666F,32.009F);
        System.out.println("With float inputs, the result is: " + floatOverload + "\n");
    }
}

class MultiplyInt {
    public static int multiply(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public static int multiply(double a, double b) {
        int multiply = (int) a * (int) b;
        return multiply;
    }

    public static int multiply(float a, float b) {
        int multiply = (int) a * (int) b;
        return multiply;
    }
}