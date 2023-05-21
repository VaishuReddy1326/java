import java.util.Scanner;
import java.util.regex.Pattern;

public class ConstantNameEx {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String regex = "[A-Z]*";
        boolean res;

        do{

            System.out.println("enter constant name:");

            String input = sc.next();

            res = Pattern.matches(regex, input);

            if(res)
                System.out.println("constant name valid");
            else 
                System.out.println("invalid constant name");
        }while(!res);
        sc.close();
    }

}
    

