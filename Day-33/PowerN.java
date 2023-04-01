//program to print the value of power n

public class PowerN {
    public static void main(String[] args){
        int result=power(2,2);
        System.out.println(result);


    }
    public static int power(int base,int n){
        if(n==0)
        return base;
        return base*power(base,n-1);
    }
    
}
