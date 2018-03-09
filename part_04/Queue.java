package part_04;
/** Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
        it cannot be retrieved again) of integers 0 through 100. Then print out every other
        value in the queue.
        expected output: 0,2,4,6,8.....100
*/

class Queue {

    private int[] qArray;
    private int putloc, getloc;

    public Queue(int size) {
        qArray = new int[size];
        putloc = getloc = 0;
    }

    void push(int i) {
        if (putloc == qArray.length) {
            System.out.println("Sorry, the queue is full!");
            return;
        }

        qArray[putloc++] = i;
    }

    int pop() {
        if (getloc == putloc) {
            System.out.println("Sorry, the queue is empty!");
            return 0;
        } return qArray[getloc++];
    }
}


