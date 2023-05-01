import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("10");
        BigInteger num2 = new BigInteger("20");
        System.out.println(num1.subtract(num2));
        System.out.println(num1.compareTo(num2));
        System.out.println(num1.equals(num2));
        System.out.println(num1.add(num2));
        System.out.println(num1.max(num2));
        System.out.println(num1.min(num2));
        System.out.println(num1.multiply(num2));
        System.out.println(num1.intValue());
        System.out.println(num1.byteValue());
        


    }
    
}

    

