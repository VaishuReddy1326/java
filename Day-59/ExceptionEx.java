import java.util.Scanner;
public class ExceptionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age:");
        try {
            int age = sc.nextInt();
            System.out.println(age);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("name:DOg");
        sc.close();
    }
    
}
