package part_09;


//Bonus questions not covered in book.

//Write a class that can get the date of the last modification, can check whether or not you can write to that file
//and can set a file to read-only.
//Hint, use the "File" class.

import java.io.File;
import java.text.SimpleDateFormat;

public class Exercise_04 {
    public static void main(String[] args) throws SecurityException {
        File example = new File("/Users/hbwhyte/CodingNomads/bali/java_labs_bali/part_09/E1/newExampleFile.txt");

        long lastMod = example.lastModified();
        String pattern = "yyyy-MM-dd 'at' HH:mm:ss";
        SimpleDateFormat myFormat = new SimpleDateFormat(pattern);
        System.out.println("File was last modified on " + myFormat.format(lastMod));

        System.out.println(example.canWrite() ? "Can write to file." : "Cannot write to file.");

        example.setReadOnly();
        System.out.println(example.canWrite() ? "Can write to file." : "Cannot write to file.");
    }

}








