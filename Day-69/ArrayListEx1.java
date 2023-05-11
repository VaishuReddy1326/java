import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> Animals = new ArrayList<String>();
        Animals.add("dog");
        Animals.add("cat");
        Animals.add("duck");
        for(int i = 0; i <Animals.size(); i++) {
            System.out.println(Animals.get(i));
        }
    }
    
}
