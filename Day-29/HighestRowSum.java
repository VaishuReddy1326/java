public class HighestRowSum {
    public static void main(String[] args){
        int arr[][]={
            {2,3,4},
            {5,6,7},
            {8,9,3},
        };
        int row=0;
        int index=0;
        int maxsum=0;
        boolean isRow=false;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
            sum+=arr[i][j];

        }
        if(sum>maxsum){
            maxsum=sum;
            index=i;
        }
    }
    for(int j=0;j<arr[0].length;j++){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][j];
        }
        if(sum>maxsum){
            maxsum=sum;
            index=j;
    }
}  
     if(isRow)
        System.out.println("maximun column" + (index+1) + "sum is"+maxsum);
        else 
        System.out.println("maximun row"+ (index+1) +"sum is"+maxsum);
    }
    
}
