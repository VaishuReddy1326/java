import java.util.Arrays;
public class Missing_ArrayElement {
    public static void main(String[] args){
        int n=6;
        int arr[]={2,5,1,4,6};
        int requiredSum=(n*(n+1))/2;
        int actualSum=0;
        for(int i=0;i<n-1;i++)
        actualSum +=arr[i];
        System.out.print(requiredSum-actualSum);


    }
    
}
