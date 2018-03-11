package part_09.E1;

/**
 12. On your own, try adding synchronization to the Queue class developed in previous chapters
 so that it is safe for multithreaded use.
 */

import java.util.concurrent.locks.ReentrantLock;

//String Queue
class QueueWithSync {

    private String[] qArray;
    private int putloc, getloc;

    public QueueWithSync(int size) {
        qArray = new String[size];
        putloc = getloc = 0;
    }

    void push(String a) {
        if (putloc == qArray.length) {
            System.out.println("Sorry, the queue is full!");
            return;
        }

        qArray[putloc++] = a;
    }

    String pop() {
        if (getloc == putloc) {
            System.out.println("Sorry, the queue is empty!");
            return null;
        } return qArray[getloc++];
    }
}


class QueueMultithreading implements Runnable {
    private final ReentrantLock lock = new ReentrantLock(true);

    Thread thread;

    public QueueMultithreading(String name, int priority) {
        thread = new Thread(this, name);
        thread.setPriority(priority);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void run() {
            System.out.println(thread.getName() + " has entered the Queue");
            lock.lock();

//            try {
                int arrLength = 3;
                QueueWithSync newQueue = new QueueWithSync(arrLength);
                for (int i = 0; i < arrLength; i++) {
                    newQueue.push(thread.getName() + " is at " + i);
                }
                for (int i = 0; i < arrLength; i++) {
                    System.out.println(newQueue.pop());
                }
//                notify();
//            } catch (IllegalMonitorStateException ie) {
//                System.out.println(thread.getName() + " hit IMSE.");
//            } finally {
//                lock.unlock();
//            }
            System.out.println(thread.getName() + " exited the Queue.");
    }
}

class QueueLabWithSync {
    public static void main(String[] args) {
        System.out.println("Starting the Queue!");
        QueueMultithreading person1 = new QueueMultithreading("Person #1",5);
        QueueMultithreading person2 = new QueueMultithreading("Person #2",5);
        QueueMultithreading person3 = new QueueMultithreading("Person #3",5);
        System.out.println("Queue is now closed!");
    }
}
