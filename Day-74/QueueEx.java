import java.util.*;
public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

    }
    
}
