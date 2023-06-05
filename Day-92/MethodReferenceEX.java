// to find maximum of two using method reference
@FunctionalInterface
interface  Max {

    int maximum(int x,int y);

}
public class MethodReferenceEX {

    public static void main(String[] args) {

        Max max = Math::max;

        int res = max.maximum(10,40);

        System.out.println(res);
    }

}