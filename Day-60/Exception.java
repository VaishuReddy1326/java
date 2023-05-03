
import java.util.Scanner;
//import java.util.ArithmeticException;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        try {
           int x = sc.nextInt();
           int y = arr[7];
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds exception");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithematic exception");

        }
        System.out.println("hello world");

    }
    
}
