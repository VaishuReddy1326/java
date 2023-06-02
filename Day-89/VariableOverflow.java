

public class VariableOverflow {
    public static void main(String[] args) {

        int b = 128;

        byte a = (byte)b;

        System.out.println(a);
    }
    
}
