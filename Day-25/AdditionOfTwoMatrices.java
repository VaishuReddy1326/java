// program for addition of two matrices

import java.util.Arrays;
public class AdditionOfTwoMatrices {
    public static void main(String[] args){
        int a[][]={{3,4,5},
                   {6,7,8},
                    {1,2,3}
                };
         int b[][]={{3,4,5},
                   {6,7,8},
                   {4,5,6}};
            
        int result[][]=new int[a.length][b.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                result[i][j]=a[i][j]+b[i][j];
                 }
         }
        for(var x:result){
            for(var y:x)
                System.out.print(y+" ");
                System.out.println();
            
        }
          
       
    }
    
}
