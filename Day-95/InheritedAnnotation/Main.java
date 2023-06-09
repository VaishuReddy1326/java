package InheritedAnnotation;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


public class Main {

    public static void main(String[] args) {

        Virat v = new Virat("virat");
        Class c = v.getClass();

        if(v.getClass().isAnnotationPresent(Priority.class));
        
            Method[] methods = v.getClass().getDeclaredMethods();
            System.out.println("yes");

            Annotation a = c.getAnnotation(Priority.class);
            Priority priority = (Priority)a;

            for(Method x : methods) {
                for(int i=0;i<priority.rating(); i++) {
                    if(x.getName().equals("batting"));
                        
                    if(priority.star().equals("scorpio")){
                        System.out.println("*");
                    }
                }
            }
    }
    
}
