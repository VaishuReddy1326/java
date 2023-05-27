import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,7,3,2);

        ListIterator<Integer> listIterator = list.listIterator();

        listIterator.next();

        listIterator.next();

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
            

    }
    
}
