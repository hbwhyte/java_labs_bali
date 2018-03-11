package part_09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
//be sure to close all connections

public class Exercise_03 {

    public static void main(String[] args) throws IOException {
        readLine();
        read();
    }



    static void readLine() throws IOException {
        try (BufferedReader in = new BufferedReader(
                new FileReader("/Users/hbwhyte/CodingNomads/bali/java_labs_bali/part_09/E1/newExampleFile.txt"))) {
            String rl;
            while((rl = in.readLine()) != null) {
                System.out.println(rl + "(end of line)");
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("Sorry, file not found.");
        }
    }

    static void read() throws IOException {
        try (BufferedReader in = new BufferedReader(
                new FileReader("/Users/hbwhyte/CodingNomads/bali/java_labs_bali/part_09/E1/newExampleFile.txt"))) {
            int r;
            while((r = in.read()) != -1){
                System.out.print((char) r+ ".");
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("Sorry, file not found.");
        }

    }
}
