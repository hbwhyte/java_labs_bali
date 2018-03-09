package part_07.E1;

public interface SuperClassInterface {

    void hello();

    void myParent();

    void countLimbs();

    default void myRank() {
        System.out.println("I don't know what my taxonomic rank is... ");
    }

}
