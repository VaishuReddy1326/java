//program to reverse the given number
public class reverseNumber {
    public static void main(String[] args) {
         int num = 567432;
         rev(num);
    }
    public static void rev(int num) {
        if(num==0)
        return;
        int lastdig=num%10;
        System.out.print(lastdig);
        rev(num/10);
        return;
        
    }
    
}
