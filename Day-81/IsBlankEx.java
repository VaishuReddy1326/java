
//if the string is empty or contains whitespaces then isBlank() method returns true
public class IsBlankEx {
    public static void main(String[] args) {

        String first = " ";

        String last = "world";

        if(first.isEmpty() || first.isBlank()) {

            first = "hello";

            System.out.println(first + " "+ last);
        }
        String str = "";
        System.out.println(str.isBlank());//returns true ,string is empty
    }
    
}
