import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMethod {
    public static void main(String[] args) {
        String regex = "hello";

        Pattern pattern = Pattern.compile(regex);

        String stringToBeMatched = "helloworld";

        Matcher matcher = pattern.matcher(stringToBeMatched);

        System.out.println(matcher.find());
        




    }
    
}
