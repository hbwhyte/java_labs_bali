package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

class Pasta {
    public static void main(String[] args) {
        Sauce bolognese = new Sauce("Bolognese");
        System.out.println("Sauce type: " + bolognese.getType()+"\n");

        Sauce alfredo = new Sauce("Alfredo","White",false);
        System.out.println("Sauce type: " + alfredo.getType() + "\nSauce color: " + alfredo.getColor());
        System.out.println("\nVegan: " + alfredo.isVegan()+"\n");

        Sauce pesto = new Sauce("Pesto", "Green",80, false);
        System.out.println("Sauce type: " + pesto.getType() + "\nSauce color: " + pesto.getColor());
        System.out.println("Calories per tbsp: " + pesto.getCalories() + "\nVegan: " + pesto.isVegan()+"\n");

        Sauce tomato = new Sauce("Tomato", "Red",29, true);
        System.out.println("Sauce type: " + tomato.getType() + "\nSauce color: " + tomato.getColor());
        System.out.println("Calories per tbsp: " + tomato.getCalories() + "\nVegan: " + tomato.isVegan()+"\n");
    }
}

class Sauce {
    private String type;
    private String color;
    private int calories;
    private boolean vegan;

    public Sauce(String type) {
        this.type = type;
    }

    public Sauce(String type, String color, boolean vegan) {
        this.type = type;
        this.color = color;
        this.vegan = vegan;
    }

    public Sauce(String type, String color, int calories, boolean vegan) {
        this.type = type;
        this.color = color;
        this.calories = calories;
        this.vegan = vegan;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isVegan() {
        return vegan;
    }
}