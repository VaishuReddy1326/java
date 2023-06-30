import java.util.Optional;
import static java.lang.Math.random;

public class OptionalClassEx {
    public static void main(String[] args) {
        String rock = null;

        Optional<String> result = randomString();
        System.out.println(result.toString().length());

    }
    public static Optional<String> randomString() {
        if(Math.floor(random()*4)==4)
            return null;
        else 
            return Optional.ofNullable(("rock"));
    }
    
}
