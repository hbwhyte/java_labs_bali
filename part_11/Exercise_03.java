package part_11;

/**
 * Modify your Queue Class so that it is completely generic
 */

class GenericQueue<E> {
    // Instance Variables
    private E[] qArray;
    private int putloc, getloc;

    // Constructor
    public GenericQueue(E[] qArray) {
        this.qArray = qArray;
        putloc = getloc = 0;
    }

    public E[] getqArray() {
        return this.qArray;
    }

    synchronized void push(E a) throws InterruptedException {
        if (putloc == qArray.length) {
            System.out.println("Sorry, the queue is full!");
            return;
        }
        Thread.sleep(500);
        qArray[putloc++] = a;
    }

    synchronized E pop() throws InterruptedException {
        if (getloc == putloc) {
            System.out.println("Sorry, the queue is empty!");
            return null;

        }
        Thread.sleep(500);
        return qArray[getloc++];
    }
}


class QueueMultiGeneric implements Runnable {

    Thread thread;

    public QueueMultiGeneric(String name, int priority) {
        thread = new Thread(this, name);
        thread.setPriority(priority);
        thread.start();

    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " has entered the Queue");
        Double[] dubArrayObj = new Double[5];
        GenericQueue<Double> stringQueue = new GenericQueue<>(dubArrayObj);
        try {
            for (double i = 0; i < dubArrayObj.length; i++) {
                stringQueue.push(i);
            }
            for (int i = 0; i < dubArrayObj.length; i++) {
                System.out.print("This is " + thread.getName() + ": " + stringQueue.pop() + "\n");
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
        QueueMultiGeneric person1 = new QueueMultiGeneric("Person #1", 5);
        QueueMultiGeneric person2 = new QueueMultiGeneric("Person #2", 5);
        QueueMultiGeneric person3 = new QueueMultiGeneric("Person #3",5);
        System.out.println("Queue is now closed!");
    }
}

