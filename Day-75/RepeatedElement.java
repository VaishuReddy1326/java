import java.util.HashMap;

public class RepeatedElement {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int arr[] = {2,5,8,6,1,5,8,2,3,3,3};

        for(int i=0;i<arr.length;i++) {
            
            if(!map.containsKey(arr[i])) {

                map.put(arr[i] , 1);
            }
            else {

                int preValue = map.get(arr[i]);

                map.put(arr[i] , preValue+1);
            }
        }

        int count = -1 , key = -1;

        for(var x : map.entrySet()) {

            if(x.getValue() > count) {

                count = x.getValue();
                
                key = x.getKey();
            }
        }
        System.out.println(key);
    }
    
}
