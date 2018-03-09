package part_08.E3;


public class ClassA {

    public static void main(String[] args) {
        //Call method in ClassB
        ClassB obj = new ClassB();
        try {
            obj.arrayExcTest();
        } catch (ArrayIndexOutOfBoundsException aioob) {
            System.out.println("Sorry, this array index is out of bounds.");
        }
    }
}
