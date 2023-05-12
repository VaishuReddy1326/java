import java.util.*;
public class EqualsMethodEx {
    
        public static void main(String[] args) {
            Duck d1 = new Duck();
            d1.age = 10;
            d1.weight = 124.5;
            Duck d2 = new Duck();
            d2.age = 10;
            d2.weight = 124.5;
            Duck1 d3 = new Duck1();
            System.out.println(d1.equals(d2));
            System.out.println(d1.equals(d3));
    
        }
        
}
    class Duck extends Object {
        int age;
        double weight;
        void sound() {
            System.out.println("quak quak");
        }
        @ Override
        public boolean equals(Object obj) {
            if(this == obj);
               return true;
            if(this.getClass() != obj.getClass())
                return false;
            Duck duck = (Duck) obj;
            return age == duck.age && Double.compare(duck.weight , weight)==0;
    
        }
    }
    class Duck1 {
        int age;
        double weight;
        void sound() {
            System.out.println("quak quak");
        }
    
    }
    
    

