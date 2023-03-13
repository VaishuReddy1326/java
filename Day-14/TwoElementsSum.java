import java.util.Arrays;
public class TwoElementsSum {
    public static void main(String[] args){
        int arr[]={3,5,6,7,2};
        int sum=8;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("("+i+","+j+")" );
                }
            }
        }
    }
    
}
