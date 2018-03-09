package part_07.E1;

public class TetrapodSuperClass {
    private String name;
    private int limbs;
    private String phylum;
    private String taxonomicRank;

    public TetrapodSuperClass() {
        this.name = "Tetrapod";
        this.limbs = 4;
        this.phylum = "Chordata";
        this.taxonomicRank = "SuperClass";
    }

    public void setTaxonomicRank(String taxonomicRank) {
        this.taxonomicRank = taxonomicRank;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }
    public void hello() {
        System.out.println("Hello there! I am a " + name);
    }
    public void countLimbs() {
        System.out.println("How many limbs do I have?");
       for (int i = 0; i < limbs-1; i++) {
           System.out.println((i+1) + "... ");
       }
        System.out.println(limbs + "!");
    }

    public void myParent() {
        System.out.println("My phylum is " + phylum);
    }

    public void myRank() {
        System.out.println("My taxonomic rank is " + taxonomicRank);
    }
}
