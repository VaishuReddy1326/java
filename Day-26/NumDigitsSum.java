public class NumDigitsSum {
    public static void main(String[] args){
      String str="abcd1234058def";
      int numDigits=0;
      int sum=0;
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)>=48 && str.charAt(i)<=57){
            sum+=(str.charAt(i)-48);
            numDigits++;
        }
      }
      System.out.println(sum);
    }
}
