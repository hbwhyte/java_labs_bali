package part_07.E1;

public class AnimalHandler {
    public static void main(String[] args) {
        BoaSpecies boa = new BoaSpecies();
        KomodoSpecies komodo = new KomodoSpecies();
        MammaliaClass mammal = new MammaliaClass();
        ReptiliaClass reptile = new ReptiliaClass();
        TetrapodSuperClass tetra = new TetrapodSuperClass();

        tetra.hello();
        tetra.myParent();
        tetra.myRank();
        tetra.countLimbs();
        System.out.println();

        mammal.hello();
        mammal.skinType();
        mammal.coldBlooded();
        mammal.babyMama();
        System.out.println();

        reptile.hello();
        reptile.skinType();
        reptile.coldBlooded();
        reptile.babyMama();
        System.out.println();

        boa.hello();
        boa.babyMama();
        boa.hungry();
        boa.attack();
        System.out.println();

        komodo.hello();
        komodo.hungry();
        komodo.bigBoy();
        System.out.println();

    }
}
