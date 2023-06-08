import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class ReflectionEx {

    public static void main(String[] args) {

        John john = new John("john");

        boolean res = john.getClass().isAnnotationPresent(VIP.class);

        if(res)
            john.print();
    
    King king = new King("king");

    boolean res1 = king.getClass().isAnnotationPresent(VIP.class);

    if(res1)
        king.print();
}
}
@VIP
class John {

    String name;
    John(String name){
        this.name = name;
    }
    John() {
        System.out.println("john");
    
    }
    void print() {

    }

}
class King {
    String name;
    King(String name) {
         this.name = name;
    }
    King() {
        System.out.println("King");
    }
    void print(){
        System.out.println("hello");
    }
}
@Target(ElementType.TYPE)
@interface VIP{

}
