

public class strCount {
    public static void main(String[] args){
        String str="catcowcat";
        String sub="cat";
        System.out.println(strcount(str,sub));
    }
    public static int strcount(String str,String sub){
        int strlen=str.length();
        int sublen=sub.length();
        if(strlen<sublen)
        return 0;
        if(str.substring(0,sublen).equals(sub))
        return 1+strcount(str.substring(sublen),sub);
        else 
        return strcount(str.substring(1),sub);
    }
    
}
