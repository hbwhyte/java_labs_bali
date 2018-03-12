package part_10.Threads;

/**
 * Create an application that demonstrates how to create threads by implementing the runnable interface
 * Create an application that demonstrates the use of getName() on threads
 */

class ThreadChecker implements Runnable {

    Thread thread;

    public ThreadChecker(String name) {
        thread = new Thread(this, name);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    int sum = 0;

    @Override
    public synchronized void run() {
        String name = thread.getName().toLowerCase();
        char[] charArray = name.toCharArray();
        int[] intArray = new int[name.length()];
        for (int i = 0; i < name.length(); i++) {
            if (charArray[i] == 32) {
                intArray[i] = 0;
            } else {
                intArray[i] = charArray[i] - 96;
            }
        }
        sum = 0;
        for (int i : intArray) {
            sum += i;
            System.out.println("Current sum for " + thread.getName() + " is " + sum);
        }
        System.out.println(thread.getName() + "'s final score is " + sum + "!");

    }

    public int getSum() {
        return sum;
    }

    public String getName() {
        return thread.getName();
    }

}

class NewClass {
    public static void main(String[] args) {
        System.out.println("Who's name has the highest numerical value?");
        ThreadChecker ryan = new ThreadChecker("Ryan Desmond");
        ThreadChecker caden = new ThreadChecker("Caden Mackenzie");
        ThreadChecker heather = new ThreadChecker("Heather Whyte");

        int[] sumArray = new int[]{ryan.getSum(), caden.getSum(), heather.getSum()};
        int highestSum = sumArray[0];
        String highestName;
        for (int i = 0; i < sumArray.length; i++) {
            if (sumArray[i] > highestSum) {
                highestSum = sumArray[i];
            }
        }
        if (ryan.getSum() == highestSum) {
            highestName = ryan.getName();
        } else if (caden.getSum() == highestSum) {
            highestName = caden.getName();
        } else {
            highestName = heather.getName();
        }
        System.out.println("The highest value was for " + highestName + " with a sum of " + highestSum);
    }
}



