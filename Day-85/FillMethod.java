import java.util.Arrays;

public class FillMethod {
    public static void main(String[] args) {

        int arr[] = new int[10];

        System.out.println(Arrays.toString(arr)); // by default array is fill with zeroes

        Arrays.fill(arr,4);

        System.out.println(Arrays.toString(arr));//to fill the complete array with value 4

        Arrays.fill(arr,2,5,7);

        System.out.println(Arrays.toString(arr));//fill from index 2 to 4 with a value 7


    }
    
}
