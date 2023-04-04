//program to check the n copies of sub appear in the string with overlapping
public class strCopies {
    public static void main(String[] args){
        String str = "catcowcat";
        String sub = "cow";
        int n = 1;
        System.out.println(strcopies(str,sub,n));
    }
    public static boolean strcopies(String str,String sub,int n ) {
        int strlen = str.length();
        int sublen = sub.length();
        if(strlen<sublen){
        if(n<=0)
        return true;
        else 
        return false;
        }
        if(str.substring(0,sublen).equals(sub))
        return strcopies(str.substring(1),sub,n-1);
        else 
        return strcopies(str.substring(1),sub,n);
    }
    
}
