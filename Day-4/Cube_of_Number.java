//program to display the cube of the number
import java.util.Scanner;
public class Cube_of_Number {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt ();
        for(int i=1;i<=n;i++) {
    
            System.out.println("number is : "+i+" and cube of the " +i+ " is:"+(i*i*i));
        }
         
    }
    
}
