import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OptionalClassMethods {
    public static void main(String[] args) {

        int min = IntStream.of(1,2,3,4).min().orElse(0);
        System.out.println(min);

        OptionalInt min1 = IntStream.of(1,2,3,4).min();
        System.out.println(min1.getAsInt());

        OptionalLong max = LongStream.of(2345l,678l,24l).max();
        System.out.println(max.getAsLong());

        OptionalDouble avg = DoubleStream.of(2.34,4.5,6.74,2.45).average();
        System.out.println(avg.getAsDouble());

        OptionalLong max1 = LongStream.of().max();
        if(max1.isPresent())
            System.out.println(max1.getAsLong());
        else 
            System.out.println("value not present");

        List<Integer> list =List.of(1,2,3,4,5);
        Optional<Integer> listMin = list.stream().min(Comparator.naturalOrder());
        listMin.stream().forEach(System.out::println);


    }
    
}
