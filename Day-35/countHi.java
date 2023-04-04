//program to count the occurence of "hi" in the string,do not count "hi" thahave an 'x' immediately before them

public class countHi {
    public static void main(String[] args){
        String str = "xhivshic";
        System.out.println(counthi(str));
    }
    public static int counthi(String str){
        if(str.length()<2)
        return 0;
        if(str.charAt(0)=='x' && str.charAt(1)=='h')
        return counthi(str.substring(2));
        else if(str.substring(0,2).equals("hi"))
        return 1+counthi(str.substring(2));
        else 
        return counthi(str.substring(1));
    }
    
}
