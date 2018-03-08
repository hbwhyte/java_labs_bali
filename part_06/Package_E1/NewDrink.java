package part_06.Package_E1;

public class NewDrink {
    public static void main(String[] args) {
        Coffee arabica = new Coffee(95,"Arabica", "dark roast");
        System.out.println(arabica.toString());

        Tea green = new Tea(84, "Green");
        System.out.println(green.toString());

        Tea black = new Tea("black");
        System.out.println(black.toString());

        Coffee iced = new Coffee(5,"Robusta","iced");
        System.out.println(iced.toString());

        FancyCoffee latte = new FancyCoffee("latte");
        System.out.println(latte.toString());

        FancyCoffee decafSoyLatte = new FancyCoffee(false,"soy","latte");
        System.out.println(decafSoyLatte.toString());

        //Dynamic method dispatch
        dynMethDisp();
    }

    public static void dynMethDisp() {
        HotBeverage hotBev = new HotBeverage();
        Coffee cafe = new Coffee();
        Tea chai = new Tea();
        FancyCoffee oohLaLa = new FancyCoffee();

        HotBeverage superRef;

        superRef = chai;
        superRef.dynDispDemo();

        superRef = oohLaLa;
        superRef.dynDispDemo();

        superRef = hotBev;
        superRef.dynDispDemo();

        superRef = cafe;
        superRef.dynDispDemo();

    }
}
