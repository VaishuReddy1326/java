import java.util.HashMap;

public class HashMapVSArray {
    public static void main(String[] args) {
         
        HashMap<Integer,Integer> hashmap = new HashMap<>(); // each player can take 64 bits of memory

        int noOfPlayers = 5;

        for(int i = 0; i < noOfPlayers; i++) {

            hashmap.put(i,1);
        }
        hashmap.put(2,0);

        hashmap.put(4,0);

        System.out.println(hashmap.get(3));

        System.out.println(hashmap.get(4));

        int[] arr = new int[noOfPlayers];

        arr[3] = 0;

        System.out.println(arr[3]); // each payer can take 32 bits of memory,so array takes less memory than hashmap

    }
    
}
