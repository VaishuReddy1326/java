

public class MagicSquare{
    static int a[][]={{1,2,3},
                      {4,5,6},
                      {7,8,9}};
    public static void main(String[] args){
      boolean res=isMagicSquare();
      System.out.println(res);
   
    
    }
    public static boolean isMagicSquare(){
        int reqsum = a[0][0]+a[0][1]+a[0][2];
        for(int i=0;i<3;i++){
          if(a[i][0]+a[i][1]+a[i][2]!=reqsum)
             return false;
        }
        for(int i=0;i<3;i++){
            if(a[0][i]+a[1][i]+a[2][i]!=reqsum)
               return false;
          }
          return (a[0][0]+a[1][1]+a[2][2]==reqsum && a[0][2]+a[1][1]+a[2][0]==reqsum);
    }
}  