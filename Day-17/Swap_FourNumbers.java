/* program to swap four numbers without using fifth variable
  Before swapping:12 2 34 56
  After swapping:56 12 2 34

 */
import java.util.Scanner;
public class Swap_FourNumbers {
    public static void main(String[] args){
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        System.out.println("Before swapping:"+a+" "+b+" "+c+" "+d);
         a=a+b+c+d;
         b=a-b-c-d;
         c=a-b-c-d;
         d=a-b-c-d;
         a=a-b-c-d;
         System.out.println("After swapping:"+a+" "+b+" "+c+" "+d);
    }    

    
}
