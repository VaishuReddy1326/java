//pogram to print diagonal elements in array

public class DiagonalElements {
    public static void main(String[] args){
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}              //odd array
    };
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(i==j || j==arr[i].length-1-i)
            System.out.print(arr[i][j]);
            else
            System.out.print("  ");
        }
        System.out.println();
    }

    }
    
}
