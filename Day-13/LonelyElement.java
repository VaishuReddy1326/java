//program to find lonely element in an array
import java.util.Arrays;
public class LonelyElement {
    public static void main(String[] args){
        int arr[]={3,4,5,4,5};
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            result=result^arr[i];
            
        }
        System.out.print(result);
    }
}
