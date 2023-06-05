@FunctionalInterface
interface Rock {
    void sayHello(String str);
}
public class MethodReferenceEx2 {

    public static void main(String[] args) {

        Rock rock = Dog :: sayHello;  // sayhello() method is a static ,so we can acces by class or method name

        rock.sayHello("hi");

    }
    
}
class Dog {
    public static void sayHello(String str) {

        System.out.println(str);

        System.out.println(str.contains("i"));

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());
    }
}


    

