import java.util.Stack;

public class MethodEx {
    public static void main(String[] args) {
        
        Person p = new Person();
        p.age = 25;
        p.name = "king";
        System.out.println(p);
        p = new Person();
    }
    static void rock() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
    }
    
}
class Person {
    int age;
    String name;
}
