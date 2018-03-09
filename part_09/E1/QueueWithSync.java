package part_09.E1;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;

public class QueueWithSync {

    private ArrayList<Character> myQueue;

    public static void main(String[] args) {
        QueueWithSync newQueue = new QueueWithSync();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the size of the stack: ");
        int queueSize = scanner.nextInt();
        for (char i = 'a'; i <= 'z'; i++) {
            newQueue.add(i);
        }
//        for (char i = 'a'; i <= 'z'; i++) {
//            System.out.println(newQueue.remove());
//        }
    }

    public ArrayList Queue() {
        myQueue = new ArrayList<>();
        return myQueue;
    }

    private char add(char c) {
        myQueue.add(c);
        return c;
    }

    private char remove() {
        if (myQueue.size() == 0) {
            throw new EmptyStackException();
        } else {
            return myQueue.remove(myQueue.size()-1);
        }
    }
}
