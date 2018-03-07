package part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {
    public static void main(String[] args) {
        System.out.println("The area is " + area(2.4, 6.4) + " and the perimeter is " + perimeter(2.4,6.4));
    }

    public static double area(double w, double h) {
        double area = h * w;
        return area;
    }

    public static double perimeter(double w, double h) {
        double perimeter = 2*h + 2*w;
        return perimeter;
    }

}