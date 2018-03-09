package part_04;

/** Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.
 expected output: 0,2,4,6,8.....100
 */

public class QueueLab {
    public static void main(String[] args) {
        int arrLength = 101;
        Queue newQueue = new Queue(arrLength);

        for (int i = 0; i < arrLength; i++) {
            newQueue.push(i);
        }
        for (int i = 0; i < arrLength; i++) {
            if(i%2 == 0) {
                System.out.println(newQueue.pop());
            } else {
                newQueue.pop();
            }
        }
    }
}
