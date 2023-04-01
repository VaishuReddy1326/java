//program to count the hi in a given string

public class countHi {
    public static void main(String[] args){
        String str="vxhiab";
        int result=count(str);
        System.out.println(result);
    }
    public static int count(String str){
        if(str.length()<2)
        return 0;
        if(str.substring(0,2).equals("hi"))
        return 1+count(str.substring(2));
        else 
        return count(str.substring(2));
    }
    
}
