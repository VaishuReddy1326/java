import java.math.BigDecimal;
public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("0.01");
        BigDecimal num2 = new BigDecimal("0.03");
        System.out.println(num1.subtract(num2));
        System.out.println(num1.compareTo(num2));
        System.out.println(num1.equals(num2));
        System.out.println(num1.add(num2));
        System.out.println(num1.max(num2));
        System.out.println(num1.min(num2));
        System.out.println(num1.multiply(num2));
        System.out.println(num1.intValue());
        System.out.println(num1.byteValue());
        System.out.println(num1.toBigInteger());


    }
    
}
