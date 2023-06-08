

public class DefaultMethod implements R{

    public static void main(String[] args) {

        DefaultMethod d = new DefaultMethod();

        d.show();
    }
    @Override
    public void print() {

    }
    
}
@FunctionalInterface
interface R {
    void print(); //functional interface contains abstract methods but here default method also
    default void show() {
        System.out.println("hello");
    }
}
