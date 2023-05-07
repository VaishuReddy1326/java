

public class CustomMadeException extends Exception{
    String str;
    CustomMadeException(String str) {
        this.str = str;
    }
}
class Exception1 {
    public static void main(String[] args) {
        try {
            throw new customMadeException("hello");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

}
