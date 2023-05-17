import java.util.*;
public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);
        deque.addFirst(5);
        deque.addLast(50);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.offer(70));
        System.out.println(deque.peek());
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pop());
        
        
    }
    
}
