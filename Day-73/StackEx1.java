import java.util.*;
public class StackEx1 {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push(3);
        stack1.push("hello");
        stack1.push('h');

        Stack stack2 = new Stack();
        stack2.push("welocme");
        stack2.push("to");
        stack2.push("java");
        stack2.pop();

        System.out.println(stack1);
        System.out.println(stack2);

        
    }
    
}
