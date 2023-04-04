//program to return the string  present in the paranthesis

public class parenBit {
    public static void main(String[] args) {
     String str = "xyz(abc)123";
     System.out.println(parenbit(str));
    }
    public static String parenbit(String str) {
        if(str.length()<=1)
        return "";
        if(str.charAt(0)=='(')
        if(str.charAt(str.length()-1)==')')
        return str;
        else 
        return parenbit(str.substring(0,str.length()-1));
        else 
        return parenbit(str.substring(1));
    }

    
    
}
