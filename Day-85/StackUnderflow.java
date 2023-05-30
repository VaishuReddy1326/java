import java.util.Stack;
public class StackUnderflow {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10); //add the element into the stack

        stack.push(20);

        stack.push(30);

        System.out.println(stack);

        stack.pop(); //remove the element from the top of the stack

        stack.pop();

        stack.pop();//stack becomes empty

        stack.pop(); //  throws an EmptyStackException

      //  System.out.println(stack);
        


    }
}