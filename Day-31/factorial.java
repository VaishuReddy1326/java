public class factorial {
    public static void main(String[] args){
        int n=5;
        int ans=fact(n);
        System.out.println(ans);
    }
    
    public static int fact(int n){
        if(n==0)
        return 1;
        int temp=fact(n-1);
        int fact_n=n*temp;
        return fact_n;
    }


}
    

