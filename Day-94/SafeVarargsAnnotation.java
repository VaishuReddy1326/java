

public class SafeVarargsAnnotation {

    public static void main(String[] args) {
 
        Duck<Integer> r =new Duck<>() ;

        Integer[] a = {5,8,9,4};

        r.showman(a);
            
        


    }
    
}
class Duck<E> {

    @SafeVarargs

    final void showman(E... args) {

        for(E x: args) {
            System.out.println(x);
        }
    }
}
