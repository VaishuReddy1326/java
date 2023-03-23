public class SubstractionOfThreeMatrices {
    public static void main(String[] args){
        int a[][]={{3,4,5},
                   {6,7,8},
                    {1,2,3}
                };
         int b[][]={{3,4,5},
                   {6,7,8},
                   {4,5,6}};
        int c[][]={{1,2,3},
                   {5,6,7},
                   {9,8,7}}; 
                   if((a.length!=b.length)  ||(b.length!=c.length) ||(a[0].length!=b[0].length) ||(b[0].length!=c[0].length)){
                    System.out.println("substraction of three numbers is not possible");
                    return;
                   }           
        int result[][]=new int[a.length][b.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                result[i][j]=a[i][j]-b[i][j]-c[i][j];
                 }
         }
        for(var x:result){
            for(var y:x)
                System.out.print(y+" ");
                System.out.println();
            
        }
          
       
    }
    
}

    

