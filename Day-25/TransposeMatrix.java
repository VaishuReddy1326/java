/*program for transposematrix
{2,3,8},
{4,5,5},
{1,2,4}
output:
{2,4,1},
{3,5,2},
{8,5,4} */

public class TransposeMatrix {
    public static void main(String[] args){
        int a[][]={{2,3,8},
                {4,5,5},
                {1,2,4}}; 
                    
        int m=a.length; //no.of rows
        int n=a[0].length; //no.of columns
        int transpose[][]=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transpose[i][j]=a[j][i];
               
            }
        
        }
        for(var x:transpose){
            for(var y:x)
            System.out.print(y+" ");
            System.out.println();
        }  
    }
    
}
