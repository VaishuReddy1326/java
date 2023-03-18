import java.util.Arrays;
public class Merge_TwoArrays {
    public static void main(String[] args){
        int a[] = {8,7,5,10};
        int b[] = {4,9,15,2,6};
        int c[] = new int[a.length+b.length];
        int k=0;
        for(int i=0;i<=a.length-1;i++){
            c[k] = a[i];
            c[k ]= b[j];
            k++;

        }
        for(int j=0;j<=b.length-1;j++){
            c[k] = b[j];
            k++;
        }
        System.out.println(Arrays.toString(c));  //[8,7,5,10,4,9,15,2,6]
    
    }
    
}
