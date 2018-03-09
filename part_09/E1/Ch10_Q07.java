package part_09.E1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class Ch10_Q07 {
    public static void main(String[] args) throws IOException {

        // Declare Streams
        FileInputStream in = null;
        FileOutputStream out = null;

        // Initialize with try
        try {
            int b;
            in = new FileInputStream("/Users/hbwhyte/CodingNomads/bali/java_labs_bali/part_09/E1/newExampleFile.txt");
            out = new FileOutputStream("/Users/hbwhyte/CodingNomads/bali/java_labs_bali/part_09/E1/newExampleFile_Encoded.txt");

            while ((b = in.read()) != -1) {
                if (b == ' ') {
                    out.write('-');
                } else {
                    out.write(b);
                }
            }

        } catch (IOException e) {
            System.out.println("IO Exception found");
        } finally {
            in.close();
            out.close();
        }
        }
}
