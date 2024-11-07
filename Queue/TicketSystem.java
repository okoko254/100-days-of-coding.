package Queue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class TicketSystem {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        Random rand = new Random();

        for(int i = 0; i < 5;i++){
            int ticketNumber = rand.nextInt(100) + 1;
            queue.offer(ticketNumber);
            System.out.println("Customer added with Ticket No. "+ ticketNumber);
        }

        System.out.println("\n--- Serving Customers ---");
        /*
        queue.offer(56);
        queue.offer(34);
        queue.offer(73);
        queue.offer(29);
        queue.offer(96);
         */

        while (!queue.isEmpty()) {
            System.out.println("Customer being served at the moment: Ticket No. "+ queue.poll());
            
            if(!queue.isEmpty()){
                System.out.println("Next in line: Ticket No. " + queue.peek());
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println("Service interrupted");
            }
        }
        System.out.println("Thank you foor flying with us!");
    }
}
