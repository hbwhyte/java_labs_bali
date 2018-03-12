package part_09;

/**
 * 12. On your own, try adding synchronization to the Queue class developed in previous chapters
 * so that it is safe for multithreaded use.
 */

//String Queue
class QueueSync2 {

    private String[] qArray;
    private int putloc, getloc;

    public QueueSync2(int size) {
        qArray = new String[size];
        putloc = getloc = 0;
    }

    synchronized void push(String a) throws InterruptedException {
        if (putloc == qArray.length) {
            System.out.println("Sorry, the queue is full!");
            return;
        }
        Thread.sleep(500);
        qArray[putloc++] = a;
    }

    synchronized String pop() throws InterruptedException {
        if (getloc == putloc) {
            System.out.println("Sorry, the queue is empty!");
            return null;

        }
        Thread.sleep(500);
        return qArray[getloc++];
    }
}


class QueueMulti2 implements Runnable {

    Thread thread;

    public QueueMulti2(String name, int priority) {
        thread = new Thread(this, name);
        thread.setPriority(priority);
        thread.start();

    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " has entered the Queue");
        int arrLength = 4;
        QueueSync2 newQueue = new QueueSync2(arrLength);
        try {
            for (int i = 0; i < arrLength; i++) {
                newQueue.push(thread.getName() + " is at " + i);
            }
            for (int i = 0; i < arrLength; i++) {
                System.out.println(newQueue.pop());
            }
        } catch (InterruptedException ie) {
            System.out.println("Interrupted");
            System.out.println(thread.getName() + " exited the Queue.");

        }
    }
}

class QueueLabWithSync2 {
    public static void main(String[] args) {
        System.out.println("Starting the Queue!");
        QueueMulti2 person1 = new QueueMulti2("Person #1", 5);
        QueueMulti2 person2 = new QueueMulti2("Person #2", 5);
        QueueMulti2 person3 = new QueueMulti2("Person #3", 5);
        System.out.println("Queue is now closed!");
    }
}
