

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {3,5,9,6,2};
        int x=6;
        System.out.println(search(arr,arr.length-1,x));
    }
    public static boolean search(int arr[],int endInd,int x){
        if(endInd==0)
        return false;
        if(arr[endInd]==x)
        return true;
        return search(arr,endInd-1,x);
    }

    
}
