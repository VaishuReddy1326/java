public class Space_Complexity-n^2 {
    public static void main(String[] args){
        int n=100;
        int arr[] = new arr[n];
        int high=arr.length-1;
        int low=0;
        int key=56;
        boolean flag=false;
        while(low<=high){
         int mid=(low+high)/2;
         if(key==mid){
         System.out.println("element found");
         flag=true;
         else if(key<=mid)
         high=mid-1;
         else if(key>=mid){
            low=mid+1;
         }
        

         }
         if(flag==false)
         System.out.println("element not found");
    }
    
}
