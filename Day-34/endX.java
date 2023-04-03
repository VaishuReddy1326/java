//program to print the string where the 'x' chars has been removed to the end of the string
public class endX {
    public static void main(String[] args){
       String str = "xrexvx";
       System.out.println(endx(str));

    }
    public static String endx(String str){
        if(str.length()<=1)
        return str;
        if(str.charAt(0)!='x')
        return str.charAt(0)+endx(str.substring(1));
        else 
        return endx(str.substring(1))+"x";
    }
    
}
