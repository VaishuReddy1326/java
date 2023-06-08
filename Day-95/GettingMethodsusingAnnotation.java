
import java.lang.reflect.Method;
public class GettingMethodsusingAnnotation {

    public static void main(String[] args) {

        for(Method m : John.class.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        John j = new John();
        for(Method m : j.getClass().getDeclaredMethods()){
            if(m.getName().equals("helloprint"));
                Cock[] c = m.getAnnotationsByType(Cock.class);
                System.out.println(c.length);
                System.out.println(c[0]);
                System.out.println(c[0].rating());
                System.out.println(c[0].star());

        }
    }
    
}
