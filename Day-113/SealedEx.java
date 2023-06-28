import java.net.NoRouteToHostException;

public class SealedEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();

    }
    
}
sealed class Animal {
    void sound() {
        System.out.println("sound");
    }
}
non-sealed class Dog extends Animal {
    void sound() {
        System.out.println("bow bow");
    }
}
final class Cat extends Animal {
    void sound() {
        System.out.println("meow meow");
    }

}
