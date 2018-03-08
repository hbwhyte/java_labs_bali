package part_06.Package_E1;

public class Coffee extends HotBeverage {
    private String beanType;
    private String roastStyle;

    public Coffee(int waterTempC, String beanType, String roastStyle) {
        super(waterTempC);
        this.beanType = beanType;
        this.roastStyle = roastStyle;
    }

    public Coffee(String beanType, String roastStyle) {
        this.beanType = beanType;
        this.roastStyle = roastStyle;
    }

    public Coffee(boolean hasCaffeine) {
        super(hasCaffeine);
        this.beanType = "Arabica";
        this.roastStyle = "light roast";
    }

    public Coffee() {
        this.beanType = "Arabica";
        this.roastStyle = "light roast";
    }

    public String getBeanType() {
        return beanType;
    }

    public void setBeanType(String beanType) {
        this.beanType = beanType;
    }

    public String getRoastStyle() {
        return roastStyle;
    }

    public void setRoastStyle(String roastStyle) {
        this.roastStyle = roastStyle;
    }


    public String toString() {
        return "Here is your cup of " + roastStyle + " " + beanType + " coffee. " + super.toString();
    }

    void dynDispDemo() {
        System.out.println("Coffee's DDD.");
    }
}
