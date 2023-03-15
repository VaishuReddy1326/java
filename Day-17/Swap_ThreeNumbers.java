/*  program to swap three numbers without using fourth variable
Before swapping:25 35 60
After swapping:60 25 35 */
import java.util.Scanner;
public class Swap_ThreeNumbers {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Before swapping:"+a+" "+b+" "+c);
         a=a+b+c;
         b=a-b-c;
         c=a-b-c;
         a=a-b-c;
         System.out.println("After swapping:"+a+" "+b+" "+c);
    }    
}
