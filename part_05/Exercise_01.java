package part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

//Is there a way to link Food to Shark? So I can specify which shark eats what food?

class SharkTank {
    public static void main(String[] args) {
        // Create an instance of Class_02 (Shark)
        Shark hammerhead = new Shark();
        Shark tiger = new Shark();
        Shark blue = new Shark();

        // Create an instance of Class_03
        Food hammerFood = new Food();
        Food tigerFood = new Food();
        Food blueFood = new Food();

        // Set the private variables of Class_03
        hammerFood.setFoodType("Manta Rays");
        hammerFood.setLive(true);

        tigerFood.setFoodType("Turtles");
        tigerFood.setLive(false);

        blueFood.setFoodType("Squids");
        tigerFood.setLive(true);

        // Set variables of Class_02
        hammerhead.setSpecies("Hammerhead Shark");
        hammerhead.setQuantity(4);
        hammerhead.setWeightKg(450);
        hammerhead.setFood(hammerFood);

        tiger.setSpecies("Tiger Shark");
        tiger.setQuantity(7);
        tiger.setWeightKg(863);
        tiger.setFood(tigerFood);

        blue.setSpecies("Blue Shark");
        blue.setQuantity(3);
        blue.setWeightKg(182);
        blue.setFood(blueFood);

        System.out.println(hammerhead.toString() + "\n\n" + tiger.toString() + "\n\n" + blue.toString());
    }
}

class Shark {
    private String species;
    private int quantity;
    private int weightKg;
    private Food food;

    public static void method1(){

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Our aquarium has " + quantity + " " + species + "s which eat " + food.toString() +
                " and can weigh up to " + weightKg + "kg!";
    }
}

class Food {
    private String foodType;
    private boolean live;

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    @Override
    public String toString() {
        return (live == true ? "live" : "prepared") + " " + foodType;
    }
}