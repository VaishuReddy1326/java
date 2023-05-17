import java.util.HashMap;
public class HashMapEx{

    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();

        

        map.put(1, 10);
        map.put(2,15);
        map.put(3,20);

        System.out.println(map);

        System.out.println(map.containsValue(15));

     
    }
    
}
