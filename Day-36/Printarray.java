// program to print the array

public class Printarray {
    public static void main(String[] args){
        int arr[] = {5,6,4,3,8};
        print(arr,0);

    }
    public static void print(int arr[],int stInd){
        if(stInd==arr.length)
        return;
        System.out.print(arr[stInd]+" ");
        print(arr,stInd+1);
    }
    
}
