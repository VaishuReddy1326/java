import java.util.ArrayList;
import java.util.List;

public class SuppressedWarningAnnotationEx {
    @SuppressWarnings("unused")

    public static void main(String[] args) {

        String a = "hello";

        String b = "world";

        List<String> list = new ArrayList<>();

        list.add(a);

        System.out.println(list);
    }
    
}
