package part_07.E1;

public class ReptiliaClass extends TetrapodSuperClass {
    private String name;
    private boolean laysEggs;
    private boolean scales;
    private boolean ectothermic;

    public ReptiliaClass() {
        this.name = "Reptilia";
        this.laysEggs = true;
        this.scales = true;
        this.ectothermic = true;
    }

    public boolean isLaysEggs() {
        return laysEggs;
    }

    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs;
    }

    public void hello() {
        System.out.println("Hello there! I am a " + name);
    }

    public void skinType() {
        String skinType = (scales ? "scales" : "some unknown substance");
        System.out.println("Our bodies are covered in " + skinType);
    }

    public void coldBlooded() {
        if (ectothermic) {
            System.out.println("Brr, it's cold in here. There must be some Toros in the atmosphere!");
        } else {
            System.out.println("I'm feeling hot hot hot!");
        }
    }

    public void babyMama() {
        String babies = (laysEggs ? "from eggs laid on land." : "live from my belly!");
        System.out.println("My babies are born " + babies);
    }

}
