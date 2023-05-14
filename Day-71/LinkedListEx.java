import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Dog> list = new LinkedList();

        Dog d1 = new Dog();

        d1.age = 14;

        d1.weight = 23.7;

        Dog d2 = new Dog();

        d1.age = 12;

        d1.weight = 12.4;

        list.add(d1);

        list.add(d2);

        System.out.println(list);

        System.out.println(list.toString());
    }
    
}
class Dog {
     int age ;

     double weight;

     @Override
     public String toString() {

        return " age " + age + " weight " + weight;
     }
}
