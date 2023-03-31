//program to count the occurences of 8 as a digit,if 8 with another 8 immediately to its left counts double

public class Count8 {
    public static void main(String[] args){
        int n=888178;
        int ans=count(n);
        System.out.println(ans);
    }
    public static int count(int n){
        if(n==0)
        return 0;
        if(n%100==88)
        return 2+count(n/10);
        if(n%10==8)
        return 1+count(n/10);

        return count(n/10);
    }
    
}
