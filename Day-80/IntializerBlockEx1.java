public class IntializerBlockEx1 {
    public static void main(String[] args) {

        Dog d1 = new Dog();
 
 
        Dog d2 = new Dog();

        Dog d3 = new Dog("parker");
    }
    
}
class Dog {
    static {
        System.out.println("static block");
    }
    Dog() {
        System.out.println("empty constructor");

    }
    Dog(String name) {

        System.out.println("parameterized constructor");
    }
    {
        System.out.println("Intializer block");
    }
}
