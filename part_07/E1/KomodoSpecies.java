package part_07.E1;

public class KomodoSpecies extends ReptiliaClass {
    private String speciesName;
    private boolean carnivore;
    private int averageWeightKg;
    private int maxWeightKg;

    public KomodoSpecies() {
        this.speciesName = "Komodo Dragon";
        this.carnivore = true;
        this.averageWeightKg = 70;
        this.maxWeightKg = 166;
        super.setTaxonomicRank("Species");
    }

    public void hello() {
        System.out.println("Hello there! I am a " + speciesName);
    }

    public void hungry() {
        System.out.println((carnivore ? "Imma gonna eat chu!" : "Do you have a salad?"));
    }

    public void bigBoy() {
        System.out.println("On average, a " + speciesName + " weighs " + averageWeightKg + "kg, but they have been" +
                " recorded to weigh as much as " + maxWeightKg + "kg!");
    }

}
