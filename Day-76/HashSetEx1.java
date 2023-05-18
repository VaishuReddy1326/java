import java.util.*;

public class HashSetEx1 {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        int arr[] = {3,5,6,7,2,8,9,1};

        int target = 8;

        for(int i=0; i<arr.length;i++) {
            set.add(arr[i]);
        }
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
    
}
