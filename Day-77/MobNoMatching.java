import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobNoMatching {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("..........");

        Matcher mobno = p.matcher("354677");

        if(mobno.matches()) {
            System.out.println("mobile number matches");
        }
        else {
            System.out.println("you must entered 10 digits");
        }

    }
    
}
