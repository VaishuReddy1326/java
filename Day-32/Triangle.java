//program to print the total number of blocks in a triangle with the given rows

public class Triangle {
    public static void main(String[] args){
        int n=4;
        int ans=triangle1(n);
        System.out.println(ans);

    }
    public static int triangle1(int n){
        if(n==0)
        return 0;
        return n+triangle1(n-1);
    }
    
}
