import java.util.Optional;

public class OptionalLowerCase {
        public static void main(String[] args) {
            String[] str = new String[10];
            Optional<String> checkNull = Optional.ofNullable(str[3]);
            if(checkNull.isPresent()){
                String lowercaseString = str[3].toLowerCase();
                System.out.print(lowercaseString);
            }else
                System.out.println("string value is not present");
        }


}