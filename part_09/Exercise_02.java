package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.*;

public class Exercise_02 {
    public static void main(String[] args) throws IOException {

        try (BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("/Users/hbwhyte/CodingNomads/bali/java_labs_bali/part_09/E1/newExampleFile2.txt"))) {
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException fnf){
            System.out.println("File not found.");
        }
    }


}
