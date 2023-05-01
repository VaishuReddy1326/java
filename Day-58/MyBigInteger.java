import java.math.BigInteger;
public class MyBigInteger {
    public static void main(String[] args) {
      
       MyBigInteger1 num = new MyBigInteger1("123");
       MyBigInteger1 num1 = new MyBigInteger1("123"); 
       String sum = MyBigInteger.addNums(num , num1);
       System.out.println(sum);

    }
     static class MyBigInteger1 {
        String value;
        MyBigInteger1(String s){
            this.value = s;
        }
    }
    public static String addNums(MyBigInteger1 a , MyBigInteger1 b) {
        String num = a.value;
        String num1 = b.value;
        int carry = 0;
        String sum = "";
        int i,j;
        for(i = num.length()-1, j = num1.length()-1; i>-1 && j>-1; i-- , j--) {
            int temp = Integer.parseInt(String.valueOf(num.charAt(i)))
                            +Integer.parseInt(String.valueOf(num1.charAt(j))) + carry;
            sum += temp%10;
            carry = (temp/10);                
        }
        while(i > -1) {
            int temp = Integer.parseInt(String.valueOf(num.charAt(i))) + carry;
            sum += temp%10;
            carry = (temp/10);
            i--;
        }
        while(j > -1) {
            int temp = Integer.parseInt(String.valueOf(num1.charAt(j))) + carry;
            sum += temp%10;
            carry = (temp/10);
            j--;
        }
        if(carry > 0) 
            sum += carry;
            String res = "";
            for(var x : sum.toCharArray()) {
                res = x+res;
            }
            return res;
            
    }   
        
    
}
