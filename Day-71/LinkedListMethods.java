
import java.util.LinkedList;
public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList  list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add("hello");
        list.add('v');
        list.add(2,"java");
        System.out.println(list);
        list.addFirst(10.8f);
        list.addLast("world");
        System.out.println(list);
        System.out.println(list.element());
        System.out.println(list.indexOf('v'));
        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.offer(235);
        System.out.println(list);
        list.push("rock");
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list);
    }
    
}
