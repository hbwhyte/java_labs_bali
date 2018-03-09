package part_07.E1;

public class BoaSpecies extends ReptiliaClass {
    private String speciesName;
    private boolean carnivore;
    private boolean venemous;

    public BoaSpecies() {
        super();
        this.speciesName = "Python";
        this.carnivore = true;
        this.venemous = false;
        super.setLimbs(0);
        super.setLaysEggs(false);
        super.setTaxonomicRank("Species");
    }

    public void hello() {
        System.out.println("Hello there! I am a " + speciesName);
    }

    public void hungry() {
        System.out.println((carnivore ? "Imma gonna eat chu!" : "Do you have a salad?"));
    }

    public void attack() {
        System.out.println((venemous ? "Don't let me bite you!" : "I just want to give you a reallllly big hug..."));
    }

    @Override
    public void babyMama() {
        String babies = (super.isLaysEggs() ? "from eggs laid on land." : "live from my belly!");
        System.out.println("Even though I am a reptile, my babies are born " + babies);
    }

}
