//program to count the total ears of bunnies ,if the count of bunnies is odd(1,3,5,7..)then each bunny has 2 yeaars
//if count of bunnies is even then each bunny has 3 ears
public class bunnyEars2 {
    public static void main(String[] args){
        int n=6;
        int ans=bunny(n);
        System.out.println(ans);


    }
    public static int bunny(int n){
        if(n==0)
        return 0;
        if(n%2==0)
         return 3+bunny(n-1);
         else 
         return 2+bunny(n-1);
    }
    
}
