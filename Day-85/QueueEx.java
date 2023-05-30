
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("rock");

        q.add("mock");
        
        q.add("duck");

        System.out.println(q);

        q.remove("duck");

        System.out.println(q);
    }
    
}
