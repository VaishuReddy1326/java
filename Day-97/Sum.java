import java.util.Scanner;
/**
 * @author King
 */
public class Sum {

    public static void main(String[] args) {

        /**
         * declare two variables
         */
        int x;
        int y;
        /**
         * scanner class is used to take input from users
         */

        Scanner sc=new Scanner(System.in);

        /**
         * declared two variables and taking input from the user
         */

         x=sc.nextInt();
         y=sc.nextInt();

         /**
          * storing the result to the variable sum
          */
         int sum=x+y;

         /**
          * using output stream for giving output
          */

         System.out.println(sum);

    }
    
}

