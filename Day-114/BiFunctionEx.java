import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import javax.sound.sampled.SourceDataLine;

public class BiFunctionEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,6);

        BiFunction<Integer,Integer,Integer> bifunction = new BiFunction<Integer,Integer,Integer>();

        @Override
        public Integer apply(Integer integer,Integer,integer2) {
            return integer*integer2;
        }
    };
    Integer result = bifunction.apply(10,20);
    System.out.println(result);
    
}
