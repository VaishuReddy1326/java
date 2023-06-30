import java.util.stream.Stream;

public class StreamOfEx {
    public static void main(String[] args) {

        Integer data[] = {2,4,5,6,7};
        Stream<Integer> i = Stream.of(data);
        i.forEach(System.out::println);

        Float data1[] = {2.4f,5.6f,7.8f,22.3f};
        Stream<Float> f = Stream.of(data1);
        f.forEach(System.out::println);

        Long data2[] = {234523l,567856l,456712l,78954l};
        Stream<Long> l = Stream.of(data2);
        l.forEach(System.out::println);



    }
    
}
