import java.util.*;
public class QueueEx1 {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        Iterator iterator = queue.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}   
