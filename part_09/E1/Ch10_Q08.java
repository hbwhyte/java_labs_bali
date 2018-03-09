package part_09.E1;

import java.io.*;

public class Ch10_Q08 {
    public static void main(String[] args) {

        try (BufferedReader bIn = new BufferedReader(new
                FileReader("/Users/hbwhyte/CodingNomads/bali/java_labs_bali/part_09/E1/newExampleFile.txt"));
            BufferedWriter bOut = new BufferedWriter(new
                FileWriter("/Users/hbwhyte/CodingNomads/bali/java_labs_bali/part_09/E1/newExampleFile_CharEncoded.txt")))
        {
            int c;

            while ((c = bIn.read()) != -1) {
                if (c == ' ') {
                    bOut.write('~');
                } else {
                    bOut.write(c);
                }
            }
            System.out.println("Encoded Copy Complete.");
        } catch (IOException io) {
            System.out.println("IO Exception caught.");
        }
    }
}
