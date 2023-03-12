
import java.util.Arrays;
public class Binary_Search {
    public static void main(String[] args){
        int arr[]={2,3,5,9,15,25};
        int key=2;
        int low=0;
        int high=arr.length-1;
        boolean flag=false;
        while(low<=high){
            int mid=(low+high)/2;

        
        if(key==mid){
        System.out.println("element found");
        flag=true;
        break;
        }
        else if(key<mid)
        high=mid-1;
        else if(key>mid)
        low=mid+1;
    }
        if(flag=false)
        System.out.println("element not found");
    }
    
}
