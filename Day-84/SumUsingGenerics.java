import java.util.Arrays;
import java.util.List;

public class SumUsingGenerics {
    public static void main(String[] args) {
       
        List<Integer> list = Arrays.asList(4,6,9,5);

        Sum(list);
    }
    public static void Sum(List<? extends Number> t) {
        int sum = 0;

        for(Number x : t)
            sum +=x.intValue();
        System.out.println(sum);
    }
     
}
