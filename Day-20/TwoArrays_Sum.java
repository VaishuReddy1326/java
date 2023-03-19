/* program to add two arrays
  a=[4,5,6]
  b=[2,6,8]
  sum=[7,2,4]  s
 */
import java.util.Arrays;
public class TwoArrays_Sum {
    public static void main(String[] args){
        int a[]={4,5,6};
        int b[]={2,6,8};
        int max=(a.length>b.length)?a.length:b.length;
        int c[]=new int[max];
        int i=a.length-1;
        int j=b.length-1;
        int k=0;
        int z=1;
        int sum;
        while(i>=0 && j>=0){
           sum=a[i]+b[j]+k;
            c[max-z]=sum%10;
            k=sum/10;
            z++;j--;i--;
        }
        if(a.length==b.length){
            System.out.print(Arrays.toString(c));
            return;
        }
        else if(a.length>b.length){
            while(i>=0){
            sum=a[i]+k;
            c[max--]=sum%10;
            k=sum/10;
            i--;
            }

        }
        else {
    
            while(j>=0){
                sum=b[j]+k;
                c[max--]=sum%10;
                k=sum/10;
                j--;
            }

        
        }       
         System.out.println(Arrays.toString(c));
        
 
    }

    
}
