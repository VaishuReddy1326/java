//program to print the string where the adjacent chars that are the same have been reduced to a single char 
public class stringClean {
    public static void main(String[] args){
        String str="abbbcdd";
        System.out.println(stringclean(str));
    }
    public static String stringclean(String str){
        if(str.length()<2)
        return str;
        if(str.charAt(0)==str.charAt(1))
        return stringclean(str.substring(1));
        else 
        return str.charAt(0)+stringclean(str.substring(1));
    }
    
}
