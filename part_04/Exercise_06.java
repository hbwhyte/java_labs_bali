package part_04;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */

import java.util.LinkedList;
import java.util.Queue;
/**
* Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
        it cannot be retrieved again) of integers 0 through 100. Then print out every other
        value in the queue.
        expected output: 0,2,4,6,8.....100
*/
class Exercise_06 {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        for (int i = 0; i < 101; i++) {
            myQueue.add(i);
        }
        for (int i = 0; i < 101; i++) {
            if(i%2 == 0) {
                System.out.println(myQueue.remove());
            } else {
                myQueue.remove();
            }
        }
    }
}