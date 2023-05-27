import java.util.Arrays;
import java.util.List;

public class WildCardLowerBound {
    public static void main(String[] args) { 

        List<Integer> list1 = Arrays.asList(3,5,7,8,9);

        print(list1);

        List<Number> list2 = Arrays.asList(3,5,2);

        print(list2);



    }
    public static void print(List<? super Integer> x) {

        System.out.println(x);
    }
    
}
