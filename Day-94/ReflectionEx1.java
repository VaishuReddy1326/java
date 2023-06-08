
import java.lang.reflect.Field;

public class ReflectionEx1 {

    public static void main(String[] args) {

        Main m = new Main();
        Field[] fields = m.getClass().getDeclaredFields();

        for(Field x : fields)
            if(x.getName.equals("h"))
                System.out.println(m.setz());



    }
    
}
