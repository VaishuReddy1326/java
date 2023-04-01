//program to change all the x characters into y

public class changeXy {
    public static void main(String[] args){
        String str="xbcxxd";
        String result=change(str);
        System.out.println(result);

    }
    public static String change(String str){
        if(str.length()==0)
        return " ";
        if(str.charAt(0)=='x')
        return 'y'+change(str.substring(1));
        else 
        return str.charAt(0)+change(str.substring(1));
    }
    
}
