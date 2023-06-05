@FunctionalInterface
interface Rock {
    void sayHello(String str);
}

public class MethodReferenceEx1 {

    public static void main(String[] args) {

        Rock rock = new Dog() :: sayHello;  // sayhello() method is a non static ,so we create an object for that class

        rock.sayHello("hi");

    }
    
}
class Dog {
    public void sayHello(String str) {

        System.out.println(str);

        System.out.println(str.contains("i"));

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());
    }
}
