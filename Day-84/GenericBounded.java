

public class GenericBounded {

    public static void main(String[] args) {

        GenericClass<Integer> str = new GenericClass();

    }
    
}
class GenericClass<T extends Number> {
    public void display() {
        System.out.println("bounded type generic class");
    }
}
