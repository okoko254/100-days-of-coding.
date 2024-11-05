package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class SamplePQueue {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(4.5);
        queue.offer(2.1);
        queue.offer(3.0);
        queue.offer(1.6);
        queue.offer(4.3);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
            
        }
    }
}
