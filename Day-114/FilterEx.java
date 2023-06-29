import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import javax.sound.sampled.SourceDataLine;

public class FilterEx {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,7);

        Stream<Integer> stream = list.stream();
        Predicate<Integer> predicate = new Predicate<Integer>(){
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }

        };
        Stream<Integer> list1 =stream.filter(predicate);
        list1.forEach(System.out::println);


    }
    
}
