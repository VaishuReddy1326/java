//program to print all the zeros at the starting of the array.
import java.util.Arrays;
public class Zeros_Ones {
    public static void main(String[] args){
        int arr[]= {1,0,0,0,1,0,1,0,1};
        int zeros=0;
        int ones=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            zeros++;
            else 
            ones++;

        }
        int i;
        for( i=0;i<zeros;i++){
        arr[i]=0;
        }
        
        while(i<arr.length){
            arr[i++]=1;
        }
        System.out.println(Arrays.toString(arr));

    }
    
}
