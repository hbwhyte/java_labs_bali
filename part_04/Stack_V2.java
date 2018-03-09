package part_04;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

class Stack_V2 {

    private char[] sArray;
    private char putloc, getloc;

    public Stack_V2(int size) {
        sArray = new char[size];
        putloc = getloc = 0;
    }

    void push(char i) {
        if (putloc == sArray.length) {
            System.out.println("Sorry, the stack is full!");
            return;
        }
        sArray[putloc++] = i;
        getloc++;
    }

    char pop() {
        if (getloc == 0) {
            System.out.println("Sorry, the stack is empty!");
            return 0;
        } return sArray[--getloc];

    }
}

class StackLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the desired stack height: ");
        int height = scanner.nextInt();

        Stack_V2 newStack = new Stack_V2(height);

        for(char c = 'a'; c < ('a'+height); c++) {
            newStack.push(c);
        }
        for(char c = 'a'; c < ('a'+height); c++) {
            System.out.println(newStack.pop());
        }
    }
}

