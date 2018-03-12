package part_10.Threads;

class Weave {

    public synchronized static void bob(String name) {
            System.out.println(name + " bobs!");
    }

    public synchronized static void weave(String name){
            System.out.println(name + " weaves!");
    }

    public synchronized static void forward(String name) {
            System.out.println("They're running...");
    }

    public static void finish(String name) {
        System.out.println("~~~ " + name + " crosses the finish line ~~~");

    }
}

class ObstacleCourse extends Thread {

    public ObstacleCourse(String name, int priority) {
        super(name);
        this.setPriority(priority);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " is out of the gate!");
        boolean finishLine = false;
        for (int i = 0; i < 5; i++) {
            double r = Math.random() * (4 - 1 + 1);
            try{
                if (r < 1) {
                    currentThread().sleep(500);
                    Weave.weave(getName());
                } else if (r < 2) {
                    currentThread().sleep(500);
                    Weave.bob(getName());
                } else {
                    currentThread().sleep(500);
                    Weave.forward(getName());
                }
            } catch (InterruptedException ie) {
                System.out.println(getName() + " was interrupted.");
            }
        } Weave.finish(getName());

    }
}

class Controller {
    public static void main(String[] args) {
        System.out.println(" --- Let the race begin! ---");
        ObstacleCourse player1 = new ObstacleCourse("Frank the Tank",6);
        ObstacleCourse player2 = new ObstacleCourse("Duchess of Dudleyville", 7);
        ObstacleCourse player3 = new ObstacleCourse("Dan the Man",4);
    }
}
