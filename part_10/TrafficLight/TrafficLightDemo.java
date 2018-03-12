package part_10.TrafficLight;

enum TrafficLightColor {
    RED(4000), GREEN(3000), YELLOW(1000);

    private int delay;

    TrafficLightColor(int d) {
        delay = d;
    }

    public int getDelay() {
        return delay;
    }

}

class TrafficLightSimulator implements Runnable {
    private Thread thread;  // Hold the thread that runs the simulation
    private TrafficLightColor tlc; // Holds the color of the traffic light
    boolean stopped = false; // changes to true to end the simulation
    boolean changed = false; // true when light is changed

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
        thread = new Thread(this);
        thread.start();
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (!stopped) {
            try {
                Thread.sleep(tlc.getDelay());
            } catch (InterruptedException ie) {
                System.out.println("Thread was interrupted.");
            }
            changeColor();
        }

    }

    synchronized void changeColor(){
        tlc = tlc.values()[(tlc.ordinal() +1) % 3];
        changed = true;
        notify();
    }
    synchronized void waitForChange() {
        try {
            while(!changed) {
                wait();
            } changed = false;
        } catch (InterruptedException ie) {
            System.out.println("Wait was interrupted");
        }
    }

    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    synchronized void cancel() {
        stopped = true;
    }
}

class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
        for (int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}
