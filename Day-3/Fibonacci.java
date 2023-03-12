

public class Fibonacci {
    public static void main(String[] args){
        int n=10;
        int a=0,b=1;
        int count=0;
        while(a<n){
            System.out.println("a:" +a);
            int c=a+b;
            a=b;
            b=c;
            count++;
        }
    }
    
}
