public class polindrome {
    public static void main(String[] args){
        String str = "rotator";
        System.out.println(polindrome(str));
    }
    public static boolean polindrome(String str){
        if(str.length()<=1)
        return true;
        if(str.charAt(0)==str.charAt(str.length()-1))
        return polindrome(str.substring(1,str.length()-1));
        else 
        return false;
    }
    
}
