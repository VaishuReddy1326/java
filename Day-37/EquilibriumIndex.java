/*program to print the equlibrium index in the array.equlibrium index means sum of elements in lower indices
is equal to the sum of indices in higher indices.
*/

public class EquilibriumIndex {
    public static void main(String[] args){
        int arr[] = {-7,1,5,2,-4,3,0};
        for(int i=0;i<arr.length;i++){
            int lsum=0;
            int rsum=0;
            for(int j=0;j<i;j++)
                lsum+=arr[j];
            
            for(int j=i+1;j<arr.length;j++)
                rsum+=arr[j];
            if(lsum==rsum)
            System.out.println(i);
        }
    }
    
}
