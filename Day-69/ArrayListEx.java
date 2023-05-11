import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();

        mylist.add(10);
        mylist.add(90);
        mylist.add(30);
        mylist.add(50);
        mylist.add(20);
        mylist.add(250);
        mylist.add(120);
        System.out.println(mylist);
        System.out.println(mylist.get(5));
        System.out.println(mylist.size());
        Collections.sort(mylist);
        mylist.clear();
        for(int i : mylist) {
            System.out.println(i);
        }


    }

    
}
