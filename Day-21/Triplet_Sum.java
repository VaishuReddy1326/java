
import java.util.Arrays;
public class Triplet_Sum {
    public static void main(String[] args){
        int arr[]={3,6,8,7,4,2,15};
        int sum=12;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);  // 3 7 2
                    }                                                      // 6 4 2
                }
            }
        }
    }
    
}
