import javax.lang.model.util.ElementScanner14;

//program to count the occurence of x in a string

public class countX {
    public static void main(String[] args){
       String str="cxxvrx";
        int result=count(str);
        System.out.println(result);

    }
    public static int count(String str){
        if(str.length()==0)
        return 0;
        if(str.charAt(0)=='x')
        return 1+ count(str.substring(1));
        else 
        return count(str.substring(1));
    }
    
}
