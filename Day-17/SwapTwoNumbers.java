/*program to swap two numbers by using third variable
Before swapping:10 20
After swapping:20 10  */
public class SwapTwoNumbers {
    public static void main(String[] args){
        int a=10,b=20;
        System.out.println("Before Swapping:"+a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:"+a+" "+b);
    }
    
}
