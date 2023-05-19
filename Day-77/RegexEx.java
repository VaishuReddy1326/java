import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx {
    public static void main(String[] args){

        Pattern pattern = Pattern.compile("hello");

        Matcher matcher = pattern.matcher("hello world");

        if(matcher.find()) {
            System.out.println("match found");
        }
        else {
            System.out.println("match not found");
        }



    } 
} 