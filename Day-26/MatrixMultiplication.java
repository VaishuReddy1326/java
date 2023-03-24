/* program for matrix multiplication
no.of columns in first matrix==no.of columns in second matrix then we perform matrix multiplication and 
the size of the resultant matrix will be no.of the rows=no.of columns */

public class MatrixMultiplication {
    public static void main(String[] args){
        int a[][]={{1,2,3},
                   {4,5,6}};  //2*3 matrix
        int b[][]={{1,2},
                   {3,4},
                   {5,6}};  // 3*2 matrix
        int c[][]=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
           for(int j=0;j<b[0].length;j++){
            c[i][j]=0;
            for(int k=0;k<a[0].length;k++){
                c[i][j]=c[i][j]+a[i][k]*b[k][j];
            
            }
                System.out.print(c[i][j]+ " ");
            
           }
           System.out.println();
        }
    }

    
}
