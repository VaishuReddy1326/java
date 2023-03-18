//program for merge two sorted arrays into a third sorted array
import java.util.Arrays;
public class MergeTwo_SortedArrays {
    public static void main(String[] args){
        int a[] = {3,5,7,8};
        int b[] = {2,4,9,10,15};
        int c[] = new int[a.length+b.length];
        int i,j;
        int k=0;
        for(i=0,j=0;i<a.length && j<b.length;){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else
            c[k++]=b[j++];
        }
    
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        System.out.println(Arrays.toString(c));  //[2,3,4,5,7,8,9,10,15]
        
    } 
        
    
    
}
