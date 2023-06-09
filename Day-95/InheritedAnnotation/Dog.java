package InheritedAnnotation;

public class Dog {

    String name;

    Dog() {

    }
    Dog(String name){
        this.name =name;
    }
    void eat() {
        System.out.println("eating");
    }
    void print() {
        System.out.println(name.toLowerCase());
    }
}
