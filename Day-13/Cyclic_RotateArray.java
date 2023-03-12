//program cyclic rotate an array by one
import java.util.Arrays;
public class Cyclic_RotateArray {
    public static void main(String[] args){
        int arr[]={4,6,8,9,2};
        int lastElement=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
            arr[i]=arr[i-1];
            arr[0]=lastElement;

        System.out.println(Arrays.toString(arr));
    }
    
}
