package part_06.Package_E1;

public class HotBeverage {
    private int waterTempC;
    private boolean hasCaffeine;
    private String cupType;

    public HotBeverage() {
        this.waterTempC = 95;
        this.hasCaffeine = true;
        this.cupType = this.cupSelector(waterTempC);
    }

    public HotBeverage(int waterTempC) {
        this.waterTempC = waterTempC;
        this.hasCaffeine = true;
        this.cupType = this.cupSelector(waterTempC);
    }

    public HotBeverage(boolean hasCaffeine) {
        this.waterTempC = 95;
        this.hasCaffeine = false;
        this.cupType = this.cupSelector(waterTempC);
    }

    public int getWaterTempC() {
        return waterTempC;
    }

    public void setWaterTempC(int waterTempC) {
        this.waterTempC = waterTempC;
    }

    public boolean isHasCaffeine() {
        return hasCaffeine;
    }

    public void setHasCaffeine(boolean hasCaffeine) {
        this.hasCaffeine = hasCaffeine;
    }

    public String getCupType() {
        return cupType;
    }

    public void setCupType(String cupType) {
        this.cupType = cupSelector(this.waterTempC);
    }

    @Override
    public String toString() {
        return "It " + (hasCaffeine == true ? "has caffeine" : "is caffeine free") + ", and is served in a " + cupType +
                " at " + waterTempC + " degrees Celsius.";
    }

    public String cupSelector(int waterTempC) {
        if (waterTempC < 20) {
           return "ice cold glass";
        } else {
            return "nice warm mug";
        }
    }

    void dynDispDemo() {
        System.out.println("Hot Beverage's DDD.");
    }
}
