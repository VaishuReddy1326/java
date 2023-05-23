import java.util.StringTokenizer;
import java.util.List;
import java.util.StringJoiner;
import java.util.ArrayList;

public class ToStringMethod {
    public static void main(String[] args) {

        String str = "rock the world";

        StringTokenizer st = new StringTokenizer(str, ",");

        List<String> list = new ArrayList<>();

        while(st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        for(var x : list) {
            System.out.println(x);
        }

        StringJoiner sj = new StringJoiner(" ");

        for(var x : list) {
            sj.add(x);
        }
        String x = String.valueOf(sj);

        String x1 = sj.toString();

        x1 += "joy";

        System.out.println(sj);

        System.out.println(x1);
    }
    
}
