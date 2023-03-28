// program to check the given array is in arithematic progression or not
import java.util.Arrays;
public class ArithematicProgression {
    public static void main(String[] args){
        int arr[]={1,6,11,16};
        Arrays.sort(arr);
        int diff=arr[0]-arr[1];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]-arr[i=1]!=diff){
                System.out.println("not In Arithematic progression");
                return;
            }
        }
        System.out.println(" in arithematic progresion");

    }
    
}
