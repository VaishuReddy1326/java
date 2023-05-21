import java.util.Scanner;
import java.util.regex.Pattern;
public class VariableMatching {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String regex = "[\\d][a-zA-Z0-9_$]";
        boolean res;

        do{

            System.out.println("enter variable name:");

            String input = sc.next();

            res = Pattern.matches(regex, input);

            if(res)
                System.out.println("variable name valid");
            else 
                System.out.println("invalid variable name");
        }while(!res);
        sc.close();
    }
    
}
