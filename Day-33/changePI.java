//to change the Pi with 3.14

public class changePI {
    public static void main(String[] args){
        String str="xpicx";
        String result=change(str);
        System.out.println(result);


    }
    public static String change(String str){
        if(str.length()<2)
        return str;
        if(str.substring(0,2).equals("pi"))
        return 3.14+change(str.substring(2));
        else 
        return str.substring(0,1)+change(str.substring(1)); 
    }
    
}
