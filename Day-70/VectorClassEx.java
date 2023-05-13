
import java.util.*;
public class VectorClassEx {
    public static void main(String[] args) {
        Vector vec = new Vector();

        vec.add(10);

        vec.add(20);

        vec.add('b');

        vec.add("hello");

        System.out.println(vec);

        vec.set(2,"rock");

        System.out.println(vec);

        vec.add("java");

        vec.remove(2);

        System.out.println(vec.get(3));

        System.out.println(vec);
    }
    
}
