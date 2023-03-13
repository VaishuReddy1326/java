// program to print the sum of natural numbers
import java.util.Scanner;

public class Sum_Of_NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++) {
            sum+=i;
            System.out.println("sum of first "+n+" natural numbers is" +sum);
        }
        

    }
    
}
