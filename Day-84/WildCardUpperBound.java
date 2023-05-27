import java.util.Arrays;
import java.util.List;

public class WildCardUpperBound {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(3,5,7,8);

        System.out.println(list1);

        List<Float> list2 = Arrays.asList(3.4f,5.6f,2.9f);

        System.out.println(list2);

        
    }
    public static void num(List<? extends Number>x) {
        System.out.println(x);
    }
    
}
