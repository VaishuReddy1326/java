// program for 10^9+7 modulo

public class Modulo {
    public static void main(String[] args) {
        byte a = 100;
        
        byte b = 70;

        System.out.println(a+b); // error:int cannot convert into byte

        byte c = (byte)((a+b)%1000000007);

        System.out.println(c);

    }
    
}
