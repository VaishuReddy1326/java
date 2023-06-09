package InheritedAnnotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Priority {
    
   int rating() default 4;
    String star();
    
}
@Retention(RetentionPolicy.RUNTIME)
@interface PriorityContainer {

    Priority[] value();
}
    

