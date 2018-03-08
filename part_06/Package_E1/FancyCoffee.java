package part_06.Package_E1;

public class FancyCoffee extends Coffee {
    private String milkType;
    private String coffeeStyle;

    public FancyCoffee(String coffeeStyle) {
        this.milkType = "2% milk";
        this.coffeeStyle = coffeeStyle;
    }

    public FancyCoffee() {
        this.milkType = "Orange Mocha";
        this.coffeeStyle = "Frappuccino";
    }

    public FancyCoffee(String milkType, String coffeeStyle) {
        this.milkType = milkType;
        this.coffeeStyle = coffeeStyle;
    }

    public FancyCoffee(boolean hasCaffeine, String milkType, String coffeeStyle) {
        super(hasCaffeine);
        this.milkType = milkType;
        this.coffeeStyle = coffeeStyle;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public String getCoffeeStyle() {
        return coffeeStyle;
    }

    public void setCoffeeStyle(String coffeeStyle) {
        this.coffeeStyle = coffeeStyle;
    }

    @Override
    public String toString() {
        return "Here is your " + milkType + " " + coffeeStyle + ". " + super.toString();
    }

    void dynDispDemo() {
        System.out.println("Fancy Coffee's DDD.");
    }
}

