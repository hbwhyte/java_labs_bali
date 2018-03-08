package part_05;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.text.DecimalFormat;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */


class Parallel49Brewery {
    public static void main(String[] args) {


        PaleAle trashPanda = new PaleAle();

        trashPanda.setLabel("Trash Panda IPA");
        trashPanda.setAlcPercent(5.5);
        trashPanda.setFruitNotes("grapefruit");
        trashPanda.setIbu(70);
        System.out.println("The " + trashPanda.getLabel() + " has lovely notes of " + trashPanda.getFruitNotes()+".");
        System.out.println("Its alcohol content is currently " + trashPanda.getAlcPercent() + "% and its IBU is " +
                "currently " + trashPanda.getIbu() + ".\n");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int moreHops = trashPanda.getIbu() + moreHops(trashPanda);
        trashPanda.setIbu(moreHops);
        System.out.println("Let's get hoppy - this new batch now has an IBU of " + trashPanda.getIbu() + "!\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double getDrunk = trashPanda.getAlcPercent() + boozify(trashPanda);
        trashPanda.setAlcPercent(getDrunk);
        System.out.println("Okay you alcoholics, just for you this batch is " +
                df1.format(trashPanda.getAlcPercent()) + "% alcohol.\nCheers!");


    }

    public static int moreHops(Object trashPanda) {
        double addHops = Math.random() * (30 + 1 - 1);
        int moreHops = (int) addHops;
        return moreHops;
    }
    private static DecimalFormat df1 = new DecimalFormat(".#");

    public static double boozify(Object trashPanda) {
        double getDrunk = Math.random() * (4 + 1 - 1);
        return getDrunk;
    }
}

class PaleAle {
    private String label;
    private int ibu; //70
    private String fruitNotes;
    private double alcPercent;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getIbu() {
        return ibu;
    }

    public void setIbu(int ibu) {
        this.ibu = ibu;
    }

    public String getFruitNotes() {
        return fruitNotes;
    }

    public void setFruitNotes(String fruitNotes) {
        this.fruitNotes = fruitNotes;
    }

    public double getAlcPercent() {
        return alcPercent;
    }

    public void setAlcPercent(double alcPercent) {
        this.alcPercent = alcPercent;
    }
}