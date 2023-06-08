/* retention annotation is a meta annotation that come with some retention policies
   there are 3 types of retention policies
   RetentionPolicy.SOURCE
   RetentionPolicy.CLASS
   RetentionPolicy.RUNTIME
*/
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RetentionAnnotation {

    public static void main(String[] args) {



    }
    
}
@Retention(RetentionPolicy.RUNTIME)
@interface Dog {

}
