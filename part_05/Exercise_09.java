package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class VarArgsExample {
    public static void main(String[] args) {
        VarArgsExample sb = new VarArgsExample();
        sb.varArgs("Test","this","racecar");
        System.out.println("");
        sb.varArgs("Second", "test of", "things", "and", "words");
        System.out.println("\nUsing String Builder:");
        sb.stringTest("Test", "this", "racecar");
        sb.stringTest("a man", "a plan", "a canal", "panama");
        sb.stringTest("A man,", "a plan,", "a canal:", "Panama");
        sb.stringTest("Kayak", "a nut for a jar of tuna","TacocaT", "Yobananaboy");
    }

    private static void varArgs(String ...v) {
        for (String word : v) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    private static void stringTest(String ...v) {
        for (String word : v) {
            StringBuilder sb = new StringBuilder(word);
            System.out.print(sb.reverse() + " ");
        }
        System.out.println();
    }

}




