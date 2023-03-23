
//program to print diagonal elements sum in an array
public class DiagonalElementsSum {
    public static void main(String[] args){
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}              //odd array
};
int sum=0;
for(int i=0;i<arr.length;i++){
  for(int j=0;j<arr[i].length;j++){
    if(i==j || j==arr[i].length-1-i){
    
       sum+=arr[i][j];
    }
    
   
}
}

System.out.println(sum);

    }
    
}
