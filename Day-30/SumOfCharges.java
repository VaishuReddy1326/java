public class SumOfCharges {
    public static void main(String[] args){
        int n=3;
        int sum=sumcharges(n);
        System.out.println(sum);

    }
    public static int sumcharges(int n){
        if(n==1)
        return 1;
        int sum=n+sumcharges(n-1);
        return sum;

    }
    
}
