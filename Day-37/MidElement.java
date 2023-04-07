//program to print the middle character in string
import java.util.*;
public class MidElement {
    public static void main(String[] args){
        String str="welcome";
        char ch[] = str.toCharArray();
        int mid=str.length()/2;
        if(mid%2==0)
          System.out.print(str.charAt(mid-1)+str.charAt(mid));
        else 
           System.out.print(str.charAt(mid));
    }
    
}
