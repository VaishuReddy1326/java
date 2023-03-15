// program to swap two numbers without using third variable

import java.util.Scanner;

public class Swap_TwoNumbers {
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before sorting:"+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After sorting:"+a+" "+b);
    }
    
}
