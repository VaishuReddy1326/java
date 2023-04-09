package example2;
import example1.*;
import example2.subpack.*;
public class Hello {
    public static void main(String[] args) {
        Rock obj=new Rock();
           System.out.println(obj.a);
        Hi h=new Hi();
           System.out.println(h.name);   // name is a default modifier so it cannot access to the other package
        Duck d=new Duck();
           System.out.println(d.name);
        Horse h1=new Horse();
           System.out.println(h1.name);
        
    }
}
