//program to print recursively all  the adjacent characters are separated by a "*"

public class allStar {
    public static void main(String[] args){
        String str="hello";
        System.out.println(star(str));
    }
    public static String star(String str){
        if(str.length()<=1)
        return str;
        return str.charAt(0)+"*"+star(str.substring(1));
    }
    
}
