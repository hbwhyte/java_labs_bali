package part_04;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;

/**
 The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */

public class Stack {
    private ArrayList<Character> myStack;
    public static void main(String[] args) {
        Stack newStack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the size of the stack: ");
        int stackSize = scanner.nextInt();
        for (char i = 'a'; i < 'a'+stackSize; i++) {
            newStack.push(i);
        }
        for (char i = 'a'; i < 'a'+stackSize; i++) {
                System.out.println(newStack.pop());
        }
    }
    public Stack() {
        myStack = new ArrayList<>();
    }
    private char push (char c) {
        myStack.add(c);
        return c;
    }
    private char pop() {
        if (myStack.size() == 0) {
            throw new EmptyStackException();
        } else {
            return myStack.remove(myStack.size()-1);
        }
    }
}