public class BruteForce {
    static int a[][] = {
        {1,2,3},
        {6,7,8},
        {4,5,6}};
        public static void main(String[] args) {
            boolean res = isMagicSquare();
            System.out.println(res);
        }
        public static boolean isMagicSquare() {
            int reqSum = a[0][0]+a[0][1]+a[0][2];
            //compare rows
            for(int i=0;i<2;i++) {
                if(a[i][0]+a[i][1]+a[i][2]!=reqSum)
                    return false;
            }
            //compare columns
            for(int i=0;i<2;i++) {
                if(a[0][i]+a[1][i]+a[2][i]!=reqSum)
                     return false;
            }
            return(a[0][0]+a[1][1]+a[2][2]==reqSum && a[0][2]+a[1][1]+a[2][0]==reqSum);
        }
        
    

}
