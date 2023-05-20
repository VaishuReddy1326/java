import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("welcometo javaprograming", " " );

        System.out.println(st.countTokens());

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        StringTokenizer st1 = new StringTokenizer("welcome-to-java-programming");
        while(st1.hasMoreTokens()) {
            System.out.println(st1.nextToken("-"));
        }
        

    }
    
}
