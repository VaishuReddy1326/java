

public class binarySearch {
    public static void main(String[] args){
        int arr[] = {2,4,5,6,7,8,9};
        int x=8;
        System.out.println(search(arr,0,arr.length-1,x));
    }
    public static int search(int arr[],int low,int high,int x){
        if(low>=high)
        return -1;
        int mid=(low+high)/2;
        if(arr[mid]==x)
        return mid;
        else if(arr[mid]<x){
        low=mid+1;
        return search(arr,low,high,x);
        }
        else{
            high=mid-1;
            return search(arr,low,high,x);
        }

    }

    
}
