
import java.util.*;
public class VectorClass {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        System.out.println("values in vector:" +v);
        v.insertElementAt(60,4);
        v.remove((Object)30);
        System.out.println(v);
    }
    
}
