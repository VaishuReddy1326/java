import java.util.HashMap;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        int arr[] ={ 3,5,7,2,8,9};
        
        int target = 10;

        for(int i=0;i<arr.length;i++) {

            map.put(arr[i],"x");
        }
        for(var x : map.keySet()) {
             int cur = x;

             int reqTarget = target -cur;

             if(map.containsKey(reqTarget))
                System.out.println(x + " + " + reqTarget+ "=" +target);
        }
        


    }
}
