package part_07.E1;

public class MammaliaClass extends TetrapodSuperClass {
    private String name;
    private boolean laysEggs;
    private String covering;
    private boolean ectothermic;

    public MammaliaClass() {
        this.name = "Mammalia";
        this.laysEggs = false;
        this.covering = "hair or fur";
        this.ectothermic = false;
    }

    public void hello() {
        System.out.println("Hello there! I am a " + name);
    }

    public void skinType() {
        System.out.println("Our bodies are covered in " + covering);
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
