//program to print the sum of the elements in the array

public class arraySum { 
    public static void main(String[] args){
        int arr[] = {4,5,6,3,2};
        System.out.println(sum(arr,0));
    }
    public static int sum(int arr[],int stInd){
        if(arr.length==stInd)
        return 0;
         return arr[stInd]+sum(arr,stInd+1);

    }

    
}
