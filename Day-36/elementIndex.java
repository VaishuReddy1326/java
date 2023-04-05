

public class elementIndex {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,8};
        int x = 5;
        System.out.println(findInd(arr,arr.length-1,x));

    }
    public static int findInd(int arr[],int endInd,int x){
        if(endInd==0)
        return -1;
        if(arr[endInd]==x)
        return endInd;
        return findInd(arr,endInd-1,x);
    }
    
}
