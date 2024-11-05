package Queue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public interface SampleQueue<E> extends Collection<E> {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Ice Spice");
        queue.offer("Big Latto");
        queue.offer("Cardi B");
        queue.offer("Megan thee Stallion");
        queue.offer("Glorilla");
        queue.offer("Flo Milli");
        
        queue.poll();
        System.out.println(queue.peek());

        System.out.println(queue);

        //3 useful methods inherited from collections class
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.contains("Cardi B"));
    }
}
