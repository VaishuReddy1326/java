import java.util.HashSet;
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        
        System.out.println(set);

        System.out.println(set.contains(20)); // checks if element contains in set or not

        System.out.println(set.size());  //return the size of the set

        System.out.println(set.isEmpty()); // checks set is empty or not

        set.remove(10);

        System.out.println(set);

    }
    
}
