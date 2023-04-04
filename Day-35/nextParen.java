
//program to check the pair of paranthesis
public class nextParen {
    public static void main(String[] args){
        String str = "((())";
        System.out.println(nextparen(str));
    }
    public static boolean nextparen(String str){
        if(str.length()==0)
        return true;
        if(str.length()%2==1)
        return false;
        else if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')')
        return nextparen(str.substring(1,str.length()-1));
        else 
        return false;
    }

    
}
