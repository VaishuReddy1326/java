// program to print the corner elements in an array
public class CornerElements {
    public static void main(String[] args){
        int arr[][]={{2,3,4},
                      {6,7,8},
                      {1,2,3}};
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((i==0 &&j==0) || (i==arr.length-1 && j==arr.length-1) || (i==0 && j==arr.length-1) || (j==0 && i==arr.length-1)){
                    System.out.print(arr[i][j]+" ");
                
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }             
    }
    
}
