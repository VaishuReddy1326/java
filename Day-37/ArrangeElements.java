import java.util.Arrays;
public class ArrangeElements {
    public static void main(String[] args){
        int n=6;
        int arr[] = new int[n];
        int start=1,i;
        for( i=0;i<=n/2;i++){
            if(start<n){
              arr[i]=start;
               start+=2;
            }
            else 
              break;
        }
              arr[i]=n;
              if(n%2==0)
                start=n-2;
                else 
                 start=n-1;
               for(int j=i+1;j<n;j++){
                 arr[j] = start;
                 start-=2;
               }
        
        System.out.println(Arrays.toString(arr));
    }
    
}
