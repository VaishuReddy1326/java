public class ThrowsKeyword {
    public static void main(String[] args) {

        try {
            div(5,0);
        }
        catch(Exception e) {
            System.out.println("excepton occurs");
        }
    }
    static int div(int d,int c) throws ArithmeticException {
        int r =divide(c,d);
        return 5;
    }
    static int divide(int x, int y) throws ArithmeticException {
        if(y == 0)
           throw new ArithmeticException("by zero");
        return x/y;    }
    
    
}
