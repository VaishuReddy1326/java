import java.util.Arrays;
public class ZigZag {
    public static void main(String[] args){
        int arr[][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int i,j;
         for(i=0;i<arr.length;i++){
            for( j=0;j<arr.length;j++){
                if(i==0)
                System.out.print(arr[i][j]);
               else
                    for( j=arr.length-1;j>=0;j--){
                        System.out.print(arr[i][j]);
                    }
                }
            }
            System.out.println();

         }               
}    
    

