import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import javax.sound.sampled.SourceDataLine;

public class ArraysStreamEx {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};
        IntStream res = Arrays.stream(arr, 1, 3);
        res.forEach(System.out::println);

        double arr1[] = {3.4,5.6,7.8,6.8};
        DoubleStream res1 = Arrays.stream(arr1,2,4);
        res1.forEach(System.out::println);

        long arr2[] = {345,456,789,12345,23456,56789};
        LongStream res2 = Arrays.stream(arr2,0,2);
        res2.forEach(System.out::println);


    }
    
}
