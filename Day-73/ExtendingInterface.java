interface Dog {
    public void eat() ;
     
}
interface Cat extends Dog {
    public void sound();

}
class Animal implements Cat {

    public void eat() {
        System.out.println("eat");
    }
    public void sound() {
        System.out.println("sound");
    }

}
public class ExtendingInterface {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.eat();

        animal.sound();
    }
    
}
