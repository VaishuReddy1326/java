
import java.util.Arrays;
public class PassBy_Reference {
    public static void main(String[] args){
        int arr[]={5,6,7,8};
        System.out.println(Arrays.toString(arr));  //5 6 7 8
        displayArray(arr);
        System.out.println(Arrays.toString(arr));  //6 7 8  9
    
    
    }
    static void displayArray(int arr1[]){
        for(int i=0;i<=arr1.length-1;i++)
        arr1[i]=arr1[i]+1;
        System.out.println(Arrays.toString(arr1));  // 6 7 8 9
    }
}
