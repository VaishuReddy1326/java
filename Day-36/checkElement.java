// program to check the element in the given array

public class checkElement {
    public static void main(String[] args){
        int arr[] = {3,4,5,6,2,8};
        int x=2;
        System.out.println(index(arr,arr.length-1,x));
    }
    public static boolean index(int arr[],int endInd,int x){
        if(endInd<0)
        return false;
        if(arr[endInd]==x)
        return true;
        return index(arr,endInd-1,x);
     
    }
    
}
