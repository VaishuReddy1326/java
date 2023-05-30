//Deque stands for double ended queue,we can add or delete elements at both ends

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(10);

        dq.add(20);

        System.out.println(dq);

        dq.addLast(30);

        dq.addFirst(5);

        System.out.println(dq);

        System.out.println(dq.removeFirst());

    }
    
}
