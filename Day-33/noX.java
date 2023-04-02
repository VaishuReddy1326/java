//to remove all the X characters in a string

public class noX {
    public static void main(String[] args){
        String str="abxvxy";
        String result=remove(str);
        System.out.println(result);
    }
    public static String remove(String str){
        if(str.length()==0)
        return "";
        if(str.charAt(0)=='x')
        return ""+remove(str.substring(1));
        else 
        return str.charAt(0)+remove(str.substring(1));
    }
    
}
