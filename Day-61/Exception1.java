public class Exception1 {
    public static void main(String[] args) {
        check(3); //exception occurs
    }
    static void check(int n) {
        if(n==0) {
            return;

        }
        check(n+1);
    }
    
}
