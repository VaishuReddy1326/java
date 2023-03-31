public class fibonacci {
    public static void main(String[] args){
       int a=0,b=1;  int n=7;
       System.out.println(a);
       System.out.println(b);
       fib(a,b,n-2);
    }
    public static int fib(int a,int b,int n) {
        if(n==0){
        return 0;
        }
        int c=a+b;
        System.out.println(c);
        fib(b,c,n-1);
    }
}
