package part_08.E1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatchClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;

        do {
            try {
                System.out.println("Please input an integer: ");
                int input = scanner.nextInt();
                System.out.println("Your input: " + input);
                tryAgain = false;
            } catch (InputMismatchException ime) {
                System.out.println("Input Mismatch: Sorry, that's not an integer.");
                scanner.nextLine();
            }
        } while (tryAgain);

    }
}
