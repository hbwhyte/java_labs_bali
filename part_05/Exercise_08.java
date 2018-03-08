package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, access the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a instance variable in the outer with this value.
 */


class MantisShrimp {
    private String name = "Mantis Shrimp";
    private int photoreceptors;
    private int visibleColors;
    private int extraReceptors = 0;

    public static void main(String[] args) {
        MantisShrimp newMantis = new MantisShrimp();

        newMantis.setPhotoreceptors(16);
        newMantis.setVisibleColors(newMantis.colors());
        newMantis.setExtraReceptors(newMantis.extra());

        System.out.println(newMantis.toString());
    }

    int colors() {
        CompoundEye colors = new CompoundEye();
        return colors.manyColors();
    }

    int extra() {
        CompoundEye extra = new CompoundEye();
        return extra.humanReceptors();
    }

    public int getPhotoreceptors() {
        return photoreceptors;
    }

    public void setPhotoreceptors(int photoreceptors) {
        this.photoreceptors = photoreceptors;
    }

    public int getVisibleColors() {
        return visibleColors;
    }

    public void setVisibleColors(int visibleColors) {
        this.visibleColors = visibleColors;
    }

    public int getExtraReceptors() {
        return extraReceptors;
    }

    public void setExtraReceptors(int extraReceptors) {
        this.extraReceptors = extraReceptors;
    }

    @Override
    public String toString() {
        return "The " + name + " has " + photoreceptors + " photoreceptors in its crazy eyes (" + extraReceptors +
        " more than humans) which means it can see over " + visibleColors + " colors!";
    }

    class CompoundEye {

        int manyColors() {
            int visColors = photoreceptors * photoreceptors;
            return visColors;
        }

        int humanReceptors() {
            int humanReceptors = getPhotoreceptors() - 3;
            return humanReceptors;
        }
    }
}