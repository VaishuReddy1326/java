import javafx.util.Pair;
public class PairClass {
    public static void main(String[] args) {

        Pair<Integer,String> p = new Pair<Integer,String>(5 , "hello");

        System.out.println(p.getKey());

        System.out.println(p.getValue());
    }
    
}
