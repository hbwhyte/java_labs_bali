package part_06.Package_E1;

public class Tea extends HotBeverage {
    private String teaType;

    protected Tea(int waterTempC, String teaType) {
        super(waterTempC);
        this.teaType = teaType;
    }

    protected Tea(String teaType) {
        this.teaType = teaType;
    }

    protected Tea() {
        this.teaType = "Orange Pekoe";
    }

    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }

    @Override
    public String toString() {
        return "Here is your cup of " + teaType + " tea. " + super.toString();
    }
    void dynDispDemo() {
        System.out.println("Tea's DDD.");
    }
}
