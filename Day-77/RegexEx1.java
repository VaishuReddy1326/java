import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("..x");

        Matcher m = p.matcher("abx");

        boolean b = m.matches();
        System.out.println(b);
      
        boolean b1 = Pattern.matches(".r", "or");  // true ,second char should be r
        System.out.println(b1);

        boolean b2 = Pattern.matches("[abc]" , "a"); // any char among a,b,c
        System.out.println(b2);

        boolean b3 = Pattern.matches("[^abc]" , "a"); // any char except a,b,c
        System.out.println(b3);

        boolean b4 = Pattern.matches("[a-zA-Z]" , "h"); // from a to z and A to Z characters
        System.out.println(b4);

        boolean b5 = Pattern.matches("[a-z &&[abc]]" , "b"); // any  one char among a,b,c
        System.out.println(b5);

        boolean b6 = Pattern.matches("[a-z&&[^cd]]" , "d"); // any char from a to z except c,d
        System.out.println(b6);

        boolean b7 = Pattern.matches("a*" , "aa"); // a occurs zero or many times
        System.out.println(b7);

        boolean b8 = Pattern.matches("a+" , "a"); // a occurs once or more times
        System.out.println(b7);

        boolean b9 = Pattern.matches("a?" , "acd"); // a occurs once or not at all 
        System.out.println(b9);

        boolean b10 = Pattern.matches("a{3}" , "aaa"); // a occurs three times
        System.out.println(b10);

        boolean b11 = Pattern.matches("a{3,}" , "a"); // a occurs three times or more than 3 times
        System.out.println(b11);

        boolean b12 = Pattern.matches("a{2,4}" , "aaa"); // a occurs between 2 to 4
        System.out.println(b12);
    }
}