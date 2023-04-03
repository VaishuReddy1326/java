// program to count the occurence of abc and aba in a string
public class countAbc {
    public static void main(String[] args){
        String str="abcxxabcaba";
        System.out.println(countabc(str));
    }
    public static int countabc(String str){
        if(str.length()<=2)
        return 0;
        if(str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba"))
        return 1+countabc(str.substring(2));
        else 
        return countabc(str.substring(1));

    }
    
}
