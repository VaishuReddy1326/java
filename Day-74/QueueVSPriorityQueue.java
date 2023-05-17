import java.util.*;
public class QueueVSPriorityQueue {

    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.add(10);
        q.add(3);
        q.add(24);
        q.add(5);
        System.out.println(q);

        PriorityQueue pq = new PriorityQueue();
        pq.add(10);
        pq.add(3);
        pq.add(24);
        pq.add(5);
        System.out.println(pq);


    }
    
}
