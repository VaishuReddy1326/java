public class BoundaryElementsClockWise {
    public static void main(String[] args){
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9} };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==0  || j==arr.length-1)
                System.out.print(arr[i][j]);
            }
        } 
        for(int i=0;i<arr.length;i++){
           for( int j=arr[i].length-1;j>=0;j--)
           if(i==arr.length-1 && j!=arr[i].length-1){
            System.out.print(arr[i][j]);
           }
        } 
        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr[i].length-1;j>=0;j--){
                if(i!=0 && i!=arr.length-1 && j==0)

                System.out.print(arr[i][j]);
            }
        }              

    }
    
}
