public class SumOfNumbers {
   
    public static void main(String[] args){
        int n=5,sum=0;
         int ans=sum(n);
         System.out.println(ans);

    }
    public static int sum(int n){
        if(n==1)
        return 1;
        int temp=n+sum(n-1);
        return temp;
  

    }
    
}
