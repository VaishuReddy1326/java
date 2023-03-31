//program to print the sum of digits recursively
public class SumDigits {
    public static void main(String[] args){
        int n=116;
        int ans=sumDig(n);
        System.out.println(ans);
    }
    public static int sumDig(int n){
        if(n==0)
        return 0;
        return n%10+sumDig(n/10);

    }
    
}
