//to check the given string has duplicate characters or not 
import java.util.Arrays;
public class UniqueOrDuplicateChar {
    public static void main(String[] args){
        String str1="helo";
        char[] c1=str1.toCharArray();
        Arrays.sort(c1);
        for(int i=0;i<c1.length-1;i++){
            if(c1[i]==c1[i+1]){
            System.out.println("duplicate");
            return;
            }
        
        }
        System.out.println("unique");
    }
    
}
