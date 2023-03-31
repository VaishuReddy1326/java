//program to return the count of occurences of 7 as a digit

public class count7 {
    public static void main(String[] args){
        int n=717;
        int ans=count(n);
        System.out.println(ans);

    }
    public static int count(int n){
        if(n==0)
        return 0;
        if(n%10==7)
        return 1+count(n/10);
        else 
        return count(n/10);
    }
    
}
