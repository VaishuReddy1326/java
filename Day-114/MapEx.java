import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class MapEx {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(45,67,23,37,56);

        Stream<Integer> stream = list.stream();

        stream.map(n->n*n).forEach(System.out::println);
    }
    
}
