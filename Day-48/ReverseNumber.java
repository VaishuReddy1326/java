public class ReverseNumber {
    public static void main(String[] args) {
        int num=564;
        int rev=0;
        while(num!=0) {
            int remainder=num%10;
            rev=rev*10+remainder;
            num=num/10;


        }
        System.out.println("the reverse of given number is"+rev);
    }
    
}
