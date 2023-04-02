//program to print the string where the identical chars that are adjacent in the original string are separated by "*"

public class pairStar {
    public static void main(String[] args){
        String str="hello";
        String result=pairstar(str);
        System.out.println(result);
    }
    public static String pairstar(String str){
        if(str.length()<=1)
        return str;
        if(str.charAt(0)==str.charAt(1))
        return str.charAt(0)+"*"+pairstar(str.substring(1));
        else 
        return str.charAt(0)+pairstar(str.substring(1));
    }
    
}
