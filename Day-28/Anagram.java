import java.util.Arrays;
public class Anagram {
    public static void main(String[] args){
        String str1="hello";
        String str2="elhol";
        if(str1.length()!=str2.length()){
            System.out.println("not anagram");
        }
        char[] c1=str1.toCharArray();
        char[] c2=str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)!=str2.charAt(i))
          System.out.println("not a anagram");
        }
        System.out.println("anagram");
    }
    
}
