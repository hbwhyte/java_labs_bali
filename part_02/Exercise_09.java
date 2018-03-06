package part_02;


/**
 * Part 2 Exercise 9:
 *
 *      Use a do-while loop to print out the letters of the alphabet in reverse order.
 *
 */
public class Exercise_09 {
    public static void main(String[] args) {
        char letter = 90;
        do {
            System.out.println(letter);
            letter--;
        } while (letter > 64);
    }
}


