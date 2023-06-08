import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class TargetAnnotation {
    @John
        void eat() {
            
        }
        
    public static void main(String[] args) {

       @VIP

       int a = 10;
        
        

        
        


    }
    
}
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface John {


}
@Target(ElementType.LOCAL_VARIABLE)
@Retention(RetentionPolicy.RUNTIME)
@interface VIP {

    }



