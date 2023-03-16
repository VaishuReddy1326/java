
import java.util.Arrays;
public class Linear search {
    public static void main(String[] args){
    
        int arr[]={4,5,7,8,15,35};
        int key=35;
        int low=0,high=arr.length-1;
        boolean flag=false;
        while(low<=high){
            int mid=(low+high)/2;
            if (key==arr[mid]){
            System.out.println("element found");
            flag=true;
            return;
            }
            else if(key< arr[mid])
            high=mid-1;
            else if(key>arr[mid])
            low=mid+1;
        }
        if(flag==false)
        System.out.println("element not found");

    }
    
}
